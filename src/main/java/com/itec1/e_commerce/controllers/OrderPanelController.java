/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.TrackingOrder;
import com.itec1.e_commerce.services.CarrierServiceImpl;
import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.services.InvoiceServiceImpl;
import com.itec1.e_commerce.services.OrderServiceImpl;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.services.ProductServiceImpl;


import com.itec1.e_commerce.services.ProviderServiceImpl;
import com.itec1.e_commerce.services.SectorServiceImpl;
import com.itec1.e_commerce.services.WarehouseServiceImpl;
import com.itec1.e_commerce.views.InterfacePanel;
import com.itec1.e_commerce.views.Order_NewOrder_FirstPanel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pania
 */
public class OrderPanelController {

    private static Order order = new Order();
    private static List<DetailOrder> details;
    private final InterfacePanel panel;
    private final OrderServiceImpl orderService;
    private final ClientServiceImpl clientService;
    private final ProductServiceImpl productService;
    private final WarehouseServiceImpl warehouseService;
    private final InvoiceServiceImpl invoiceService;
    private final CarrierServiceImpl carrierService;
    private final ProductCategoryServiceImpl productCategory;
    private final SectorServiceImpl sectorService;

    public OrderPanelController(InterfacePanel panel) {
        this.panel = panel;
        this.orderService = new OrderServiceImpl();
        this.clientService = new ClientServiceImpl();
        this.productService = new ProductServiceImpl();
        this.warehouseService = new WarehouseServiceImpl();
        this.invoiceService = new InvoiceServiceImpl();
        this.carrierService = new CarrierServiceImpl();
        this.productCategory = new ProductCategoryServiceImpl();
        this.sectorService = new SectorServiceImpl();
    }

    //Orders
    public String createOrder() {
        if (orderService.findById(order.getId()) != null) {
            return "No se pudo generar el pedido, por favor, inténtelo nuevamente.";
        } else {
            try {
                orderService.createOrder(order);
                this.addDetail(order, details);
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Pedido creado correctamente.";
    }

    public Order findById(Long id) {
        return orderService.findById(id);
    }

    public List<Order> findAll() {
        return orderService.findAll();
    }

    public List<Order> findOrderByWarehouse(Warehouse ordersByWharehouse) {
        return orderService.findByWarehouse(ordersByWharehouse);
    }

    public List<Order> findOrderByClient(Client ordersByClient) {
        return orderService.findByClient(ordersByClient);
    }

    public List<Order> findOrderBySector(Sector ordersBySector) {
        return orderService.findBySector(ordersBySector);
    }

    public void setClient(Client client) {
        order.setClient(client);
    }

    public void setWarehouseOrigin(Warehouse warehouseOrigin) {
        order.setWarehouseOrigin(warehouseOrigin);          //cambiar
        order.setSector(sectorService.findSectorByName("recibidos", warehouseOrigin));
    }

    public void setWarehouseDestiny(Warehouse warehouseDestiny) {
        order.setWarehouseOrigin(warehouseDestiny);
    }

    //TrackingOrder
    public String createTrackingOrder(TrackingOrder trackingOrder) {
        if (orderService.findById(trackingOrder.getId()) != null) {
            return "No se pudo generar el tracking, por favor inténtelo de nuevo.";
        } else {
            orderService.createTrackingOrder(trackingOrder);
        }
        return "Tracking generado correctamente.";
    }

    public List<TrackingOrder> findByOrder(Order order) {
        return orderService.findByOrder(order);
    }

    public void changeOrderState(Order order) {
        orderService.changeOrderState(order);
    }

    public void orderInTransit(Order order, String latitude, String longitude) {
        orderService.orderInTransit(order, latitude, longitude);
    }

    public void cancelOrder(Order order) throws Exception {
        orderService.cancelOrder(order);
    }

    public void returnOrder(Order order) throws Exception {
        orderService.returnOrder(order);
    }

    public String createInvoice(Invoice invoice) {
        if (orderService.findById(invoice.getId()) != null) {
            return "No se pudo generar el remito, por favor inténtelo nuevamente.";
        } else {
            orderService.createInvoice(invoice);
        }
        return "Remito generado correctamente.";
    }

    //detail Order.
    public void addDetail(Order order, List<DetailOrder> details) {
        orderService.addDetail(order, details);
    }

    public void qualifyProvider(DetailOrder detail, int star) throws Exception {
        orderService.qualifyProvider(detail, star);
    }

    public void qualifyCarrier(Invoice invoice, int star) throws Exception {
        orderService.qualifyCarrier(invoice, star);
    }

    //Client.
    public Client findByCuit(String cuit) {
        return clientService.findByCuit(cuit);
    }

    //Product.
    public List<Product> findProductsByName(String name) {
        return productService.findProductsByName(name);
    }

    public List<Product> findProductsByCategory(String category) {
        return productService.findProductsByCategory(category);
    }

    //función determinar cantidad  de productos. ->
    public List<Product> updateTableProduct(String name) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Nombre", "Descripción", "Peso", "Alto", "Ancho", "Profundidad", "Categoria", "Proveedor", "Habilitado"};
        model.setColumnIdentifiers(titles);
        List<Product> products = productService.findAll();
        List<Product> result = new ArrayList<>();
        String lowerName = name.toLowerCase();
        for (Product prod : products) {
            if (prod.getName().toLowerCase().startsWith(lowerName)) {
                Object[] object = {prod.getId(), prod.getName(), prod.getDescription(), prod.getWeight(), prod.getHigh(), prod.getWidth(), prod.getDepth(), prod.getProductCategory().getName(), prod.getProvider().getName(), prod.isEnable()};
                model.addRow(object);
                result.add(prod);
            }
        }
        return result;
    }

    //Warehouse
    public List<Warehouse> updateTableWarehouse(String string) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Código", "Dirección", "País", "Latitud", "Longitud"};
        model.setColumnIdentifiers(titles);
        List<Warehouse> warehouses = warehouseService.findAll();
        List<Warehouse> result = new ArrayList<>();
        for (Warehouse wh : warehouses) {
            if (wh.getCode().startsWith(string)) {
                Object[] object = {wh.getId(), wh.getCode(), wh.getAddress(), wh.getCountry(), wh.getLatitude(), wh.getLongitude()};
                model.addRow(object);
                result.add(wh);
            }
        }
        return result;
    }

    public List<Warehouse> findWarehouseByCountry(String countryName) {
        return warehouseService.findWarehouseByCountry(countryName);
    }

    public void chooseOrigin(Order order, Warehouse warehouseOrigin) {
        order.setWarehouseOrigin(warehouseOrigin);
    }

    public void chooseDestiny(Order order, Warehouse warehouseOrigin) {
        order.setWarehouseOrigin(warehouseOrigin);
    }

    //Carrier
    public List<Carrier> findByTypeOfTransport(String transportType) {
        return carrierService.findByTypeOfTransport(transportType);
    }

    //confirmar transportista.
    public void chooseCarrier() {

    }

    public List<Carrier> updateTable(String cuit) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Nombre", "C.U.I.T.", "Teléfono", "Transportes habilitados"};
        model.setColumnIdentifiers(titles);
        List<Carrier> clients = carrierService.findAll();
        List<Carrier> result = new ArrayList<>();
        for (Carrier carrier : clients) {
            if (carrier.getCuit().startsWith(cuit)) {
                Object[] object = {carrier.getId(), carrier.getName(),
                    carrier.getCuit(), carrier.getPhone(), carrierService.verifyEnabledTransports(carrier)};
                model.addRow(object);
                result.add(carrier);
            }
        }
        return result;
    }
}
