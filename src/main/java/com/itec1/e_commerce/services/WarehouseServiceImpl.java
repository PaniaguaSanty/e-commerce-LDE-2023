package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.WarehouseJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.Warehouse;
import java.util.List;

/**
 *
 * @author pania
 */
public class WarehouseServiceImpl implements ICRUD<Warehouse> {

    private final WarehouseJpaController warehouseJpaController;
    private final SectorServiceImpl sectorService;

    public WarehouseServiceImpl() {
        this.warehouseJpaController = new WarehouseJpaController(Connection.getEmf());
        this.sectorService = new SectorServiceImpl();
    }

    @Override
    public Warehouse create(Warehouse entity) {
        warehouseJpaController.create(entity);
        sectorService.create(new Sector("entregados", entity, "001"));
        sectorService.create(new Sector("devueltos", entity, "002"));
        sectorService.create(new Sector("recepcion", entity, "003"));
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
    public List<Warehouse> findAllEnabled() {
        return findAll().stream().filter(Warehouse::isEnable).toList();
    }

    @Override
    public Warehouse disable(Long id) throws NonexistentEntityException, Exception {
        Warehouse warehouse = warehouseJpaController.findWarehouse(id);
        warehouse.setEnable(false);
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
        warehouse.setEnable(true);
        warehouseJpaController.edit(warehouse);
        return warehouseJpaController.findWarehouse(id);
    }

    public List<Warehouse> findWarehouseByCountry(String countryName) {
        return findAll().stream()
                .filter(warehouse -> warehouse.getCountry()
                .equals(countryName)).toList();
    }

    public Warehouse findByCode(String code) {
        return findAll().stream()
                .filter(warehouse -> warehouse.getCode()
                .equals(code)).findFirst().orElse(null);
    }
}
