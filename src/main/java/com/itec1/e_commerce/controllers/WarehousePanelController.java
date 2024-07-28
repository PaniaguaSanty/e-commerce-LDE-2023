package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.services.WarehouseServiceImpl;
import com.itec1.e_commerce.views.Management_Warehouses_Panel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author melina
 */
public class WarehousePanelController implements IController<Warehouse> {

    private final WarehouseServiceImpl warehouseService;
    private final Management_Warehouses_Panel warehousePanel;
    private String crudOption = "";

    public WarehousePanelController(Management_Warehouses_Panel warehousePanel) {
        this.warehouseService = new WarehouseServiceImpl();
        this.warehousePanel = warehousePanel;
    }

    @Override
    public List<Warehouse> updateTable(String string) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Código", "Dirección", "País", "Latitud", "Longitud"};
        model.setColumnIdentifiers(titles);
        List<Warehouse> warehouses = warehouseService.findAllEnabled();
        List<Warehouse> result = new ArrayList<>();
        for (Warehouse wh : warehouses) {
            if (wh.getCode().startsWith(string)) {
                Object[] object = {wh.getId(), wh.getCode(), wh.getAddress(), wh.getCountry(), wh.getLatitude(), wh.getLongitude()};
                model.addRow(object);
                result.add(wh);
            }
        }
        this.warehousePanel.getTable().setModel(model);
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
    public String create(Warehouse entity) {
        if (warehouseService.findByCode(entity.getCode()) != null) {
            return "ERROR. Este código ya pertence a una sucursal.";
        } else {
            warehouseService.create(entity);
        }
        return "Sucursal creada correctamente.";
    }

    @Override
    public String update(Long id, Warehouse entity) {
        try {
            warehouseService.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. estra sucursal no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Sucursal actualizada correctamente";
    }

    @Override
    public Warehouse findById(Long id) {
        return warehouseService.findById(id);
    }

    @Override
    public List<Warehouse> findAll() {
        return warehouseService.findAll();
    }

    @Override
    public String disable(Long id) {
        Warehouse warehouse = warehouseService.findById(id);
        if (!warehouse.isEnable()) {
            return "ERROR. Esta sucursal ya se encuentra eliminada.";
        } else {
            try {
                warehouseService.disable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Esta sucursal no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Sucursal eliminada correctamente.";
    }

    @Override
    public String enable(Long id) {
        Warehouse warehouse = warehouseService.findById(id);
        if (warehouse.isEnable()) {
            return "ERROR. Esta sucursal no se encuentra eliminada.";
        } else {
            try {
                warehouseService.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Esta sucursal no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Sucursal recuperada correctamente.";
    }

    public Warehouse findByCode(String code) {
        return warehouseService.findByCode(code);
    }
}
