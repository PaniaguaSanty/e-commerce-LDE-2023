/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.services.CarrierServiceImpl;
import com.itec1.e_commerce.views.Management_Carriers_Panel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author turraca
 */
public class CarrierPanelController implements IController<Carrier> {

    private final CarrierServiceImpl carrierService;
    private final Management_Carriers_Panel carriersPanel;
    String crudOption = "";

    public CarrierPanelController(Management_Carriers_Panel carriersPanel) {
        this.carrierService = new CarrierServiceImpl();
        this.carriersPanel = carriersPanel;
    }

    @Override
    public List<Carrier> updateTable(String cuit) {
        DefaultTableModel model = new DefaultTableModel();
        //agrega los titulos a la columna
        String[] titles = {"Id", "Nombre", "C.U.I.T.", "Teléfono", "Transportes habilitados"};
        model.setColumnIdentifiers(titles);
        List<Carrier> clients = carrierService.findAll();
        List<Carrier> result = new ArrayList<>();
        for (Carrier carrier : clients) {
            if (carrier.getCuit().startsWith(cuit)) {
                Object[] object = {carrier.getId(), carrier.getName(),
                    carrier.getCuit(), carrier.getPhone(), verifyEnabledTransports(carrier)};
                model.addRow(object);
                result.add(carrier);
            }
        }
        this.carriersPanel.getTable().setModel(model);
        return result;
    }

    private String verifyEnabledTransports(Carrier carrier) {
        String result = (carrier.getGround()
                ? (carrier.getMaritime()
                ? (carrier.getAerial()
                ? "Terrestre, Marítimo y Aéreo" : "Terrestre y Marítimo") : "Terrestre")
                : (carrier.getAerial()
                ? (carrier.getMaritime()
                ? "Marítimo y Aéreo" : "Aéreo") : "Marítimo"));
        return result;
    }

    @Override
    public boolean verifyCrud(String selectedOption) {
        if (!crudOption.equals(selectedOption)) {
            crudOption = selectedOption;
            return true;
        }
        return false;
    }

    @Override
    public String create(Carrier entity) {
        if (findByCuit(entity.getCuit()) != null) {
            return "ERROR. Este CUIT ya pertenece a un cliente.";
        } else {
            carrierService.create(entity);
        }
        return "Cliente creado correctamente.";
    }

    @Override
    public String update(Long id, Carrier entity) {
        try {
            carrierService.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. este cliente no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Cliente actualizado correctamente";
    }

    @Override
    public Carrier findById(Long id) {
        return carrierService.findById(id);
    }

    public Carrier findByCuit(String cuit) {
        return carrierService.findByCuit(cuit);
    }

    @Override
    public List<Carrier> findAll() {
        return carrierService.findAll();
    }

    public List<Carrier> findByTransportType(String transportType) {
        return carrierService.findByTypeOfTransport(transportType);
    }

    @Override
    public String disable(Long id) {
        Carrier carrier = carrierService.findById(id);
        if (!carrier.getEnable()) {
            return "ERROR. Este cliente ya se encuentra eliminado.";
        } else {
            try {
                carrierService.disable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este cliente no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Cliente eliminado correctamente.";
    }

    @Override
    public String enable(Long id) {
        Carrier carrier = carrierService.findById(id);
        if (carrier.getEnable()) {
            return "ERROR. Este cliente no se encuentra eliminado.";
        } else {
            try {
                carrierService.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este cliente no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Cliente recuperado correctamente.";
    }

}
