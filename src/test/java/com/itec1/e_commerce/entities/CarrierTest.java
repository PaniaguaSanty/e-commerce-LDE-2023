package com.itec1.e_commerce.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrierTest {

    Carrier carrier;

    @BeforeEach
    void setUp() {
        this.carrier = new Carrier("name", "cuit", "phone", true, true, true);
    }

    @Test
    void testSetAndGetId() {
        carrier.setId(123L);
        Long expected = 123L;
        assertEquals(expected, carrier.getId());
    }

    @Test
    void testGetName() {
        String expected = "name";
        assertEquals(expected, carrier.getName());
    }

    @Test
    void testSetAndGetName() {
        carrier.setName("other name");
        String expected = "other name";
        assertEquals(expected, carrier.getName());
    }

    @Test
    void testGetCuit() {
        String expected = "cuit";
        assertEquals(expected, carrier.getCuit());
    }

    @Test
    void testSetAndGetCuit() {
        carrier.setCuit("12345");
        String expected = "12345";
        assertEquals(expected, carrier.getCuit());
    }

    @Test
    void testGetPhone() {
        String expected = "phone";
        assertEquals(expected, carrier.getPhone());
    }

    @Test
    void testSetAndGetPhone() {
        carrier.setPhone("other phone");
        String expected = "other phone";
        assertEquals(expected, carrier.getPhone());
    }

    @Test
    void testGetEnable() {
        boolean expected = true;
        assertEquals(expected, carrier.isEnable());
    }

    @Test
    void testSetAndGetEnable() {
        carrier.setEnable(false);
        boolean expected = false;
        assertEquals(expected, carrier.isEnable());
    }

    @Test
    void testGetGround() {
        boolean expected = true;
        assertEquals(expected, carrier.isGround());
    }

    @Test
    void testSetAndGetGround() {
        carrier.setGround(false);
        boolean expected = false;
        assertEquals(expected, carrier.isGround());
    }

    @Test
    void testGetMaritime() {
        boolean expected = true;
        assertEquals(expected, carrier.isMaritime());
    }

    @Test
    void testSetAndGetMaritime() {
        carrier.setMaritime(false);
        boolean expected = false;
        assertEquals(expected, carrier.isMaritime());
    }

    @Test
    void testGetAerial() {
        boolean expected = true;
        assertEquals(expected, carrier.isAerial());
    }

    @Test
    void testSetAndGetAerial() {
        carrier.setAerial(false);
        boolean expected = false;
        assertEquals(expected, carrier.isAerial());
    }

    @Test
    void testToString() {
        String expected = "carrier{id=" + carrier.getId() +", name=name, cuit=cuit, phone=phone, enabled=true, ground=true, maritime=true, aerial=true}";
        assertEquals(expected, carrier.toString());
    }
}