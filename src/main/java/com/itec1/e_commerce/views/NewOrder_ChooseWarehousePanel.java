/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.JTextFieldListener;
import com.itec1.e_commerce.views.resources.TableListener;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author pania
 */
public final class NewOrder_ChooseWarehousePanel extends javax.swing.JPanel implements InterfacePanel, InterfaceOrderPanel {

    private final OrderPanelController controller;
    private final FieldDataValidator validator;
    private List<Warehouse> warehouses;
    private final MainFrame mainFrame;

    public NewOrder_ChooseWarehousePanel(MainFrame mainframe) {
        initComponents();
        this.controller = new OrderPanelController(this);
        this.mainFrame = mainframe;
        this.validator = new FieldDataValidator();
        initListener();
        initValidator();
        initPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_origin = new javax.swing.JLabel();
        jtf_warehouseOriginSelected = new javax.swing.JTextField();
        lbl_destiny = new javax.swing.JLabel();
        jtf_warehouseDestinySelected = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jbtn_warehouseOrigin = new javax.swing.JButton();
        jScrollPaneTabla2 = new javax.swing.JScrollPane();
        tableChooseWarehouse = new javax.swing.JTable();
        jbl_filter11 = new javax.swing.JLabel();
        jbl_filterByCountry = new javax.swing.JLabel();
        jbl_filter13 = new javax.swing.JLabel();
        jbl_clientCuitInfo = new javax.swing.JLabel();
        jbtn_warehouseDestiny = new javax.swing.JButton();
        jbtn_previewOrderPanel = new javax.swing.JButton();
        jtf_warehouseFilter = new javax.swing.JTextField();
        lbl_origin1 = new javax.swing.JLabel();
        jtf_warehouseOriginSelected1 = new javax.swing.JTextField();
        lbl_destiny1 = new javax.swing.JLabel();
        jtf_warehouseDestinySelected1 = new javax.swing.JTextField();
        jbtn_nextOrderPanel = new javax.swing.JButton();

        lbl_origin.setText("ORIGEN:");

        jtf_warehouseOriginSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_warehouseOriginSelectedActionPerformed(evt);
            }
        });

        lbl_destiny.setText("DESTINO:");

        jtf_warehouseDestinySelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_warehouseDestinySelectedActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jbtn_warehouseOrigin.setText("ORIGEN");
        jbtn_warehouseOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_warehouseOriginActionPerformed(evt);
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

        jbl_clientCuitInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_clientCuitInfo.setForeground(new java.awt.Color(255, 255, 255));

        jbtn_warehouseDestiny.setText("DESTINO");
        jbtn_warehouseDestiny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_warehouseDestinyActionPerformed(evt);
            }
        });

        jbtn_previewOrderPanel.setText("VOLVER");
        jbtn_previewOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_previewOrderPanelActionPerformed(evt);
            }
        });

        jtf_warehouseFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_warehouseFilterActionPerformed(evt);
            }
        });

        lbl_origin1.setText("ORIGEN:");

        jtf_warehouseOriginSelected1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_warehouseOriginSelected1ActionPerformed(evt);
            }
        });

        lbl_destiny1.setText("DESTINO:");

        jtf_warehouseDestinySelected1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_warehouseDestinySelected1ActionPerformed(evt);
            }
        });

        jbtn_nextOrderPanel.setText("SIGUIENTE");
        jbtn_nextOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_nextOrderPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtn_previewOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 590, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbl_clientCuitInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbl_filter11)
                        .addGap(582, 582, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbl_filterByCountry)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_origin1)
                                            .addComponent(lbl_destiny1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_warehouseOriginSelected1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_warehouseDestinySelected1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtn_nextOrderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbl_filter13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtf_warehouseFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtn_warehouseOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jbtn_warehouseDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbl_clientCuitInfo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jbl_filter11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbl_filterByCountry)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbl_filter13)
                        .addComponent(jtf_warehouseFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn_warehouseDestiny)
                        .addComponent(jbtn_warehouseOrigin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_origin1)
                    .addComponent(jtf_warehouseOriginSelected1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_warehouseDestinySelected1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_destiny1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_previewOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_nextOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_warehouseOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_warehouseOriginActionPerformed

        int selectedWarehouse = tableChooseWarehouse.getSelectedRow();
        if (selectedWarehouse >= 0) {
            Warehouse warehouse = warehouses.get(selectedWarehouse);
            jtf_warehouseOriginSelected1.setText(warehouse.getCode()); // tiene un "1" al final porque son elementos duplicados
            validator.enableField(false, jtf_warehouseOriginSelected1);
            controller.assignWarehouseOriginToOrder(warehouse);
            setOriginGreenFont();
        }
        if (!jtf_warehouseOriginSelected1.getText().isBlank() && !jtf_warehouseDestinySelected1.getText().isBlank()) {
            changeConditionButton(jbtn_nextOrderPanel, true);
        }
    }//GEN-LAST:event_jbtn_warehouseOriginActionPerformed

    private void jbtn_warehouseDestinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_warehouseDestinyActionPerformed
        int selectedWarehouse = tableChooseWarehouse.getSelectedRow();
        if (selectedWarehouse >= 0) {
            Warehouse warehouse = warehouses.get(selectedWarehouse);
            jtf_warehouseDestinySelected1.setText(warehouse.getCode());
            controller.assignWarehouseDestinyToOrder(warehouse);
            setDestinyGreenFont();
        }
        if (!jtf_warehouseOriginSelected1.getText().isBlank() && !jtf_warehouseDestinySelected1.getText().isBlank()) {
            changeConditionButton(jbtn_nextOrderPanel, true);
        }
    }//GEN-LAST:event_jbtn_warehouseDestinyActionPerformed

    private void jtf_warehouseFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_warehouseFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_warehouseFilterActionPerformed

    private void jbtn_previewOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_previewOrderPanelActionPerformed
        mainFrame.changeOrderPanel();
    }//GEN-LAST:event_jbtn_previewOrderPanelActionPerformed

    private void jtf_warehouseOriginSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_warehouseOriginSelectedActionPerformed
        // warehouses = controller.updateWarehouseTable(getWarehouseFilter());
    }//GEN-LAST:event_jtf_warehouseOriginSelectedActionPerformed

    private void jtf_warehouseDestinySelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_warehouseDestinySelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_warehouseDestinySelectedActionPerformed

    private void jtf_warehouseOriginSelected1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_warehouseOriginSelected1ActionPerformed
        warehouses = controller.updateWarehouseTable(getWarehouseFilter());
    }//GEN-LAST:event_jtf_warehouseOriginSelected1ActionPerformed

    private void jtf_warehouseDestinySelected1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_warehouseDestinySelected1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_warehouseDestinySelected1ActionPerformed

    private void jbtn_nextOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_nextOrderPanelActionPerformed
        mainFrame.changeOrderPanel();
        initPanel();
    }//GEN-LAST:event_jbtn_nextOrderPanelActionPerformed

    @Override
    public void initListener() {
        tableChooseWarehouse.getSelectionModel().addListSelectionListener(new TableListener(this));
        jtf_warehouseFilter.getDocument().addDocumentListener(new JTextFieldListener(this));
    }

    @Override
    public void initValidator() {
        validator.enableField(false, jtf_warehouseOriginSelected1);
        validator.enableField(false, jtf_warehouseDestinySelected1);
        validator.onlyLetters(jtf_warehouseOriginSelected1);
    }

    @Override
    public void initPanel() {
        this.warehouses = controller.updateWarehouseTable("");
        changeConditionAllButtons(false);
        changeConditionAllFields(true);
        changeConditionField(jtf_warehouseDestinySelected1, false);
        changeConditionField(jtf_warehouseOriginSelected1, false);
        changeConditionButton(jbtn_warehouseOrigin, true);
        changeConditionButton(jbtn_warehouseDestiny, true);
        cleanAllFields();
    }

    @Override
    public JTable getTable() {
        return null;
    }

    @Override
    public void selectFromTable() {
        int selectedWarehouse = tableChooseWarehouse.getSelectedRow();
        if (verifyEmptyFields() == false) {
            changeConditionButton(jbtn_nextOrderPanel, true);
        }
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_warehouseOriginSelected1, state);
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
        validator.enableField(state, textField);
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
        changeConditionButton(jbtn_warehouseOrigin, state);
        changeConditionButton(jbtn_warehouseDestiny, state);
        changeConditionButton(jbtn_nextOrderPanel, state);
    }

    @Override
    public void changeConditionButton(JButton button, boolean state) {
        Color buttonEnabledColor = Color.GREEN;
        Color textEnabledcolor = Color.BLACK;
        Color buttonDisabledColor = Color.DARK_GRAY;
        Color buttonTextDisabledColor = Color.BLACK;
        validator.enableButton(state, button, buttonEnabledColor, textEnabledcolor, buttonDisabledColor, buttonTextDisabledColor);
    }

    private void setOriginGreenFont() {
        lbl_origin.setForeground(Color.GREEN);
        lbl_origin.setFont(new Font("Arial", Font.BOLD, 12));
    }

    private void setDestinyGreenFont() {
        lbl_destiny.setForeground(Color.GREEN);
        lbl_destiny.setFont(new Font("Arial", Font.BOLD, 12));
    }

    @Override
    public void cleanAllFields() {
        cleanField(jtf_warehouseOriginSelected1);
        cleanField(jtf_warehouseDestinySelected1);
        cleanField(jtf_warehouseFilter);
    }

    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }

    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_warehouseOriginSelected1);
        fields.add(jtf_warehouseDestinySelected1);
        for (JTextField field : fields) {
            if (field.getText().length() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void updateTable() {
        warehouses = controller.updateWarehouseTable(jtf_warehouseFilter.getText());
    }

    @Override
    public String getStringFilter() {
        return jtf_warehouseFilter.getText();
    }

    @Override
    public JTable getClientsTable() {
        return null;
    }

    @Override
    public JTable getProductsTable() {
        return null;
    }

    @Override
    public JTable getWarehousesTable() {
        return this.tableChooseWarehouse;
    }

    @Override
    public JTable getSectorsTable() {
        return null;
    }

    @Override
    public JTable getOrdersTable() {
        return null;
    }

    @Override
    public JTable getCarriersTable() {
        return null;
    }

    @Override
    public JTable getDetailOrdersTable() {
        return null;
    }

    @Override
    public String getClientFilter() {
        return null;
    }

    @Override
    public String getProductFilter() {
        return null;
    }

    @Override
    public String getWarehouseFilter() {
        return jtf_warehouseOriginSelected1.getText();
    }

    @Override
    public String getSectorFilter() {
        return null;
    }

    @Override
    public String getOrderFilter() {
        return null;

    }

    @Override
    public String getCarrierFilter() {
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneTabla2;
    private javax.swing.JLabel jbl_clientCuitInfo;
    private javax.swing.JLabel jbl_filter11;
    private javax.swing.JLabel jbl_filter13;
    private javax.swing.JLabel jbl_filterByCountry;
    private javax.swing.JButton jbtn_nextOrderPanel;
    private javax.swing.JButton jbtn_previewOrderPanel;
    private javax.swing.JButton jbtn_warehouseDestiny;
    private javax.swing.JButton jbtn_warehouseOrigin;
    private javax.swing.JTextField jtf_warehouseDestinySelected;
    private javax.swing.JTextField jtf_warehouseDestinySelected1;
    private javax.swing.JTextField jtf_warehouseFilter;
    private javax.swing.JTextField jtf_warehouseOriginSelected;
    private javax.swing.JTextField jtf_warehouseOriginSelected1;
    private javax.swing.JLabel lbl_destiny;
    private javax.swing.JLabel lbl_destiny1;
    private javax.swing.JLabel lbl_origin;
    private javax.swing.JLabel lbl_origin1;
    private javax.swing.JTable tableChooseWarehouse;
    // End of variables declaration//GEN-END:variables
}
