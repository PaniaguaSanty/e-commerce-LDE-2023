package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.services.ProductServiceImpl;
import com.itec1.e_commerce.services.ProviderServiceImpl;
import com.itec1.e_commerce.views.Management_Products_Panel;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ProductPanelController implements IController<Product> {

    private final ProductServiceImpl service;
    private final ProductCategoryServiceImpl categoryService;
    private final ProviderServiceImpl providerService;
    private final Management_Products_Panel panel;
    private String crudOption = "";

    public ProductPanelController(Management_Products_Panel panel) {
        this.service = new ProductServiceImpl();
        this.categoryService = new ProductCategoryServiceImpl();
        this.providerService = new ProviderServiceImpl();
        this.panel = panel;
    }

    @Override
    public List<Product> updateTable(String name) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Nombre", "Descripción", "Peso", "Alto", "Ancho", "Profundidad", "Categoria", "Proveedor", "Habilitado"};
        model.setColumnIdentifiers(titles);
        List<Product> products = service.findAllEnabled();
        List<Product> result = new ArrayList<>();
        String lowerName = name.toLowerCase();
        for (Product prod : products) {
            if (prod.getName().toLowerCase().startsWith(lowerName)) {
                Object[] object = {prod.getId(), prod.getName(), prod.getDescription(), prod.getWeight(), prod.getHigh(), prod.getWidth(), prod.getDepth(), prod.getProductCategory().getName(), prod.getProvider().getName(), prod.isEnable()};
                model.addRow(object);
                result.add(prod);
            }
        }
        this.panel.getTable().setModel(model);
        return result;
    }

    @Override
    public String create(Product entity) {
        if (service.findByName(entity.getName()) != null) {
            return "ERROR. Ya existe ese Producto !!!";
        } else {
            service.create(entity);
        }
        return "Producto creado correctamente.";
    }

    @Override
    public String update(Long id, Product entity) {
        try {
            service.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. Este producto no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Producto actualizado correctamente";
    }

    @Override
    public Product findById(Long id) {
        return service.findById(id);
    }

    public Product findByName(String name) throws EntityNotFoundException {
        return service.findByName(name);
    }

    @Override
    public List<Product> findAll() {
        return service.findAll();
    }

    @Override
    public String disable(Long id) {
        Product prod = service.findById(id);
        if (!prod.isEnable()) {
            return "ERROR. El producto ya está eliminado.";
        } else {
            try {
                service.disable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este producto no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Producto eliminado correctamente.";
    }

    @Override
    public String enable(Long id) {
        Product prod = service.findById(id);
        if (prod.isEnable()) {
            return "ERROR. Este producto no se encuentra eliminado.";
        } else {
            try {
                service.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este producto no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Producto recuperado correctamente.";
    }

    @Override
    public boolean verifyCrud(String selectedOption) {
        if (!crudOption.equals(selectedOption)) {
            crudOption = selectedOption;
            return true;
        }
        return false;
    }

    public ProductCategory getCategoryByName(String name) {
        return categoryService.findByName(name);
    }

    public Provider getProviderByName(String name) {
        return providerService.findByName(name);
    }

    public void getCategoryCMB(JComboBox comboBox_category) {
        categoryService.getCategoryCMB(comboBox_category);
    }

    public void getProviderCMB(JComboBox comboBox_provider) {
        providerService.getProviderCMB(comboBox_provider);
    }
}
