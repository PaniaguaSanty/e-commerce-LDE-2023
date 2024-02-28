/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.SectorJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Sector;
import java.util.List;

/**
 *
 * @author pania
 */
public class SectorServiceImpl implements ICRUD<Sector> {

    private final SectorJpaController sectorJpaController;

    public SectorServiceImpl(SectorJpaController sectorJpaController) {
        this.sectorJpaController = sectorJpaController;
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
        sector.setWarehouse(entity.getWarehouse());
        sector.setOrders(entity.getOrders());
        sectorJpaController.edit(entity);
        return sectorJpaController.findSector(entity.getId());
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        Sector sector = sectorJpaController.findSector(id);
        sector.setEnabled(false);
        sectorJpaController.edit(sector);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        sectorJpaController.destroy(id);
    }

    @Override
    public Sector findById(Long id) {
        return sectorJpaController.findSector(id);
    }

    @Override
    public List<Sector> findAll() {
        return sectorJpaController.findSectorEntities();
    }

    public List<Sector> findSectorByName(String sectorName) {
        return sectorJpaController.findSectorEntities()
                .stream()
                .filter(sector -> sector.getName().equals(sectorName))
                .toList();
    }

    public List<Sector> findSectorByWarehouse(String enabledSectors) {
        return sectorJpaController.findSectorEntities()
                .stream()
                .filter(sector -> sector.getWarehouse()
                .equals(enabledSectors))
                .toList();
    }

}
