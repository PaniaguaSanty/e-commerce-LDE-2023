/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import java.util.List;

/**
 *
 * @author melina
 */
public class ProductCategoryController implements ICRUD<ProductCategory> {

    private final ProductCategoryServiceImpl productCategoryServiceImpl;

    public ProductCategoryController(ProductCategoryServiceImpl ProductCategoryServiceImpl) {
        this.productCategoryServiceImpl = ProductCategoryServiceImpl;
    }

    @Override
    public ProductCategory create(ProductCategory entity) {
        return productCategoryServiceImpl.create(entity);
    }

    @Override
    public ProductCategory update(Long id, ProductCategory entity) throws NonexistentEntityException, Exception {
        return productCategoryServiceImpl.update(id, entity);
    }

    @Override
    public ProductCategory findById(Long id) {
        return productCategoryServiceImpl.findById(id);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryServiceImpl.findAll();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        productCategoryServiceImpl.disable(id);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        productCategoryServiceImpl.delete(id);
    }

    public ProductCategory findByName(String name) {
        return productCategoryServiceImpl.findByName(name);
    }

}
