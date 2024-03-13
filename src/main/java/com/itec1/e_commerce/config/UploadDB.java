package com.itec1.e_commerce.config;

import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.services.ProductServiceImpl;
import com.itec1.e_commerce.services.ProviderServiceImpl;

public class UploadDB {

    private final ClientServiceImpl clientService;
    private final ProviderServiceImpl providerService;
    private final ProductCategoryServiceImpl categoryService;
    private final ProductServiceImpl productService;

    public UploadDB() {
        
        this.clientService = new ClientServiceImpl();
        this.providerService = new ProviderServiceImpl();
        this.categoryService = new ProductCategoryServiceImpl(); 
        this.productService = new ProductServiceImpl();       
        
        clientService.create(new Client("Kevin", "Turraca", "Dirección", "20424052753", "kevin@gmail.com", "123456"));
        clientService.create(new Client("Chano", "Perez", "Dirección2", "12345678910", "chano@gmail.com", "123456"));
        clientService.create(new Client("Fulano", "De Tal", "asdfasdf", "10987654321", "fulanito@gmail.com", "987654"));

        providerService.create(new Provider("Juan", "Gómez", "Av. San Martín 123", "33201234567", "juan.gomez@example.com", "54-376-1234567"));
        providerService.create(new Provider("Ana", "Pérez", "Calle Belgrano 456", "27205432109", "ana.perez@example.com", "54-376-6543210"));
        providerService.create(new Provider("Luis", "Rodríguez", "Ruta Nacional 12 Km 5", "20202223339", "luis.rodriguez@example.com", "54-376-2223333"));
        providerService.create(new Provider("María", "López", "Av. Uruguay 789", "33208889999", "maria.lopez@example.com", "54-376-8889999"));
        providerService.create(new Provider("Diego", "Martínez", "Calle Buenos Aires 1010", "27204445559", "diego.martinez@example.com", "54-376-4445555"));

        categoryService.create(new ProductCategory("Electronica", "Productos electronicos"));
        categoryService.create(new ProductCategory("Indumentaria masculina", "Ropa y prendas de vestir para hombre"));
        categoryService.create(new ProductCategory("Indumentaria femenina", "Ropa y prendas de vestir para mujer"));
        categoryService.create(new ProductCategory("Libros", "Libros, revistas y periódicos"));

        productService.create(new Product("Mouse", "Mouse gamer", 22.1f, 33.2f, 44.3f, 55.4f, categoryService.findByName("Electronica"), providerService.findByName("Juan")));
        productService.create(new Product("Zapatos", "Zapatos deportivos", 22.1f, 33.2f, 44.3f, 55.4f, categoryService.findByName("Indumentaria femenina"), providerService.findByName("Ana")));
        productService.create(new Product("Camisa", "Camisa de polo", 22.1f, 33.2f, 44.3f, 55.4f, categoryService.findByName("Indumentaria femenina"), providerService.findByName("Luis")));
        productService.create(new Product("Libro", "Libro de programación", 22.1f, 33.2f, 44.3f, 55.4f, categoryService.findByName("Libros"), providerService.findByName("Diego")));

    }
}
