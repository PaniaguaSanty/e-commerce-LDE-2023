/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.services.SectorServiceImpl;
import java.util.List;

/**
 *
 * @author melina
 */
public class SectorController implements ICRUD<Sector> {

    private final SectorServiceImpl sectorServiceImpl;

    public SectorController(SectorServiceImpl sectorServiceImpl) {
        this.sectorServiceImpl = sectorServiceImpl;
    }

    @Override
    public Sector create(Sector entity) {
        return sectorServiceImpl.create(entity);
    }

    @Override
    public Sector update(Long id, Sector entity) throws NonexistentEntityException, Exception {
        return sectorServiceImpl.update(id, entity);
    }

    @Override
    public Sector findById(Long id) {
        return sectorServiceImpl.findById(id);
    }

    @Override
    public List<Sector> findAll() {
        return sectorServiceImpl.findAll();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        sectorServiceImpl.disable(id);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        sectorServiceImpl.delete(id);
    }

    public Sector findSectorByName(String sectorName, Warehouse entity) {
        return sectorServiceImpl.findSectorByName(sectorName, entity);
    }

    public List<Sector> findSectorByWarehouse(Warehouse warehouse) {
        return sectorServiceImpl.findSectorByWarehouse(warehouse);
    }

    public Order changeSector(Order order, Sector sector) throws Exception {
        return sectorServiceImpl.changeSector(order, sector);
    }
}
