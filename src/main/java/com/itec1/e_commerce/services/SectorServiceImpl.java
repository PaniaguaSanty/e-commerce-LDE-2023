/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.OrderJpaController;
import com.itec1.e_commerce.dao.SectorJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.Warehouse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pania
 */
public class SectorServiceImpl implements ICRUD<Sector> {

    private final SectorJpaController sectorJpaController;
    private final OrderJpaController orderJpaController;

    public SectorServiceImpl(SectorJpaController sectorJpaController, OrderJpaController orderJpaController) {
        this.sectorJpaController = sectorJpaController;
        this.orderJpaController = orderJpaController;
    }

    @Override
    public Sector create(Sector entity) {
        sectorJpaController.create(entity);
        return sectorJpaController.findSector(entity.getId());
    }

    @Override
    public Sector update(Long id, Sector entity) throws NonexistentEntityException, Exception {
        Sector sector = sectorJpaController.findSector(id);
        sector.setName(entity.getName());
        sectorJpaController.edit(entity);
        return sectorJpaController.findSector(entity.getId());
    }

    @Override
    public Sector disable(Long id) throws NonexistentEntityException, Exception {
        Sector sector = sectorJpaController.findSector(id);
        sector.setEnabled(false);
        sectorJpaController.edit(sector);
        return sectorJpaController.findSector(id);
    }

    @Override
    public Sector delete(Long id) throws NonexistentEntityException {
        sectorJpaController.destroy(id);
        return sectorJpaController.findSector(id);
    }

    @Override
    public Sector enable(Long id) throws NonexistentEntityException, Exception {
        Sector sector = sectorJpaController.findSector(id);
        sector.setEnabled(true);
        sectorJpaController.edit(sector);
        return sectorJpaController.findSector(id);
    }

    @Override
    public Sector findById(Long id) {
        return sectorJpaController.findSector(id);
    }

    @Override
    public List<Sector> findAll() {
        List<Sector> sectors = new ArrayList<>();
        for (Sector se : sectorJpaController.findSectorEntities()) {
            if (se.getEnabled()) {
                sectors.add(se);
            }
        }
        return sectors;
    }

    public Sector findSectorByName(String sectorName, Warehouse entity) {
        List<Sector> sectors = findSectorByWarehouse(entity);
        return sectors
                .stream()
                .filter(sector -> sector.getName().equals(sectorName))
                .findFirst().orElse(null);
    }

    public List<Sector> findSectorByWarehouse(Warehouse warehouse) {
        return sectorJpaController.findSectorEntities()
                .stream()
                .filter(sector -> sector.getWarehouse().getId()
                .equals(warehouse.getId()))
                .toList();
    }

    public Order changeSector(Order order, Sector sector) throws Exception {
        order.setSector(sector);
        orderJpaController.edit(order);
        return orderJpaController.findOrder(order.getId());
    }

}
