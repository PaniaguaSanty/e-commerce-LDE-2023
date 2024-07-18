package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.TrackingOrder;
import com.itec1.e_commerce.services.CarrierServiceImpl;
import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.services.OrderServiceImpl;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.services.ProductServiceImpl;
import com.itec1.e_commerce.services.SectorServiceImpl;
import com.itec1.e_commerce.services.WarehouseServiceImpl;
import com.itec1.e_commerce.views.InterfaceOrderPanel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pania
 */
public class OrderPanelController {

    private static Order order = new Order();
    private static Invoice invoice = new Invoice();
    private static List<DetailOrder> details = new ArrayList<>();
    private final InterfaceOrderPanel panel;
    private final OrderServiceImpl orderService;
    private final ClientServiceImpl clientService;
    private final ProductServiceImpl productService;
    private final WarehouseServiceImpl warehouseService;
    private final CarrierServiceImpl carrierService;
    private final ProductCategoryServiceImpl productCategoryService;
    private final SectorServiceImpl sectorService;

    public OrderPanelController(InterfaceOrderPanel panel) {
        this.panel = panel;
        this.orderService = new OrderServiceImpl();
        this.clientService = new ClientServiceImpl();
        this.productService = new ProductServiceImpl();
        this.warehouseService = new WarehouseServiceImpl();
        this.carrierService = new CarrierServiceImpl();
        this.productCategoryService = new ProductCategoryServiceImpl();
        this.sectorService = new SectorServiceImpl();
    }

    //Orders
    public String createOrder() {
        try {
            orderService.createOrder(order);
            this.addDetail(order, details);
            return "Pedido creado correctamente";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
    }

    public Order findById(Long id) {
        return orderService.findById(id);
    }

    public List<Order> findAll() {
        return orderService.findAll();
    }

    public List<Order> findOrdersByClient(Client ordersByClient) {
        try {
            return orderService.findOrdersByClient(ordersByClient);

        } catch (Exception e) {
            System.err.println("Error while finding orders by client." + e.getMessage());
            throw new RuntimeException("Failed to found the order by Client.", e);
        }
    }

    public List<Order> findOrdersBySector(Sector ordersBySector) {
        try {
            return orderService.findOrdersBySector(ordersBySector);

        } catch (Exception e) {
            System.err.println("Error while finding orders by sector");
            throw new RuntimeException("Failed to found orders by sector", e);
        }
    }

    public List<Order> findOrdersByWarehouse(Warehouse ordersByWharehouse) {
        try {
            return orderService.findOrdersByWarehouse(ordersByWharehouse);
        } catch (Exception e) {
            System.err.println("Error while finding orders by Warehouse: " + e.getMessage());
            throw new RuntimeException("Failed to found the order.", e);
        }
    }

    public void assignClientToOrder(Client clientSelected) {
        order.setClient(clientSelected);
    }

    public void assignWarehouseOriginToOrder(Warehouse warehouseOrigin) {
        order.setWarehouseOrigin(warehouseOrigin);
        order.setSector(sectorService.findSectorByName("recibidos", warehouseOrigin));
    }

    public void assignWarehouseDestinyToOrder(Warehouse warehouseDestiny) {
        order.setWarehouseDestiny(warehouseDestiny);
    }

    public void assignCarrierToInvoice(Carrier carrierSelected) {
        invoice.setCarrier(carrierSelected);
    }

    //TrackingOrder
    public String createTrackingOrder(TrackingOrder trackingOrder) {
        if (orderService.findById(trackingOrder.getId()) != null) {
            return "No se pudo generar el tracking, por favor inténtelo de nuevo.";
        } else {
            try {
                orderService.createTrackingOrder(trackingOrder);
            } catch (Exception e) {
                System.err.println("Error while creating the tracking order." + e.getMessage());
                throw new RuntimeException("Failed to  create the Tracking order: ", e);
            }
        }
        return "Tracking generado correctamente.";
    }

    public List<TrackingOrder> findByOrder(Order order) {
        try {
            return orderService.findByOrder(order);
        } catch (Exception e) {
            System.err.println("Error while finding tracking orders: " + e.getMessage());
            throw new RuntimeException("Failed to found the order.", e);
        }
    }

    public void putOrderInTransit(Order order, String latitude, String longitude) {
        try {
            orderService.putOrderInTransit(order, latitude, longitude);
        } catch (Exception e) {
            System.err.println("Error while trying to put order in transit." + e.getMessage());
        }
    }

    public void cancelOrder(Order order) throws Exception {
        try {
            orderService.cancelOrder(order);
        } catch (Exception e) {
            System.err.println("Error while trying to cancel the order." + e.getMessage());
        }
    }

    public void returnOrder(Order order) throws Exception {
        try {
            orderService.returnOrder(order);
        } catch (Exception e) {
            System.err.println("Error while trying to return the order." + e.getMessage());
        }
    }

    public void changeOrderState(Order order) {
        try {
            orderService.changeOrderState(order);
        } catch (Exception e) {
            System.err.println("Error while trying to change state." + e.getMessage());
        }
    }

    //detail Order.
    public void addDetail(Order order, List<DetailOrder> details) {
        try {
            orderService.addDetail(order, details);
        } catch (Exception e) {
            System.err.println("Error while trying to add detail.");
        }
    }

    public void assignNewDetailToOrder(DetailOrder detailOrder) {
        detailOrder.setOrder(order);
        detailOrder.setProviderQualification(0);
        details.add(detailOrder);
    }

    public void removeNewDetail(int remove) {
        details.remove(remove);
    }

    public boolean verifyDetail(Product receivedProduct) {
        return !details.stream()
                .anyMatch(detail -> detail.getProduct().equals(receivedProduct));
    }

    public void changeDetailAmount(Product receivedProduct, int amount) {
        details.stream()
                .filter(detail -> detail.getProduct().equals(receivedProduct))
                .forEach(detail -> {
                    int newAmount = detail.getAmount() + amount;
                    detail.setAmount(newAmount);
                });
    }

    public void updateDetailTable() {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Cantidad", "Producto"};
        model.setColumnIdentifiers(titles);
        for (DetailOrder detail : details) {
            Object[] object = {detail.getAmount(), detail.getProduct().getName()};
            model.addRow(object);
        }
        this.panel.getDetailOrdersTable().setModel(model);
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

    public List<Client> updateTable(String cuit) {
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
        this.panel.getClientsTable().setModel(model);
        return result;
    }

    //Product.
    public List<Product> findProductsByName(String name) {
        return productService.findProductsByName(name);
    }

    public List<Product> findProductsByCategory(String category) {
        return productService.findProductsByCategory(category);
    }

    public List<ProductCategory> getCategories() {
        return productCategoryService.findAll();
    }

    public List<Product> updateProductTable(String name, String category) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Nombre", "Descripción", "Peso", "Alto", "Ancho", "Profundidad"};
        model.setColumnIdentifiers(titles);
        List<Product> products = productService.findAll();
        List<Product> result = new ArrayList<>();
        String lowerName = name.toLowerCase();
        if (productCategoryService.findByName(category) == null) {
            category = "";
        }
        for (Product prod : products) {
            if (prod.getName().toLowerCase().startsWith(lowerName) && prod.getProductCategory().getName().startsWith(category)) {
                Object[] object = {prod.getName(), prod.getDescription(), prod.getWeight(), prod.getHigh(), prod.getWidth(), prod.getDepth()};
                model.addRow(object);
                result.add(prod);
            }
        }
        this.panel.getProductsTable().setModel(model);
        return result;
    }

    public boolean verifyWarehouse(String code) {
        return warehouseService.findByCode(code) != null;
    }

    public boolean verifySector(String code) {
        return false;
    }

    //Warehouse
    public List<Warehouse> findWarehouseByCountry(String countryName) {
        return warehouseService.findWarehouseByCountry(countryName);
    }

    public void chooseOrigin(Order order, Warehouse warehouseOrigin) {
        order.setWarehouseOrigin(warehouseOrigin);
    }

    public void chooseDestiny(Order order, Warehouse warehouseOrigin) {
        order.setWarehouseDestiny(warehouseOrigin);
    }

    public List<Warehouse> updateWarehouseTable(String countryName) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Código", "Dirección", "País"};
        model.setColumnIdentifiers(titles);
        List<Warehouse> warehouses = warehouseService.findAll();
        List<Warehouse> result = new ArrayList<>();
        String lowerCountryName = countryName.toLowerCase();
        for (Warehouse wh : warehouses) {
            if (wh.getCountry().toLowerCase().startsWith(lowerCountryName)) {
                Object[] object = {wh.getCode(), wh.getAddress(), wh.getCountry()};
                model.addRow(object);
                result.add(wh);
            }
        }
        this.panel.getWarehousesTable().setModel(model);
        return result;
    }

    public List<Warehouse> updateWarehouseTableForCode(String string) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Código", "Dirección", "País"};
        model.setColumnIdentifiers(titles);
        List<Warehouse> warehouses = warehouseService.findAll();
        List<Warehouse> result = new ArrayList<>();
        for (Warehouse wh : warehouses) {
            if (wh.getCode().startsWith(string)) {
                Object[] object = {wh.getCode(), wh.getAddress(), wh.getCountry()};
                model.addRow(object);
                result.add(wh);
            }
        }
        this.panel.getWarehousesTable().setModel(model);
        return result;
    }

    public List<Sector> updateTableSector(String codeWarehouse, String code) {
        Warehouse warehouse = warehouseService.findByCode(codeWarehouse);
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Nombre", "Código"};
        model.setColumnIdentifiers(titles);
        List<Sector> sectors = new ArrayList<>();
        if (warehouse == null) {
            this.panel.getSectorsTable().setModel(model);
            return sectors;
        } else {
            sectors = sectorService.findSectorByWarehouse(warehouse);

        }
        List<Sector> result = new ArrayList<>();
        for (Sector se : sectors) {
            if (se.getCode().startsWith(code)) {
                Object[] object = {se.getName(), se.getCode()};
                model.addRow(object);
                result.add(se);
            }
        }
        this.panel.getSectorsTable().setModel(model);
        return result;
    }

    public List<Order> updateTableOrder(String code) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Cliente", "C.U.I.T"};
        model.setColumnIdentifiers(titles);
        List<Order> orders = orderService.findAll();
        List<Order> result = new ArrayList<>();
        for (Order or : orders) {
            if (or.getCode().startsWith(code)) {
                Object[] object = {or.getClient().getName(), or.getClient().getCuit()};
                model.addRow(object);
                result.add(or);
            }
        }
        this.panel.getOrdersTable().setModel(model);
        return result;
    }

    //Carrier
    public List<Carrier> findByTypeOfTransport(String transportType) {
        return carrierService.findByTypeOfTransport(transportType);
    }

    public List<Carrier> updateCarrierTable(String transportType) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Nombre", "C.U.I.T.", "Teléfono", "Transportes habilitados"};
        model.setColumnIdentifiers(titles);
        List<Carrier> carriers = new ArrayList<>();
        List<Carrier> result = new ArrayList<>();
        if (transportType.equals("")) {
            carriers = carrierService.findAll();
        } else {
            carriers = findByTypeOfTransport(transportType);
        }
        for (Carrier carrier : carriers) {
            if (carrier.isEnable()) {
                Object[] object = {carrier.getName(),
                    carrier.getCuit(), carrier.getPhone(), carrierService.verifyEnabledTransports(carrier)};
                model.addRow(object);
                result.add(carrier);
            }
        }
        this.panel.getCarriersTable().setModel(model);
        return result;
    }

    //invoice
    public String createInvoice() {
        if (orderService.findById(invoice.getId()) != null) {
            return "No se pudo generar el remito, por favor inténtelo nuevamente.";
        } else {
            try {
                orderService.createInvoice(invoice);
            } catch (Exception e) {
                System.err.println("Error while finding orders by sector");
                throw new RuntimeException("Failed to found orders by sector", e);
            }
        }
        return "Remito generado con éxito.";
    }
}
