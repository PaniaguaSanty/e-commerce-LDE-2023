package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.views.Management_Products_Categories_Panel;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ProductCategoryPanelController implements IController<ProductCategory> {

    private final ProductCategoryServiceImpl service;
    private final Management_Products_Categories_Panel panel;
    private String crudOption = "";

    public ProductCategoryPanelController(Management_Products_Categories_Panel panel) {
        this.service = new ProductCategoryServiceImpl();
        this.panel = panel;
    }

    @Override
    public List<ProductCategory> updateTable(String name) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Nombre", "Descripción"};
        model.setColumnIdentifiers(titles);
        List<ProductCategory> categories = service.findAllEnabled();
        List<ProductCategory> result = new ArrayList<>();
        String lowerName = name.toLowerCase();
        for (ProductCategory cat : categories) {
            if (cat.getName().toLowerCase().startsWith(lowerName)) {
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
        return "Categoría creada correctamente.";
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
        return "Categoría actualizada correctamente";
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

    public void getCategoryCombobox(JComboBox categoryCombobox) {
        service.getCategoryCMB(categoryCombobox);
    }
}
