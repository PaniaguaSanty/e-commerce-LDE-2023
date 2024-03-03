/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itec1.e_commerce.views;

import javax.swing.JPanel;

/**
 *
 * @author sjcex
 */
public class MainFrame extends javax.swing.JFrame {

    private final MainPanel mainPanel;
    private Management_Carriers_Panel carriersPanel;
    private Management_Clients_Panel clientsPanel;
    private Management_Products_Categories_Panel productsCategoriesPanel;
    private Management_Products_Panel productsPanel;
    private Management_Providers_Panel providersPanel;
    private Management_Sectors_Panel sectorsPanel;
    private Management_Warehouses_Panel warehouseHouse;
    private Order_NewOrder_Panel newOrderPanel;
    private Order_ViewOrderSector_Panel wiewOrderSectorPanel;
    private Order_ViewOrderStatuses_Panel orderStatusesPanel;
    private Reports_Carriers_ByDate_Panel carriersByDatePanel;
    private Reports_Carriers_Overview_Panel reportsCarriersOverviewPanel;
    private Reports_Clients_ByCategory_Panel reportsClientsByCategoryPanel;
    private Reports_Clients_ByDate_Panel reportsClientsByDatePanel;
    private Reports_Clients_Overview_Panel reportsClientsOverviewPanel;
    private Reports_Orders_ByDate_Panel reportsOrdersByDatePanel;
    private Reports_Orders_ByStatuses_Panel reportsOrdersByStatusesPanel;
    private Reports_Orders_Overview_Panel reportsOrdersOverviewPanel;
    private Reports_Providers_ByDate_Panel providersByDatePanel;
    private Reports_Providers_Overview_Panel reportsProvidersOverviewPanel;
    
           
    public MainFrame() {

        initComponents();
        this.mainPanel = new MainPanel();
        this.mainPanel.setSize(800, 660);
        this.contentPanel.add(mainPanel);

        this.setSize(800, 660);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
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

        contentPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        contentPanel.setMinimumSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

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
        menu_newOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_newOrderActionPerformed(evt);
            }
        });
        menu_Orders.add(menu_newOrder);

        menu_ViewOrderSector.setText("Ver sector de un pedido");
        menu_ViewOrderSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ViewOrderSectorActionPerformed(evt);
            }
        });
        menu_Orders.add(menu_ViewOrderSector);

        menu_ViewOrderStatuses.setText("Ver estados de un pedido");
        menu_ViewOrderStatuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ViewOrderStatusesActionPerformed(evt);
            }
        });
        menu_Orders.add(menu_ViewOrderStatuses);

        jMenuBar1.add(menu_Orders);

        menu_Reports.setText("Informes");

        menu_ClientReports.setText("Generar informe de Clientes");

        client_OverviewReport.setText("Informe general");
        client_OverviewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_OverviewReportActionPerformed(evt);
            }
        });
        menu_ClientReports.add(client_OverviewReport);

        client_ReportByDate.setText("Informe por fecha");
        client_ReportByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_ReportByDateActionPerformed(evt);
            }
        });
        menu_ClientReports.add(client_ReportByDate);

        client_ReportByCategory.setText("Informe por categoria de productos");
        client_ReportByCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_ReportByCategoryActionPerformed(evt);
            }
        });
        menu_ClientReports.add(client_ReportByCategory);

        menu_Reports.add(menu_ClientReports);

        menu_ProvidersReport.setText("Generar informe de Proveedores");

        provider_OverviewReport.setText("Informe general");
        provider_OverviewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provider_OverviewReportActionPerformed(evt);
            }
        });
        menu_ProvidersReport.add(provider_OverviewReport);

        provider_ReportByDate.setText("Informe por fecha");
        provider_ReportByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provider_ReportByDateActionPerformed(evt);
            }
        });
        menu_ProvidersReport.add(provider_ReportByDate);

        menu_Reports.add(menu_ProvidersReport);

        menu_CarriersReport.setText("Generar informe de Transportistas");

        carrier_OverviewReport.setText("Informe general");
        carrier_OverviewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrier_OverviewReportActionPerformed(evt);
            }
        });
        menu_CarriersReport.add(carrier_OverviewReport);

        carrier_ReportByDate.setText("Informe por fecha");
        carrier_ReportByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrier_ReportByDateActionPerformed(evt);
            }
        });
        menu_CarriersReport.add(carrier_ReportByDate);

        menu_Reports.add(menu_CarriersReport);

        menu_OrdersReport.setText("Generar informe de Pedidos");

        order_OverviewReport.setText("Informe general");
        order_OverviewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_OverviewReportActionPerformed(evt);
            }
        });
        menu_OrdersReport.add(order_OverviewReport);

        order_ReportByDate.setText("Informe por fecha");
        order_ReportByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_ReportByDateActionPerformed(evt);
            }
        });
        menu_OrdersReport.add(order_ReportByDate);

        order_ReportByStatuses.setText("Informe por estados");
        order_ReportByStatuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_ReportByStatusesActionPerformed(evt);
            }
        });
        menu_OrdersReport.add(order_ReportByStatuses);

        menu_Reports.add(menu_OrdersReport);

        jMenuBar1.add(menu_Reports);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_ClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ClientsActionPerformed
        Management_Clients_Panel clientsP = new Management_Clients_Panel();
        this.changePanel(clientsP);

    }//GEN-LAST:event_menu_ClientsActionPerformed

    private void menu_CarriersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CarriersActionPerformed
        Management_Carriers_Panel carriersP = new Management_Carriers_Panel();
        this.changePanel(carriersP);
    }//GEN-LAST:event_menu_CarriersActionPerformed

    private void menu_ProvidersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ProvidersActionPerformed
        Management_Providers_Panel providerP = new Management_Providers_Panel();
        this.changePanel(providerP);
    }//GEN-LAST:event_menu_ProvidersActionPerformed

    private void menu_ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ProductsActionPerformed
        Management_Products_Panel productsP = new Management_Products_Panel();
        this.changePanel(productsP);
    }//GEN-LAST:event_menu_ProductsActionPerformed

    private void menu_WarehousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_WarehousesActionPerformed
        Management_Warehouses_Panel warehouseP = new Management_Warehouses_Panel();
        this.changePanel(warehouseP);
    }//GEN-LAST:event_menu_WarehousesActionPerformed

    private void menu_ProductCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ProductCategoriesActionPerformed
       Management_Products_Categories_Panel productCP = new Management_Products_Categories_Panel();
       this.changePanel(productCP);
    }//GEN-LAST:event_menu_ProductCategoriesActionPerformed

    private void menu_SectorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_SectorsActionPerformed
   Management_Sectors_Panel sectorP = new Management_Sectors_Panel();
   this.changePanel(sectorP);
    }//GEN-LAST:event_menu_SectorsActionPerformed

    private void client_OverviewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_OverviewReportActionPerformed
        Reports_Clients_Overview_Panel report =  new Reports_Clients_Overview_Panel();
        this.changePanel(report);
    }//GEN-LAST:event_client_OverviewReportActionPerformed

    private void client_ReportByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_ReportByDateActionPerformed
        Reports_Clients_ByDate_Panel report = new Reports_Clients_ByDate_Panel();
        this.changePanel(report);
    }//GEN-LAST:event_client_ReportByDateActionPerformed

    private void client_ReportByCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_ReportByCategoryActionPerformed
       Reports_Clients_ByCategory_Panel report = new Reports_Clients_ByCategory_Panel();
       this.changePanel(report);
    }//GEN-LAST:event_client_ReportByCategoryActionPerformed

    private void provider_OverviewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provider_OverviewReportActionPerformed
      Reports_Providers_Overview_Panel report = new Reports_Providers_Overview_Panel();
      this.changePanel(report);
    }//GEN-LAST:event_provider_OverviewReportActionPerformed

    private void provider_ReportByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provider_ReportByDateActionPerformed
      Reports_Providers_ByDate_Panel report = new Reports_Providers_ByDate_Panel();
      this.changePanel(report);
    }//GEN-LAST:event_provider_ReportByDateActionPerformed

    private void carrier_OverviewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrier_OverviewReportActionPerformed
        Reports_Carriers_Overview_Panel report = new Reports_Carriers_Overview_Panel();
        this.changePanel(report);
    }//GEN-LAST:event_carrier_OverviewReportActionPerformed

    private void carrier_ReportByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrier_ReportByDateActionPerformed
        Reports_Carriers_ByDate_Panel report = new Reports_Carriers_ByDate_Panel();
        this.changePanel(report);
    }//GEN-LAST:event_carrier_ReportByDateActionPerformed

    private void order_OverviewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_OverviewReportActionPerformed
        Reports_Orders_Overview_Panel report = new Reports_Orders_Overview_Panel();
        this.changePanel(report);
    }//GEN-LAST:event_order_OverviewReportActionPerformed

    private void order_ReportByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_ReportByDateActionPerformed
        Reports_Orders_ByDate_Panel report = new Reports_Orders_ByDate_Panel();
        this.changePanel(report);
    }//GEN-LAST:event_order_ReportByDateActionPerformed

    private void order_ReportByStatusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_ReportByStatusesActionPerformed
       Reports_Orders_ByStatuses_Panel report = new Reports_Orders_ByStatuses_Panel();
       this.changePanel(report);
    }//GEN-LAST:event_order_ReportByStatusesActionPerformed

    private void menu_newOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_newOrderActionPerformed
        Order_NewOrder_Panel order = new Order_NewOrder_Panel();
        this.changePanel(order);
    }//GEN-LAST:event_menu_newOrderActionPerformed

    private void menu_ViewOrderSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ViewOrderSectorActionPerformed
       Order_ViewOrderSector_Panel order = new Order_ViewOrderSector_Panel();
       this.changePanel(order);
    }//GEN-LAST:event_menu_ViewOrderSectorActionPerformed

    private void menu_ViewOrderStatusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ViewOrderStatusesActionPerformed
      Order_ViewOrderStatuses_Panel order = new Order_ViewOrderStatuses_Panel();
      this.changePanel(order);
    }//GEN-LAST:event_menu_ViewOrderStatusesActionPerformed

    public void changePanel (JPanel newPanel ){
        this.contentPanel.removeAll();
        newPanel.setSize(800,660);
        this.contentPanel.add(newPanel);
        this.contentPanel.validate();
        this.contentPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem carrier_OverviewReport;
    private javax.swing.JMenuItem carrier_ReportByDate;
    private javax.swing.JMenuItem client_OverviewReport;
    private javax.swing.JMenuItem client_ReportByCategory;
    private javax.swing.JMenuItem client_ReportByDate;
    private javax.swing.JPanel contentPanel;
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
