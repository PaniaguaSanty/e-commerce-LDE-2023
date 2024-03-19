/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 *
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

    public List<TrackingOrder> findByOrder(Order order) {
        try {
            return trackingOrderJpaController.findTrackingOrderEntities().stream()
                    .filter(trackingOrder -> trackingOrder.getOrder().getId().equals(order.getId()))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println("Error while finding tracking orders: " + e.getMessage());
            throw new RuntimeException("Failed to found the order.", e);
        }
    }

    public List<Order> findByWarehouse(Warehouse orderByWarehouse) {
        try {
            return orderJpaController.findOrderEntities().stream()
                    .filter(order -> order.getSector().getWarehouse().getId()
                    .equals(orderByWarehouse.getId()))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println("Error while finding orders by Warehouse: " + e.getMessage());
            throw new RuntimeException("Failed to found the order.", e);
        }

    }

    public List<Order> findByClient(Client orderByClient) {
        try {
            return orderJpaController.findOrderEntities().stream()
                    .filter(order -> order.getClient().getId()
                    .equals(orderByClient.getId()))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println("Error while finding orders by client." + e.getMessage());
            throw new RuntimeException("Failed to found the order by Client.", e);
        }
    }

    public List<Order> findBySector(Sector orderBySector) {
        try {
            return orderJpaController.findOrderEntities().stream()
                    .filter(order -> order.getSector().getId()
                    .equals(orderBySector.getId()))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println("Error while finding orders by sector");
            throw new RuntimeException("Failed to found orders by sector", e);
        }

    }

    public TrackingOrder createTrackingOrder(TrackingOrder entity) {
        try {
            trackingOrderJpaController.create(entity);
            return trackingOrderJpaController.findTrackingOrder(entity.getId());
        } catch (Exception e) {
            System.err.println("Error while creating the tracking order." + e.getMessage());
            throw new RuntimeException("Failed to  create the Tracking order: ", e);
        }
    }

    public void changeOrderState(Order order) {
        State[] states = State.values();
        int nextState = findByOrder(order).size() + 1;
        if (nextState < 7) {
            createTracking(order, order.getWarehouseOrigin().getLatitude(),
                    order.getWarehouseOrigin().getLongitude(), states[nextState]);
        } else {
            createTracking(order, order.getWarehouseDestiny().getLatitude(),
                    order.getWarehouseDestiny().getLongitude(), states[nextState]);
        }
    }

    public void orderInTransit(Order order, String latitude, String longitude) {
        createTracking(order, latitude, longitude, State.IN_TRANSIT);
    }

    public void cancelOrder(Order order) throws Exception {
        createTracking(order,
                order.getWarehouseOrigin().getLatitude(),
                order.getWarehouseOrigin().getLongitude(),
                State.CANCELED);
        sectorServiceImpl.changeSector(order,
                sectorServiceImpl.findSectorByName("returned", order.getSector().getWarehouse()));
    }

    public void returnOrder(Order order) throws Exception {
        createTracking(order,
                order.getWarehouseDestiny().getLatitude(),
                order.getWarehouseDestiny().getLongitude(),
                State.RETURNED);
        sectorServiceImpl.changeSector(order,
                sectorServiceImpl.findSectorByName("returned", order.getSector().getWarehouse()));
    }

    public void createInvoice(Invoice invoice) {
        try {
            invoiceJpaController.create(invoice);
        } catch (Exception e) {
            System.err.println("Error while creating invoice. " + e.getMessage());
            throw new RuntimeException("Failed to create Invoice", e);
        }
    }

    public void addDetail(Order order, List<DetailOrder> details) {
        for (DetailOrder detail : details) {
            detail.setOrder(orderJpaController.findOrder(order.getId()));
            detailOrderJpaController.create(detail);
        }
    }

    public void qualifyProvider(DetailOrder detail, int star) throws Exception {
        detail.setProviderQualification(star);
        detailOrderJpaController.edit(detail);
    }

    public void qualifyCarrier(Invoice invoice, int star) throws Exception {
        invoice.setCarrierQualification(star);
        invoiceJpaController.edit(invoice);
    }

    private void createTracking(Order order, String latitude, String longitude, State state) {
        TrackingOrder tracking = new TrackingOrder();
        tracking.setOrder(order);
        tracking.setDate(new Date());
        tracking.setHour(new Date());
        tracking.setLatitude(latitude);
        tracking.setLongitude(longitude);
        tracking.setState(state);
        createTrackingOrder(tracking);
    }
}
