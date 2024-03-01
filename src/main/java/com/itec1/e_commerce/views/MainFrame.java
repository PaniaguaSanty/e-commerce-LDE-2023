/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itec1.e_commerce.views;

/**
 *
 * @author sjcex
 */
public class MainFrame extends javax.swing.JFrame {
    
    private final MainPanel mainPanel;

    /**
     * Creates new form Principal
     */
    public MainFrame() {
        
        initComponents();
        
        this.setSize(800,660);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.mainPanel = new MainPanel();
        this.mainPanel.setSize(800, 660);
        this.add(this.mainPanel);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menu_Management = new javax.swing.JMenu();
        menu_Clients = new javax.swing.JMenuItem();
        menu_Carriers = new javax.swing.JMenuItem();
        menu_Providers = new javax.swing.JMenuItem();
        menu_Products = new javax.swing.JMenuItem();
        menu_ProductCategories = new javax.swing.JMenuItem();
        menu_Warehouses = new javax.swing.JMenuItem();
        menu_Sectors = new javax.swing.JMenuItem();
        menu_Orders = new javax.swing.JMenu();
        menu_newOrder = new javax.swing.JMenuItem();
        menu_ViewOrderSector = new javax.swing.JMenuItem();
        menu_ViewOrderStatuses = new javax.swing.JMenuItem();
        menu_Reports = new javax.swing.JMenu();
        menu_ClientReports = new javax.swing.JMenu();
        client_OverviewReport = new javax.swing.JMenuItem();
        client_ReportByDate = new javax.swing.JMenuItem();
        client_ReportByCategory = new javax.swing.JMenuItem();
        menu_ProvidersReport = new javax.swing.JMenu();
        provider_OverviewReport = new javax.swing.JMenuItem();
        provider_ReportByDate = new javax.swing.JMenuItem();
        menu_CarriersReport = new javax.swing.JMenu();
        carrier_OverviewReport = new javax.swing.JMenuItem();
        carrier_ReportByDate = new javax.swing.JMenuItem();
        menu_OrdersReport = new javax.swing.JMenu();
        order_OverviewReport = new javax.swing.JMenuItem();
        order_ReportByDate = new javax.swing.JMenuItem();
        order_ReportByStatuses = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 660));
        setMinimumSize(new java.awt.Dimension(800, 660));
        setPreferredSize(new java.awt.Dimension(800, 660));
        setResizable(false);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        menu_Management.setText("Gestión");

        menu_Clients.setText("Clientes");
        menu_Clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ClientsActionPerformed(evt);
            }
        });
        menu_Management.add(menu_Clients);

        menu_Carriers.setText("Transportistas");
        menu_Carriers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CarriersActionPerformed(evt);
            }
        });
        menu_Management.add(menu_Carriers);

        menu_Providers.setText("Proveedores");
        menu_Providers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ProvidersActionPerformed(evt);
            }
        });
        menu_Management.add(menu_Providers);

        menu_Products.setText("Productos");
        menu_Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ProductsActionPerformed(evt);
            }
        });
        menu_Management.add(menu_Products);

        menu_ProductCategories.setText("Categorías de Productos");
        menu_ProductCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ProductCategoriesActionPerformed(evt);
            }
        });
        menu_Management.add(menu_ProductCategories);

        menu_Warehouses.setText("Sucursales");
        menu_Warehouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_WarehousesActionPerformed(evt);
            }
        });
        menu_Management.add(menu_Warehouses);

        menu_Sectors.setText("Sectores");
        menu_Sectors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_SectorsActionPerformed(evt);
            }
        });
        menu_Management.add(menu_Sectors);

        jMenuBar1.add(menu_Management);

        menu_Orders.setText("Pedidos");

        menu_newOrder.setText("Crear nuevo pedido");
        menu_Orders.add(menu_newOrder);

        menu_ViewOrderSector.setText("Ver sector de un pedido");
        menu_Orders.add(menu_ViewOrderSector);

        menu_ViewOrderStatuses.setText("Ver estados de un pedido");
        menu_Orders.add(menu_ViewOrderStatuses);

        jMenuBar1.add(menu_Orders);

        menu_Reports.setText("Informes");

        menu_ClientReports.setText("Generar informe de Clientes");

        client_OverviewReport.setText("Informe general");
        menu_ClientReports.add(client_OverviewReport);

        client_ReportByDate.setText("Informe por fecha");
        menu_ClientReports.add(client_ReportByDate);

        client_ReportByCategory.setText("Informe por categoria de productos");
        menu_ClientReports.add(client_ReportByCategory);

        menu_Reports.add(menu_ClientReports);

        menu_ProvidersReport.setText("Generar informe de Proveedores");

        provider_OverviewReport.setText("Informe general");
        menu_ProvidersReport.add(provider_OverviewReport);

        provider_ReportByDate.setText("Informe por fecha");
        menu_ProvidersReport.add(provider_ReportByDate);

        menu_Reports.add(menu_ProvidersReport);

        menu_CarriersReport.setText("Generar informe de Transportistas");

        carrier_OverviewReport.setText("Informe general");
        menu_CarriersReport.add(carrier_OverviewReport);

        carrier_ReportByDate.setText("Informe por fecha");
        menu_CarriersReport.add(carrier_ReportByDate);

        menu_Reports.add(menu_CarriersReport);

        menu_OrdersReport.setText("Generar informe de Pedidos");

        order_OverviewReport.setText("Informe general");
        menu_OrdersReport.add(order_OverviewReport);

        order_ReportByDate.setText("Informe por fecha");
        menu_OrdersReport.add(order_ReportByDate);

        order_ReportByStatuses.setText("Informe por estados");
        menu_OrdersReport.add(order_ReportByStatuses);

        menu_Reports.add(menu_OrdersReport);

        jMenuBar1.add(menu_Reports);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_ClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ClientsActionPerformed
        
    }//GEN-LAST:event_menu_ClientsActionPerformed

    private void menu_CarriersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CarriersActionPerformed
        
    }//GEN-LAST:event_menu_CarriersActionPerformed

    private void menu_ProvidersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ProvidersActionPerformed
        
    }//GEN-LAST:event_menu_ProvidersActionPerformed

    private void menu_ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ProductsActionPerformed
        
    }//GEN-LAST:event_menu_ProductsActionPerformed

    private void menu_WarehousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_WarehousesActionPerformed
        
    }//GEN-LAST:event_menu_WarehousesActionPerformed

    private void menu_ProductCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ProductCategoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_ProductCategoriesActionPerformed

    private void menu_SectorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_SectorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_SectorsActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem carrier_OverviewReport;
    private javax.swing.JMenuItem carrier_ReportByDate;
    private javax.swing.JMenuItem client_OverviewReport;
    private javax.swing.JMenuItem client_ReportByCategory;
    private javax.swing.JMenuItem client_ReportByDate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menu_Carriers;
    private javax.swing.JMenu menu_CarriersReport;
    private javax.swing.JMenu menu_ClientReports;
    private javax.swing.JMenuItem menu_Clients;
    private javax.swing.JMenu menu_Management;
    private javax.swing.JMenu menu_Orders;
    private javax.swing.JMenu menu_OrdersReport;
    private javax.swing.JMenuItem menu_ProductCategories;
    private javax.swing.JMenuItem menu_Products;
    private javax.swing.JMenuItem menu_Providers;
    private javax.swing.JMenu menu_ProvidersReport;
    private javax.swing.JMenu menu_Reports;
    private javax.swing.JMenuItem menu_Sectors;
    private javax.swing.JMenuItem menu_ViewOrderSector;
    private javax.swing.JMenuItem menu_ViewOrderStatuses;
    private javax.swing.JMenuItem menu_Warehouses;
    private javax.swing.JMenuItem menu_newOrder;
    private javax.swing.JMenuItem order_OverviewReport;
    private javax.swing.JMenuItem order_ReportByDate;
    private javax.swing.JMenuItem order_ReportByStatuses;
    private javax.swing.JMenuItem provider_OverviewReport;
    private javax.swing.JMenuItem provider_ReportByDate;
    // End of variables declaration//GEN-END:variables
}
