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

    private ClientServiceImpl clientService;
    private Client client;
    private Client client2;
    private List<Client> clientMockDB;


    @BeforeEach
    void setUp() {
        this.clientService = new ClientServiceImpl(clientJpa);
        this.client = new Client("name", "lastname", "address", "123", "email", "phone");
        this.client2 = new Client("name2", "lastname2", "address2", "123", "email2", "phone2");
        this.clientMockDB = new ArrayList<>();
        this.clientMockDB.add(client);
        this.clientMockDB.add(client2);
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
    void testFindByCuit() {
        clientMockDB.add(new Client("0", "0", "0", "0", "0", "0"));
        when(clientJpa.findClientEntities()).thenReturn(clientMockDB);
        assertEquals(client.getCuit(), clientService.findByCuit("123").getCuit());
    }

    @Test
    void testFindAll() {
        clientMockDB.add(client);
        when(clientJpa.findClientEntities()).thenReturn(clientMockDB);
        assertEquals(3, clientService.findAll().size());
    }


    @Test
    void testEnable() throws Exception {
        client.setEnable(false);
        when(clientJpa.findClient(any())).thenReturn(clientMockDB.get(0));
        assertNotEquals(client.isEnable(), clientService.enable(client.getId()).isEnable());
    }

    @Test
    void testDisable() throws Exception {
        when(clientJpa.findClient(any())).thenReturn(clientMockDB.get(0));
        assertNotEquals(client.isEnable(), clientService.disable(client.getId()).isEnable());
    }

    @Test
    void findAllEnabled() {
        client2.setEnable(false);
        clientMockDB.add(client2);
        when(clientJpa.findClientEntities()).thenReturn(clientMockDB);
        assertEquals(1, clientService.findAllEnabled().size());
    }
}