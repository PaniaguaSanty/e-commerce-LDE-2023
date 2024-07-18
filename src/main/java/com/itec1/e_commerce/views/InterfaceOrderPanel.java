/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itec1.e_commerce.views;

/**
 *
 * @author pania
 */
public interface InterfaceOrderPanel {

    javax.swing.JTable getClientsTable();

    javax.swing.JTable getProductsTable();

    javax.swing.JTable getWarehousesTable();

    javax.swing.JTable getSectorsTable();

    javax.swing.JTable getOrdersTable();

    javax.swing.JTable getCarriersTable();

    javax.swing.JTable getDetailOrdersTable();

    String getClientFilter();

    String getProductFilter();

    String getWarehouseFilter();

    String getSectorFilter();

    String getOrderFilter();

    String getCarrierFilter();
}
