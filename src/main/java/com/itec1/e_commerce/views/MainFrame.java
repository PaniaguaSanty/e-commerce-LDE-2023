package com.itec1.e_commerce.views;

import java.awt.BorderLayout;
import java.awt.Component;

/**
 *
 * @author sjcex
 */
public class MainFrame extends javax.swing.JFrame {

    private InterfacePanel activePanel;

    private Management_Carriers_Panel carriersPanel;
    private Management_Clients_Panel clientsPanel;
    private Management_Products_Categories_Panel productsCategoriesPanel;
    private Management_Products_Panel productsPanel;
    private Management_Providers_Panel providersPanel;
    private Management_Sectors_Panel sectorsPanel;
    private Management_Employees_Panel employeesPanel;
    private Management_Warehouses_Panel warehouseHouse;

    private NewOrder_FirstPanel newOrderFirstPanel;
    private NewOrder_SecondPanel newOrderSecondPanel;
    private Order_ViewOrderSector_Panel viewOrderSectorPanel;
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
    private Report_Clients reportClients;

    public MainFrame() {

        initComponents();

        contentPanel.setSize(800, 600);
        contentPanel.add(Welcome);

        setSize(800, 660); // Cambiar el tamaño del frame
        setLocationRelativeTo(null);
        setVisible(true);

        activePanel = null;
        startPanels();

    }

    private void changePanel(InterfacePanel newPanel) {
        if (!newPanel.equals(activePanel)) {
            activePanel = newPanel;
            contentPanel.removeAll();
            contentPanel.setLayout(new BorderLayout());
            contentPanel.add((Component) newPanel, BorderLayout.CENTER);
            newPanel.initPanel();
            contentPanel.revalidate();
            contentPanel.repaint();
        }
    }

    private void startPanels() {

        carriersPanel = new Management_Carriers_Panel();
        clientsPanel = new Management_Clients_Panel();
        productsCategoriesPanel = new Management_Products_Categories_Panel();
        productsPanel = new Management_Products_Panel();
        providersPanel = new Management_Providers_Panel();
        sectorsPanel = new Management_Sectors_Panel();
        employeesPanel = new Management_Employees_Panel();
        warehouseHouse = new Management_Warehouses_Panel();

        newOrderFirstPanel = new NewOrder_FirstPanel(this);
        newOrderSecondPanel = new NewOrder_SecondPanel(this);
        viewOrderSectorPanel = new Order_ViewOrderSector_Panel();
        orderStatusesPanel = new Order_ViewOrderStatuses_Panel();

        carriersByDatePanel = new Reports_Carriers_ByDate_Panel();
        reportsCarriersOverviewPanel = new Reports_Carriers_Overview_Panel();
        reportsClientsByCategoryPanel = new Reports_Clients_ByCategory_Panel();
        reportsClientsByDatePanel = new Reports_Clients_ByDate_Panel();
        reportsClientsOverviewPanel = new Reports_Clients_Overview_Panel();
        reportClients= new Report_Clients();
        reportsOrdersByDatePanel = new Reports_Orders_ByDate_Panel();
        reportsOrdersByStatusesPanel = new Reports_Orders_ByStatuses_Panel();
        reportsOrdersOverviewPanel = new Reports_Orders_Overview_Panel();
        providersByDatePanel = new Reports_Providers_ByDate_Panel();
        reportsProvidersOverviewPanel = new Reports_Providers_Overview_Panel();

    }

    public void changeOrderPanel() {
        contentPanel.removeAll();
        contentPanel.setLayout(new BorderLayout());
        if (newOrderFirstPanel.equals(activePanel)) {
            contentPanel.add(newOrderSecondPanel, BorderLayout.CENTER);
            activePanel = newOrderSecondPanel;
        } else {
            contentPanel.add(newOrderFirstPanel, BorderLayout.CENTER);
            activePanel = newOrderFirstPanel;
        }
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        Welcome = new javax.swing.JPanel();
        jlbl_welcome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_Close = new javax.swing.JMenuItem();
        menu_Exit = new javax.swing.JMenuItem();
        menu_Management = new javax.swing.JMenu();
        menu_Clients = new javax.swing.JMenuItem();
        menu_Carriers = new javax.swing.JMenuItem();
        menu_Providers = new javax.swing.JMenuItem();
        menu_Products = new javax.swing.JMenuItem();
        menu_ProductCategories = new javax.swing.JMenuItem();
        menu_Warehouses = new javax.swing.JMenuItem();
        menu_Employees = new javax.swing.JMenuItem();
        menu_Sectors = new javax.swing.JMenuItem();
        menu_Orders = new javax.swing.JMenu();
        menu_newOrder = new javax.swing.JMenuItem();
        menu_ViewOrderSector = new javax.swing.JMenuItem();
        menu_ViewOrderStatuses = new javax.swing.JMenuItem();
        menu_Reports = new javax.swing.JMenu();
        menu_newOrder1 = new javax.swing.JMenuItem();
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
        setMinimumSize(new java.awt.Dimension(800, 660));
        setResizable(false);

        contentPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        contentPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        contentPanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                contentPanelComponentAdded(evt);
            }
        });

        Welcome.setBackground(new java.awt.Color(0, 51, 153));
        Welcome.setMaximumSize(new java.awt.Dimension(800, 660));
        Welcome.setMinimumSize(new java.awt.Dimension(800, 660));

        jlbl_welcome.setBackground(new java.awt.Color(0, 51, 153));
        jlbl_welcome.setFont(new java.awt.Font("Laksaman", 0, 24)); // NOI18N
        jlbl_welcome.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_welcome.setText("Bienvenido a nuestro E-commerce");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngegg1.png"))); // NOI18N

        javax.swing.GroupLayout WelcomeLayout = new javax.swing.GroupLayout(Welcome);
        Welcome.setLayout(WelcomeLayout);
        WelcomeLayout.setHorizontalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addComponent(jlbl_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomeLayout.createSequentialGroup()
                .addGap(0, 135, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(135, 135, 135))
        );
        WelcomeLayout.setVerticalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        menu_Close.setText("Cerrar");
        menu_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CloseActionPerformed(evt);
            }
        });
        jMenu1.add(menu_Close);

        menu_Exit.setText("Salir");
        menu_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(menu_Exit);

        jMenuBar1.add(jMenu1);

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

        menu_Employees.setText("Empleados");
        menu_Employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_EmployeesActionPerformed(evt);
            }
        });
        menu_Management.add(menu_Employees);

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

        menu_newOrder1.setText("Generar informe de Clientes");
        menu_newOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_newOrder1ActionPerformed(evt);
            }
        });
        menu_Reports.add(menu_newOrder1);

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

        contentPanel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_EmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_EmployeesActionPerformed
        changePanel(employeesPanel);
    }//GEN-LAST:event_menu_EmployeesActionPerformed

    private void contentPanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_contentPanelComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_contentPanelComponentAdded

    private void menu_newOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_newOrder1ActionPerformed
        changePanel(reportClients);
    }//GEN-LAST:event_menu_newOrder1ActionPerformed

    private void menu_ClientsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_ClientsActionPerformed
        changePanel(clientsPanel);
    }// GEN-LAST:event_menu_ClientsActionPerformed

    private void menu_CarriersActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_CarriersActionPerformed
        changePanel(carriersPanel);
    }// GEN-LAST:event_menu_CarriersActionPerformed

    private void menu_ProvidersActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_ProvidersActionPerformed
        changePanel(providersPanel);
    }// GEN-LAST:event_menu_ProvidersActionPerformed

    private void menu_ProductsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_ProductsActionPerformed
        changePanel(productsPanel);
    }// GEN-LAST:event_menu_ProductsActionPerformed

    private void menu_WarehousesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_WarehousesActionPerformed
        changePanel(warehouseHouse);
    }// GEN-LAST:event_menu_WarehousesActionPerformed

    private void menu_ProductCategoriesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_ProductCategoriesActionPerformed
        changePanel(productsCategoriesPanel);
    }// GEN-LAST:event_menu_ProductCategoriesActionPerformed

    private void menu_SectorsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_SectorsActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_menu_SectorsActionPerformed

    private void client_OverviewReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_client_OverviewReportActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_client_OverviewReportActionPerformed

    private void client_ReportByDateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_client_ReportByDateActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_client_ReportByDateActionPerformed

    private void client_ReportByCategoryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_client_ReportByCategoryActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_client_ReportByCategoryActionPerformed

    private void provider_OverviewReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_provider_OverviewReportActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_provider_OverviewReportActionPerformed

    private void provider_ReportByDateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_provider_ReportByDateActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_provider_ReportByDateActionPerformed

    private void carrier_OverviewReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_carrier_OverviewReportActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_carrier_OverviewReportActionPerformed

    private void carrier_ReportByDateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_carrier_ReportByDateActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_carrier_ReportByDateActionPerformed

    private void order_OverviewReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_order_OverviewReportActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_order_OverviewReportActionPerformed

    private void order_ReportByDateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_order_ReportByDateActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_order_ReportByDateActionPerformed

    private void order_ReportByStatusesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_order_ReportByStatusesActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_order_ReportByStatusesActionPerformed

    private void menu_newOrderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_newOrderActionPerformed
        newOrderFirstPanel.initPanel();
        changeOrderPanel();
    }// GEN-LAST:event_menu_newOrderActionPerformed

    private void menu_ViewOrderSectorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_ViewOrderSectorActionPerformed
        changePanel(viewOrderSectorPanel);
    }// GEN-LAST:event_menu_ViewOrderSectorActionPerformed

    private void menu_ViewOrderStatusesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_ViewOrderStatusesActionPerformed
        changePanel(sectorsPanel);
    }// GEN-LAST:event_menu_ViewOrderStatusesActionPerformed

    private void menu_CloseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_CloseActionPerformed
        contentPanel.removeAll();
        contentPanel.add(Welcome);
        contentPanel.revalidate();
        contentPanel.repaint();
        activePanel = null;
    }// GEN-LAST:event_menu_CloseActionPerformed

    private void menu_ExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menu_ExitActionPerformed
        this.dispose();
    }// GEN-LAST:event_menu_ExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Welcome;
    private javax.swing.JMenuItem carrier_OverviewReport;
    private javax.swing.JMenuItem carrier_ReportByDate;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jlbl_welcome;
    private javax.swing.JMenuItem menu_Carriers;
    private javax.swing.JMenu menu_CarriersReport;
    private javax.swing.JMenuItem menu_Clients;
    private javax.swing.JMenuItem menu_Close;
    private javax.swing.JMenuItem menu_Employees;
    private javax.swing.JMenuItem menu_Exit;
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
    private javax.swing.JMenuItem menu_newOrder1;
    private javax.swing.JMenuItem order_OverviewReport;
    private javax.swing.JMenuItem order_ReportByDate;
    private javax.swing.JMenuItem order_ReportByStatuses;
    private javax.swing.JMenuItem provider_OverviewReport;
    private javax.swing.JMenuItem provider_ReportByDate;
    // End of variables declaration//GEN-END:variables
}
