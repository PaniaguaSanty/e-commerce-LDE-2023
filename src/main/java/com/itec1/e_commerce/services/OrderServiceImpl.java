/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public OrderServiceImpl(ClientJpaController clientJpaController, WarehouseJpaController warehouseJpaController, DetailOrderJpaController detailOrderJpaController, ProductJpaController productJpaController, TrackingOrderJpaController trackingOrderJpaController, OrderJpaController orderJpaController, InvoiceJpaController invoiceJpaController) {
        this.clientJpaController = clientJpaController;
        this.warehouseJpaController = warehouseJpaController;
        this.detailOrderJpaController = detailOrderJpaController;
        this.productJpaController = productJpaController;
        this.trackingOrderJpaController = trackingOrderJpaController;
        this.orderJpaController = orderJpaController;
        this.invoiceJpaController = invoiceJpaController;
    }

    public Order create(Order entity) {
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
        List<TrackingOrder> foundTrackingOrder = new ArrayList<>();
        for (TrackingOrder to : trackingOrderJpaController.findTrackingOrderEntities()) {
            if (to.getOrder().getId().equals(order.getId())) {
                foundTrackingOrder.add(to);
            }
        }
        return foundTrackingOrder;
    }

    public List<Order> findByWarehouse(Warehouse entity) {
        return orderJpaController.findOrderEntities().stream()
                .filter(order -> order.getSector().getWarehouse().getId()
                .equals(entity.getId()))
                .toList();

    }

    public List<Order> findByClient(Client entity) {
        return orderJpaController.findOrderEntities().stream()
                .filter(order -> order.getClient().getId()
                .equals(entity.getId()))
                .toList();

    }

    public List<Order> findBySector(Sector entity) {
        return orderJpaController.findOrderEntities().stream()
                .filter(order -> order.getSector().getId()
                .equals(entity.getId()))
                .toList();

    }

    public TrackingOrder create(TrackingOrder entity) {
        trackingOrderJpaController.create(entity);
        return trackingOrderJpaController.findTrackingOrder(entity.getId());
    }

    public void changeState(Order order) {
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

    public void create(Invoice invoice) {
        invoiceJpaController.create(invoice);
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
        create(tracking);
    }
}
