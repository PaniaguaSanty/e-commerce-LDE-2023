package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import java.util.List;

import com.itec1.e_commerce.dao.ClientJpaController;
import com.itec1.e_commerce.entities.Client;

public class ClientServiceImpl implements ICRUD<Client> {

    private final ClientJpaController clientJpaController;

    public ClientServiceImpl() {
        this.clientJpaController = new ClientJpaController(Connection.getEmf());
    }

    public ClientServiceImpl(ClientJpaController jpa) {
        this.clientJpaController = jpa;
    }

    @Override
    public Client create(Client entity) {
        clientJpaController.create(entity);
        return clientJpaController.findClient(entity.getId());
    }

    @Override
    public Client update(Long id, Client entity) throws Exception {
        Client client = clientJpaController.findClient(id);
        client.setName(entity.getName());
        client.setLastname(entity.getLastname());
        client.setAddress(entity.getAddress());
        client.setCuit(entity.getCuit());
        client.setEmail(entity.getEmail());
        client.setPhone(entity.getPhone());
        clientJpaController.edit(client);
        return clientJpaController.findClient(entity.getId());
    }

    @Override
    public Client findById(Long id) {
        return clientJpaController.findClient(id);
    }

    @Override
    public List<Client> findAll() {
        return clientJpaController.findClientEntities();
    }
    
    @Override
    public List<Client> findAllEnabled() {
        return findAll().stream().filter(Client::isEnable).toList();
    }

    @Override
    public Client disable(Long id) throws Exception {
        Client client = clientJpaController.findClient(id);
        client.setEnable(false);
        clientJpaController.edit(client);
        return clientJpaController.findClient(id);
    }

    @Override
    public Client delete(Long id) throws Exception {
        clientJpaController.destroy(id);
        return clientJpaController.findClient(id);
    }

    @Override
    public Client enable(Long id) throws Exception {
        Client client = clientJpaController.findClient(id);
        client.setEnable(true);
        clientJpaController.edit(client);
        return clientJpaController.findClient(id);
    }

    public Client findByCuit(String cuit) {
        return clientJpaController.findClientEntities().stream()
                .filter(client -> client.getCuit().equals(cuit))
                .findFirst()
                .orElse(null);
    }
}
