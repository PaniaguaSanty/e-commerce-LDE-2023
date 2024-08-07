/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.WarehousePanelController;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.services.SectorServiceImpl;
import com.itec1.e_commerce.views.resources.TableListener;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.JTextFieldListener;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author sjcex
 */
public final class Management_Warehouses_Panel extends javax.swing.JPanel implements InterfacePanel {

    private final WarehousePanelController controller;
    private final FieldDataValidator validator;
    private List<Warehouse> warehouses;
    private SectorServiceImpl sectorService;

    public Management_Warehouses_Panel() {
        initComponents();

        this.controller = new WarehousePanelController(this);
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

        jPanel_crud = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        tableWarehouse = new javax.swing.JTable();
        seeWarehouses = new javax.swing.JButton();
        jbl_filter = new javax.swing.JLabel();
        jtf_codeFilter = new javax.swing.JTextField();
        jPanel_datos1 = new javax.swing.JPanel();
        jbl_code = new javax.swing.JLabel();
        jtf_code = new javax.swing.JTextField();
        jbl_address = new javax.swing.JLabel();
        jtf_address = new javax.swing.JTextField();
        jbl_country = new javax.swing.JLabel();
        jtf_country = new javax.swing.JTextField();
        jbn_update = new javax.swing.JButton();
        jbn_delete = new javax.swing.JButton();
        jbl_longitude = new javax.swing.JLabel();
        jbl_latitude = new javax.swing.JLabel();
        jtf_latitude = new javax.swing.JTextField();
        jtf_longitude = new javax.swing.JTextField();
        jbn_save = new javax.swing.JButton();
        jbn_restore = new javax.swing.JButton();
        jlbl_info = new javax.swing.JLabel();

        jPanel_crud.setBackground(new java.awt.Color(0, 51, 255));

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        tableWarehouse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla.setViewportView(tableWarehouse);

        seeWarehouses.setText("VER SUCURSALES");
        seeWarehouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeWarehousesActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel_crudLayout = new javax.swing.GroupLayout(jPanel_crud);
        jPanel_crud.setLayout(jPanel_crudLayout);
        jPanel_crudLayout.setHorizontalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addComponent(jbl_filter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_codeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seeWarehouses))
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel_crudLayout.setVerticalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seeWarehouses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_codeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel_datos1.setBackground(new java.awt.Color(0, 51, 255));

        jbl_code.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_code.setForeground(new java.awt.Color(255, 255, 255));
        jbl_code.setText("CODIGO");

        jtf_code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbl_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_address.setForeground(new java.awt.Color(255, 255, 255));
        jbl_address.setText("DIRECCION");

        jtf_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbl_country.setBackground(new java.awt.Color(255, 255, 255));
        jbl_country.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_country.setForeground(new java.awt.Color(255, 255, 255));
        jbl_country.setText("PAIS");

        jtf_country.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        jbl_longitude.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_longitude.setForeground(new java.awt.Color(255, 255, 255));
        jbl_longitude.setText("LONGITUD");

        jbl_latitude.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_latitude.setForeground(new java.awt.Color(255, 255, 255));
        jbl_latitude.setText("LATITUD");

        jtf_latitude.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtf_longitude.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanel_datos1Layout = new javax.swing.GroupLayout(jPanel_datos1);
        jPanel_datos1.setLayout(jPanel_datos1Layout);
        jPanel_datos1Layout.setHorizontalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbl_code, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_code, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addComponent(jbl_country, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jtf_country, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addComponent(jbl_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jtf_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addComponent(jbl_longitude, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jtf_longitude, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addGap(130, 130, 130)
                        .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel_datos1Layout.setVerticalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jtf_country, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbl_country, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_longitude, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbl_longitude, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            .addComponent(jPanel_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void seeWarehousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeWarehousesActionPerformed
        initPanel();
    }//GEN-LAST:event_seeWarehousesActionPerformed

    private void jtf_codeFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_codeFilterActionPerformed
        warehouses = controller.updateTable(jtf_codeFilter.getText());
    }//GEN-LAST:event_jtf_codeFilterActionPerformed

    private void jbn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_updateActionPerformed
        if (controller.verifyCrud("update")) {
            changeConditionAllFields(true);
            changeConditionField(jtf_code, false);
            changeConditionAllButtons(false);
            changeConditionButton(jbn_update, true);
            setGreenFont();
            jlbl_info.setText("Modifique los campos que requiera. y vuelva a pulsar");

        } else {
            if (verifyEmptyFields()) {
                setRedFont();
                jlbl_info.setText("Error: no pueden haber datos vacios");
            } else {
                Warehouse newWarehouse = controller.findByCode(jtf_code.getText());
                newWarehouse.setAddress(jtf_address.getText());
                newWarehouse.setCountry(jtf_country.getText());
                newWarehouse.setLatitude(jtf_latitude.getText());
                newWarehouse.setLongitude(jtf_longitude.getText());
                jlbl_info.setText(controller.update(newWarehouse.getId(), newWarehouse));
            }
            initPanel();
        }
    }//GEN-LAST:event_jbn_updateActionPerformed

    private void jbn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_deleteActionPerformed
        Warehouse newWarehouse = controller.findByCode(jtf_code.getText());
        jlbl_info.setText(controller.disable(newWarehouse.getId()));
        initPanel();
    }//GEN-LAST:event_jbn_deleteActionPerformed

    private void jbn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_saveActionPerformed
        if (controller.verifyCrud("save")) {
            changeConditionAllFields(true);
            setGreenFont();
            jlbl_info.setText("Complete los campos y vuelva a presionar Guardar");
            changeConditionAllButtons(false);
            changeConditionButton(jbn_save, true);
        } else {
            if (verifyEmptyFields()) {
                setRedFont();
                jlbl_info.setText("Error: no pueden haber datos vacios");
            } else {
                Warehouse newWarehouse = new Warehouse();
                newWarehouse.setCode(jtf_code.getText());
                newWarehouse.setAddress(jtf_address.getText());
                newWarehouse.setCountry(jtf_country.getText());
                newWarehouse.setLatitude(jtf_latitude.getText());
                newWarehouse.setLongitude(jtf_longitude.getText());
                jlbl_info.setText(controller.create(newWarehouse));
            }
            initPanel();
        }
    }//GEN-LAST:event_jbn_saveActionPerformed

    private void jbn_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_restoreActionPerformed
        if (controller.verifyCrud("restore")) {
            changeConditionButton(jbn_save, false);
            changeConditionField(jtf_code, true);
            setGreenFont();
            jlbl_info.setText("Ingrese el códifo a restaurar y vuelva a presionar");
        } else {

            Warehouse warehouse = controller.findByCode(jtf_code.getText());
            jlbl_info.setText(controller.enable(warehouse.getId()));
            initPanel();

        }
    }//GEN-LAST:event_jbn_restoreActionPerformed

    @Override
    public void initListener() {
        jtf_codeFilter.getDocument().addDocumentListener(new JTextFieldListener(this));
        tableWarehouse.getSelectionModel().addListSelectionListener(new TableListener(this));
    }

    @Override
    public void initValidator() {
        validator.onlyNumbers(jtf_code);
        validator.onlyNumbers(jtf_latitude);
        validator.onlyNumbers(jtf_longitude);
        validator.onlyLetters(jtf_country);

    }

    @Override
    public void initPanel() {
        changeConditionAllButtons(false);
        changeConditionAllFields(false);
        changeConditionButton(jbn_save, true);
        changeConditionButton(jbn_restore, true);
        this.warehouses = controller.updateTable("");
        cleanAllFields();
        controller.verifyCrud("");
    }

    @Override
    public JTable getTable() {
        return this.tableWarehouse;
    }

    @Override
    public void selectFromTable() {
        int field = tableWarehouse.getSelectedRow();
        if (field >= 0) {
            Warehouse selected = warehouses.get(field);
            jtf_address.setText(selected.getAddress());
            jtf_country.setText(selected.getCountry());
            jtf_code.setText(selected.getCode());
            jtf_latitude.setText(selected.getLatitude());
            jtf_longitude.setText(selected.getLongitude());
            changeConditionAllButtons(true);
            jlbl_info.setText("");
            changeConditionButton(jbn_save, false);
            changeConditionButton(jbn_restore, false);
        }
        controller.verifyCrud("");
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_address, state);
        changeConditionField(jtf_country, state);
        changeConditionField(jtf_code, state);
        changeConditionField(jtf_latitude, state);
        changeConditionField(jtf_longitude, state);
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
        cleanField(jtf_address);
        cleanField(jtf_country);
        cleanField(jtf_code);
        cleanField(jtf_latitude);
        cleanField(jtf_longitude);
    }

    @Override
    public void cleanField(JTextField textField) {
        validator.cleanField(textField);
    }

    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_address);
        fields.add(jtf_country);
        fields.add(jtf_code);
        fields.add(jtf_latitude);
        fields.add(jtf_longitude);

        for (JTextField field : fields) {
            if (field.getText().length() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getStringFilter() {
        return jtf_codeFilter.getText();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel_crud;
    private javax.swing.JPanel jPanel_datos1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JLabel jbl_address;
    private javax.swing.JLabel jbl_code;
    private javax.swing.JLabel jbl_country;
    private javax.swing.JLabel jbl_filter;
    private javax.swing.JLabel jbl_latitude;
    private javax.swing.JLabel jbl_longitude;
    private javax.swing.JButton jbn_delete;
    private javax.swing.JButton jbn_restore;
    private javax.swing.JButton jbn_save;
    private javax.swing.JButton jbn_update;
    private javax.swing.JLabel jlbl_info;
    private javax.swing.JTextField jtf_address;
    private javax.swing.JTextField jtf_code;
    private javax.swing.JTextField jtf_codeFilter;
    private javax.swing.JTextField jtf_country;
    private javax.swing.JTextField jtf_latitude;
    private javax.swing.JTextField jtf_longitude;
    private javax.swing.JButton seeWarehouses;
    private javax.swing.JTable tableWarehouse;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateTable() {
        warehouses = controller.updateTable(jtf_codeFilter.getText());
    }

}
