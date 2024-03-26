package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.InvoiceJpaController;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;

/**
 *
 * @author sjcex
 */
public class InvoiceServiceImpl {

    private final InvoiceJpaController invoiceJpaController;

    public InvoiceServiceImpl() {
        this.invoiceJpaController = new InvoiceJpaController(Connection.getEmf());
    }

    public Invoice create(Invoice entity) {
        try {
            invoiceJpaController.create(entity);
            return invoiceJpaController.findInvoice(entity.getId());
        } catch (Exception e) {
            System.err.println("Error when creating the invoice: " + e.getMessage());
            throw new RuntimeException("Failed to create invoice", e);
        }
    }

    public List<Invoice> findAll() {
        return invoiceJpaController.findInvoiceEntities();
    }

    public List<Invoice> findByCarrier(Carrier carrier) {
        return invoiceJpaController.findInvoiceEntities().stream()
                .filter(invoice -> invoice.getCarrier().getCuit().equals(carrier.getCuit()))
                .collect(Collectors.toList());
    }

    public Invoice findByOrder(Order order) {
        return invoiceJpaController.findInvoiceEntities().stream()
                .filter(invoice -> invoice.getOrder().getId().equals(order.getId()))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Invoice-not-found"));
    }
}
