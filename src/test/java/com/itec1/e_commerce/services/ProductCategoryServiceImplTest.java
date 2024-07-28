package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.ProductCategoryJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.ProductCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class ProductCategoryServiceImplTest {

    @Mock
    private ProductCategoryJpaController jpaController;

    private ProductCategoryServiceImpl service;

    private ProductCategory category;

    private List<ProductCategory> categoryMockDB;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        service = new ProductCategoryServiceImpl(jpaController);
        category = new ProductCategory("test", "test");
        categoryMockDB = new ArrayList<>();
        categoryMockDB.add(category);
    }

    @Test
    void create() {
        Mockito.doNothing().when(jpaController).create(category);
        service.create(category);
        Mockito.verify(jpaController).create(any());
    }

    @Test
    void update() throws Exception {
        Mockito.when(jpaController.findProductCategory(category.getId())).thenReturn(category);
        category.setName("test2");
        Mockito.doNothing().when(jpaController).edit(category);
        service.update(category.getId(), category);
        assertEquals("test2", category.getName());
    }

    @Test
    void findById() {
        Mockito.when(jpaController.findProductCategory(category.getId())).thenReturn(category);
        assertEquals(category, service.findById(category.getId()));
    }

    @Test
    void findAll() {
        Mockito.when(jpaController.findProductCategoryEntities()).thenReturn(categoryMockDB);
        assertEquals(categoryMockDB, service.findAll());
    }

    @Test
    void disable() throws Exception {
        Mockito.when(jpaController.findProductCategory(category.getId())).thenReturn(category);
        category.setEnable(false);
        Mockito.doNothing().when(jpaController).edit(category);
        service.disable(category.getId());
        assertFalse(category.isEnable());
    }

    @Test
    void delete() throws NonexistentEntityException {
        Mockito.doNothing().when(jpaController).destroy(category.getId());
        service.delete(category.getId());
        Mockito.verify(jpaController).destroy(any());
    }

    @Test
    void enable() throws Exception {
        ProductCategory category = new ProductCategory("test", "test");
        category.setEnable(false);
        Mockito.when(jpaController.findProductCategory(category.getId())).thenReturn(category);
        service.enable(category.getId());
        assertTrue(category.isEnable());
        Mockito.verify(jpaController).edit(category);
    }

    @Test
    void findByName() {
        ProductCategory expected = new ProductCategory("test", "test");
        Mockito.when(jpaController.findProductCategoryEntities()).thenReturn(categoryMockDB);
        ProductCategory result = service.findByName(expected.getName());
        assertEquals(expected, result);
    }

    @Test
    void getCategoryCMB() {
        service.getCategoryCMB(Mockito.any());
        Mockito.verify(jpaController).getCategoryCMB(Mockito.any());
    }

}