package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.CarrierJpaController;
import com.itec1.e_commerce.entities.Carrier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class CarrierServiceImplTest {

    @Mock
    private CarrierJpaController carrierJpaController;

    private CarrierServiceImpl carrierService;

    private Carrier carrier;

    private List<Carrier> carrierMockDB;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        carrierService = new CarrierServiceImpl(carrierJpaController);
        carrier = new Carrier("test", "11222222223", "1234567890", true, true, true);
        carrierMockDB = new ArrayList<>();
        carrierMockDB.add(carrier);
    }

    @Test
    void create() {
        Mockito.doNothing().when(carrierJpaController).create(carrier);
        carrierService.create(carrier);
        Mockito.verify(carrierJpaController).create(any(Carrier.class));
    }

    @Test
    void update() throws Exception {
        Mockito.when(carrierJpaController.findCarrier(carrier.getId())).thenReturn(carrier);
        carrier.setName("test2");
        Mockito.doNothing().when(carrierJpaController).edit(carrier);
        carrierService.update(carrier.getId(), carrier);
        assertEquals("test2", carrier.getName());
    }

    @Test
    void findById() {
        Mockito.when(carrierJpaController.findCarrier(carrier.getId())).thenReturn(carrier);
        assertEquals(carrier, carrierService.findById(carrier.getId()));
    }

    @Test
    void findAll() {
        Mockito.when(carrierJpaController.findCarrierEntities()).thenReturn(carrierMockDB);
        assertEquals(carrierMockDB, carrierService.findAll());
    }

    @Test
    void disable() throws Exception {
        Mockito.when(carrierJpaController.findCarrier(carrier.getId())).thenReturn(carrier);
        carrier.setEnable(false);
        Mockito.doNothing().when(carrierJpaController).edit(carrier);
        carrierService.disable(carrier.getId());
        assertFalse(carrier.isEnable());
    }

    @Test
    void delete() throws Exception {
        Mockito.doNothing().when(carrierJpaController).destroy(carrier.getId());
        carrierService.delete(carrier.getId());
        Mockito.verify(carrierJpaController).destroy(carrier.getId());
    }

    @Test
    void enable() throws Exception {
        Mockito.when(carrierJpaController.findCarrier(carrier.getId())).thenReturn(carrier);
        carrier.setEnable(false);
        Mockito.doNothing().when(carrierJpaController).edit(carrier);
        carrierService.enable(carrier.getId());
        assertTrue(carrier.isEnable());
    }

    @Test
    void findByCuit() {
        carrierMockDB.add(new Carrier("0", "0", "0", true, true, true));
        Mockito.when(carrierJpaController.findCarrierEntities()).thenReturn(carrierMockDB);
        assertEquals(carrier, carrierService.findByCuit(carrier.getCuit()));
    }

    @Test
    void findByTypeOfTransport() {
        carrierMockDB.add(new Carrier("0", "0", "0", true, false, true));
        Mockito.when(carrierJpaController.findCarrierEntities()).thenReturn(carrierMockDB);
        String transportType = "maritime";
        List<Carrier> carriers = carrierService.findByTypeOfTransport(transportType);
        assertEquals(1, carriers.size());
        assertEquals(carrier, carriers.get(0));
    }
}