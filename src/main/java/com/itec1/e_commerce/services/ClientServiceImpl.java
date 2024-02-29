package com.itec1.e_commerce.services;

import java.util.List;

import com.itec1.e_commerce.dao.ClientJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Client;

public class ClientServiceImpl implements ICRUD<Client> {

    private final ClientJpaController clientJpaController;

    public ClientServiceImpl(ClientJpaController clientJpaController) {
        this.clientJpaController = clientJpaController;
    }

    @Override
    public Client create(Client entity) {
        clientJpaController.create(entity);
        return clientJpaController.findClient(entity.getId());
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
        return clientJpaController.findClientEntities();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        Client client = clientJpaController.findClient(id);
        client.setEnable(false);
        clientJpaController.edit(client);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        clientJpaController.destroy(id);
    }

    public Client findByCuit(String cuit) {
        return clientJpaController.findClientEntities().stream()
                .filter(client -> client.getCuit().equals(cuit))
                .findFirst().orElse(null);
    }
}
