package com.itec1.e_commerce.services;

import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.dao.ClientJpaController;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ClientServiceImplTest {

    @Mock
    private ClientJpaController clientJpa;

    private Client client;
    private List<Client> clientMockDB;
    private ClientServiceImpl clientService;

    @BeforeEach
    void setUp() {
        this.client = new Client("name","lastname", "address", "123", "email", "phone");
        this.clientMockDB = new ArrayList<>();
        this.clientMockDB.add(client);
        this.clientService = new ClientServiceImpl(clientJpa);
    }

    @Test
    void testCreate() {
        when(clientJpa.findClient(any())).thenReturn(clientMockDB.get(0));
        assertEquals(client, clientService.create(client));
    }

    @Test
    void testUpdate() throws Exception {
        client.setName("nuevo nombre");
        when(clientJpa.findClient(any())).thenReturn(clientMockDB.get(0));
        assertEquals(client.getName(), clientService.update(client.getId(), client).getName());
    }

    @Test
    void testFindById() {
        when(clientJpa.findClient(any())).thenReturn(clientMockDB.get(0));
        assertEquals(client.getId(), clientService.findById(any()).getId());
    }

    @Test
    void testFindAll() {
        clientMockDB.add(client);
        when(clientJpa.findClientEntities()).thenReturn(clientMockDB);
        assertEquals(2, clientService.findAll().size());
    }

    @Test
    void testDisable() throws Exception {
        when(clientJpa.findClient(any())).thenReturn(clientMockDB.get(0));
        assertNotEquals(client.getEnable(), clientService.disable(client.getId()).getEnable());
    }

    @Test
    void testDelete() throws Exception {
        when(clientJpa.findClient(any())).thenReturn(clientMockDB.get(0));
        assertNotEquals(client.getEnable(), clientService.disable(client.getId()).getEnable());
    }

    @Test
    void testEnable() throws Exception {
        client.setEnable(false);
        when(clientJpa.findClient(any())).thenReturn(clientMockDB.get(0));
        assertNotEquals(client.getEnable(), clientService.enable(client.getId()).getEnable());
    }

    @Test
    void testFindByCuit() {
        clientMockDB.add(new Client("0","0","0","0","0","0"));
        when(clientJpa.findClientEntities()).thenReturn(clientMockDB);
        assertEquals(client.getCuit(), clientService.findByCuit("123").getCuit());
    }
}