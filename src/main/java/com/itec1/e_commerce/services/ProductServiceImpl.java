/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.ProductJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Product;
import java.util.List;
import java.util.stream.Collectors;

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
        try {
            productJpaController.create(entity);
            return productJpaController.findProduct(entity.getId());
        } catch (Exception e) {
            System.err.println("Error while creating a new product: " + e.getMessage());
            throw new RuntimeException("Failed to create a product", e);
        }
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
    public Product disable(Long id) throws NonexistentEntityException, Exception {
        Product product = productJpaController.findProduct(id);
        product.setEnabled(false);
        productJpaController.edit(product);
        return productJpaController.findProduct(id);
    }

    @Override
    public Product delete(Long id) throws NonexistentEntityException {
        productJpaController.destroy(id);
        return productJpaController.findProduct(id);
    }

    @Override
    public Product enable(Long id) throws NonexistentEntityException, Exception {
        Product product = productJpaController.findProduct(id);
        product.setEnabled(false);
        productJpaController.edit(product);
        return productJpaController.findProduct(id);
    }

    public List<Product> findProductsByName(String name) {
        try {
            return productJpaController.findProductEntities().stream()
                    .filter(product -> product.getName().contains(name))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println("Error while finding a product named}: " + e.getMessage());
            throw new RuntimeException("Failed to find products by name.", e);
        }
    }

    public List<Product> findProductsByCategory(String category) {
        try {
            return productJpaController.findProductEntities().stream()
                    .filter(product -> product.getProductCategory().getName().contains(category))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println("Error while finding products by category: " + e.getMessage());
            throw new RuntimeException("Failed to find products by category.", e);
        }
    }

    public List<Product> findProductsByProvider(String cuit) {
        try {
            return productJpaController.findProductEntities().stream()
                    .filter(product -> product.getProvider().getCuit().equals(cuit))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println("Error while finding products by provider´s nonexistent cuit: " + e.getMessage());
            throw new RuntimeException("Failed to find products  by  provider´s cuit: ", e);
        }
    }

    public Product updateProductCategory(Long id, Product entity) throws Exception {
        Product product = productJpaController.findProduct(id);
        product.setProductCategory(entity.getProductCategory());
        productJpaController.edit(product);
        return productJpaController.findProduct(id);
    }
}
