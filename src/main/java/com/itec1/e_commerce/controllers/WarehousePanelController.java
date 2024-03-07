/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    private final WarehouseServiceImpl warehouseServiceImpl;
    private final Management_Warehouses_Panel warehousePanel;

    public WarehousePanelController(Management_Warehouses_Panel warehousePanel) {
        this.warehouseServiceImpl = new WarehouseServiceImpl();
        this.warehousePanel = warehousePanel;
    }

    @Override
    public List<Warehouse> updateTable(String direccion) {
        DefaultTableModel model = new DefaultTableModel();
        //agrega los titulos a la columna
        String[] titles = {"Id", "Pais", "Dirección", "Latitud", "Longitud"};
        model.setColumnIdentifiers(titles);
        List<Warehouse> warehouse = warehouseServiceImpl.findAll();
        List<Warehouse> result = new ArrayList<>();
        for (Warehouse wh : warehouse) {
            if (wh.getAddress().startsWith(direccion)) {
                Object[] object = {wh.getCountry(), wh.getAddress(), wh.getLatitude(), wh.getLongitude()};
                model.addRow(object);
                result.add(wh);
            }
        }
        this.warehousePanel.getTable().setModel(model);
        return result;
    }

    @Override
    public String create(Warehouse entity) {
        if (warehouseServiceImpl.findByAddress(entity.getAddress()) != null) {
            return "ERROR. Esta dirección ya pertenece a una sucursal.";
        } else {
            warehouseServiceImpl.create(entity);
        }
        return "Sucursal creada correctamente.";
    }

    @Override
    public String update(Long id, Warehouse entity) {
        try {
            warehouseServiceImpl.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. Esta Sucursal no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Sucursal actualizada correctamente";
    }

    @Override
    public Warehouse findById(Long id) {
        return warehouseServiceImpl.findById(id);
    }

    @Override
    public List<Warehouse> findAll() {
        return warehouseServiceImpl.findAll();
    }

    @Override
    public String disable(Long id) {
        Warehouse warehouse = warehouseServiceImpl.findById(id);
        if (!warehouse.getEnabled()) {
            return "Error. esta sucursal ya se encuentra eliminada";
        } else {
            try {
                warehouseServiceImpl.disable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Esta sucursal no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Sucursal eliminada correctamente.";
    }

    public List<Warehouse> findWarehouseByCountry(String countryName) {
        return warehouseServiceImpl.findWarehouseByCountry(countryName);

    }

    public List<Warehouse> findByAddress(String Address) {

        return warehouseServiceImpl.findByAddress(Address);

    }

    @Override
    public String enable(Long id) {
        Warehouse warehouse = warehouseServiceImpl.findById(id);
        if (warehouse.getEnabled()) {
            return "ERROR. Esta sucursal no se encuntra eliminada.";
        } else {
            try {
                warehouseServiceImpl.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Esta sucursal no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Sucursal recuperada correctamente.";
    }
}


