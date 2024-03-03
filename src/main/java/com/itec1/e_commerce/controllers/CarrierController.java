/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.services.CarrierServiceImpl;
import java.util.List;

/**
 *
 * @author melina
 */
public class CarrierController implements ICRUD<Carrier> {

    private final CarrierServiceImpl carrierServiceImpl;

    public CarrierController(CarrierServiceImpl CarrierServiceImpl) {
        this.carrierServiceImpl = CarrierServiceImpl;
    }

    @Override
    public Carrier create(Carrier entity) {
        return carrierServiceImpl.create(entity);
    }

    @Override
    public Carrier update(Long id, Carrier entity) throws NonexistentEntityException, Exception {
        return carrierServiceImpl.update(id, entity);
    }

    @Override
    public Carrier findById(Long id) {
        return carrierServiceImpl.findById(id);
    }

    @Override
    public List<Carrier> findAll() {
        return carrierServiceImpl.findAll();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        carrierServiceImpl.disable(id);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        carrierServiceImpl.delete(id);
    }

    public Carrier findByCuit(String cuit) {
        return carrierServiceImpl.findByCuit(cuit);
    }

    public List<Carrier> searchByTypeOfTransport(String transportType) {
        return carrierServiceImpl.searchByTypeOfTransport(transportType);
    }

}
