/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.services.CarrierServiceImpl;
import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.services.OrderServiceImpl;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.services.ProductServiceImpl;
import com.itec1.e_commerce.services.SectorServiceImpl;
import com.itec1.e_commerce.services.WarehouseServiceImpl;
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
    
    public ReportPanelController (InterfacePanel panel) {
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
    
    private int clientsWithoutOrders() {
        int result = 0;
        for (Client client : clientService.findAll()) {
            for (Order order : orderService.findAll()) {
                if (order.getClient().equals(client)) {
                    result += 1;
                    break;
                }
            }
        }
        return clientService.findAll().size() - result;
    }

    private int disabledClients() {
        int result = 0;
        for (Client client : clientService.findAll()) {
            if (!client.isEnable()) {
                result += 1;
            }
        }
        return result;
    }

    public String clientOverviewReport() {
        String report = "El sistema cuenta con un total de "
                + clientService.findAll().size() + " clientes registrados.\n"
                + " - " + clientsWithoutOrders() + " de ellos no realizaron ningún pedido en el sistema.\n"
                + " - " + disabledClients() + " de ellos se encuentran deshabilitados.\n"
                + " - Los cliente realizaron un total de " + orderService.findAll().size() +
                " pedidos con las siguientes preferencias:\n";
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

}
