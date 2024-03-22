package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.SectorJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;

import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;


@ExtendWith(MockitoExtension.class)
class SectorServiceImplTest {
    @Mock
    private SectorJpaController sectorJpa;
    @Mock
    private OrderServiceImpl orderService;

    private SectorServiceImpl serviceImplTest;

    private List<Sector> sectors;


    @BeforeEach
    void setUp() {

        serviceImplTest = new SectorServiceImpl(sectorJpa,orderService);
        sectors = new ArrayList<>();
        sectorList();
    }

    @Test
    void testCreateSector() {
        Mockito.doNothing().when(sectorJpa).create(sectors.get(0));
        serviceImplTest.create(sectors.get(0));
        Mockito.verify(sectorJpa).create(sectors.get(0));


    }

    @Test
    void testUpdateEmployee() throws Exception {
        sectors.get(0).setName("nombre nuevo");
        Mockito.when(sectorJpa.findSector(sectors.get(0).getId())).thenReturn(sectors.get(0));
        Sector result = serviceImplTest.update(sectors.get(0).getId(), sectors.get(0));
        assertEquals(sectors.get(0).getName(), result.getName());
    }

    @Test
    void testDisableEmployee() throws Exception {
        Mockito.when(sectorJpa.findSector(sectors.get(0).getId())).thenReturn(sectors.get(0));
        serviceImplTest.disable(sectors.get(0).getId());
        assertFalse(sectors.get(0).isEnable());
    }

    @Test
    void testDeleteEmployee() throws NonexistentEntityException {
        Mockito.when(sectorJpa.findSector(sectors.get(0).getId())).thenReturn(sectors.get(0));
        serviceImplTest.delete(sectors.get(0).getId());
        Mockito.verify(sectorJpa).destroy(sectors.get(0).getId());
        assertEquals(serviceImplTest.delete(sectors.get(0).getId()), sectors.get(0));

    }

    @Test
    void enable() throws Exception {
        Mockito.when(sectorJpa.findSector(sectors.get(0).getId())).thenReturn(sectors.get(0));
        serviceImplTest.enable(sectors.get(0).getId());
        assertTrue(sectors.get(0).isEnable());
    }

    @Test
    void findById() {
        Sector sector = sectors.get(0);
        Mockito.when(sectorJpa.findSector(sector.getId())).thenReturn(sector);
        Sector result = serviceImplTest.findById(sector.getId());
        assertEquals(sector.getId(), result.getId());
    }

    @Test
    void findAll() {
        Mockito.when(sectorJpa.findSectorEntities()).thenReturn(sectors);
        serviceImplTest.findAll();
        assertEquals(sectors, serviceImplTest.findAll());
    }

    @Test
    void testFindSectorByName() {
        Sector sector = sectors.get(0);
        Mockito.when(sectorJpa.findSectorEntities()).thenReturn(sectors);
        Sector result = serviceImplTest.findSectorByName(sector.getName(), sector.getWarehouse());
        assertEquals(sector.getName(), result.getName());
    }

    @Test
    void testFindSectorByWarehouse() {
        Mockito.when(sectorJpa.findSectorEntities()).thenReturn(sectors);
        List<Sector> result = serviceImplTest.findSectorByWarehouse(sectors.get(0).getWarehouse());
        assertEquals(2, result.size());
    }

    @Test
    void testFindByCode() {
        Mockito.when(sectorJpa.findSectorEntities()).thenReturn(sectors);
        Sector result = serviceImplTest.findByCode(sectors.get(0).getCode());
        assertEquals(sectors.get(0).getCode(), result.getCode());
    }

    @Test
    void testchangeSector() throws Exception {
        Order order = new Order();
        Mockito.when(orderService.changeSector(any(), any())).thenReturn(order);
        serviceImplTest.changeSector(order, sectors.get(1));
        Mockito.verify(orderService).changeSector(order, sectors.get(1));
        assertEquals(order.getSector(), sectors.get(1));
    }

    private void sectorList() {
        Warehouse warehouse = new Warehouse();
        warehouse.setId(1L);
        Sector s1 = new Sector("name", warehouse, "code");
        sectors.add(s1);
        Sector s2 = new Sector("name1", warehouse, "code1");
        sectors.add(s2);
    }

}