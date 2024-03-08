/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.views.Management_Products_Categories_Panel;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author turraca
 */
public class ProductCategoryPanelController implements IController<ProductCategory> {

    private final ProductCategoryServiceImpl service;
    private final Management_Products_Categories_Panel panel;
    private String crudOption = "";

    public ProductCategoryPanelController(Management_Products_Categories_Panel productsCategoriesPanel) {
        this.service = new ProductCategoryServiceImpl();
        this.panel = productsCategoriesPanel;
    }

    @Override
    public List<ProductCategory> updateTable(String name) {
        DefaultTableModel model = new DefaultTableModel();
        //agrega los titulos a la columna
        String[] titles = {"Id", "Nombre", "Descripción"};
        model.setColumnIdentifiers(titles);
        List<ProductCategory> categories = service.findAll();
        List<ProductCategory> result = new ArrayList<>();
        for (ProductCategory cat : categories) {
            if (cat.getName().startsWith(name)) {
                Object[] object = {cat.getId(), cat.getName(), cat.getDescription()};
                model.addRow(object);
                result.add(cat);
            }
        }
        this.panel.getTable().setModel(model);
        return result;
    }

    @Override
    public String create(ProductCategory entity) {
        if (service.findByName(entity.getName()) != null) {
            return "ERROR. Ya existe esa categoría";
        } else {
            service.create(entity);
        }
        return "Cliente creado correctamente.";
    }

    @Override
    public String update(Long id, ProductCategory entity) {
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
    public ProductCategory findById(Long id) {
        return service.findById(id);
    }

    public ProductCategory findByName(String name) throws EntityNotFoundException {
        return service.findByName(name);
    }

    @Override
    public List<ProductCategory> findAll() {
        return service.findAll();
    }

    @Override
    public String disable(Long id) {
        ProductCategory cat = service.findById(id);
        if (!cat.isEnable()) {
            return "ERROR. La categoría ya está eliminada.";
        } else {
            try {
                service.disable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Esta Categoría no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Categoría eliminada correctamente.";
    }

    @Override
    public String enable(Long id) {
        ProductCategory cat = service.findById(id);
        if (cat.isEnable()) {
            return "ERROR. Esta categoria no se encuentra eliminada.";
        } else {
            try {
                service.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Esta categoría no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Categoría recuperada correctamente.";
    }

    @Override
    public boolean verifyCrud(String selectedOption) {
        if (!crudOption.equals(selectedOption)) {
            crudOption = selectedOption;
            return true;
        }
        return false;
    }

}
