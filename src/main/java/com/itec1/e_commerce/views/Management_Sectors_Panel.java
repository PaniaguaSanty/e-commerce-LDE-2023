/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.SectorPanelController;

import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.JTextFieldListener;
import com.itec1.e_commerce.views.resources.TableListener;
import java.awt.Color;
import java.awt.Font;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author sjcex
 */
public class Management_Sectors_Panel extends javax.swing.JPanel implements InterfacePanel {

    private final SectorPanelController controller;
    private final FieldDataValidator validator;
    private List<Sector> sectors;
    private List<Warehouse> warehouses;

    /**
     * Creates new form Management_Client_Panel
     */
    public Management_Sectors_Panel() {
        initComponents();
        this.controller = new SectorPanelController(this);
        this.validator = new FieldDataValidator();
        initListener();
        initValidator();
        initPanel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_crud2 = new javax.swing.JPanel();
        jScrollPaneTabla2 = new javax.swing.JScrollPane();
        tableWarehouse = new javax.swing.JTable();
        seeWarehouse = new javax.swing.JButton();
        jbl_filter = new javax.swing.JLabel();
        jtf_codeFilter = new javax.swing.JTextField();
        jPanel_datos1 = new javax.swing.JPanel();
        jbl_name = new javax.swing.JLabel();
        jtf_name = new javax.swing.JTextField();
        jbn_update = new javax.swing.JButton();
        jbn_delete = new javax.swing.JButton();
        jbn_save = new javax.swing.JButton();
        jbn_restore = new javax.swing.JButton();
        jlbl_info = new javax.swing.JLabel();
        jScrollPaneTabla3 = new javax.swing.JScrollPane();
        tableSectors = new javax.swing.JTable();
        jbl_code = new javax.swing.JLabel();
        jtf_code = new javax.swing.JTextField();

        jPanel_crud2.setBackground(new java.awt.Color(0, 51, 255));

        jScrollPaneTabla2.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setPreferredSize(new java.awt.Dimension(950, 750));

        tableWarehouse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla2.setViewportView(tableWarehouse);

        seeWarehouse.setText("VER SUCURSALES");
        seeWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeWarehouseActionPerformed(evt);
            }
        });

        jbl_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter.setText("Filtrar por código:");

        jtf_codeFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_codeFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_codeFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_crud2Layout = new javax.swing.GroupLayout(jPanel_crud2);
        jPanel_crud2.setLayout(jPanel_crud2Layout);
        jPanel_crud2Layout.setHorizontalGroup(
            jPanel_crud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crud2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel_crud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_crud2Layout.createSequentialGroup()
                        .addComponent(jbl_filter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_codeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seeWarehouse))
                    .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel_crud2Layout.setVerticalGroup(
            jPanel_crud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crud2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_crud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_crud2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seeWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_crud2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_crud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_codeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel_datos1.setBackground(new java.awt.Color(0, 51, 255));

        jbl_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_name.setForeground(new java.awt.Color(255, 255, 255));
        jbl_name.setText("NOMBRE");

        jtf_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbn_update.setText("MODIFICAR");
        jbn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_updateActionPerformed(evt);
            }
        });

        jbn_delete.setText("ELIMINAR");
        jbn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_deleteActionPerformed(evt);
            }
        });

        jbn_save.setText("GUARDAR");
        jbn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_saveActionPerformed(evt);
            }
        });

        jbn_restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-sincronizar-32.png"))); // NOI18N
        jbn_restore.setText("RECUPERAR");
        jbn_restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_restoreActionPerformed(evt);
            }
        });

        jlbl_info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPaneTabla3.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla3.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla3.setPreferredSize(new java.awt.Dimension(950, 750));

        tableSectors.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tableSectors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPaneTabla3.setViewportView(tableSectors);

        jbl_code.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_code.setForeground(new java.awt.Color(255, 255, 255));
        jbl_code.setText("CODIGO");

        jtf_code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel_datos1Layout = new javax.swing.GroupLayout(jPanel_datos1);
        jPanel_datos1.setLayout(jPanel_datos1Layout);
        jPanel_datos1Layout.setHorizontalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jbn_restore)
                        .addGap(83, 83, 83)
                        .addComponent(jbn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jbn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jbn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addComponent(jbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jbl_code, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_code))
                            .addComponent(jScrollPaneTabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1849, Short.MAX_VALUE))
        );
        jPanel_datos1Layout.setVerticalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPaneTabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbl_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbn_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_crud2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_crud2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void seeWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeWarehouseActionPerformed
        initPanel();
    }//GEN-LAST:event_seeWarehouseActionPerformed

    private void jtf_codeFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_codeFilterActionPerformed
        sectors = controller.updateTable(jtf_codeFilter.getText());
    }//GEN-LAST:event_jtf_codeFilterActionPerformed

    private void jbn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_updateActionPerformed
        if (controller.verifyCrud("update")) {
            changeConditionField(jtf_name, true);
            changeConditionAllButtons(false);
            changeConditionButton(jbn_update, true);
            setGreenFont();
            jlbl_info.setText("Modifique el nombre y vuelva a pulsar");

        } else {
            if (verifyEmptyFields()) {
                setRedFont();
                jlbl_info.setText("Error: no puede tener nombre vacío");
            } else {
                Sector newSector = controller.findByCode(jtf_code.getText());
                newSector.setCode(jtf_code.getText());
                newSector.setName(jtf_name.getText());
                jlbl_info.setText(controller.update(newSector.getId(), newSector));
            }
            initPanel();
        }
    }//GEN-LAST:event_jbn_updateActionPerformed

    private void jbn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_deleteActionPerformed
        Sector newSector = controller.findByCode(jtf_code.getText());
        jlbl_info.setText(controller.disable(newSector.getId()));
        initPanel();
    }//GEN-LAST:event_jbn_deleteActionPerformed

    private void jbn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_saveActionPerformed
        if (controller.verifyCrud("save")) {
            changeConditionAllFields(true);
            setGreenFont();
            jlbl_info.setText("Ingrese un nombre y vuelva a presionar Guardar");
            changeConditionAllButtons(false);
            changeConditionButton(jbn_save, true);
        } else {
            if (verifyEmptyFields()) {
                setRedFont();
                jlbl_info.setText("Error: no pueden haber datos vacios");
            } else {
                Sector newSector = new Sector();
                newSector.setName(jtf_name.getText());
                newSector.setCode(jtf_code.getText());
                newSector.setWarehouse(warehouses.get(tableWarehouse.getSelectedRow()));
                jlbl_info.setText(controller.create(newSector));
            }
            initPanel();
        }
    }//GEN-LAST:event_jbn_saveActionPerformed

    private void jbn_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_restoreActionPerformed

        if (controller.verifyCrud("restore")) {
            changeConditionButton(jbn_save, false);
            changeConditionField(jtf_code, true);
            setGreenFont();
            jlbl_info.setText("Ingrese el código del sector a restaurar y vuelva a presionar");
        } else {
            {
                Sector newSector = controller.findByCode(jtf_code.getText());
                jlbl_info.setText(controller.enable(newSector.getId()));
            }
            initPanel();
        }
    }//GEN-LAST:event_jbn_restoreActionPerformed

    @Override
    public void initListener() {
        tableWarehouse.getSelectionModel().addListSelectionListener(new TableListener(this));
        tableSectors.getSelectionModel().addListSelectionListener(new TableListener(this));
        jtf_codeFilter.getDocument().addDocumentListener(new JTextFieldListener(this));
    }

    @Override
    public void initValidator() {

    }

    @Override
    public void initPanel() {
        this.warehouses = controller.getWarehouses("");
        this.sectors = controller.updateTable("");
        changeConditionAllButtons(false);
        changeConditionAllFields(false);
        cleanAllFields();
        controller.verifyCrud("");

    }

    @Override
    public JTable getTable() {
        return tableSectors;
    }

    public JTable getTableWarehouse() {
        return tableWarehouse;
    }

    @Override
    public void updateTable() {
        sectors = controller.updateTable(jtf_codeFilter.getText());
    }

    @Override
    public void selectFromTable() {
        int fieldWarehouse = tableWarehouse.getSelectedRow();
        int fieldSectors = tableSectors.getSelectedRow();
        if (fieldWarehouse >= 0) {
            Warehouse selected = warehouses.get(fieldWarehouse);
            sectors = controller.updateTable(selected.getCode());
            changeConditionButton(jbn_save, true);
            changeConditionButton(jbn_restore, true);
        }
        if (fieldSectors >= 0) {
            Sector selected = sectors.get(fieldSectors);
            jtf_name.setText(selected.getName());
            jtf_code.setText(selected.getCode());
            changeConditionAllButtons(true);
            changeConditionButton(jbn_save, false);
            changeConditionButton(jbn_restore, false);
        }
        controller.verifyCrud("");
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_name, state);
        changeConditionField(jtf_code, state);
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
        validator.enableField(state, textField);
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
        changeConditionButton(jbn_save, state);
        changeConditionButton(jbn_restore, state);
        changeConditionButton(jbn_update, state);
        changeConditionButton(jbn_delete, state);
    }

    private void setRedFont() {
        jlbl_info.setForeground(Color.RED);
        jlbl_info.setFont(new Font("Arial", Font.BOLD, 16));
    }

    private void setGreenFont() {
        jlbl_info.setForeground(Color.GREEN);
        jlbl_info.setFont(new Font("Arial", Font.BOLD, 16));
    }

    @Override
    public void changeConditionButton(JButton button, boolean state) {
        validator.enableButton(state, button, null, null, null, null);
    }

    @Override
    public void cleanAllFields() {
        cleanField(jtf_name);
        cleanField(jtf_code);
    }

    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }

    @Override
    public boolean verifyEmptyFields() {
        return (jtf_name.getText().length() == 0 || jtf_code.getText().length() == 0);

    }

    @Override
    public String getStringFilter() {
        return jtf_codeFilter.getText();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel_crud2;
    private javax.swing.JPanel jPanel_datos1;
    private javax.swing.JScrollPane jScrollPaneTabla2;
    private javax.swing.JScrollPane jScrollPaneTabla3;
    private javax.swing.JLabel jbl_code;
    private javax.swing.JLabel jbl_filter;
    private javax.swing.JLabel jbl_name;
    private javax.swing.JButton jbn_delete;
    private javax.swing.JButton jbn_restore;
    private javax.swing.JButton jbn_save;
    private javax.swing.JButton jbn_update;
    private javax.swing.JLabel jlbl_info;
    private javax.swing.JTextField jtf_code;
    private javax.swing.JTextField jtf_codeFilter;
    private javax.swing.JTextField jtf_name;
    private javax.swing.JButton seeWarehouse;
    private javax.swing.JTable tableSectors;
    private javax.swing.JTable tableWarehouse;
    // End of variables declaration//GEN-END:variables

}
