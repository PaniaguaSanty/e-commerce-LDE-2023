package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.ProviderJpaController;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
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

    private ProviderServiceImpl providerService;
    private Provider provider;
    private Provider provider2;
    private List<Provider> providerMockDB;



    @BeforeEach
    void setUp() {
        this.providerService = new ProviderServiceImpl(providerJpa);
        this.provider = new Provider("name", "lastname", "address", "123", "email", "phone");
        this.provider2 = new Provider("name2", "lastname2", "address2", "123", "email2", "phone2");
        this.providerMockDB = new ArrayList<>();
        this.providerMockDB.add(provider);
        this.providerMockDB.add(provider2);
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
        assertNotEquals(provider.isEnable(), providerService.disable(provider.getId()).isEnable());
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
        assertEquals(3, providerService.findAll().size());
    }

    @Test
    void testEnable() throws Exception {
        provider.setEnable(false);
        when(providerJpa.findProvider(any())).thenReturn(providerMockDB.get(0));
        assertNotEquals(provider.isEnable(), providerService.enable(provider.getId()).isEnable());
    }

    @Test
    void testDisable() throws Exception {
        provider.setEnable(true);
        when(providerJpa.findProvider(any())).thenReturn(providerMockDB.get(0));
        assertNotEquals(provider.isEnable(), providerService.disable(provider.getId()).isEnable());
    }

    @Test
    void findAllEnabled() {
        provider2.setEnable(false);
        providerMockDB.add(provider2);
        when(providerJpa.findProviderEntities()).thenReturn(providerMockDB);
        assertEquals(1, providerService.findAllEnabled().size());
    }

    @Test
    void findByName() {
        providerMockDB.add(provider);
        when(providerJpa.findProviderEntities()).thenReturn(providerMockDB);
        assertEquals(provider.getName(), providerService.findByName("name").getName());
    }

    @Test
    void delete() throws NonexistentEntityException {
        when(providerJpa.findProvider(any())).thenReturn(providerMockDB.get(0));
        try {
            providerService.delete(provider.getId());
        } catch (NonexistentEntityException e) {
            throw new RuntimeException(e);
        }
        verify(providerJpa, times(1)).destroy(provider.getId());
    }
}

