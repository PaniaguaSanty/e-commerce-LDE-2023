package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.services.CarrierServiceImpl;
import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.services.OrderServiceImpl;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.views.InterfacePanel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author turraca
 */
public class ReportPanelController {

    private final InterfacePanel panel;
    private final OrderServiceImpl orderService;
    private final ClientServiceImpl clientService;
    private final CarrierServiceImpl carrierService;
    private final ProductCategoryServiceImpl productCategoryService;

    public ReportPanelController(InterfacePanel panel) {
        this.panel = panel;
        this.orderService = new OrderServiceImpl();
        this.clientService = new ClientServiceImpl();
        this.carrierService = new CarrierServiceImpl();
        this.productCategoryService = new ProductCategoryServiceImpl();
    }

    // --------------------------- INFORME: CLIENTES --------------------------- //
    public List<Client> updateClientsTable(String cuit) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Nombre", "Apellido", "C.U.I.T."};
        model.setColumnIdentifiers(titles);
        List<Client> clients = clientService.findAll();
        List<Client> result = new ArrayList<>();
        for (Client cl : clients) {
            if (cl.getCuit().startsWith(cuit)) {
                Object[] object = {cl.getName(), cl.getLastname(), cl.getCuit()};
                model.addRow(object);
                result.add(cl);
            }
        }
        this.panel.getTable().setModel(model);
        return result;
    }

    private long findClientsWithoutOrders() {
        List<Order> allOrders = orderService.findAll();
        List<Client> allClients = clientService.findAll();
        return allClients.stream()
                .filter(client -> allOrders.stream()
                .noneMatch(order -> order.getClient().equals(client))) //verifica que no tengan ningún pedido asociado.
                .count();
    }

    private int findDisabledClients() {
        return (int) clientService.findAll().stream()
                .filter(Client -> !Client.isEnable())
                .count();
    }

    public String clientOverviewReport() {
        String report = "El sistema cuenta con un total de "
                + clientService.findAll().size() + " clientes registrados.\n"
                + " - " + findClientsWithoutOrders() + " de ellos no realizaron ningún pedido en el sistema.\n"
                + " - " + findDisabledClients() + " de ellos se encuentran deshabilitados.\n"
                + " - Los cliente realizaron un total de " + orderService.findAll().size()
                + " pedidos con las siguientes preferencias:\n";
        List<DetailOrder> allDetails = new ArrayList<>();
        for (Order anOrder : orderService.findAll()) {
            allDetails.addAll(orderService.viewDetailOfOrder(anOrder));
        }
        List<ProductCategory> categories = productCategoryService.findAll();
        List<Double> preferences = new ArrayList<>();
        double totalProductsOrdered = 0;
        for (ProductCategory category : categories) {
            double cantidad = 0;
            for (DetailOrder aDetail : allDetails) {
                if (aDetail.getProduct().getProductCategory().equals(category)) {
                    totalProductsOrdered += aDetail.getAmount();
                    cantidad += aDetail.getAmount();
                }
            }
            preferences.add(cantidad);
        }
        for (int i = 0; i < preferences.size(); i++) {
            double preference = (preferences.get(i) * 100) / totalProductsOrdered;
            report += "\t -> " + categories.get(i).getName() + ": " + preference + "%\n";
        }
        return report;
    }

    public String clientReport(String clientCuit) {
        return "";
    }

    //hay que hacer las puntuaciones de los clientes hacia los transportistas pa despues añadirlo.
    // --------------------------- INFORME: TRANSPORTISTAS --------------------------- //
    public String carrierOverViewReport() {
        return carrierInfo();
    }

    private String carrierInfo() {
        return "El sistema cuenta con un total de "
                + carrierService.findAll().size() + " transportistas registrados.\n"
                + " - " + carrierService.findAllEnabled() + " de ellos están disponibles para realizar envíos.\n"
                + " - " + carrierService.findAllDisabled() + " de ellos no están disponibles.\n";
        //falta falta jsjsjs
    }

}
