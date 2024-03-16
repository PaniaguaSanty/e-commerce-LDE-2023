/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.services.CarrierServiceImpl;
import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.services.EmployeeServiceImpl;
import com.itec1.e_commerce.services.InvoiceServiceImpl;
import com.itec1.e_commerce.services.OrderServiceImpl;
import com.itec1.e_commerce.services.ProductCategoryServiceImpl;
import com.itec1.e_commerce.services.ProductServiceImpl;
import com.itec1.e_commerce.services.ProviderServiceImpl;
import com.itec1.e_commerce.services.WarehouseServiceImpl;
import com.itec1.e_commerce.views.Order_NewOrder_Panel;

/**
 *
 * @author pania
 */
public class OrderPanelController {

    private final Order_NewOrder_Panel panel;
    private final OrderServiceImpl orderService;
    private final ClientServiceImpl clientServiceImpl;
    private final ProductServiceImpl productServiceImpl;
    private final ProviderServiceImpl providerServiceImpl;
    private final WarehouseServiceImpl warehouseServiceImpl;
    private final InvoiceServiceImpl invoiceServiceImpl;
    private final CarrierServiceImpl carrierServiceImpl;
    private final ProductCategoryServiceImpl productCategoryImpl;
    private final EmployeeServiceImpl employeeServiceImpl;

    public OrderPanelController(Order_NewOrder_Panel panel) {
        this.panel = panel;
        this.orderService = new OrderServiceImpl();
        this.clientServiceImpl = new ClientServiceImpl();
        this.productServiceImpl = new ProductServiceImpl();
        this.providerServiceImpl = new ProviderServiceImpl();
        this.warehouseServiceImpl = new WarehouseServiceImpl();
        this.invoiceServiceImpl = new InvoiceServiceImpl();
        this.carrierServiceImpl = new CarrierServiceImpl();
        this.productCategoryImpl = new ProductCategoryServiceImpl();
        this.employeeServiceImpl = new EmployeeServiceImpl();
    }

    private String create(Order entity) {
        if (orderService.findById(entity.getId()) != null) {
            return "Este pedido ya existe.";
        } else {
            orderService.create(entity);
        }
        return "Pedido creado correctamente.";
    }

}
