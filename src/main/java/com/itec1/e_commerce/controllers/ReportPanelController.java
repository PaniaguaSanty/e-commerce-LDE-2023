package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.*;
import com.itec1.e_commerce.services.*;
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
    private final ProviderServiceImpl providerServiceImpl;

    public ReportPanelController(InterfacePanel panel) {
        this.panel = panel;
        this.orderService = new OrderServiceImpl();
        this.clientService = new ClientServiceImpl();
        this.carrierService = new CarrierServiceImpl();
        this.productCategoryService = new ProductCategoryServiceImpl();
        this.providerServiceImpl = new ProviderServiceImpl();
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

    private int findClientsWithoutOrders() {
        List<Order> allOrders = orderService.findAll();
        List<Client> allClients = clientService.findAll();
        return (int) allClients.stream()
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
                + clientService.findAll().size() + " clientes registrados."
                + " - " + findClientsWithoutOrders() + " de ellos no realizaron ningún pedido en el sistema."
                + " - " + findDisabledClients() + " de ellos se encuentran deshabilitados."
                + " - Los clientes realizaron un total de " + orderService.findAll().size()
                + " pedidos con las siguientes preferencias:";
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
            report += "------> " + categories.get(i).getName() + " > " + preference + "%.";
        }
        return report;
    }

    public String clientReport(Client client) {
        int pedidos = orderService.findOrdersByClient(client).size();
        String state = (client.isEnable() ? "habilitado" : "deshabilitado");
        String report = "Este cliente se encuentra actualmente " + state + " en el sistema.";
        if (pedidos <= 0) {
            report += " - El cliente no ha realizado ningun pedido aún.";
        } else {
            report += " - El cliente ha realizado " + pedidos + " pedidos en el sistema."
                    + " - Las preferencias de los productos pedidos son:";
            List<DetailOrder> allDetails = new ArrayList<>();
            for (Order anOrder : orderService.findAll().stream().filter(order -> order.getClient().getCuit().equals(client.getCuit())).toList()) {
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
                report += "------> " + categories.get(i).getName() + " > " + preference + "%.";
            }

        }
        return report;
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

    // ---------------- INFORME PROVEEDORES ---------------- //
    public List<Provider> updateProvidersTable(String cuit) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Nombre", "Apellido", "C.U.I.T."};
        model.setColumnIdentifiers(titles);
        List<Provider> providers = providerServiceImpl.findAll();
        List<Provider> result = new ArrayList<>();
        for (Provider pr : providers) {
            if (pr.getCuit().startsWith(cuit)) {
                Object[] object = {pr.getName(), pr.getLastname(), pr.getCuit()};
                model.addRow(object);
                result.add(pr);
            }
        }
        this.panel.getTable().setModel(model);
        return result;
    }

    public Integer getTotalProviders() {
        return providerServiceImpl.findAll().size();
    }

    public Integer getTotalEnabledProviders() {
        return providerServiceImpl.findAllEnabled().size();
    }

    public Integer getScore(String cuit) {
        Integer score = orderService.getAverageProviderScore(cuit);
        if (score == null) {
            return 0;
        }
        return score;
    }
}
