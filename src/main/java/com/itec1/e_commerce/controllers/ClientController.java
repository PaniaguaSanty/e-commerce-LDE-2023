/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.services.ClientServiceImpl;
import java.util.List;

/**
 *
 * @author melina
 */
public class ClientController implements ICRUD<Client>{
    
   private final ClientServiceImpl clientServiceImpl ;

    public ClientController(ClientServiceImpl ClientServiceImpl) {
        this.clientServiceImpl = ClientServiceImpl;
    }
   
   

    @Override
    public Client create(Client entity) {
     return clientServiceImpl.create(entity);
   }

    @Override
    public Client update(Long id, Client entity) throws NonexistentEntityException, Exception {
    return clientServiceImpl.update(id, entity);
    }

    @Override
    public Client findById(Long id) {
    return clientServiceImpl.findById(id);
    }

    @Override
    public List<Client> findAll() {
        return clientServiceImpl.findAll();
   }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        clientServiceImpl.disable(id);
   }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        clientServiceImpl.delete(id);
   }
    
    public Client findByCuit(String cuit) {
        return clientServiceImpl.findByCuit(cuit);
    }
    
    
}
