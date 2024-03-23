package com.itec1.e_commerce.config;

import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.Employee;

import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.services.ProviderServiceImpl;
import com.itec1.e_commerce.services.CarrierServiceImpl;
import com.itec1.e_commerce.services.WarehouseServiceImpl;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.services.ProductServiceImpl;
import com.itec1.e_commerce.services.SectorServiceImpl;
import com.itec1.e_commerce.services.EmployeeServiceImpl;


public class UploadDB {

    private final ClientServiceImpl clientService;
    private final ProviderServiceImpl providerService;
    private final CarrierServiceImpl carrierService;
    private final WarehouseServiceImpl warehouseService;
    private final ProductCategoryServiceImpl categoryService;
    private final ProductServiceImpl productService;
    private final SectorServiceImpl sectorService;
    private final EmployeeServiceImpl employeeService;

    public UploadDB() {
        this.clientService = new ClientServiceImpl();
        this.providerService = new ProviderServiceImpl();
        this.carrierService = new CarrierServiceImpl();
        this.warehouseService = new WarehouseServiceImpl();
        this.categoryService = new ProductCategoryServiceImpl(); 
        this.productService = new ProductServiceImpl();
        this.sectorService = new SectorServiceImpl();
        this.employeeService = new EmployeeServiceImpl();
        upload();
    }
    
    private void upload() {
        uploadClients();
        uploadProviders();
        uploadCarriers();
        uploadWarehouses();
        uploadCategories();
        uploadProducts();
        uploadSectors();
        uploadEmployees();
    }
    
    private void uploadClients() {
        clientService.create(new Client("Kevin", "Turraca", "Dirección", "20424052753", "kevin@gmail.com", "123456"));
        clientService.create(new Client("Chano", "Perez", "Dirección2", "12345678910", "chano@gmail.com", "123456"));
        clientService.create(new Client("Fulano", "De Tal", "asdfasdf", "10987654321", "fulanito@gmail.com", "987654"));
        clientService.create(new Client("Araujo", "Piñeda", "Dirección de Araujo", "7896541230", "araujo@gmail.com", "321321321"));
        clientService.create(new Client("Mengano", "De Cual", "callesita 123", "9874563210", "menganito@gmail.com", "123123123"));
        clientService.create(new Client("Pablito", "Carpintero", "la calva de pablito", "0000000000", "ClavadorDeClavitos@gmail.com", "65464654"));
    }
    
    private void uploadProviders() {
        providerService.create(new Provider("Juan", "Gómez", "Av. San Martín 123", "33201234567", "juan.gomez@example.com", "54-376-1234567"));
        providerService.create(new Provider("Ana", "Pérez", "Calle Belgrano 456", "27205432109", "ana.perez@example.com", "54-376-6543210"));
        providerService.create(new Provider("Luis", "Rodríguez", "Ruta Nacional 12 Km 5", "20202223339", "luis.rodriguez@example.com", "54-376-2223333"));
        providerService.create(new Provider("María", "López", "Av. Uruguay 789", "33208889999", "maria.lopez@example.com", "54-376-8889999"));
        providerService.create(new Provider("Diego", "Martínez", "Calle Buenos Aires 1010", "27204445559", "diego.martinez@example.com", "54-376-4445555"));
        providerService.create(new Provider("Armando", "Paredes", "Calle Albañil 000", "1231233210", "armando.martinez@example.com", "54-376-4446666"));
    }
    
    private void uploadCarriers() {
        carrierService.create(new Carrier("La Niña","10101010101","123321",false,true,false));
        carrierService.create(new Carrier("La Pinta","20202020202","321123",false,true,false));
        carrierService.create(new Carrier("La Santa María","30303030303","456654",false,true,true));
        carrierService.create(new Carrier("Volkswagen Kubelwagen 823","40404040404","654456",true,false,false));
        carrierService.create(new Carrier("Caterpillar","50505050505","789987",true,false,false));
        carrierService.create(new Carrier("PAL-V Liberty","60606060606","987789",true,false,true));
        carrierService.create(new Carrier("USG Ishimura","70707070707","147741",false,false,true));
        carrierService.create(new Carrier("Pierpaolo Lazzarini","80808080808","741147",true,true,true));
    }
    
    private void uploadWarehouses() {
        warehouseService.create(new Warehouse("Avenida Belgrano 123","Argentina","010101","101010","12345"));
        warehouseService.create(new Warehouse("Avenida Brasil 321","Brasil","020202","202020","54321"));
        warehouseService.create(new Warehouse("Calle Rocamora 456","Argentina","030303","303030","56789"));
        warehouseService.create(new Warehouse("Tiananmen Square 1989","China","040404","404040","98765"));
        warehouseService.create(new Warehouse("Und das heißt Erika","Alemania","050505","505050","01234"));
        warehouseService.create(new Warehouse("Calle Hamburger 789","Estados Unidos","060606","606060","43210"));
        warehouseService.create(new Warehouse("American Coleslaw 987","Estados Unidos","070707","707070","67890"));
        warehouseService.create(new Warehouse("Chapa Chapita Tampon 654","Colombia","080808","808080","09876"));
    }
    
    private void uploadCategories() {
        categoryService.create(new ProductCategory("Electronica", "Productos electronicos"));
        categoryService.create(new ProductCategory("Indumentaria masculina", "Ropa y prendas de vestir para hombre"));
        categoryService.create(new ProductCategory("Indumentaria femenina", "Ropa y prendas de vestir para mujer"));
        categoryService.create(new ProductCategory("Libros", "Libros, revistas y periódicos"));
    }
    
    private void uploadProducts() {
        productService.create(new Product("Mouse", "Mouse gamer", 22.1f, 33.2f, 44.3f, 55.4f, categoryService.findByName("Electronica"), providerService.findByName("Juan")));
        productService.create(new Product("Zapatos", "Zapatos deportivos", 22.1f, 33.2f, 44.3f, 55.4f, categoryService.findByName("Indumentaria femenina"), providerService.findByName("Ana")));
        productService.create(new Product("Camisa", "Camisa de polo", 22.1f, 33.2f, 44.3f, 55.4f, categoryService.findByName("Indumentaria femenina"), providerService.findByName("Luis")));
        productService.create(new Product("Libro", "Libro de programación", 22.1f, 33.2f, 44.3f, 55.4f, categoryService.findByName("Libros"), providerService.findByName("Diego")));
    }
        
    private void uploadSectors() {
        
    }
        
    private void uploadEmployees() {
        employeeService.create(new Employee("Arnoldo","López","addressArnoldo","00000000001","arnoldo@outlook.lde","10000000000",warehouseService.findByCode("12345")));
        employeeService.create(new Employee("Gustavo","López","addressGustavo","00000000002","gustavo@outlook.lde","20000000000",warehouseService.findByCode("12345")));
        employeeService.create(new Employee("Federico","López","addressFederico","00000000003","federico@outlook.lde","30000000000",warehouseService.findByCode("54321")));
        employeeService.create(new Employee("Damián","López","addressDamián","00000000004","damian@outlook.lde","40000000000",warehouseService.findByCode("54321")));
        employeeService.create(new Employee("Rosa","López","addressRosa","00000000005","rosa@outlook.lde","50000000000",warehouseService.findByCode("56789")));
        employeeService.create(new Employee("Pablo","López","addressPablo","00000000006","pablo@outlook.lde","60000000000",warehouseService.findByCode("56789")));
        employeeService.create(new Employee("Guadalupe","López","addressGuadalupe","00000000007","guada@outlook.lde","70000000000",warehouseService.findByCode("98765")));
        employeeService.create(new Employee("Dario","López","addressDario","00000000008","dario@outlook.lde","80000000000",warehouseService.findByCode("98765")));
        employeeService.create(new Employee("Armando","López","addressArmando","00000000009","armando@outlook.lde","90000000000",warehouseService.findByCode("01234")));
        employeeService.create(new Employee("Miguel","López","addressMiguel","00000000010","miguel@outlook.lde","01000000000",warehouseService.findByCode("01234")));
        employeeService.create(new Employee("Xiomara","López","addressXiomara","00000000020","xio@outlook.lde","02000000000",warehouseService.findByCode("43210")));
        employeeService.create(new Employee("Josefina","López","addressJosefina","00000000030","josefina@outlook.lde","03000000000",warehouseService.findByCode("43210")));
        employeeService.create(new Employee("Noé","López","addressNoé","00000000040","noe@outlook.lde","04000000000",warehouseService.findByCode("67890")));
        employeeService.create(new Employee("Michael","López","addressMichael","00000000050","micha@outlook.lde","05000000000",warehouseService.findByCode("67890")));
        employeeService.create(new Employee("Ainara","López","addressAinara","00000000060","ainara@outlook.lde","06000000000",warehouseService.findByCode("09876")));
        employeeService.create(new Employee("Lorena","López","addressLorena","00000000070","lorena@outlook.lde","070000000000",warehouseService.findByCode("09876")));
    }
    
}
