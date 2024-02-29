package com.itec1.e_commerce.services;

import java.util.List;

import com.itec1.e_commerce.dao.CarrierJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Carrier;
import java.util.stream.Collectors;

public class CarrierServiceImpl implements ICRUD<Carrier> {

    private final CarrierJpaController carrierJpaController;

    public CarrierServiceImpl(CarrierJpaController carrierJpaController) {
        this.carrierJpaController = carrierJpaController;
    }

    @Override
    public Carrier create(Carrier entity) {
        carrierJpaController.create(entity);
        return carrierJpaController.findCarrier(entity.getId());
    }

    @Override
    public Carrier update(Long id, Carrier entity) throws NonexistentEntityException, Exception {
        Carrier carrier = carrierJpaController.findCarrier(id);
        carrier.setName(entity.getName());
        carrier.setCuit(entity.getCuit());
        carrier.setPhone(entity.getPhone());
        carrier.setGround(entity.getGround());
        carrier.setMaritime(entity.getMaritime());
        carrier.setAerial(entity.getAerial());
        carrierJpaController.edit(carrier);
        return carrierJpaController.findCarrier(entity.getId());
    }

    @Override
    public Carrier findById(Long id) {
        return carrierJpaController.findCarrier(id);
    }

    @Override
    public List<Carrier> findAll() {
        return carrierJpaController.findCarrierEntities();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        Carrier carrier = carrierJpaController.findCarrier(id);
        carrier.setEnable(false);
        carrierJpaController.edit(carrier);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        carrierJpaController.destroy(id);
    }

    public Carrier findByCuit(String cuit) {
        return carrierJpaController.findCarrierEntities().stream()
                .filter(carrier -> carrier.getCuit().equals(cuit))
                .findFirst().orElse(null);
    }

    public List<Carrier> searchByTypeOfTransport(String transportType) {
        return carrierJpaController.findCarrierEntities().stream()
                .filter(carrier -> {
                    if (transportType.equalsIgnoreCase("aerial")) {
                        return carrier.getAerial() == true;
                    } else if (transportType.equalsIgnoreCase("ground")) {
                        return carrier.getGround() == true;
                    } else if (transportType.equalsIgnoreCase("maritime")) {
                        return carrier.getMaritime() == true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }
}
