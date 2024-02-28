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
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.State;
import com.itec1.e_commerce.entities.TrackingOrder;
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

    public TrackingOrder create(TrackingOrder entity) {
        trackingOrderJpaController.create(entity);
        return trackingOrderJpaController.findTrackingOrder(entity.getId());
    }

    public void changeState(Order order) {
        State[] states = State.values();
        int nextState = findByOrder(order).size() + 1;
        TrackingOrder tracking = new TrackingOrder();
        tracking.setOrder(order);
        tracking.setDate(new Date());
        tracking.setHour(new Date());
        if (nextState < 7) {
            tracking.setState(states[nextState]);
            tracking.setLongitude(order.getWarehouseOrigin().getLongitude());
            tracking.setLatitude(order.getWarehouseOrigin().getLatitude());
        } else {
            tracking.setState(states[nextState]);
            tracking.setLongitude(order.getWarehouseDestiny().getLongitude());
            tracking.setLatitude(order.getWarehouseDestiny().getLatitude());
        }

        create(tracking);
    }

    public void orderInTransit(Order order, String latitude, String longitude) {
        TrackingOrder tracking = new TrackingOrder();
        tracking.setOrder(order);
        tracking.setDate(new Date());
        tracking.setHour(new Date());
        tracking.setLatitude(latitude);
        tracking.setLongitude(longitude);
        tracking.setState(state.IN_TRANSIT);
        create(tracking);

    }

    public void cancelOrder(Order order) {
        TrackingOrder tracking = new TrackingOrder();
        tracking.setOrder(order);
        tracking.setDate(new Date());
        tracking.setHour(new Date());
        tracking.setLongitude(order.getWarehouseOrigin().getLongitude());
        tracking.setLatitude(order.getWarehouseOrigin().getLatitude());
        tracking.setState(state.CANCELED);
        create(tracking);
    }

    public void returnOrder(Order order) {
        TrackingOrder tracking = new TrackingOrder();
        tracking.setOrder(order);
        tracking.setDate(new Date());
        tracking.setHour(new Date());
        tracking.setLongitude(order.getWarehouseDestiny().getLongitude());
        tracking.setLatitude(order.getWarehouseDestiny().getLatitude());
        tracking.setState(state.RETURNED);
        create(tracking);
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
 public void qualifyProvider(DetailOrder detail, int star) throws Exception{
        detail.setProviderQualification(star);
        detailOrderJpaController.edit(detail);
    }
    

    public void qualifyCarrier(Invoice invoice, int star) throws Exception{
        invoice.setCarrierQualification(star);
        invoiceJpaController.edit(invoice);
    }
    

}
