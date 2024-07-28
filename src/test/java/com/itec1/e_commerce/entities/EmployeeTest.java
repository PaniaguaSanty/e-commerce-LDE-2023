package com.itec1.e_commerce.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;
    Warehouse warehouse;

    @BeforeEach
    void setUp() {
        this.warehouse = new Warehouse();
        this.employee = new Employee("name", "lastname", "address", "cuit", "email", "phone", warehouse);
    }

    @Test
    void testSetAndGetId() {
        employee.setId(123L);
        Long expected = 123L;
        assertEquals(expected, employee.getId());
    }

    @Test
    void testGetName() {
        String expected = "name";
        assertEquals(expected, employee.getName());
    }

    @Test
    void testSetAndGetName() {
        employee.setName("other name");
        String expected = "other name";
        assertEquals(expected, employee.getName());
    }

    @Test
    void testGetLastname() {
        String expected = "lastname";
        assertEquals(expected, employee.getLastname());
    }

    @Test
    void testSetAndGetLastname() {
        employee.setLastname("other lastname");
        String expected = "other lastname";
        assertEquals(expected, employee.getLastname());
    }

    @Test
    void testGetAddress() {
        String expected = "address";
        assertEquals(expected, employee.getAddress());
    }

    @Test
    void testSetAndGetAddress() {
        employee.setAddress("other address");
        String expected = "other address";
        assertEquals(expected, employee.getAddress());
    }

    @Test
    void testGetCuit() {
        String expected = "cuit";
        assertEquals(expected, employee.getCuit());
    }

    @Test
    void testSetAndGetCuit() {
        employee.setCuit("other cuit");
        String expected = "other cuit";
        assertEquals(expected, employee.getCuit());
    }

    @Test
    void testGetEmail() {
        String expected = "email";
        assertEquals(expected, employee.getEmail());
    }

    @Test
    void testSetAndGetEmail() {
        employee.setEmail("other email");
        String expected = "other email";
        assertEquals(expected, employee.getEmail());
    }

    @Test
    void testGetPhone() {
        String expected = "phone";
        assertEquals(expected, employee.getPhone());
    }

    @Test
    void testSetAndGetPhone() {
        employee.setPhone("other phone");
        String expected = "other phone";
        assertEquals(expected, employee.getPhone());
    }

    @Test
    void testIsEnable() {
        boolean expected = true;
        assertEquals(expected, employee.isEnable());
    }

    @Test
    void testSetAndGetEnable() {
        employee.setEnable(false);
        boolean expected = false;
        assertEquals(expected, employee.isEnable());
    }

    @Test
    void testToString() {
        String expected = "Employee{" + "id=" + employee.getId() + ", name=name, surname=lastname, address=address, cuit=cuit, email=email, phone=phone, enabled=true, warehouse=Warehouse{id=null, address=null, country=null, enabled=true}}";
        assertEquals(expected, employee.toString());
    }
}