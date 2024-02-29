/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.ProductCategoryJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.ProductCategory;
import java.util.List;

/**
 *
 * @author melina
 */
public class ProductCategoryServiceImpl implements ICRUD<ProductCategory> {

    private final ProductCategoryJpaController productCategoryJpaController;

    public ProductCategoryServiceImpl(ProductCategoryJpaController productCategoryJpaController) {
        this.productCategoryJpaController = productCategoryJpaController;
    }

    @Override
    public ProductCategory create(ProductCategory entity) {
        productCategoryJpaController.create(entity);
        return productCategoryJpaController.findProductCategory(entity.getId());
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
        return productCategoryJpaController.findProductCategoryEntities();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        ProductCategory productCategory = productCategoryJpaController.findProductCategory(id);
        productCategory.setEnable(false);
        productCategoryJpaController.edit(productCategory);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        productCategoryJpaController.destroy(id);
    }

    public ProductCategory findByName(String name) {
        return productCategoryJpaController.findProductCategoryEntities().stream()
                .filter(productCategory -> productCategory.getName().equals(name))
                .findFirst().orElse(null);
    }
}
