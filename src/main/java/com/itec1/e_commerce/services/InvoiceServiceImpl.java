/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.InvoiceJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Invoice;
import java.util.List;

/**
 *
 * @author sjcex
 */
public class InvoiceServiceImpl implements ICRUD<Invoice>{

    private final InvoiceJpaController invoiceJpaController;

    public InvoiceServiceImpl(InvoiceJpaController invoiceJpaController) {
        this.invoiceJpaController = invoiceJpaController;
    }

    @Override
    public Invoice create(Invoice entity) {
        invoiceJpaController.create(entity);
        return invoiceJpaController.findInvoice(entity.getId());
    }

    @Override
    public Invoice update(Long id, Invoice entity) throws NonexistentEntityException, Exception {
        Invoice invoice = invoiceJpaController.findInvoice(id);
        invoice.setEmployeeIssuing(entity.getEmployeeIssuing());
        invoice.setEmployeeReceiving(entity.getEmployeeReceiving());
        invoice.setCarrier(entity.getCarrier());
        invoice.setOrder(entity.getOrder());
        invoiceJpaController.edit(invoice);
        return invoiceJpaController.findInvoice(id);
    }

    @Override
    public Invoice findById(Long id) {
        return invoiceJpaController.findInvoice(id);
    }

    @Override
    public List<Invoice> findAll() {
        return invoiceJpaController.findInvoiceEntities();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        invoiceJpaController.destroy(id);
    }
    
}
