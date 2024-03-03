/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.services.InvoiceServiceImpl;

import java.util.List;

/**
 *
 * @author melina
 */
public class InvoiceController {

    private final InvoiceServiceImpl invoiceServiceImpl;

    public InvoiceController(InvoiceServiceImpl invoiceServiceImpl) {
        this.invoiceServiceImpl = invoiceServiceImpl;
    }

    public Invoice create(Invoice entity) {
        return invoiceServiceImpl.create(entity);
    }

    public List<Invoice> findAll() {
        return invoiceServiceImpl.findAll();
    }

    public List<Invoice> findByCarrier(Carrier carrier) {
        return invoiceServiceImpl.findByCarrier(carrier);

    }

    public Invoice findByOrder(Order order) {
        return invoiceServiceImpl.findByOrder(order);

    }
}
