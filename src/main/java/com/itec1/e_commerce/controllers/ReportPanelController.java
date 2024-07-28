package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.services.CarrierServiceImpl;
import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.services.InvoiceServiceImpl;
import com.itec1.e_commerce.services.OrderServiceImpl;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.services.ProviderServiceImpl;
import com.itec1.e_commerce.views.InterfacePanel;
import com.sun.jdi.connect.Transport;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
    private final InvoiceServiceImpl invoiceService;
    private final ProductCategoryServiceImpl productCategoryService;
    private final ProviderServiceImpl providerServiceImpl;
    
    public ReportPanelController(InterfacePanel panel) {
        this.panel = panel;
        this.orderService = new OrderServiceImpl();
        this.clientService = new ClientServiceImpl();
        this.carrierService = new CarrierServiceImpl();
        this.invoiceService = new InvoiceServiceImpl();
        this.productCategoryService = new ProductCategoryServiceImpl();
        this.providerServiceImpl = new ProviderServiceImpl();
    }

//// --------------------------- INFORME: CLIENTES --------------------------- ////
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
    
    private int findClientsWithoutOrders(List<Order> allOrders) {
        List<Client> allClients = clientService.findAll();
        int count = allClients.size();
        for (Client c : allClients) {
            for (Order o : allOrders) {
                if (o.getClient().getCuit().equals(c.getCuit())) {
                    count--;
                    break;
                }
            }
        }
        return count;
//        return (int) allClients.stream()
//                .filter(client -> allOrders.stream()
//                .noneMatch(order -> order.getClient().equals(client))) //verifica que no tengan ningún pedido asociado.
//                .count();
    }
    
    private int findDisabledClients() {
        return (int) clientService.findAll().stream()
                .filter(Client -> !Client.isEnable())
                .count();
    }
    
    private List<Order> filterByDate(List<Order> orders, GregorianCalendar init, GregorianCalendar end) {
        if (init.after(new GregorianCalendar(2000, 1, 1))) {
            //orders = orders.stream().filter(order
            //       -> orderService.findByOrder(order).stream().filter(track
            //             -> track.getState().getName().equals("Pending")).findFirst().get().getDate().after(init)).toList();
            for (Order anOrder : orders) {
                if (!orderService.findByOrder(anOrder).get(0).getDate().after(init)) {
                    orders.remove(anOrder);
                }
            }
        }
        if (end.after(new GregorianCalendar(2000, 1, 1))) {
            //orders = orders.stream().filter(order
            //       -> orderService.findByOrder(order).stream().filter(track
            //              -> track.getState().getName().equals("Pending")).findFirst().get().getDate().before(end)).toList();
            for (Order anOrder : orders) {
                if (!orderService.findByOrder(anOrder).get(0).getDate().before(end)) {
                    orders.remove(anOrder);
                }
            }
        }
        return orders;
    }
    
    private String getCategoryPreferences(List<Order> orders) {
        List<DetailOrder> allDetails = new ArrayList<>();
        List<ProductCategory> categories = productCategoryService.findAll();
        List<Double> preferences = new ArrayList<>();
        double totalProductsOrdered = 0;
        String result = "";
        for (Order anOrder : orders) {
            allDetails.addAll(orderService.viewDetailOfOrder(anOrder));
        }
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
            result += "------> " + categories.get(i).getName() + " > " + Math.round(preference * 100d) / 100d + "%.\n";
        }
        return result;
    }
    
    private String getPreferredProvider(List<Order> orders) {
        List<DetailOrder> allDetails = new ArrayList<>();
        List<String> allProviders = new ArrayList<>();
        String preferredProvider = "";
        double qualification = 0;
        int count;
        int aux = 0;
        for (Order anOrder : orders) {
            allDetails.addAll(orderService.viewDetailOfOrder(anOrder));
        }
        for (DetailOrder detail : allDetails) {
            allProviders.add(detail.getProduct().getProvider().getName());
        }
        for (int i = 0; i < allProviders.size(); i++) {
            count = 0;
            String provider = allProviders.get(i);
            for (String anProvider : allProviders) {
                if (provider.equals(anProvider)) {
                    count += allDetails.get(i).getAmount();
                    qualification += allDetails.get(i).getProviderQualification();
                }
            }
            if (count > aux) {
                aux = count;
                qualification = Math.round(((qualification / count) * 100d) / 100d);
                preferredProvider = provider + (qualification == 0 ? ", sin calificar." : ", con una calificación de " + qualification + "\n");
            }
        }
        return preferredProvider;
    }
    
    private String getPreferredCarrier(List<Order> orders) {
        List<Invoice> allInvoices = new ArrayList<>();
        List<String> allCarriers = new ArrayList<>();
        String preferredCarrier = "";
        double qualification = 0;
        int count;
        int aux = 0;
        for (Order anOrder : orders) {
            allInvoices.add(invoiceService.findByOrder(anOrder));
            allCarriers.add(invoiceService.findByOrder(anOrder).getCarrier().getName());
        }
        for (int i = 0; i < allCarriers.size(); i++) {
            count = 0;
            String carrier = allCarriers.get(i);
            for (String anCarrier : allCarriers) {
                if (carrier.equals(anCarrier)) {
                    count++;
                    qualification += allInvoices.get(i).getCarrierQualification();
                }
            }
            if (count > aux) {
                aux = count;
                qualification = Math.round(((qualification / count) * 100d) / 100d);
                preferredCarrier = carrier + (qualification == 0 ? ", sin calificar." : ", con una calificación de " + qualification + "\n");
            }
        }
        return preferredCarrier;
    }
    
    public String clientOverviewReport(GregorianCalendar init, GregorianCalendar end) {
        List<Order> allOrders = filterByDate(orderService.findAll(), init, end);
        String report = "El sistema cuenta con un total de "
                + clientService.findAll().size() + " clientes registrados.\n"
                + " - " + findClientsWithoutOrders(allOrders) + " de ellos no realizaron ningún pedido en el sistema.\n"
                + " - " + findDisabledClients() + " de ellos se encuentran deshabilitados.\n"
                + " - Los clientes realizaron un total de " + allOrders.size() + " pedidos con las siguientes preferencias:\n";
        report += getCategoryPreferences(allOrders);
        return report;
    }
    
    public String clientReport(Client client, GregorianCalendar init, GregorianCalendar end) {
        List<Order> allOrders = filterByDate(orderService.findOrdersByClient(client), init, end);
        String report = "Este cliente se encuentra actualmente " + (client.isEnable() ? "habilitado" : "deshabilitado") + " en el sistema.\n";
        if (allOrders.size() <= 0) {
            report += " - El cliente no ha realizado ningun pedido aún.\n";
        } else {
            report += " - El cliente ha realizado " + allOrders.size() + " pedidos en el sistema.\n"
                    + " - Las preferencias de los productos pedidos son:\n";
            report += getCategoryPreferences(allOrders);
            //report += " - El proveedor preferido por este cliente es:\n------> " + getPreferredProvider(allOrders);
            //report += " - El transportista preferido por este cliente es\n------> " + getPreferredCarrier(allOrders);
        }
        return report;
    }

//// --------------------------- INFORME: TRANSPORTISTAS --------------------------- ////
    public List<Carrier> updateCarriersTable(String cuit) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Nombre", "C.U.I.T.", "Teléfono", "Transportes habilitados"};
        model.setColumnIdentifiers(titles);
        List<Carrier> carriers = carrierService.findAll();
        List<Carrier> result = new ArrayList<>();
        for (Carrier cr : carriers) {
            if (cr.getCuit().startsWith(cuit)) {
                Object[] object = {cr.getName(), cr.getCuit(), cr.getPhone(), carrierService.verifyEnabledTransports(cr)};
                model.addRow(object);
                result.add(cr);
            }
        }
        this.panel.getTable().setModel(model);
        return result;
    }
    
    private int findCarriersWithoutOrders(List<Order> allOrders) {
        List<Carrier> allCarriers = carrierService.findAll();
        int count = allCarriers.size();
        for (Carrier c : allCarriers) {
            for (Order o : allOrders) {
                if (o.getClient().getCuit().equals(c.getCuit())) {
                    count--;
                    break;
                }
            }
        }
        return count;
//        return (int) allClients.stream()
//                .filter(client -> allOrders.stream()
//                .noneMatch(order -> order.getClient().equals(client))) //verifica que no tengan ningún pedido asociado.
//                .count();
    }
    
    private int findDisabledCarriers() {
        return (int) carrierService.findAll().stream()
                .filter(carrier -> !carrier.isEnable())
                .count();
    }
    
    public String carrierOverviewReport(GregorianCalendar init, GregorianCalendar end) {
        List<Order> allOrders = filterByDate(orderService.findAll(), init, end);
        String report = "El sistema cuenta con un total de "
                + carrierService.findAll().size() + " transportistas registrados.\n"
                + " - " + findCarriersWithoutOrders(allOrders) + " de ellos no transportaron ningún pedido del sistema.\n"
                + " - " + findDisabledCarriers() + " de ellos se encuentran deshabilitados.\n"
                + " - Los transportistas trasladaron un total de " + allOrders.size() + " pedidos con las siguientes preferencias:\n";
        return report;
    }
    
    public String carrierReport(Carrier carrier, GregorianCalendar init, GregorianCalendar end) {
        List<Order> allOrders = new ArrayList<>();
        for (Invoice anInvoice : invoiceService.findByCarrier(carrier)) {
            allOrders.add(anInvoice.getOrder());
        }
        allOrders = filterByDate(allOrders, init, end);
        String report = "Este transportista se encuentra actualmente " + (carrier.isEnable() ? "habilitado" : "deshabilitado") + " en el sistema.\n";
        if (allOrders.size() <= 0) {
            report += " - El transportista no ha trasladado ningun pedido aún.\n";
        } else {
            report += " - El transportista ha trasladado " + allOrders.size() + " pedidos.\n"
                    + " - El transportista tiene una calificación de " + invoiceService.getCarrierQualification(carrier);
        }
        return report;
    }

    //hay que hacer las puntuaciones de los clientes hacia los transportistas pa despues añadirlo.
    

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
        if (score == null || score == 0) {
            return 0;
        }
        return score;
    }
    
}
