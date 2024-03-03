/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.services.ProductServiceImpl;
import java.util.List;

/**
 *
 * @author melina
 */
public class ProductController implements ICRUD<Product> {

    private final ProductServiceImpl productServiceImpl;

    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @Override
    public Product create(Product entity) {
        return productServiceImpl.create(entity);
    }

    @Override
    public Product update(Long id, Product entity) throws NonexistentEntityException, Exception {
        return productServiceImpl.update(id, entity);

    }

    @Override
    public Product findById(Long id) {
        return productServiceImpl.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productServiceImpl.findAll();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        productServiceImpl.disable(id);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        productServiceImpl.delete(id);
    }

    public List<Product> findProductsByName(String name) {
        return productServiceImpl.findProductsByName(name);
    }

    public List<Product> findProductsByCategory(String category) {
        return productServiceImpl.findProductsByCategory(category);
    }

    public List<Product> findProductsByProvider(String cuit) {
        return productServiceImpl.findProductsByProvider(cuit);
    }

    public Product updateProductCategory(Long id, Product entity) throws Exception {
        return productServiceImpl.updateProductCategory(id, entity);
    }

}
