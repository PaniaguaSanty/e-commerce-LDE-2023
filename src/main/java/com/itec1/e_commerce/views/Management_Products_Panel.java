package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.ProductPanelController;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.views.resources.TableListener;
import com.itec1.e_commerce.views.resources.CustomCellRender;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.JTextFieldListener;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.TableColumnModel;

public final class Management_Products_Panel extends javax.swing.JPanel implements InterfacePanel {

    private final ProductPanelController controller;
    private final FieldDataValidator validator;
    private final ProductCategory category;
    private final Provider provider;
    private List<Product> products;

    public Management_Products_Panel() {
        initComponents();
        this.category = new ProductCategory();
        this.provider = new Provider();
        this.controller = new ProductPanelController(this);
        this.validator = new FieldDataValidator();
        loadComboBox();
        initListener();
        initValidator();
        initPanel();
        productTable.setDefaultRenderer(Object.class, new CustomCellRender());
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_datos1 = new javax.swing.JPanel();
        lbl_name = new javax.swing.JLabel();
        jtf_name = new javax.swing.JTextField();
        lbl_description = new javax.swing.JLabel();
        jtf_description = new javax.swing.JTextField();
        lbl_weight = new javax.swing.JLabel();
        jtf_weight = new javax.swing.JTextField();
        jbn_update = new javax.swing.JButton();
        jbn_delete = new javax.swing.JButton();
        jbl_email = new javax.swing.JLabel();
        jbl_address = new javax.swing.JLabel();
        jbl_phone = new javax.swing.JLabel();
        jtf_high = new javax.swing.JTextField();
        jtf_width = new javax.swing.JTextField();
        jtf_depth = new javax.swing.JTextField();
        jbn_save = new javax.swing.JButton();
        jbn_restore = new javax.swing.JButton();
        jlbl_info = new javax.swing.JLabel();
        lbl_category = new javax.swing.JLabel();
        lbl_provider = new javax.swing.JLabel();
        comboBox_provider = new javax.swing.JComboBox<>();
        comboBox_category = new javax.swing.JComboBox<>();
        jPanel_crud = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jbl_filter = new javax.swing.JLabel();
        jtf_nameFilter = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel_datos1.setBackground(new java.awt.Color(0, 51, 255));

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("NOMBRE");

        jtf_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_description.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_description.setForeground(new java.awt.Color(255, 255, 255));
        lbl_description.setText("DESCRIPCION");

        jtf_description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_weight.setBackground(new java.awt.Color(255, 255, 255));
        lbl_weight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_weight.setForeground(new java.awt.Color(255, 255, 255));
        lbl_weight.setText("PESO");

        jtf_weight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        jbl_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_email.setForeground(new java.awt.Color(255, 255, 255));
        jbl_email.setText("ANCHO");

        jbl_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_address.setForeground(new java.awt.Color(255, 255, 255));
        jbl_address.setText("ALTO");

        jbl_phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_phone.setForeground(new java.awt.Color(255, 255, 255));
        jbl_phone.setText("PROFUNDIDAD");

        jtf_high.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtf_width.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtf_depth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        lbl_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_category.setForeground(new java.awt.Color(255, 255, 255));
        lbl_category.setText("CATEGORIA");

        lbl_provider.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_provider.setForeground(new java.awt.Color(255, 255, 255));
        lbl_provider.setText("PROVEEDOR");

        comboBox_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_categoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_datos1Layout = new javax.swing.GroupLayout(jPanel_datos1);
        jPanel_datos1.setLayout(jPanel_datos1Layout);
        jPanel_datos1Layout.setHorizontalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_description, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_description, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_weight, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtf_high, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jtf_width, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_depth, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_weight))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_category, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_provider, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBox_provider, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBox_category, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                        .addGap(138, 138, 138)
                        .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 63, Short.MAX_VALUE))
        );
        jPanel_datos1Layout.setVerticalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_high, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_width, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_provider, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_provider, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_depth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        productTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla.setViewportView(productTable);

        jbl_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter.setText("BUSCAR PRODUCTO");

        jtf_nameFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_nameFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nameFilterActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_crudLayout = new javax.swing.GroupLayout(jPanel_crud);
        jPanel_crud.setLayout(jPanel_crudLayout);
        jPanel_crudLayout.setHorizontalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_crudLayout.createSequentialGroup()
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_nameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_limpiar))
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        jPanel_crudLayout.setVerticalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_nameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar))
                .addContainerGap())
        );

        jtf_nameFilter.getAccessibleContext().setAccessibleName("");
        jtf_nameFilter.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_crud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(236, 236, 236))
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

    private void comboBox_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_categoryActionPerformed

    }//GEN-LAST:event_comboBox_categoryActionPerformed

    private void jbn_updateActionPerformed(java.awt.event.ActionEvent evt) {
        if (controller.verifyCrud("update")) {
            changeConditionAllFields(true);
            changeConditionField(jtf_name, false);
            changeConditionAllButtons(false);
            changeConditionButton(jbn_update, true);
            comboBox_category.setEnabled(true);
            comboBox_provider.setEnabled(true);
            setGreenFont();
            jlbl_info.setText("Modifique los campos que requiera. y vuelva a pulsar");
        } else {
            if (verifyEmptyFields()) {
                setRedFont();
                jlbl_info.setText("Error: no pueden haber datos vacios");
            } else {
                Product newProd = controller.findByName(jtf_name.getText());
                newProd.setName(jtf_name.getText());
                newProd.setDescription(jtf_description.getText());
                newProd.setWeight(Float.valueOf(jtf_weight.getText()));
                newProd.setHigh(Float.valueOf(jtf_high.getText()));
                newProd.setWidth(Float.valueOf(jtf_width.getText()));
                newProd.setDepth(Float.valueOf(jtf_depth.getText()));
                newProd.setProductCategory(controller.getCategoryByName(
                        comboBox_category.getItemAt(comboBox_category.getSelectedIndex()).getName()));
                newProd.setProvider(controller.getProviderByName(
                        comboBox_provider.getItemAt(comboBox_provider.getSelectedIndex()).getName()));
                jlbl_info.setText(controller.update(newProd.getId(), newProd));
            }
            initPanel();
        }
    }

    private void jbn_deleteActionPerformed(java.awt.event.ActionEvent evt) {
        Product newProd = controller.findByName(jtf_name.getText());
        jlbl_info.setText(controller.disable(newProd.getId()));
        initPanel();
    }

    private void jbn_saveActionPerformed(java.awt.event.ActionEvent evt) {
        if (controller.verifyCrud("save")) {
            changeConditionAllFields(true);
            setGreenFont();
            jlbl_info.setText("Complete los campos y vuelva a presionar Guardar");
            changeConditionAllButtons(false);
            changeConditionButton(jbn_save, true);
            comboBox_category.setEnabled(true);
            comboBox_provider.setEnabled(true);
        } else {
            if (verifyEmptyFields()) {
                setRedFont();
                jlbl_info.setText("Error: no pueden haber datos vacios");
            } else {
                Product newProd = new Product();
                newProd.setName(jtf_name.getText());
                newProd.setDescription(jtf_description.getText());
                newProd.setWeight(Float.valueOf(jtf_weight.getText()));
                newProd.setHigh(Float.valueOf(jtf_high.getText()));
                newProd.setWidth(Float.valueOf(jtf_width.getText()));
                newProd.setDepth(Float.valueOf(jtf_depth.getText()));
                newProd.setProductCategory(controller.getCategoryByName(
                        comboBox_category.getItemAt(comboBox_category.getSelectedIndex()).getName()));
                newProd.setProvider(controller.getProviderByName(
                        comboBox_provider.getItemAt(comboBox_provider.getSelectedIndex()).getName()));
                jlbl_info.setText(controller.create(newProd));
            }
            initPanel();
        }
    }

    private void jbn_restoreActionPerformed(java.awt.event.ActionEvent evt) {
        Product newProd = controller.findByName(jtf_name.getText());
        jlbl_info.setText(controller.enable(newProd.getId()));
        initPanel();
    }

    private void jtf_nameFilterActionPerformed(java.awt.event.ActionEvent evt) {
        products = controller.updateTable(jtf_nameFilter.getText());
    }

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {
        initPanel();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<ProductCategory> comboBox_category;
    private javax.swing.JComboBox<Provider> comboBox_provider;
    private javax.swing.JPanel jPanel_crud;
    private javax.swing.JPanel jPanel_datos1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JLabel jbl_address;
    private javax.swing.JLabel jbl_email;
    private javax.swing.JLabel jbl_filter;
    private javax.swing.JLabel jbl_phone;
    private javax.swing.JButton jbn_delete;
    private javax.swing.JButton jbn_restore;
    private javax.swing.JButton jbn_save;
    private javax.swing.JButton jbn_update;
    private javax.swing.JLabel jlbl_info;
    private javax.swing.JTextField jtf_depth;
    private javax.swing.JTextField jtf_description;
    private javax.swing.JTextField jtf_high;
    private javax.swing.JTextField jtf_name;
    private javax.swing.JTextField jtf_nameFilter;
    private javax.swing.JTextField jtf_weight;
    private javax.swing.JTextField jtf_width;
    private javax.swing.JLabel lbl_category;
    private javax.swing.JLabel lbl_description;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_provider;
    private javax.swing.JLabel lbl_weight;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public javax.swing.JTable getTable() {
        return this.productTable;
    }

    @Override
    public void selectFromTable() {
        int field = productTable.getSelectedRow();
        if (field >= 0) {
            loadComboBox();
            Product selected = products.get(field);
            jtf_name.setText(selected.getName());
            jtf_description.setText(selected.getDescription());
            jtf_weight.setText(String.valueOf(selected.getWeight()));
            jtf_high.setText(String.valueOf(selected.getHigh()));
            jtf_width.setText(String.valueOf(selected.getWidth()));
            jtf_depth.setText(String.valueOf(selected.getDepth()));

            ProductCategory categoria = controller.getCategoryByName(selected.getProductCategory().getName());
            comboBox_category.setSelectedItem(categoria);

            Provider proveedor = controller.getProviderByName(selected.getProvider().getName());
            comboBox_provider.setSelectedItem(proveedor);

            changeConditionAllButtons(true);
            jlbl_info.setText("");
            changeConditionButton(jbn_save, false);
            changeConditionButton(jbn_restore, false);

            // activar el boton de restaurar si el producto esta disable
            if (!selected.isEnable()) {
                jbn_restore.setEnabled(true);
            }
        }
        controller.verifyCrud("");
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_name, state);
        changeConditionField(jtf_description, state);
        changeConditionField(jtf_weight, state);
        changeConditionField(jtf_high, state);
        changeConditionField(jtf_width, state);
        changeConditionField(jtf_depth, state);
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
        cleanField(jtf_description);
        cleanField(jtf_weight);
        cleanField(jtf_high);
        cleanField(jtf_width);
        cleanField(jtf_depth);
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
        fields.add(jtf_weight);
        fields.add(jtf_high);
        fields.add(jtf_width);
        fields.add(jtf_depth);

        for (JTextField field : fields) {
            if (field.getText().length() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getStringFilter() {
        return jtf_nameFilter.getText();
    }

    @Override
    public void initListener() {
        jtf_nameFilter.getDocument().addDocumentListener(new JTextFieldListener(this));
        productTable.getSelectionModel().addListSelectionListener(new TableListener(this));
    }

    @Override
    public void initValidator() {
        validator.onlyLetters(jtf_name);
        validator.onlyLetters(jtf_description);
        validator.onlyDecimalsNumbers(jtf_weight);
        validator.onlyDecimalsNumbers(jtf_high);
        validator.onlyDecimalsNumbers(jtf_width);
        validator.onlyDecimalsNumbers(jtf_depth);
    }

    @Override
    public void initPanel() {
        changeConditionAllButtons(false);
        changeConditionAllFields(false);
        changeConditionButton(jbn_save, true);
        this.products = controller.updateTable("");
        ocultarColumnas();
        cleanAllFields();
        controller.verifyCrud("");
        loadComboBox();
        comboBox_category.setEnabled(false);
        comboBox_provider.setEnabled(false);
    }

    private void loadComboBox() {
        comboBox_category.removeAllItems();
        comboBox_provider.removeAllItems();

        // Cargar ComboBox de Categoría
        category.setName("Seleccione Categoria");
        comboBox_category.addItem(category);
        controller.getCategoryCMB(comboBox_category);

        // Cargar ComboBox de Proveedor
        provider.setName("Seleccione");
        provider.setLastname("Proveedor");
        comboBox_provider.addItem(provider);
        controller.getProviderCMB(comboBox_provider);
    }

    private void ocultarColumnas() {
        TableColumnModel columnModel = productTable.getColumnModel();
        int columnIndexToHide = 9;
        columnModel.getColumn(columnIndexToHide).setWidth(0);
        columnModel.getColumn(columnIndexToHide).setMinWidth(0);
        columnModel.getColumn(columnIndexToHide).setMaxWidth(0);
        columnModel.getColumn(columnIndexToHide).setPreferredWidth(0);
    }

    @Override
    public void updateTable() {
        products = controller.updateTable(jtf_nameFilter.getText());
    }

}
