package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.TableListener;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author sjcex
 */
public final class Order_NewOrder_Panel extends javax.swing.JPanel implements InterfacePanel {

    private final OrderPanelController controller;
    private final FieldDataValidator validator;
    private List<Order> orders;
    private List<Client> clients;
    private List<Product> products;
    private List<Carrier> carriers;
    private List<Warehouse> warehouses;

    public Order_NewOrder_Panel() {
        initComponents();
        this.controller = new OrderPanelController(this);
        tableChooseCarrier.getSelectionModel().addListSelectionListener(new TableListener(this));
        this.products = controller.updateTableProduct("");
        this.carriers = controller.updateTable("");
        this.warehouses = controller.updateTableWarehouse("");
        this.validator = new FieldDataValidator();
        initListener();
        initValidator();
        initPanel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTabla = new javax.swing.JScrollPane();
        tableChooseCarrier = new javax.swing.JTable();
        jScrollPaneTabla1 = new javax.swing.JScrollPane();
        tableChooseProduct = new javax.swing.JTable();
        jtf_clientCuitFilter = new javax.swing.JTextField();
        jbl_filter = new javax.swing.JLabel();
        jbl_filterByName = new javax.swing.JLabel();
        jbl_filter5 = new javax.swing.JLabel();
        jbl_productName = new javax.swing.JLabel();
        jtf_productNameFilter = new javax.swing.JTextField();
        jbl_filter7 = new javax.swing.JLabel();
        categoryFilterComboBox = new javax.swing.JComboBox<>();
        Jbtn_findClientByCuit = new javax.swing.JButton();
        jbl_filter8 = new javax.swing.JLabel();
        jAmountSpinner = new javax.swing.JSpinner();
        jbtn_addDetailOrder = new javax.swing.JButton();
        jbtn_warehouseOrigin = new javax.swing.JButton();
        jbtn_warehouseDestiny = new javax.swing.JButton();
        jScrollPaneTabla2 = new javax.swing.JScrollPane();
        tableChooseWarehouse = new javax.swing.JTable();
        jbl_filter11 = new javax.swing.JLabel();
        jbl_filterByCountry = new javax.swing.JLabel();
        jbl_filter13 = new javax.swing.JLabel();
        jtf_warehouseFilter = new javax.swing.JTextField();
        jbtn_ConfirmCarrier = new javax.swing.JButton();
        jbtn_createNewOrder = new javax.swing.JButton();
        jbl_filterByCountry1 = new javax.swing.JLabel();
        categoryFilterComboBox1 = new javax.swing.JComboBox<>();
        jbl_filter14 = new javax.swing.JLabel();
        jbl_clientCuitInfo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseCarrier.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla.setViewportView(tableChooseCarrier);

        jScrollPaneTabla1.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla1.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla1.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseProduct.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla1.setViewportView(tableChooseProduct);

        jtf_clientCuitFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_clientCuitFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_clientCuitFilterActionPerformed(evt);
            }
        });

        jbl_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter.setText("INGRESAR CUIT DEL CLIENTE:");

        jbl_filterByName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filterByName.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filterByName.setText("FILTRAR POR:");

        jbl_filter5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter5.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter5.setText("ARMAR CARRITO:");

        jbl_productName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_productName.setForeground(new java.awt.Color(255, 255, 255));
        jbl_productName.setText("nombre:");

        jtf_productNameFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_productNameFilterActionPerformed(evt);
            }
        });

        jbl_filter7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter7.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter7.setText("categoría:");

        categoryFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item 1", "item 2", "Item 3", "Item 4" }));
        categoryFilterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFilterComboBoxActionPerformed(evt);
            }
        });

        Jbtn_findClientByCuit.setBackground(new java.awt.Color(0, 255, 51));
        Jbtn_findClientByCuit.setText("ACEPTAR");
        Jbtn_findClientByCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_findClientByCuitActionPerformed(evt);
            }
        });

        jbl_filter8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter8.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter8.setText("SELECCIONAR TRANSPORTISTAS:");

        jbtn_addDetailOrder.setText("AGREGAR");
        jbtn_addDetailOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_addDetailOrderActionPerformed(evt);
            }
        });

        jbtn_warehouseOrigin.setText("ORIGEN");
        jbtn_warehouseOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_warehouseOriginActionPerformed(evt);
            }
        });

        jbtn_warehouseDestiny.setText("DESTINO");
        jbtn_warehouseDestiny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_warehouseDestinyActionPerformed(evt);
            }
        });

        jScrollPaneTabla2.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseWarehouse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla2.setViewportView(tableChooseWarehouse);

        jbl_filter11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter11.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter11.setText("SELECCIONAR SUCURSALES:");

        jbl_filterByCountry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filterByCountry.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filterByCountry.setText("FILTRAR POR:");

        jbl_filter13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter13.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter13.setText("país:");

        jtf_warehouseFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_warehouseFilterActionPerformed(evt);
            }
        });

        jbtn_ConfirmCarrier.setText("CONFIRMAR ");
        jbtn_ConfirmCarrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ConfirmCarrierActionPerformed(evt);
            }
        });

        jbtn_createNewOrder.setText("FINALIZAR PEDIDO");

        jbl_filterByCountry1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filterByCountry1.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filterByCountry1.setText("FILTRAR POR:");

        categoryFilterComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoryFilterComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFilterComboBox1ActionPerformed(evt);
            }
        });

        jbl_filter14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter14.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter14.setText("tipo:");

        jbl_clientCuitInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_clientCuitInfo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbl_filter11)
                                .addGap(309, 309, 309))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_clientCuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Jbtn_findClientByCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbl_filter5)
                                .addGap(0, 393, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                                .addComponent(jScrollPaneTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbl_filterByName)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(128, 128, 128)
                                            .addComponent(jAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbtn_addDetailOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jbl_productName)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jtf_productNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jbl_filter7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(categoryFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbl_filter14)
                                        .addGap(0, 183, Short.MAX_VALUE)))
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jbl_clientCuitInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbl_filter8)
                            .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jbl_filter13))
                                            .addComponent(jbl_filterByCountry)
                                            .addComponent(jbl_filterByCountry1))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(categoryFilterComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtf_warehouseFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jbtn_warehouseOrigin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jbtn_warehouseDestiny, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                                            .addComponent(jbtn_ConfirmCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(59, 59, 59))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_createNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_clientCuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jbtn_findClientByCuit)
                    .addComponent(jbl_clientCuitInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbl_filter5)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbl_filter11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_filterByName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_productName)
                            .addComponent(jtf_productNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_filter7)
                            .addComponent(categoryFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_addDetailOrder)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_filterByCountry)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_filter13)
                            .addComponent(jtf_warehouseFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_warehouseOrigin)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_warehouseDestiny))
                    .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbl_filter8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_filterByCountry1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbl_filter14)
                            .addComponent(categoryFilterComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_ConfirmCarrier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_createNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbn_chooseDestinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_chooseDestinyActionPerformed

    }//GEN-LAST:event_jbn_chooseDestinyActionPerformed

    private void jbn_chooseOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_chooseOriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbn_chooseOriginActionPerformed

    private void jbn_chooseCarrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_chooseCarrierActionPerformed

    }//GEN-LAST:event_jbn_chooseCarrierActionPerformed

    private void Jbtn_enterAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_enterAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn_enterAmountActionPerformed

    private void jtf_clientCuitFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_clientCuitFilterActionPerformed
        validator.onlyNumbers(jtf_clientCuitFilter);
    }//GEN-LAST:event_jtf_clientCuitFilterActionPerformed

    private void categoryFilterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryFilterComboBoxActionPerformed
        // controller.findProductsByCategory(categoryFilterComboBox.getItemAt(WIDTH));
    }//GEN-LAST:event_categoryFilterComboBoxActionPerformed

    private void jbtn_warehouseOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_warehouseOriginActionPerformed

    }//GEN-LAST:event_jbtn_warehouseOriginActionPerformed

    private void jbtn_ConfirmCarrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ConfirmCarrierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_ConfirmCarrierActionPerformed

    private void jtf_productNameFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_productNameFilterActionPerformed
        validator.onlyLetters(jtf_productNameFilter);
    }//GEN-LAST:event_jtf_productNameFilterActionPerformed

    private void categoryFilterComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryFilterComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryFilterComboBox1ActionPerformed

    private void jtf_warehouseFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_warehouseFilterActionPerformed
        controller.findWarehouseByCountry(jtf_warehouseFilter.getText());
    }//GEN-LAST:event_jtf_warehouseFilterActionPerformed

    private void jbtn_warehouseDestinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_warehouseDestinyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_warehouseDestinyActionPerformed

    private void Jbtn_findClientByCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_findClientByCuitActionPerformed
        Client clientExist = controller.findByCuit(jtf_clientCuitFilter.getText());
        if (clientExist != null) {
            changeConditionButton(Jbtn_findClientByCuit, false);
            jbl_clientCuitInfo.setText("CLIENTE ENCONTRADO");
            changeConditionButton(jbtn_addDetailOrder, true);
        } else {
            jbl_clientCuitInfo.setText("INGRESE UN CUIT.");
        }
    }//GEN-LAST:event_Jbtn_findClientByCuitActionPerformed

    private void jbtn_addDetailOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_addDetailOrderActionPerformed
       
    }//GEN-LAST:event_jbtn_addDetailOrderActionPerformed

    @Override
    public javax.swing.JTable getTable() {
        return this.tableChooseCarrier;
    }

    public javax.swing.JTable getWarehouseTable() {
        return this.tableChooseWarehouse;
    }

    public javax.swing.JTable getProductTable() {
        return this.tableChooseProduct;
    }

    @Override
    public void initListener() {
        tableChooseCarrier.getSelectionModel().addListSelectionListener(new TableListener(this));
        tableChooseProduct.getSelectionModel().addListSelectionListener(new TableListener(this));
        tableChooseWarehouse.getSelectionModel().addListSelectionListener(new TableListener(this));
    }

    @Override
    public void initValidator() {
        validator.onlyNumbers(jtf_clientCuitFilter);
        validator.onlyLetters(jtf_warehouseFilter);
        validator.onlyLetters(jtf_productNameFilter);
        validator.limitSize(jtf_clientCuitFilter, 11);
    }

    @Override
    public void initPanel() {
        this.products = controller.updateTableProduct("");
        this.carriers = controller.updateTable("");
        this.warehouses = controller.updateTableWarehouse("");
        changeConditionAllButtons(false);
        changeConditionAllFields(true);
        changeConditionButton(Jbtn_findClientByCuit, true);
        cleanAllFields();
    }

    @Override
    public void selectFromTable() {
        int field = tableChooseProduct.getSelectedRow();
        if (field >= 0) {
            Product selected = products.get(field);
            jtf_productNameFilter.setText(selected.getName());
        }
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_clientCuitFilter, state);
        changeConditionField(jtf_productNameFilter, state);
        changeConditionField(jtf_warehouseFilter, state);
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
        validator.enableField(state, textField);
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
        changeConditionButton(Jbtn_findClientByCuit, state);
        changeConditionButton(jbtn_addDetailOrder, state);
        changeConditionButton(jbtn_warehouseOrigin, state);
        changeConditionButton(jbtn_warehouseDestiny, state);
        changeConditionButton(jbtn_ConfirmCarrier, state);
        changeConditionButton(jbtn_createNewOrder, state);
    }

    @Override
    public void changeConditionButton(JButton button, boolean state) {
        Color buttonEnabledColor = Color.GREEN;
        Color textEnabledcolor = Color.BLACK;
        Color buttonDisabledColor = Color.DARK_GRAY;
        Color buttonTextDisabledColor = Color.BLACK;
        validator.enableButton(state, button, buttonEnabledColor, textEnabledcolor, buttonDisabledColor, buttonTextDisabledColor);
    }

    @Override
    public void cleanAllFields() {
        cleanField(jtf_clientCuitFilter);
        cleanField(jtf_productNameFilter);
        cleanField(jtf_warehouseFilter);
    }

    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }

    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_productNameFilter);
        fields.add(jtf_warehouseFilter);

        for (JTextField field : fields) {
            if (field.getText().length() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getStringFilter() {
        return jtf_clientCuitFilter.getText();
    }

    public String getProductStringFilter() {
        return jtf_productNameFilter.getText();
    }

    public String getWarehouseStringFilter() {
        return jtf_warehouseFilter.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_findClientByCuit;
    private javax.swing.JComboBox<String> categoryFilterComboBox;
    private javax.swing.JComboBox<String> categoryFilterComboBox1;
    private javax.swing.JSpinner jAmountSpinner;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JScrollPane jScrollPaneTabla1;
    private javax.swing.JScrollPane jScrollPaneTabla2;
    private javax.swing.JLabel jbl_clientCuitInfo;
    private javax.swing.JLabel jbl_filter;
    private javax.swing.JLabel jbl_filter11;
    private javax.swing.JLabel jbl_filter13;
    private javax.swing.JLabel jbl_filter14;
    private javax.swing.JLabel jbl_filter5;
    private javax.swing.JLabel jbl_filter7;
    private javax.swing.JLabel jbl_filter8;
    private javax.swing.JLabel jbl_filterByCountry;
    private javax.swing.JLabel jbl_filterByCountry1;
    private javax.swing.JLabel jbl_filterByName;
    private javax.swing.JLabel jbl_productName;
    private javax.swing.JButton jbtn_ConfirmCarrier;
    private javax.swing.JButton jbtn_addDetailOrder;
    private javax.swing.JButton jbtn_createNewOrder;
    private javax.swing.JButton jbtn_warehouseDestiny;
    private javax.swing.JButton jbtn_warehouseOrigin;
    private javax.swing.JTextField jtf_clientCuitFilter;
    private javax.swing.JTextField jtf_productNameFilter;
    private javax.swing.JTextField jtf_warehouseFilter;
    private javax.swing.JTable tableChooseCarrier;
    private javax.swing.JTable tableChooseProduct;
    private javax.swing.JTable tableChooseWarehouse;
    // End of variables declaration//GEN-END:variables

}
