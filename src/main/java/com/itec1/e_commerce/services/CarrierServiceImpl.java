package com.itec1.e_commerce.services;

import java.util.List;

import com.itec1.e_commerce.dao.CarrierJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Carrier;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;

public class CarrierServiceImpl implements ICRUD<Carrier> {

    private final CarrierJpaController carrierJpaController;

    public CarrierServiceImpl(CarrierJpaController carrierJpaController) {
        this.carrierJpaController = carrierJpaController;
    }

    @Override
    public Carrier create(Carrier entity) {
        try {
            carrierJpaController.create(entity);
            return carrierJpaController.findCarrier(entity.getId());
        } catch (Exception e) {
            System.err.println("Error when creating the carrier: " + e.getMessage());
            throw new RuntimeException("Failed to create carrier.", e);
        }
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
    public Carrier disable(Long id) throws NonexistentEntityException, Exception {
        Carrier carrier = carrierJpaController.findCarrier(id);
        carrier.setEnable(false);
        carrierJpaController.edit(carrier);
        return carrierJpaController.findCarrier(id);
    }

    @Override
    public Carrier delete(Long id) throws NonexistentEntityException {
        carrierJpaController.destroy(id);
        return carrierJpaController.findCarrier(id);
    }

    @Override
    public Carrier enable(Long id) throws NonexistentEntityException, Exception {
        Carrier carrier = carrierJpaController.findCarrier(id);
        carrier.setEnable(true);
        carrierJpaController.edit(carrier);
        return carrierJpaController.findCarrier(id);
    }

    public Carrier findByCuit(String cuit) {
        try {
            return carrierJpaController.findCarrierEntities().stream()
                    .filter(carrier -> carrier.getCuit().equals(cuit))
                    .findFirst()
                    .orElseThrow(() -> new EntityNotFoundException("Carrier with CUIT: " + cuit + " Not found"));
        } catch (Exception e) {
            System.err.println("Error while searching for carrier by CUIT: " + e.getMessage());
            throw new RuntimeException("Error while searching for carrier by CUIT. Please try again later.", e);
        }
    }

    public List<Carrier> searchByTypeOfTransport(String transportType) {
        try {
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
        } catch (Exception e) {
            System.err.println("Error while searching for carriers by type of transport: " + e.getMessage());
            throw new RuntimeException("Error while searching for carriers by type of transport. Please try again later.", e);
        }
    }
}
