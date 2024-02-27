/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.ProviderJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Provider;
import java.util.List;

/**
 *
 * @author melina
 */
public class ProviderServiceImpl implements ICRUD<Provider> {
    private final ProviderJpaController providerJpaController;

    public ProviderServiceImpl(ProviderJpaController providerJpaController) {
        this.providerJpaController = providerJpaController;
    }
    
    

    @Override
    public Provider create(Provider entity) {
     providerJpaController.create(entity);
     return providerJpaController.findProvider(entity.getId());
   }

    @Override
    public Provider update(Long id, Provider entity) throws NonexistentEntityException, Exception {
    Provider provider = providerJpaController.findProvider(id);
    provider.setCuit(entity.getCuit());
    provider.setName(entity.getName());
    provider.setSurname(entity.getSurname());
    provider.setAddress(entity.getAddress());
    provider.setEmail(entity.getEmail());
    provider.setPhone(entity.getPhone());
    providerJpaController.edit(provider);
    return providerJpaController.findProvider(entity.getId());
    }

    @Override
    public Provider findById(Long id) {
        return providerJpaController.findProvider(id);
   }

    @Override
    public List<Provider> findAll() {
        return providerJpaController.findProviderEntities();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        Provider provider = providerJpaController.findProvider(id);
        provider.setEnabled(false);
        providerJpaController.edit(provider);
   }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        providerJpaController.destroy(id);
    }
    
}
