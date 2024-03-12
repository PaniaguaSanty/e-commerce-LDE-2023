package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import java.util.List;

import com.itec1.e_commerce.dao.ClientJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Client;
import java.util.stream.Collectors;

public class ClientServiceImpl implements ICRUD<Client> {

    private final ClientJpaController clientJpaController;

    public ClientServiceImpl() {
        this.clientJpaController = new ClientJpaController(Connection.getEmf());
    }

    @Override
    public Client create(Client entity) {
        try {
            clientJpaController.create(entity);
            return clientJpaController.findClient(entity.getId());
        } catch (Exception e) {
            System.err.println("Error when creating the client: " + e.getMessage());
            throw new RuntimeException("Failed to create client.", e);
        }
    }

    @Override
    public Client update(Long id, Client entity) throws NonexistentEntityException, Exception {
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
        return clientJpaController.findClientEntities().stream()
                .filter(client -> client.getEnable()).collect(Collectors.toList());
    }

    @Override
    public Client disable(Long id) throws NonexistentEntityException, Exception {
        Client client = clientJpaController.findClient(id);
        client.setEnable(false);
        clientJpaController.edit(client);
        return clientJpaController.findClient(id);
    }

    @Override
    public Client delete(Long id) throws NonexistentEntityException {
        clientJpaController.destroy(id);
        return clientJpaController.findClient(id);
    }

    @Override
    public Client enable(Long id) throws NonexistentEntityException, Exception {
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
