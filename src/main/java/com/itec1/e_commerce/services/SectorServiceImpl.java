package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.SectorJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.Warehouse;

import java.util.List;

/**
 * @author pania
 */
public class SectorServiceImpl implements ICRUD<Sector> {

    private final SectorJpaController sectorJpaController;
    private final OrderServiceImpl orderService;

    public SectorServiceImpl() {
        this.sectorJpaController = new SectorJpaController(Connection.getEmf());
        this.orderService = new OrderServiceImpl();
    }

    public SectorServiceImpl(SectorJpaController sectorJpaController, OrderServiceImpl orderService) {
        this.sectorJpaController = sectorJpaController;
        this.orderService = orderService;
    }

    @Override
    public Sector create(Sector entity) {
        try {
            sectorJpaController.create(entity);
            return sectorJpaController.findSector(entity.getId());
        } catch (Exception e) {
            System.err.println("Error while creating a new sector: " + e.getMessage());
            throw new RuntimeException("Failed to create a sector", e);
        }
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
        sector.setEnable(false);
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
        sector.setEnable(true);
        sectorJpaController.edit(sector);
        return sectorJpaController.findSector(id);
    }

    @Override
    public Sector findById(Long id) {
        return sectorJpaController.findSector(id);
    }

    @Override
    public List<Sector> findAll() {
        return sectorJpaController.findSectorEntities();
    }

    @Override
    public List<Sector> findAllEnabled() {
        return findAll().stream().filter(Sector::isEnable).toList();
    }

    public Sector findSectorByName(String sectorName, Warehouse entity) {
        List<Sector> sectors = findSectorByWarehouse(entity);
        return sectors
                .stream()
                .filter(sector -> sector.getName().equals(sectorName))
                .findFirst()
                .orElse(null);
    }

    public List<Sector> findSectorByWarehouse(Warehouse warehouse) {
        return findAll().stream()
                .filter(sector -> sector.getWarehouse().getId()
                .equals(warehouse.getId())).toList();
    }

    public Sector findByCode(String string) {
        return findAll().stream()
                .filter(sector -> sector.getCode().equals(string))
                .findFirst().orElse(null);
    }

    public Sector changeSector(Order order, Sector sector) throws Exception {
        order.setSector(sector);
        return orderService.changeSector(order, sector).getSector();
    }
}
