/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.ProductCategoryPanelController;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.views.resources.DefaultTableListener;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.JTextFieldListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author sjcex
 */
public final class Management_Products_Categories_Panel extends javax.swing.JPanel implements InterfaceCrudPanel {

    private final ProductCategoryPanelController controller;
    private final FieldDataValidator validator;
    private List<ProductCategory> categories;

    /**
     * Creates new form Management_Client_Panel
     */
    public Management_Products_Categories_Panel() {
        initComponents();
        this.controller = new ProductCategoryPanelController(this);
        initListener();
        this.validator = new FieldDataValidator();
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

        jPanel_datos1 = new javax.swing.JPanel();
        jbl_name = new javax.swing.JLabel();
        jtf_name = new javax.swing.JTextField();
        jbl_lastname = new javax.swing.JLabel();
        jtf_description = new javax.swing.JTextField();
        jbn_update = new javax.swing.JButton();
        jbn_delete = new javax.swing.JButton();
        jbn_save = new javax.swing.JButton();
        jbn_restore = new javax.swing.JButton();
        jlbl_info = new javax.swing.JLabel();
        jPanel_crud = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        tableCategories = new javax.swing.JTable();
        btn_seeCategories = new javax.swing.JButton();
        jbl_filter = new javax.swing.JLabel();
        jtf_nameFilter = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel_datos1.setBackground(new java.awt.Color(0, 51, 255));

        jbl_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_name.setForeground(new java.awt.Color(255, 255, 255));
        jbl_name.setText("NOMBRE");

        jtf_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbl_lastname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_lastname.setForeground(new java.awt.Color(255, 255, 255));
        jbl_lastname.setText("DESCRIPCION");

        jtf_description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanel_datos1Layout = new javax.swing.GroupLayout(jPanel_datos1);
        jPanel_datos1.setLayout(jPanel_datos1Layout);
        jPanel_datos1Layout.setHorizontalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbl_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_description, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(150, 150, 150)
                        .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel_datos1Layout.setVerticalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbl_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtf_description, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbn_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel_crud.setBackground(new java.awt.Color(0, 51, 255));

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        tableCategories.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla.setViewportView(tableCategories);

        btn_seeCategories.setText("VER CATEGORIAS");
        btn_seeCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seeCategoriesActionPerformed(evt);
            }
        });

        jbl_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter.setText("Filtrar por nombre:");

        jtf_nameFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_nameFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nameFilterActionPerformed(evt);
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
                        .addComponent(jtf_nameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_seeCategories)
                        .addGap(12, 12, 12))
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
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_nameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_crudLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_seeCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private void jbn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_updateActionPerformed
        if (controller.verifyCrud("update")) {
            changeConditionAllFields(true);
            changeConditionField(jtf_name, false);
            changeConditionAllButtons(false);
            changeConditionButton(jbn_update, true);
            jlbl_info.setText("Modifique los campos que requiera. y vuelva a pulsar");
        } else {
            if (verifyEmptyFields()) {
                jlbl_info.setText("Error: no pueden haber datos vacios");
            } else {
                ProductCategory newCat = controller.findByName(jtf_name.getText());
                newCat.setName(jtf_name.getText());
                newCat.setDescription(jtf_description.getText());
                jlbl_info.setText(controller.update(newCat.getId(), newCat));
            }
            initPanel();
        }
    }//GEN-LAST:event_jbn_updateActionPerformed

    private void jbn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_deleteActionPerformed
        ProductCategory newCat = controller.findByName(jtf_name.getText());
        jlbl_info.setText(controller.disable(newCat.getId()));
        initPanel();
    }//GEN-LAST:event_jbn_deleteActionPerformed

    private void jbn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_saveActionPerformed
        if (controller.verifyCrud("save")) {
            changeConditionAllFields(true);
            jlbl_info.setText("Complete los campos y vuelva a presionar Guardar");
            changeConditionAllButtons(false);
            changeConditionButton(jbn_save, true);
        } else {
            if (verifyEmptyFields()) {
                jlbl_info.setText("Error: no pueden haber datos vacios");
            } else {
                ProductCategory newCat = new ProductCategory();
                newCat.setName(jtf_name.getText());
                newCat.setDescription(jtf_description.getText());
                jlbl_info.setText(controller.create(newCat));
            }
            initPanel();
        }

    }//GEN-LAST:event_jbn_saveActionPerformed

    private void jbn_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_restoreActionPerformed
        if (controller.verifyCrud("restore")) {
            changeConditionButton(jbn_save, false);
            changeConditionField(jtf_name, true);
            jlbl_info.setText("Ingrese la categoria a restaurar y vuelva a presionar");
        } else {
            ProductCategory newCat = controller.findByName(jtf_name.getText());
            jlbl_info.setText(controller.enable(newCat.getId()));
            initPanel();
        }

    }//GEN-LAST:event_jbn_restoreActionPerformed

    private void btn_seeCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seeCategoriesActionPerformed

        initPanel();
    }//GEN-LAST:event_btn_seeCategoriesActionPerformed

    private void jtf_nameFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nameFilterActionPerformed
        categories = controller.updateTable(jtf_nameFilter.getText());
    }//GEN-LAST:event_jtf_nameFilterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_seeCategories;
    private javax.swing.JPanel jPanel_crud;
    private javax.swing.JPanel jPanel_datos1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JLabel jbl_filter;
    private javax.swing.JLabel jbl_lastname;
    private javax.swing.JLabel jbl_name;
    private javax.swing.JButton jbn_delete;
    private javax.swing.JButton jbn_restore;
    private javax.swing.JButton jbn_save;
    private javax.swing.JButton jbn_update;
    private javax.swing.JLabel jlbl_info;
    private javax.swing.JTextField jtf_description;
    private javax.swing.JTextField jtf_name;
    private javax.swing.JTextField jtf_nameFilter;
    private javax.swing.JTable tableCategories;
    // End of variables declaration//GEN-END:variables

    @Override
    public javax.swing.JTable getTable() {
        return this.tableCategories;
    }

    @Override
    public void selectFromTable() {
        int field = tableCategories.getSelectedRow();
        if (field >= 0) {
            ProductCategory selected = categories.get(field);
            jtf_name.setText(selected.getName());
            jtf_description.setText(selected.getDescription());
            changeConditionAllButtons(true);
            jlbl_info.setText("");
            changeConditionButton(jbn_save, false);
            changeConditionButton(jbn_restore, false);
        }
        controller.verifyCrud("");
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_name, state);
        changeConditionField(jtf_description, state);
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

    @Override
    public void changeConditionButton(JButton button, boolean state) {
        validator.enableButton(state, button, null, null, null, null);
    }

    @Override
    public void cleanAllFields() {
        cleanField(jtf_name);
        cleanField(jtf_description);
    }

    @Override
    public void cleanField(JTextField textField) {
        validator.cleanField(textField);
    }

    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_name);
        fields.add(jtf_description);

        for (JTextField field : fields) {
            if (field.getText().length() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getStringFilter() {
        return jtf_name.getText();
    }

    @Override
    public void initListener() {
        jtf_nameFilter.getDocument().addDocumentListener(new JTextFieldListener(categories, controller, this));
        tableCategories.getSelectionModel().addListSelectionListener(new DefaultTableListener(this));
    }

    @Override
    public void initValidator() {
        validator.onlyLetters(jtf_name);
        validator.onlyLetters(jtf_description);
    }

    @Override
    public void initPanel() {
        this.categories = controller.updateTable("");
        changeConditionAllButtons(false);
        changeConditionAllFields(false);
        changeConditionButton(jbn_save, true);
        changeConditionButton(jbn_restore, true);
    }

}
