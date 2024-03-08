/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.ProviderPanelController;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.views.resources.DefaultTableListener;
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
public final class Management_Providers_Panel extends javax.swing.JPanel implements InterfaceCrudPanel {

    private final ProviderPanelController providerController;
    private final FieldDataValidator validator;
    private List<Provider> providers;

    public Management_Providers_Panel() {
        initComponents();
        this.providerController = new ProviderPanelController(this);
        this.validator = new FieldDataValidator();
        initListener();
        initValidator();
        initPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_datos1 = new javax.swing.JPanel();
        jbl_name = new javax.swing.JLabel();
        jtf_providerName = new javax.swing.JTextField();
        jbl_lastname = new javax.swing.JLabel();
        jtf_providerLastname = new javax.swing.JTextField();
        jbl_cuit = new javax.swing.JLabel();
        jtf_providerCuit = new javax.swing.JTextField();
        jlbl_mensaje1 = new javax.swing.JLabel();
        jlbl_alertaNombre1 = new javax.swing.JLabel();
        jlbl_alertaApellido1 = new javax.swing.JLabel();
        jlbl_alertaDNI1 = new javax.swing.JLabel();
        jlbl_alertaTipoPersona1 = new javax.swing.JLabel();
        jbn_update = new javax.swing.JButton();
        jbn_delete = new javax.swing.JButton();
        jbl_email = new javax.swing.JLabel();
        jbl_address = new javax.swing.JLabel();
        jbl_phone = new javax.swing.JLabel();
        jtf_providerAddress = new javax.swing.JTextField();
        jtf_providerEmail = new javax.swing.JTextField();
        jtf_providerPhone = new javax.swing.JTextField();
        jbn_save = new javax.swing.JButton();
        jbn_restore = new javax.swing.JButton();
        jlbl_info = new javax.swing.JLabel();
        jPanel_crud = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        tableProvider = new javax.swing.JTable();
        seeProviders = new javax.swing.JButton();
        jbl_filter = new javax.swing.JLabel();
        jtf_cuitFilter = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel_datos1.setBackground(new java.awt.Color(0, 51, 255));

        jbl_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_name.setForeground(new java.awt.Color(255, 255, 255));
        jbl_name.setText("NOMBRE");

        jtf_providerName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbl_lastname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_lastname.setForeground(new java.awt.Color(255, 255, 255));
        jbl_lastname.setText("APELLIDO");

        jtf_providerLastname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbl_cuit.setBackground(new java.awt.Color(255, 255, 255));
        jbl_cuit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_cuit.setForeground(new java.awt.Color(255, 255, 255));
        jbl_cuit.setText("C.U.I.T.");

        jtf_providerCuit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jlbl_mensaje1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl_mensaje1.setForeground(new java.awt.Color(255, 0, 0));

        jlbl_alertaNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaApellido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaDNI1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaTipoPersona1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
        jbn_delete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbn_deleteKeyPressed(evt);
            }
        });

        jbl_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_email.setForeground(new java.awt.Color(255, 255, 255));
        jbl_email.setText("E-MAIL");

        jbl_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_address.setForeground(new java.awt.Color(255, 255, 255));
        jbl_address.setText("DIRECCIÓN");

        jbl_phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_phone.setForeground(new java.awt.Color(255, 255, 255));
        jbl_phone.setText("TELÉFONO");

        jtf_providerAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtf_providerEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtf_providerPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                    .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbl_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_providerName, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_providerLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                        .addComponent(jbl_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jtf_providerCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                        .addComponent(jbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jtf_providerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                        .addComponent(jbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jtf_providerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                        .addComponent(jbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jtf_providerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(130, 130, 130)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlbl_alertaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlbl_alertaApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlbl_alertaTipoPersona1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGap(769, 769, 769)
                                .addComponent(jlbl_alertaDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jbn_restore)
                                .addGap(83, 83, 83)
                                .addComponent(jbn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jbn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jbn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel_datos1Layout.createSequentialGroup()
                            .addGap(427, 427, 427)
                            .addComponent(jlbl_mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel_datos1Layout.setVerticalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jlbl_alertaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jlbl_alertaApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_alertaDNI1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_providerCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_providerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbl_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_providerLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbl_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jlbl_alertaTipoPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_providerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_providerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_providerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jlbl_mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbn_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPanel_crud.setBackground(new java.awt.Color(0, 51, 255));

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        tableProvider.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla.setViewportView(tableProvider);

        seeProviders.setText("VER PROVEEDORES");
        seeProviders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeProvidersActionPerformed(evt);
            }
        });

        jbl_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter.setText("Filtrar por cuit:");

        jtf_cuitFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_cuitFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cuitFilterActionPerformed(evt);
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
                        .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(277, Short.MAX_VALUE))
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addComponent(jbl_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_cuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seeProviders)
                        .addGap(277, 277, 277))))
        );
        jPanel_crudLayout.setVerticalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_cuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seeProviders, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_updateActionPerformed
        if (providerController.verifyCrud("update")) {
            setupUpdateModeForProvider();
        } else {
            if (!isValidProviderCuit()) {
                jlbl_info.setText("ERROR: Ingrese un CUIT válido");
                setRedFont();
            } else if (verifyEmptyFields()) {
                jlbl_info.setText("Error: no pueden haber datos vacíos");
                setRedFont();
            } else {
                updateProvider();
            }
            initPanel();
        }
    }//GEN-LAST:event_jbn_updateActionPerformed

    private void setupUpdateModeForProvider() {
        changeConditionAllFields(true);
        changeConditionField(jtf_providerCuit, false);
        changeConditionAllButtons(false);
        changeConditionButton(jbn_update, true);
        jlbl_info.setText("Modifique los campos que requiera y vuelva a pulsar");
        setGreenFont();
    }

    private boolean isValidProviderCuit() {
        return jtf_providerCuit.getText().length() == 11;
    }

    private void updateProvider() {
        Provider newProvider = providerController.findByCuit(jtf_providerCuit.getText());
        newProvider.setName(jtf_providerName.getText());
        newProvider.setLastname(jtf_providerLastname.getText());
        newProvider.setAddress(jtf_providerAddress.getText());
        newProvider.setEmail(jtf_providerEmail.getText());
        newProvider.setPhone(jtf_providerPhone.getText());
        jlbl_info.setText(providerController.update(newProvider.getId(), newProvider));
        setGreenFont();
    }

    private void resetProviderFieldsAndButtons() {
        changeConditionAllButtons(false);
        changeConditionAllFields(false);
        changeConditionButton(jbn_save, true);
        changeConditionButton(jbn_restore, true);
    }


    private void jbn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_deleteActionPerformed

        Provider newProvider = providerController.findByCuit(jtf_providerCuit.getText());
        setRedFont();
        jlbl_info.setText(providerController.disable(newProvider.getId()));
        cleanAllFields();
        changeConditionAllButtons(false);
        changeConditionButton(jbn_save, true);
        changeConditionButton(jbn_restore, true);
        providers = providerController.updateTable("");
    }//GEN-LAST:event_jbn_deleteActionPerformed

    private void jbn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_saveActionPerformed
        if (providerController.verifyCrud("save")) {
            setupSaveMode();
        } else {
            if (!isValidProviderCuit()) {
                jlbl_info.setText("ERROR: Ingrese un CUIT válido");
                setRedFont();
            } else if (verifyEmptyFields()) {
                jlbl_info.setText("Error: no pueden haber datos vacíos");
                setRedFont();
            } else {
                saveProvider();
            }
            initPanel();
        }
    }//GEN-LAST:event_jbn_saveActionPerformed

    private void setupSaveMode() {
        changeConditionAllFields(true);
        jlbl_info.setText("Complete los campos y vuelva a presionar Guardar");
        jlbl_info.setForeground(Color.GREEN);
        jlbl_info.setFont(new Font("Arial", Font.BOLD, 16));
        changeConditionAllButtons(false);
        changeConditionButton(jbn_save, true);
    }

    private void saveProvider() {
        Provider newProvider = new Provider();
        newProvider.setName(jtf_providerName.getText());
        newProvider.setLastname(jtf_providerLastname.getText());
        newProvider.setCuit(jtf_providerCuit.getText());
        newProvider.setAddress(jtf_providerAddress.getText());
        newProvider.setEmail(jtf_providerEmail.getText());
        newProvider.setPhone(jtf_providerPhone.getText());
        jlbl_info.setText(providerController.create(newProvider));
        setGreenFont();
    }


    private void jbn_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_restoreActionPerformed
        if (providerController.verifyCrud("restore")) {
            setupRestoreMode();
        } else {
            if (jtf_providerCuit.getText().length() != 11) {
                jlbl_info.setText("ERROR: Ingrese un CUIT válido");
                setRedFont();
            } else {
                enableProvider(jtf_providerCuit.getText());
            }
            initPanel();
        }
    }//GEN-LAST:event_jbn_restoreActionPerformed

    private void setupRestoreMode() {
        changeConditionAllButtons(false);
        changeConditionButton(jbn_restore, true);
        changeConditionField(jtf_providerCuit, true);
        jlbl_info.setText("Ingrese el CUIT a restaurar y vuelva a presionar");
        setGreenFont();
    }

    private void enableProvider(String cuit) {
        Provider newClient = providerController.findByCuit(cuit);
        jlbl_info.setText(providerController.enable(newClient.getId()));
        setGreenFont();
    }

    private void setRedFont() {
        jlbl_info.setForeground(Color.RED);
        jlbl_info.setFont(new Font("Arial", Font.BOLD, 16));
    }

    private void setGreenFont() {
        jlbl_info.setForeground(Color.GREEN);
        jlbl_info.setFont(new Font("Arial", Font.BOLD, 16));
    }

    private void seeProvidersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeProvidersActionPerformed
        initPanel();
    }//GEN-LAST:event_seeProvidersActionPerformed

    private void jtf_cuitFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_cuitFilterActionPerformed
        providers = providerController.updateTable(jtf_cuitFilter.getText());
    }//GEN-LAST:event_jtf_cuitFilterActionPerformed

    private void jbn_deleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbn_deleteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbn_deleteKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_crud;
    private javax.swing.JPanel jPanel_datos1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JLabel jbl_address;
    private javax.swing.JLabel jbl_cuit;
    private javax.swing.JLabel jbl_email;
    private javax.swing.JLabel jbl_filter;
    private javax.swing.JLabel jbl_lastname;
    private javax.swing.JLabel jbl_name;
    private javax.swing.JLabel jbl_phone;
    private javax.swing.JButton jbn_delete;
    private javax.swing.JButton jbn_restore;
    private javax.swing.JButton jbn_save;
    private javax.swing.JButton jbn_update;
    private javax.swing.JLabel jlbl_alertaApellido1;
    private javax.swing.JLabel jlbl_alertaDNI1;
    private javax.swing.JLabel jlbl_alertaNombre1;
    private javax.swing.JLabel jlbl_alertaTipoPersona1;
    private javax.swing.JLabel jlbl_info;
    private javax.swing.JLabel jlbl_mensaje1;
    private javax.swing.JTextField jtf_cuitFilter;
    private javax.swing.JTextField jtf_providerAddress;
    private javax.swing.JTextField jtf_providerCuit;
    private javax.swing.JTextField jtf_providerEmail;
    private javax.swing.JTextField jtf_providerLastname;
    private javax.swing.JTextField jtf_providerName;
    private javax.swing.JTextField jtf_providerPhone;
    private javax.swing.JButton seeProviders;
    private javax.swing.JTable tableProvider;
    // End of variables declaration//GEN-END:variables

    @Override
    public JTable getTable() {
        return this.tableProvider;
    }

    @Override
    public void selectFromTable() {
        int field = tableProvider.getSelectedRow();
        if (field >= 0) {
            Provider selected = providers.get(field);
            jtf_providerName.setText(selected.getName());
            jtf_providerLastname.setText(selected.getLastname());
            jtf_providerCuit.setText(selected.getCuit());
            jtf_providerAddress.setText(selected.getAddress());
            jtf_providerEmail.setText(selected.getEmail());
            jtf_providerPhone.setText(selected.getPhone());
            changeConditionAllButtons(true);
            jlbl_info.setText("");
            changeConditionButton(jbn_save, false);
            changeConditionButton(jbn_restore, false);
        }
        providerController.verifyCrud("");
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_providerName, state);
        changeConditionField(jtf_providerLastname, state);
        changeConditionField(jtf_providerCuit, state);
        changeConditionField(jtf_providerAddress, state);
        changeConditionField(jtf_providerEmail, state);
        changeConditionField(jtf_providerPhone, state);
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
        cleanField(jtf_providerName);
        cleanField(jtf_providerLastname);
        cleanField(jtf_providerCuit);
        cleanField(jtf_providerAddress);
        cleanField(jtf_providerEmail);
        cleanField(jtf_providerPhone);
    }

    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }

    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_providerName);
        fields.add(jtf_providerLastname);
        fields.add(jtf_providerCuit);
        fields.add(jtf_providerAddress);
        fields.add(jtf_providerEmail);
        fields.add(jtf_providerPhone);
        return fields.stream().anyMatch(field -> field.getText().length() == 0);
    }

    @Override
    public String getStringFilter() {
        return jtf_cuitFilter.getText();
    }

    @Override
    public void initListener() {
        tableProvider.getSelectionModel().addListSelectionListener(new DefaultTableListener(this));
        jtf_cuitFilter.getDocument().addDocumentListener(new JTextFieldListener(providers, providerController, this));
    }

    @Override
    public void initValidator() {
        validator.onlyNumbers(jtf_providerCuit);
        validator.onlyLetters(jtf_providerName);
        validator.onlyLetters(jtf_providerLastname);
    }

    @Override
    public void initPanel() {
        this.providers = providerController.updateTable("");
        changeConditionAllButtons(false);
        changeConditionAllFields(false);
        changeConditionButton(jbn_save, true);
        changeConditionButton(jbn_restore, true);
        cleanAllFields();
        providerController.verifyCrud("");
    }
}
