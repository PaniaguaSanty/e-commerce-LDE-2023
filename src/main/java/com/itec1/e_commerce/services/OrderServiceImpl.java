package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.ClientJpaController;
import com.itec1.e_commerce.dao.DetailOrderJpaController;
import com.itec1.e_commerce.dao.InvoiceJpaController;
import com.itec1.e_commerce.dao.OrderJpaController;
import com.itec1.e_commerce.dao.ProductJpaController;
import com.itec1.e_commerce.dao.TrackingOrderJpaController;
import com.itec1.e_commerce.dao.WarehouseJpaController;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.State;
import com.itec1.e_commerce.entities.TrackingOrder;
import com.itec1.e_commerce.entities.Warehouse;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author melina
 */
public class OrderServiceImpl {

    private final ClientJpaController clientJpaController;
    private final WarehouseJpaController warehouseJpaController;
    private final DetailOrderJpaController detailOrderJpaController;
    private final ProductJpaController productJpaController;
    private final TrackingOrderJpaController trackingOrderJpaController;
    private final OrderJpaController orderJpaController;
    private final InvoiceJpaController invoiceJpaController;
    private SectorServiceImpl sectorServiceImpl;
    private State state;

    public OrderServiceImpl() {
        this.clientJpaController = new ClientJpaController(Connection.getEmf());
        this.warehouseJpaController = new WarehouseJpaController(Connection.getEmf());
        this.detailOrderJpaController = new DetailOrderJpaController(Connection.getEmf());
        this.productJpaController = new ProductJpaController(Connection.getEmf());
        this.trackingOrderJpaController = new TrackingOrderJpaController(Connection.getEmf());
        this.orderJpaController = new OrderJpaController(Connection.getEmf());
        this.invoiceJpaController = new InvoiceJpaController(Connection.getEmf());
    }

    public OrderServiceImpl(OrderJpaController orderJpaController) {
        this.orderJpaController = orderJpaController;
        this.clientJpaController = new ClientJpaController(Connection.getEmf());
        this.warehouseJpaController = new WarehouseJpaController(Connection.getEmf());
        this.detailOrderJpaController = new DetailOrderJpaController(Connection.getEmf());
        this.productJpaController = new ProductJpaController(Connection.getEmf());
        this.trackingOrderJpaController = new TrackingOrderJpaController(Connection.getEmf());
        this.invoiceJpaController = new InvoiceJpaController(Connection.getEmf());

    }

    public Order createOrder(Order entity) throws Exception {
        orderJpaController.create(entity);
        return orderJpaController.findOrder(entity.getId());
    }

    public Order findById(Long id) {
        return orderJpaController.findOrder(id);
    }

    public List<Order> findAll() {
        return orderJpaController.findOrderEntities();
    }

    public List<Order> findOrdersByClient(Client orderByClient) {
        return findAll().stream().filter(order -> order.getClient().getId()
                .equals(orderByClient.getId())).toList();
    }

    public List<Order> findOrdersBySector(Sector orderBySector) {
        return findAll().stream().filter(order -> order.getSector().getId()
                .equals(orderBySector.getId())).toList();
    }

    public List<Order> findOrdersByWarehouse(Warehouse orderByWarehouse) {
        return findAll().stream().filter(order -> order.getSector().getWarehouse().getId()
                .equals(orderByWarehouse.getId())).toList();
    }

    public List<DetailOrder> viewDetailOfOrder(Order order) {
        return detailOrderJpaController.findDetailOrderEntities().stream().
                filter(detail -> detail.getOrder().equals(order)).toList();
    }

    public TrackingOrder createTrackingOrder(TrackingOrder entity) {
        trackingOrderJpaController.create(entity);
        return trackingOrderJpaController.findTrackingOrder(entity.getId());
    }

    public List<TrackingOrder> findByOrder(Order order) {
        return trackingOrderJpaController.findTrackingOrderEntities().stream()
                .filter(trackingOrder -> trackingOrder.getOrder().getId().equals(order.getId()))
                .collect(Collectors.toList());
    }

    private void generateTracking(Order order, String latitude, String longitude, State state) {
        TrackingOrder tracking = new TrackingOrder();
        tracking.setOrder(order);
        tracking.setDate(new Date());
        tracking.setHour(new Date());
        tracking.setLatitude(latitude);
        tracking.setLongitude(longitude);
        tracking.setState(state);
        createTrackingOrder(tracking);
    }

    public void changeOrderState(Order order) {
        State[] states = State.values();
        int nextState = findByOrder(order).size() + 1;
        if (nextState < 7) {
            generateTracking(order, order.getWarehouseOrigin().getLatitude(),
                    order.getWarehouseOrigin().getLongitude(), states[nextState]);
        } else {
            generateTracking(order, order.getWarehouseDestiny().getLatitude(),
                    order.getWarehouseDestiny().getLongitude(), states[nextState]);
        }
    }

    public Order changeSector(Order order, Sector sector) throws Exception {
        order.setSector(sector);
        orderJpaController.edit(order);
        return orderJpaController.findOrder(order.getId());
    }

    public void putOrderInTransit(Order order, String latitude, String longitude) {
        generateTracking(order, latitude, longitude, State.IN_TRANSIT);
    }

    public void cancelOrder(Order order) throws Exception {
        generateTracking(order,
                order.getWarehouseOrigin().getLatitude(),
                order.getWarehouseOrigin().getLongitude(),
                State.CANCELED);
        sectorServiceImpl.changeSector(order,
                sectorServiceImpl.findSectorByName("returned", order.getSector().getWarehouse()));
    }

    public void returnOrder(Order order) throws Exception {
        generateTracking(order,
                order.getWarehouseDestiny().getLatitude(),
                order.getWarehouseDestiny().getLongitude(),
                State.RETURNED);
        sectorServiceImpl.changeSector(order,
                sectorServiceImpl.findSectorByName("returned", order.getSector().getWarehouse()));
    }

    public Invoice createInvoice(Invoice invoice) {
        invoiceJpaController.create(invoice);
        return invoiceJpaController.findInvoice(invoice.getId());
    }

    public void addDetail(Order order, List<DetailOrder> details) {
        details.forEach(detail -> {
            detail.setOrder(orderJpaController.findOrder(order.getId()));
            detailOrderJpaController.create(detail);
        });
    }

    public void qualifyProvider(DetailOrder detail, int star) throws Exception {
        detail.setProviderQualification(star);
        detailOrderJpaController.edit(detail);
    }

    public void qualifyCarrier(Invoice invoice, int star) throws Exception {
        invoice.setCarrierQualification(star);
        invoiceJpaController.edit(invoice);
    }
}
