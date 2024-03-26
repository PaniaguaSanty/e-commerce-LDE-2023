package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.ProductCategoryJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.ProductCategory;
import java.util.List;

import javax.swing.JComboBox;

public class ProductCategoryServiceImpl implements ICRUD<ProductCategory> {

    private final ProductCategoryJpaController productCategoryJpaController;

    public ProductCategoryServiceImpl() {
        this.productCategoryJpaController = new ProductCategoryJpaController(Connection.getEmf());
    }

    public ProductCategoryServiceImpl(ProductCategoryJpaController jpaController) {
        this.productCategoryJpaController = jpaController;
    }

    @Override
    public ProductCategory create(ProductCategory entity) {
        try {
            productCategoryJpaController.create(entity);
            return productCategoryJpaController.findProductCategory(entity.getId());
        } catch (Exception e) {
            System.err.println("Error while creating the product category: " + e.getMessage());
            throw new RuntimeException("Failed to create the product category", e);
        }
    }

    @Override
    public ProductCategory update(Long id, ProductCategory entity) {
        ProductCategory productCategory = productCategoryJpaController.findProductCategory(id);
        productCategory.setDescription(entity.getDescription());
        try {
            productCategoryJpaController.edit(productCategory);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return productCategoryJpaController.findProductCategory(id);
    }

    @Override
    public ProductCategory findById(Long id) {
        return productCategoryJpaController.findProductCategory(id);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryJpaController.findProductCategoryEntities();
    }

    @Override
    public List<ProductCategory> findAllEnabled() {
        return findAll().stream().filter(ProductCategory::isEnable).toList();
    }

    @Override
    public ProductCategory disable(Long id) throws Exception {
        ProductCategory productCategory = productCategoryJpaController.findProductCategory(id);
        productCategory.setEnable(false);
        productCategoryJpaController.edit(productCategory);
        return productCategoryJpaController.findProductCategory(id);
    }

    @Override
    public ProductCategory delete(Long id) throws NonexistentEntityException {
        productCategoryJpaController.destroy(id);
        return productCategoryJpaController.findProductCategory(id);
    }

    @Override
    public ProductCategory enable(Long id) throws NonexistentEntityException, Exception {
        ProductCategory productCategory = productCategoryJpaController.findProductCategory(id);
        productCategory.setEnable(true);
        productCategoryJpaController.edit(productCategory);
        return productCategoryJpaController.findProductCategory(id);
    }

    public ProductCategory findByName(String name) {
        return productCategoryJpaController.findProductCategoryEntities().stream()
                .filter(category -> category.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public void getCategoryCMB(JComboBox comboBox_category) {
        productCategoryJpaController.getCategoryCMB(comboBox_category);
    }
}
