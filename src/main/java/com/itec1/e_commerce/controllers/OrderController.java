/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.TrackingOrder;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.services.OrderServiceImpl;
import java.util.List;

/**
 *
 * @author melina
 */
public class OrderController {

    private final OrderServiceImpl orderServiceImpl;

    public OrderController(OrderServiceImpl orderServiceImpl) {
        this.orderServiceImpl = orderServiceImpl;
    }

    public Order create(Order entity) {
        return orderServiceImpl.create(entity);
    }

    public Order findById(Long id) {
        return orderServiceImpl.findById(id);
    }

    public List<Order> findAll() {
        return orderServiceImpl.findAll();
    }

    public List<TrackingOrder> findByOrder(Order order) {
        return orderServiceImpl.findByOrder(order);

    }

    public List<Order> findByWarehouse(Warehouse entity) {
        return orderServiceImpl.findByWarehouse(entity);
    }

    public List<Order> findByClient(Client entity) {
        return orderServiceImpl.findByClient(entity);
    }

    public List<Order> findBySector(Sector entity) {
        return orderServiceImpl.findBySector(entity);
    }

    public TrackingOrder create(TrackingOrder entity) {
        return orderServiceImpl.create(entity);
    }

    public void changeState(Order order) {
        orderServiceImpl.changeState(order);
    }

    public void orderInTransit(Order order, String latitude, String longitude) {
        orderServiceImpl.orderInTransit(order, latitude, longitude);
    }

    public void cancelOrder(Order order) throws Exception {
        orderServiceImpl.cancelOrder(order);
    }

    public void returnOrder(Order order) throws Exception {
        orderServiceImpl.returnOrder(order);
    }

    public void create(Invoice invoice) {
        orderServiceImpl.create(invoice);
    }

    public void addDetail(Order order, List<DetailOrder> details) {
        orderServiceImpl.addDetail(order, details);
    }

    public void qualifyProvider(DetailOrder detail, int star) throws Exception {
        orderServiceImpl.qualifyProvider(detail, star);
    }

    public void qualifyCarrier(Invoice invoice, int star) throws Exception {
        orderServiceImpl.qualifyCarrier(invoice, star);
    }

}
