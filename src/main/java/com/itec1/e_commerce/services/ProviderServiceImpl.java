package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.ProviderJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Provider;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author melina
 */
public class ProviderServiceImpl implements ICRUD<Provider> {

    private final ProviderJpaController providerJpaController;

    public ProviderServiceImpl() {
        this.providerJpaController = new ProviderJpaController(Connection.getEmf());
    }

    public ProviderServiceImpl(ProviderJpaController jpa) {
        this.providerJpaController = jpa;
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
    public Provider update(Long id, Provider entity) throws Exception {
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
        return providerJpaController.findProviderEntities();
    }

    @Override
    public List<Provider> findAllEnabled() {
        return findAll().stream().filter(Provider::isEnable).toList();
    }

    @Override
    public Provider disable(Long id) throws Exception {
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
    public Provider enable(Long id) throws Exception {
        Provider provider = providerJpaController.findProvider(id);
        provider.setEnable(true);
        providerJpaController.edit(provider);
        return providerJpaController.findProvider(id);
    }

    public Provider findByCuit(String cuit) {
        return findAll().stream()
                .filter(client -> client.getCuit().equals(cuit))
                .findFirst().orElse(null);
    }

    public Provider findByName(String name) {
        return findAll().stream()
                .filter(product -> product.getName().equals(name))
                .findFirst().orElse(null);
    }

    public void getProviderCMB(JComboBox comboBox_provider) {
        providerJpaController.getProviderCMB(comboBox_provider);
    }
}
