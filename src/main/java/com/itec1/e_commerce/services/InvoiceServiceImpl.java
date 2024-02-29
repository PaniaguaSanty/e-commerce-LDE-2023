/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.InvoiceJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sjcex
 */
public class InvoiceServiceImpl {

    private final InvoiceJpaController invoiceJpaController;

    public InvoiceServiceImpl(InvoiceJpaController invoiceJpaController) {
        this.invoiceJpaController = invoiceJpaController;
    }

    public Invoice create(Invoice entity) {
        invoiceJpaController.create(entity);
        return invoiceJpaController.findInvoice(entity.getId());
    }

    public List<Invoice> findAll() {
        return invoiceJpaController.findInvoiceEntities();
    }

    public List<Invoice> findByCarrier(Carrier carrier) {
        List<Invoice> invoices = new ArrayList<>();
        for (Invoice invoice : invoiceJpaController.findInvoiceEntities()) {
            if (invoice.getCarrier().getCuit().equals(carrier.getCuit())) {
                invoices.add(invoice);
            }
        }
        return invoices;
    }
    
    public Invoice findByOrder (Order order){
        for(Invoice invoice : invoiceJpaController.findInvoiceEntities()){
            if(invoice.getOrder().getId().equals(order.getId())){
                return invoice;
            }
        }
        return null;
    }

}
