package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.ProviderJpaController;

import com.itec1.e_commerce.entities.Provider;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProviderServiceImplTest {

    @Mock
    private ProviderJpaController providerJpa;

    private Provider provider;

    private List<Provider> providerMockDB;

    private ProviderServiceImpl providerService;

    @BeforeEach
    void setUp() {
        this.provider = new Provider("name", "lastname", "address", "123", "email", "phone");
        this.providerMockDB = new ArrayList<>();
        this.providerMockDB.add(provider);
        this.providerService = new ProviderServiceImpl();
    }

    @Test
    void testCreate() {
        when(providerJpa.findProvider(any())).thenReturn(providerMockDB.get(0));
        assertEquals(provider, providerService.create(provider));
    }

    @Test
    void testUpdate() throws Exception {
        provider.setName("nuevo nombre");
        when(providerJpa.findProvider(any())).thenReturn(providerMockDB.get(0));
        assertEquals(provider.getName(), providerService.update(provider.getId(), provider).getName());
    }

    @Test
    void testDelete() throws Exception {
        when(providerJpa.findProvider(any())).thenReturn(providerMockDB.get(0));
        assertNotEquals(provider.getEnable(), providerService.disable(provider.getId()).getEnable());
    }

    @Test
    void testFindById() {
        when(providerJpa.findProvider(any())).thenReturn(providerMockDB.get(0));
        assertEquals(provider.getId(), providerService.findById(any()).getId());
    }

    @Test
    void testFindByCuit() {
        providerMockDB.add(new Provider("0", "0", "0", "0", "0", "0"));
        when(providerJpa.findProviderEntities()).thenReturn(providerMockDB);
        assertEquals(provider.getCuit(), providerService.findByCuit("123").getCuit());
    }

    @Test
    void testFindAll() {
        providerMockDB.add(provider);
        when(providerJpa.findProviderEntities()).thenReturn(providerMockDB);
        assertEquals(2, providerService.findAll().size());
    }

    @Test
    void testEnable() throws Exception {
        provider.setEnable(false);
        when(providerJpa.findProvider(any())).thenReturn(providerMockDB.get(0));
        assertNotEquals(provider.getEnable(), providerService.enable(provider.getId()).getEnable());
    }

    @Test
    void testDisable() throws Exception {
        when(providerJpa.findProvider(any())).thenReturn(providerMockDB.get(0));
        assertNotEquals(provider.getEnable(), providerService.disable(provider.getId()).getEnable());
    }
}