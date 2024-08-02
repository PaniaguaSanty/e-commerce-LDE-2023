package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.InvoiceJpaController;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;
import java.util.List;
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

    public InvoiceServiceImpl(InvoiceJpaController invoiceJpaController) {
        this.invoiceJpaController = invoiceJpaController;
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
                .filter(invoice -> invoice.getCarrier().getCuit().equals(carrier.getCuit())).toList();
    }

    public List<Invoice> findByClient(Client client) {
        return invoiceJpaController.findInvoiceEntities().stream()
                .filter(invoice -> invoice.getOrder().getClient().getCuit().equals(client.getCuit())).toList();
    }

    public Invoice findByOrder(Order order) {
        return invoiceJpaController.findInvoiceEntities().stream()
                .filter(invoice -> invoice.getOrder().getId().equals(order.getId()))
                .findFirst().orElseThrow(() -> new EntityNotFoundException("Invoice-not-found"));
    }
    
    public double getCarrierQualification(Carrier carrier) {
        List<Invoice> invoices = findByCarrier(carrier);
        int count = 0;
        double result = 0;
        for (Invoice anInvoice : invoices) {
            if(anInvoice.getCarrierQualification() != 0){
                count++;
            }
            result += anInvoice.getCarrierQualification();
        }
        return Math.round(((result/count)*100d)/100d);
    }

}
