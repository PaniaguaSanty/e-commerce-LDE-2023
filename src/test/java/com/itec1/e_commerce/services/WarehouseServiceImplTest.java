package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.WarehouseJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
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
class WarehouseServiceImplTest {
    @Mock
    private WarehouseJpaController warehouseJpa;
    @Mock
    private SectorServiceImpl sectorService;


    private WarehouseServiceImpl warehouseService;

    private List<Warehouse> warehouseList;

    @BeforeEach
    void setUp() {

        this.warehouseService = new WarehouseServiceImpl(warehouseJpa, sectorService);
        this.warehouseList = new ArrayList<>();
        this.warehouseMock();

    }

    @Test
    void testCreateWarehouse() {
        Warehouse expected = warehouseList.get(0);
        Mockito.when(warehouseJpa.findWarehouse(1L)).thenReturn(expected);
        assertEquals(expected, warehouseService.create(expected));

    }

    @Test
    void testUpdateWarehouse() throws Exception {
        warehouseList.get(0).setCountry("new country");
        Mockito.when(warehouseJpa.findWarehouse(any())).thenReturn(warehouseList.get(0));
        assertEquals(warehouseList.get(0).getCountry(), warehouseService.update(warehouseList.get(0).getId(), warehouseList.get(0)).getCountry());

    }

    @Test
    void testFindByIdWarehouse() {
        Warehouse expected = warehouseList.get(0);
        Mockito.when(warehouseJpa.findWarehouse(expected.getId())).thenReturn(expected);
        Warehouse result = warehouseService.findById(expected.getId());
        assertEquals(expected.getId(), result.getId());

    }

    @Test
    void testFindAllWarehouses() {
        Mockito.when(warehouseJpa.findWarehouseEntities()).thenReturn(warehouseList);
        assertEquals(warehouseList.size(), warehouseService.findAll().size());
    }

    @Test
    void testFindAllEnabledWarehouse() {
        List<Warehouse> expected = warehouseList.stream().toList();
        Mockito.when(warehouseJpa.findWarehouseEntities()).thenReturn(expected);
        assertEquals(expected.size(), warehouseService.findAllEnabled().size());

    }

    @Test
    void disable() throws Exception {
        Warehouse expected = warehouseList.get(0);
        Mockito.when(warehouseJpa.findWarehouse(1L)).thenReturn(expected);
        Warehouse result = warehouseService.disable(expected.getId());
        assertEquals(false, result.isEnable());

    }

    @Test
    void delete() throws NonexistentEntityException {
        Warehouse expected = warehouseList.get(0);
        Mockito.when(warehouseJpa.findWarehouse(1L)).thenReturn(expected);
        Warehouse result = warehouseService.delete(expected.getId());
        assertEquals(expected, result);
    }

    @Test
    void enable() throws Exception {
        Warehouse expected = warehouseList.get(1);
        Mockito.when(warehouseJpa.findWarehouse(2L)).thenReturn(expected);
        Warehouse result = warehouseService.enable(expected.getId());
        assertEquals(true, result.isEnable());
    }

    @Test
    void findWarehouseByCountry() {
        List<Warehouse> expected = warehouseList;
        Mockito.when(warehouseJpa.findWarehouseEntities()).thenReturn(expected);
        List<Warehouse> result = warehouseService.findWarehouseByCountry(expected.get(0).getCountry());
        assertEquals(expected, result);
    }

    @Test
    void findByCode() {
        Warehouse expected = warehouseList.get(1);
        Mockito.when(warehouseJpa.findWarehouseEntities()).thenReturn(warehouseList);
        Warehouse result = warehouseService.findByCode(expected.getCode());
        assertEquals(expected.getCode(), result.getCode());
    }

    private void warehouseMock() {
        Warehouse Warehouse1 = new Warehouse("address", "country", "latitude", "longitude", "code");
        Warehouse1.setId(1L);
        Warehouse1.setEnable(true);
        warehouseList.add(Warehouse1);
        Warehouse Warehouse2 = new Warehouse("address", "country", "latitude", "longitude", "code");
        Warehouse2.setId(2L);
        Warehouse2.setEnable(true);
        warehouseList.add(Warehouse2);
    }
}