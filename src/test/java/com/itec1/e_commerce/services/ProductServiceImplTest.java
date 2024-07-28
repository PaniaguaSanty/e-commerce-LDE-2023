package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.ProductJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.entities.Provider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class ProductServiceImplTest {

    @Mock
    private ProductJpaController productJpaController;

    private ProductServiceImpl productService;

    private Product product;

    private ProductCategory category;

    private Provider provider;

    private List<Product> productMockDB;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        productService = new ProductServiceImpl(productJpaController);
        category = new ProductCategory("test", "test");
        provider = new Provider("test", "test", "test", "11222222223", "test@test.com", "1234567890");
        product = new Product("test", "test", 1.1F, 2.2F, 3.3F, 4.4F, category, provider);
        productMockDB = new ArrayList<>();
        productMockDB.add(product);
    }

    @Test
    void create() {
        Mockito.doNothing().when(productJpaController).create(product);
        productService.create(product);
        Mockito.verify(productJpaController).create(any(Product.class));
    }

    @Test
    void update() throws Exception {
        Mockito.when(productJpaController.findProduct(product.getId())).thenReturn(product);
        product.setName("test2");
        Mockito.doNothing().when(productJpaController).edit(product);
        productService.update(product.getId(), product);
        assertEquals("test2", product.getName());
    }

    @Test
    void findById() {
        Mockito.when(productJpaController.findProduct(product.getId())).thenReturn(product);
        assertEquals(product, productService.findById(product.getId()));
    }

    @Test
    void findAll() {
        Mockito.when(productJpaController.findProductEntities()).thenReturn(productMockDB);
        assertEquals(productMockDB, productService.findAll());
    }

    @Test
    void disable() throws Exception {
        Mockito.when(productJpaController.findProduct(product.getId())).thenReturn(product);
        product.setEnable(false);
        Mockito.doNothing().when(productJpaController).edit(product);
        productService.disable(product.getId());
        assertFalse(product.isEnable());
    }

    @Test
    void delete() throws NonexistentEntityException {
        Mockito.doNothing().when(productJpaController).destroy(product.getId());
        productService.delete(product.getId());
        Mockito.verify(productJpaController).destroy(product.getId());
    }

    @Test
    void enable() throws Exception {
        Mockito.when(productJpaController.findProduct(product.getId())).thenReturn(product);
        product.setEnable(false);
        Mockito.doNothing().when(productJpaController).edit(product);
        productService.enable(product.getId());
        assertTrue(product.isEnable());
    }

    @Test
    void findProductsByName() {
        Product expected = new Product("test", "test", 1.1F, 2.2F, 3.3F, 4.4F, category, provider);
        Mockito.when(productJpaController.findProductEntities()).thenReturn(productMockDB);
        List <Product> result = productService.findProductsByName(expected.getName());
        assertEquals(expected, result.get(0));
    }

    @Test
    void findProductsByCategory() {
        Product expected = new Product("test", "test", 1.1F, 2.2F, 3.3F, 4.4F, category, provider);
        Mockito.when(productJpaController.findProductEntities()).thenReturn(productMockDB);
        List <Product> result = productService.findProductsByCategory(expected.getProductCategory().getName());
        assertEquals(expected, result.get(0));
    }

    @Test
    void findProductsByProvider() {
        Product expected = new Product("test", "test", 1.1F, 2.2F, 3.3F, 4.4F, category, provider);
        Mockito.when(productJpaController.findProductEntities()).thenReturn(productMockDB);
        List <Product> result = productService.findProductsByProvider(expected.getProvider().getCuit());
        assertEquals(expected, result.get(0));
    }

    @Test
    void updateProductCategory() throws Exception {
        ProductCategory category2 = new ProductCategory("test2", "test2");
        Mockito.when(productJpaController.findProduct(product.getId())).thenReturn(product);
        product.setProductCategory(category2);
        Mockito.doNothing().when(productJpaController).edit(product);
        productService.updateProductCategory(product.getId(), product);
        assertEquals(category2, product.getProductCategory());
    }

    @Test
    void findByName() {
        Product expected = new Product("test", "test", 1.1F, 2.2F, 3.3F, 4.4F, category, provider);
        Mockito.when(productJpaController.findProductEntities()).thenReturn(productMockDB);
        Product result = productService.findByName(expected.getName());
        assertEquals(expected, result);
    }
}