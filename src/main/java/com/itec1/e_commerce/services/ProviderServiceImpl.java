/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.ProviderJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Provider;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;

/**
 *
 * @author melina
 */
public class ProviderServiceImpl implements ICRUD<Provider> {
    
    private final ProviderJpaController providerJpaController;
    
    public ProviderServiceImpl() {
        this.providerJpaController = new ProviderJpaController(Connection.getEmf());
    }
    
    @Override
    public Provider create(Provider entity) {
        try {
            providerJpaController.create(entity);
            return providerJpaController.findProvider(entity.getId());
        } catch (Exception e) {
            System.err.println("Error while creating a provider: " + e.getMessage());
            throw new RuntimeException("Failed to create a provider", e);
        }
    }
    
    @Override
    public Provider update(Long id, Provider entity) throws NonexistentEntityException, Exception {
        Provider provider = providerJpaController.findProvider(id);
        provider.setCuit(entity.getCuit());
        provider.setName(entity.getName());
        provider.setLastname(entity.getLastname());
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
        return providerJpaController.findProviderEntities().stream()
                .filter(provider -> provider.getEnable())
                .collect(Collectors.toList());
    }
    
    @Override
    public Provider disable(Long id) throws NonexistentEntityException, Exception {
        Provider provider = providerJpaController.findProvider(id);
        provider.setEnable(false);
        providerJpaController.edit(provider);
        return providerJpaController.findProvider(id);
    }
    
    @Override
    public Provider delete(Long id) throws NonexistentEntityException {
        providerJpaController.destroy(id);
        return providerJpaController.findProvider(id);
    }
    
    @Override
    public Provider enable(Long id) throws NonexistentEntityException, Exception {
        Provider provider = providerJpaController.findProvider(id);
        provider.setEnable(true);
        providerJpaController.edit(provider);
        return providerJpaController.findProvider(id);
    }
    
    public Provider findByCuit(String cuit) {
        return providerJpaController.findProviderEntities()
                .stream()
                .filter(provider -> provider.getCuit().equals(cuit))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Provider not found with CUIT: " + cuit));
    }
}
