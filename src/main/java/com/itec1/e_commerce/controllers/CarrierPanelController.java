package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.services.CarrierServiceImpl;
import com.itec1.e_commerce.views.Management_Carriers_Panel;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.table.DefaultTableModel;

public class CarrierPanelController implements IController<Carrier> {

    private final CarrierServiceImpl service;
    private final Management_Carriers_Panel panel;
    String crudOption = "";

    public CarrierPanelController(Management_Carriers_Panel panel) {
        this.service = new CarrierServiceImpl();
        this.panel = panel;
    }

    @Override
    public List<Carrier> updateTable(String cuit) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Nombre", "C.U.I.T.", "Teléfono", "Transportes habilitados"};
        model.setColumnIdentifiers(titles);
        List<Carrier> carriers = service.findAllEnabled();
        List<Carrier> result = new ArrayList<>();
        for (Carrier carrier : carriers) {
            if (carrier.getCuit().startsWith(cuit)) {
                Object[] object = {carrier.getId(), carrier.getName(),
                    carrier.getCuit(), carrier.getPhone(), service.verifyEnabledTransports(carrier)};
                model.addRow(object);
                result.add(carrier);
            }
        }
        this.panel.getTable().setModel(model);
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
            service.create(entity);
        }
        return "Cliente creado correctamente.";
    }

    @Override
    public String update(Long id, Carrier entity) {
        try {
            service.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. este cliente no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Cliente actualizado correctamente";
    }

    @Override
    public Carrier findById(Long id) {
        return service.findById(id);
    }

    public Carrier findByCuit(String cuit) {
        return service.findByCuit(cuit);
    }

    @Override
    public List<Carrier> findAll() {
        return service.findAll();
    }

    public List<Carrier> findByTransportType(String transportType) {
        return service.findByTypeOfTransport(transportType);
    }

    @Override
    public String disable(Long id) {
        Carrier carrier = service.findById(id);
        if (!carrier.isEnable()) {
            return "ERROR. Este cliente ya se encuentra eliminado.";
        } else {
            try {
                service.disable(id);
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
        Carrier carrier = service.findById(id);
        if (carrier.isEnable()) {
            return "ERROR. Este cliente no se encuentra eliminado.";
        } else {
            try {
                service.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este cliente no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Cliente recuperado correctamente.";
    }
}
