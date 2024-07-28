package com.itec1.e_commerce.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class DetailOrderTest {

    Product product;
    DetailOrder detailOrder;
    Order order;

    @BeforeEach
    void setUp() {
        this.product = new Product();
        this.order = new Order();
        this.detailOrder = new DetailOrder(5, 5, product, order);
    }

    @Test
    void testSetAndGetId() {
        detailOrder.setId(123L);
        Long expected = 123L;
        assertEquals(expected, detailOrder.getId());
    }

    @Test
    void testGetAmount() {
        int expected = 5;
        assertEquals(expected, detailOrder.getAmount());
    }

    @Test
    void testSetAndGetAmount() {
        detailOrder.setAmount(7);
        int expected = 7;
        assertEquals(expected, detailOrder.getAmount());
    }

    @Test
    void testGetProviderQualification() {
        int expected = 5;
        assertEquals(expected, detailOrder.getProviderQualification());
    }

    @Test
    void testSetAndGetProviderQualification() {
        detailOrder.setProviderQualification(3);
        int expected = 3;
        assertEquals(expected, detailOrder.getProviderQualification());
    }

    @Test
    void testGetProduct() {
        Product expected = product;
        assertEquals(expected, detailOrder.getProduct());
    }

    @Test
    void testSetAndGetProduct() {
        Product newProduct = new Product("any()", "any()", 0f, 0f, 0f, 0f, new ProductCategory(), new Provider());
        detailOrder.setProduct(newProduct);
        assertEquals(newProduct, detailOrder.getProduct());
    }

    @Test
    void testGetOrder() {
        Order expected = order;
        assertEquals(expected, detailOrder.getOrder());
    }

    @Test
    void testSetAndGetOrder() {
        Order newOrder = new Order();
        detailOrder.setOrder(newOrder);
        assertEquals(newOrder, detailOrder.getOrder());
    }

    @Test
    void testToString() {
        String expected = "DetailOrder{" + "id=" + detailOrder.getId() + ", amount=5, providerQualification=5, pruduct=" + detailOrder.getProduct() + ", order=" + detailOrder.getOrder() + "}";
        assertEquals(expected, detailOrder.toString());
    }
}

