package com.itec1.e_commerce.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProviderTest {

    Provider provider;

    @BeforeEach
    void setUp() {
        this.provider = new Provider("name", "lastname", "address", "cuit", "email", "phone");
    }

    @Test
    void testSetAndGetId() {
        provider.setId(123L);
        Long expected = 123L;
        assertEquals(expected, provider.getId());
    }

    @Test
    void testGetName() {
        String expected = "name";
        assertEquals(expected, provider.getName());
    }

    @Test
    void testSetAndGetName() {
        provider.setName("other name");
        String expected = "other name";
        assertEquals(expected, provider.getName());
    }

    @Test
    void testGetLastname() {
        String expected = "lastname";
        assertEquals(expected, provider.getLastname());
    }

    @Test
    void testSetAndGetLastname() {
        provider.setLastname("other lastname");
        String expected = "other lastname";
        assertEquals(expected, provider.getLastname());
    }

    @Test
    void testGetAddress() {
        String expected = "address";
        assertEquals(expected, provider.getAddress());
    }

    @Test
    void testSetAndGetAddress() {
        provider.setAddress("other address");
        String expected = "other address";
        assertEquals(expected, provider.getAddress());
    }

    @Test
    void testGetCuit() {
        String expected = "cuit";
        assertEquals(expected, provider.getCuit());
    }

    @Test
    void testSetAndGetCuit() {
        provider.setCuit("other cuit");
        String expected = "other cuit";
        assertEquals(expected, provider.getCuit());
    }

    @Test
    void testGetEmail() {
        String expected = "email";
        assertEquals(expected, provider.getEmail());
    }

    @Test
    void testSetAndGetEmail() {
        provider.setEmail("other email");
        String expected = "other email";
        assertEquals(expected, provider.getEmail());
    }

    @Test
    void testGetPhone() {
        String expected = "phone";
        assertEquals(expected, provider.getPhone());
    }

    @Test
    void testSetAndGetPhone() {
        provider.setPhone("other phone");
        String expected = "other phone";
        assertEquals(expected, provider.getPhone());
    }

    @Test
    void testGetEnable() {
        boolean expected = true;
        assertEquals(expected, provider.isEnable());
    }

    @Test
    void testSetAndGetEnable() {
        provider.setEnable(false);
        boolean expected = false;
        assertEquals(expected, provider.isEnable());
    }

    @Test
    void testToString() {
        String expected = "name lastname";
        assertEquals(expected, provider.toString());
    }

}

