/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.WarehouseJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Warehouse;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author pania
 */
public class WarehouseServiceImpl implements ICRUD<Warehouse> {
    
    private final WarehouseJpaController warehouseJpaController;
    
    public WarehouseServiceImpl(WarehouseJpaController warehouseJpaController) {
        this.warehouseJpaController = warehouseJpaController;
    }
    
    @Override
    public Warehouse create(Warehouse entity) {
        warehouseJpaController.create(entity);
        return warehouseJpaController.findWarehouse(entity.getId());
    }
    
    @Override
    public Warehouse update(Long id, Warehouse entity) throws NonexistentEntityException, Exception {
        Warehouse warehouse = warehouseJpaController.findWarehouse(id);
        warehouse.setAddress(entity.getAddress());
        warehouse.setCountry(entity.getCountry());
        warehouseJpaController.edit(entity);
        return warehouseJpaController.findWarehouse(entity.getId());
    }
    
    @Override
    public Warehouse findById(Long id) {
        return warehouseJpaController.findWarehouse(id);
    }
    
    @Override
    public List<Warehouse> findAll() {
        return warehouseJpaController.findWarehouseEntities();
    }
    
    @Override
    public Warehouse disable(Long id) throws NonexistentEntityException, Exception {
        Warehouse warehouse = warehouseJpaController.findWarehouse(id);
        warehouse.setEnabled(false);
        warehouseJpaController.edit(warehouse);
        return warehouseJpaController.findWarehouse(id);
    }
    
    @Override
    public Warehouse delete(Long id) throws NonexistentEntityException {
        warehouseJpaController.destroy(id);
        return warehouseJpaController.findWarehouse(id);
    }
    
    @Override
    public Warehouse enable(Long id) throws NonexistentEntityException, Exception {
        Warehouse warehouse = warehouseJpaController.findWarehouse(id);
        warehouse.setEnabled(true);
        warehouseJpaController.edit(warehouse);
        return warehouseJpaController.findWarehouse(id);
    }
    
    public List<Warehouse> findWarehouseByCountry(String countryName) {
        return warehouseJpaController.findWarehouseEntities()
                .stream()
                .filter(warehouse -> warehouse.getCountry()
                .equals(countryName))
                .collect(Collectors.toList());
    }
    
}
