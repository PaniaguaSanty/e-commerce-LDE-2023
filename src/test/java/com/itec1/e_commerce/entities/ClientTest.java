package com.itec1.e_commerce.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    Client client;

    @BeforeEach
    void setUp() {
        this.client = new Client("name", "lastname", "address", "cuit", "email", "phone");
    }

    @Test
    void testSetAndGetId() {
        client.setId(123L);
        Long expected = 123L;
        assertEquals(expected, client.getId());
    }

    @Test
    void testGetName() {
        String expected = "name";
        assertEquals(expected, client.getName());
    }

    @Test
    void testSetAndGetName() {
        client.setName("other name");
        String expected = "other name";
        assertEquals(expected, client.getName());
    }

    @Test
    void testGetLastname() {
        String expected = "lastname";
        assertEquals(expected, client.getLastname());
    }

    @Test
    void testSetAndGetLastname() {
        client.setLastname("other lastname");
        String expected = "other lastname";
        assertEquals(expected, client.getLastname());
    }

    @Test
    void testGetAddress() {
        String expected = "address";
        assertEquals(expected, client.getAddress());
    }

    @Test
    void testSetAndGetAddress() {
        client.setAddress("other address");
        String expected = "other address";
        assertEquals(expected, client.getAddress());
    }

    @Test
    void testGetCuit() {
        String expected = "cuit";
        assertEquals(expected, client.getCuit());
    }

    @Test
    void testSetAndGetCuit() {
        client.setCuit("other cuit");
        String expected = "other cuit";
        assertEquals(expected, client.getCuit());
    }

    @Test
    void testGetEmail() {
        String expected = "email";
        assertEquals(expected, client.getEmail());
    }

    @Test
    void testSetAndGetEmail() {
        client.setEmail("other email");
        String expected = "other email";
        assertEquals(expected, client.getEmail());
    }

    @Test
    void testGetPhone() {
        String expected = "phone";
        assertEquals(expected, client.getPhone());
    }

    @Test
    void testSetAndGetPhone() {
        client.setPhone("other phone");
        String expected = "other phone";
        assertEquals(expected, client.getPhone());
    }

    @Test
    void testGetEnable() {
        boolean expected = true;
        assertEquals(expected, client.isEnable());
    }

    @Test
    void testSetAndGetEnable() {
        client.setEnable(false);
        boolean expected = false;
        assertEquals(expected, client.isEnable());
    }

    @Test
    void testToString() {
        String expected = "Client{" + "id=" + client.getId() + ", name=name, lastname=lastname, address=address, cuit=cuit, email=email, phone=phone, enabled=true}";
        assertEquals(expected, client.toString());
    }
}