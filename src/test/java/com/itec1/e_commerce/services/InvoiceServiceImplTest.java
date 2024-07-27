package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.InvoiceJpaController;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class InvoiceServiceImplTest {
    @Mock
    private InvoiceJpaController invoiceJpa;
    private InvoiceServiceImpl invoiceService;
    private List<Invoice> invoiceList;

    @BeforeEach
    void setUp() {
        invoiceService = new InvoiceServiceImpl(invoiceJpa);
        invoiceList = new ArrayList<>();
        invoiceMock();
    }

    @Test
    void testCreateInvoce() {
        Invoice expected = invoiceList.get(0);
        Mockito.when(invoiceJpa.findInvoice(expected.getId())).thenReturn(expected);
        Invoice result = invoiceService.create(expected);
        assertEquals(expected.getId(), result.getId());
    }

    @Test
    void testFindAllInvoices() {
        List<Invoice> invoices = invoiceList;
        Mockito.when(invoiceJpa.findInvoiceEntities()).thenReturn(invoices);
        List<Invoice> results = invoiceService.findAll();
        assertEquals(invoices.size(), results.size());

    }

    @Test
    void testFindInvoiceByCarrier() {
        List<Invoice> invoices = invoiceList;
        Mockito.when(invoiceJpa.findInvoiceEntities()).thenReturn(invoices);
        Carrier carrier = invoices.get(0).getCarrier();
        List<Invoice> results = invoiceService.findByCarrier(carrier);
        assertEquals(invoices.get(0).getCarrier().getCuit(), results.get(0).getCarrier().getCuit());
    }

    @Test
    void testFindInvoceByOrder() {
       Order expected = invoiceList.get(0).getOrder();
       Mockito.when(invoiceJpa.findInvoiceEntities()).thenReturn(invoiceList);
       Invoice result = invoiceService.findByOrder(expected);
       assertEquals(expected.getId(),result.getId());
    }

    private void invoiceMock() {
        Invoice invoice = new Invoice();
        invoice.setId(1L);
        Carrier carrier = new Carrier();
        carrier.setCuit("1234");
        invoice.setCarrier(carrier);
        Order order = new Order();
        order.setId(1L);
        invoice.setOrder(order);
        Invoice invoice1 = new Invoice();
        invoice1.setId(2L);
        Carrier carrier1 = new Carrier();
        carrier1.setCuit("4321");
        invoice1.setCarrier(carrier);
        Order order1 = new Order();
        order1.setId(2L);
        invoice1.setOrder(order1);
        invoiceList.add(invoice);
        invoiceList.add(invoice1);

    }
}