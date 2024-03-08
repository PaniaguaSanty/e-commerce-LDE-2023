/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.ProductCategoryJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.ProductCategory;
import java.util.List;
import javax.persistence.EntityNotFoundException;

/**
 *
 * @author melina
 */
public class ProductCategoryServiceImpl implements ICRUD<ProductCategory> {

    private final ProductCategoryJpaController productCategoryJpaController;

    public ProductCategoryServiceImpl() {
        this.productCategoryJpaController = new ProductCategoryJpaController(Connection.getEmf());
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
    public ProductCategory update(Long id, ProductCategory entity) throws NonexistentEntityException, Exception {
        ProductCategory productCategory = productCategoryJpaController.findProductCategory(id);
        productCategory.setDescription(entity.getDescription());
        productCategoryJpaController.edit(productCategory);
        return productCategoryJpaController.findProductCategory(id);
    }

    @Override
    public ProductCategory findById(Long id) {
        return productCategoryJpaController.findProductCategory(id);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryJpaController.findProductCategoryEntities().stream()
                .filter(producCategory -> producCategory.isEnable()).toList();
    }

    @Override
    public ProductCategory disable(Long id) throws NonexistentEntityException, Exception {
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
                .filter(productCategory -> productCategory.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
