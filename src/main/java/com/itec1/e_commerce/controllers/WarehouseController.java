/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.services.WarehouseServiceImpl;
import java.util.List;

/**
 *
 * @author melina
 */
public class WarehouseController implements ICRUD<Warehouse> {

    private final WarehouseServiceImpl warehouseServiceImpl;

    public WarehouseController(WarehouseServiceImpl warehouseServiceImpl) {
        this.warehouseServiceImpl = warehouseServiceImpl;
    }

    @Override
    public Warehouse create(Warehouse entity) {
        return warehouseServiceImpl.create(entity);
    }

    @Override
    public Warehouse update(Long id, Warehouse entity) throws NonexistentEntityException, Exception {
        return warehouseServiceImpl.update(id, entity);
    }

    @Override
    public Warehouse findById(Long id) {
        return warehouseServiceImpl.findById(id);
    }

    @Override
    public List<Warehouse> findAll() {
        return warehouseServiceImpl.findAll();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        warehouseServiceImpl.disable(id);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        warehouseServiceImpl.delete(id);
    }

    public List<Warehouse> findWarehouseByCountry(String countryName) {
        return warehouseServiceImpl.findWarehouseByCountry(countryName);
    }

}
