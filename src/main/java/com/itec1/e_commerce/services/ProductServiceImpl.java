/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.ProductJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melina
 */
public class ProductServiceImpl implements ICRUD<Product> {

    private final ProductJpaController productJpaController;

    public ProductServiceImpl(ProductJpaController productJpaController) {
        this.productJpaController = productJpaController;
    }

    @Override
    public Product create(Product entity) {
        productJpaController.create(entity);
        return productJpaController.findProduct(entity.getId());
    }

    @Override
    public Product update(Long id, Product entity) throws NonexistentEntityException, Exception {
        Product product = productJpaController.findProduct(id);
        product.setName(entity.getName());
        product.setDescription(entity.getDescription());
        product.setWeight(entity.getWeight());
        product.setHigh(entity.getHigh());
        product.setWidth(entity.getWidth());
        product.setDepth(entity.getDepth());
        productJpaController.edit(product);
        return productJpaController.findProduct(id);
    }

    @Override
    public Product findById(Long id) {
        return productJpaController.findProduct(id);
    }

    @Override
    public List<Product> findAll() {
        return productJpaController.findProductEntities();
    }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        Product product = productJpaController.findProduct(id);
        product.setEnabled(false);
        productJpaController.edit(product);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        productJpaController.destroy(id);
    }

    public List<Product> findProductsByName(String name) {
        List<Product> productsFound = new ArrayList<>();
        for (Product product : productJpaController.findProductEntities()) {
            if (product.getName().contains(name)) {
                productsFound.add(product);
            }
        }
        return productsFound;
    }

    public List<Product> findProductsByCategory(String category) {
        List<Product> productsFound = new ArrayList<>();
        for (Product product : productJpaController.findProductEntities()) {
            if (product.getProductCategory().getName().contains(category)) {
                productsFound.add(product);
            }
        }
        return productsFound;
    }

    public List<Product> findProductsByProvider(String cuit) {
        List<Product> productsFound = new ArrayList<>();
        for (Product product : productJpaController.findProductEntities()) {
            if (product.getProvider().getCuit().equals(cuit)) {
                productsFound.add(product);
            }
        }
        return productsFound;
    }

    public Product updateProductCategory(Long id, Product entity) throws Exception {
        Product product = productJpaController.findProduct(id);
        product.setProductCategory(entity.getProductCategory());
        productJpaController.edit(product);
        return productJpaController.findProduct(id);
    }
}
