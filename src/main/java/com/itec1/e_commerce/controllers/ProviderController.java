/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.services.ProviderServiceImpl;
import java.util.List;

/**
 *
 * @author melina
 */
public class ProviderController implements ICRUD<Provider> {

    private final ProviderServiceImpl providerServiceImpl;

    public ProviderController(ProviderServiceImpl providerServiceImpl) {
        this.providerServiceImpl = providerServiceImpl;
    }

   

    @Override
    public Provider create(Provider entity) {
        return providerServiceImpl.create(entity);
    }

    @Override
    public Provider update(Long id, Provider entity) throws NonexistentEntityException, Exception {
   return providerServiceImpl.update(id, entity);
    }

    @Override
    public Provider findById(Long id) {
        return providerServiceImpl.findById(id);
    }

    @Override
    public List<Provider> findAll() {
  return providerServiceImpl.findAll();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        providerServiceImpl.disable(id);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
    providerServiceImpl.delete(id);
    }
    
    public Provider findByCuit(String cuit) {
    return providerServiceImpl.findByCuit(cuit);
    }

}
