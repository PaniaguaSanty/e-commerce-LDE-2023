package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;

import java.util.List;

import com.itec1.e_commerce.dao.CarrierJpaController;
import com.itec1.e_commerce.entities.Carrier;

public class CarrierServiceImpl implements ICRUD<Carrier> {

    private final CarrierJpaController carrierJpaController;

    public CarrierServiceImpl() {
        this.carrierJpaController = new CarrierJpaController(Connection.getEmf());
    }

    public CarrierServiceImpl(CarrierJpaController carrierJpaController) {
        this.carrierJpaController = carrierJpaController;
    }

    @Override
    public Carrier create(Carrier entity) {
        carrierJpaController.create(entity);
        return carrierJpaController.findCarrier(entity.getId());
    }

    @Override
    public Carrier update(Long id, Carrier entity) throws Exception {
        Carrier carrier = carrierJpaController.findCarrier(id);
        carrier.setName(entity.getName());
        carrier.setCuit(entity.getCuit());
        carrier.setPhone(entity.getPhone());
        carrier.setGround(entity.isGround());
        carrier.setMaritime(entity.isMaritime());
        carrier.setAerial(entity.isAerial());
        carrierJpaController.edit(carrier);
        return carrierJpaController.findCarrier(id);
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
    public List<Carrier> findAllEnabled() {
        return findAll().stream().filter(Carrier::isEnable).toList();
    }

    public List<Carrier> findAllDisabled() {
        return findAll().stream().filter(carrier -> !carrier.isEnable()).toList();
    }

    @Override
    public Carrier disable(Long id) throws Exception {
        Carrier carrier = carrierJpaController.findCarrier(id);
        carrier.setEnable(false);
        carrierJpaController.edit(carrier);
        return carrierJpaController.findCarrier(id);
    }

    @Override
    public Carrier delete(Long id) throws Exception {
        carrierJpaController.destroy(id);
        return carrierJpaController.findCarrier(id);
    }

    @Override
    public Carrier enable(Long id) throws Exception {
        Carrier carrier = carrierJpaController.findCarrier(id);
        carrier.setEnable(true);
        carrierJpaController.edit(carrier);
        return carrierJpaController.findCarrier(id);
    }

    public Carrier findByCuit(String cuit) {
        return carrierJpaController.findCarrierEntities().stream()
                .filter(carrier -> carrier.getCuit().equals(cuit))
                .findFirst()
                .orElse(null);
    }

    public List<Carrier> findByTypeOfTransport(String transportType) {
        return findAllEnabled().stream().filter(carrier -> switch (transportType) {
            case "aerial" ->
                carrier.isAerial();
            case "ground" ->
                carrier.isGround();
            case "maritime" ->
                carrier.isMaritime();
            default ->
                false;
        }).toList();
    }

    public String verifyEnabledTransports(Carrier carrier) {
        return (carrier.isGround()
                ? (carrier.isMaritime()
                ? (carrier.isAerial()
                ? "Terrestre, Marítimo y Aéreo" : "Terrestre y Marítimo") : (carrier.isAerial()
                ? "Terrestre y Aéreo" : "Terrestre")) : (carrier.isMaritime()
                ? (carrier.isAerial()
                ? "Marítimo y Aéreo" : "Marítimo") : "Aéreo"));
    }
}
