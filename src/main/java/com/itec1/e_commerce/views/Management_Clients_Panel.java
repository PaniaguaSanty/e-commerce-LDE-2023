/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.ClientJpaController;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.services.ClientServiceImpl;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sjcex
 */
public class Management_Clients_Panel extends javax.swing.JPanel {

    private final ClientServiceImpl clientService;

    /**
     * Creates new form Management_Client_Panel
     */
    public Management_Clients_Panel() {
        initComponents();

        this.clientService = new ClientServiceImpl();

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
        jLabel3 = new javax.swing.JLabel();
        jtf_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_lastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_cuit = new javax.swing.JTextField();
        jlbl_mensaje1 = new javax.swing.JLabel();
        jlbl_alertaNombre1 = new javax.swing.JLabel();
        jlbl_alertaApellido1 = new javax.swing.JLabel();
        jlbl_alertaDNI1 = new javax.swing.JLabel();
        jlbl_alertaTipoPersona1 = new javax.swing.JLabel();
        jbtn_cancelar1 = new javax.swing.JButton();
        jbtn_modificar1 = new javax.swing.JButton();
        jbtn_eliminar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtf_address = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jtf_phone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel_crud = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jtb_persona = new javax.swing.JTable();
        jbtn_listar = new javax.swing.JButton();
        jbtn_agregar = new javax.swing.JButton();
        jtf_buscarPersona = new javax.swing.JTextField();
        jbtn_volver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE");

        jtf_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("APELLIDO");

        jtf_lastname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("C.U.I.T.");

        jtf_cuit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jlbl_mensaje1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl_mensaje1.setForeground(new java.awt.Color(255, 0, 0));

        jlbl_alertaNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaApellido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaDNI1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaTipoPersona1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jbtn_cancelar1.setText("CANCELAR");
        jbtn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelar1ActionPerformed(evt);
            }
        });

        jbtn_modificar1.setText("MODIFICAR");
        jbtn_modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_modificar1ActionPerformed(evt);
            }
        });

        jbtn_eliminar1.setText("ELIMINAR");
        jbtn_eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminar1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Dirección");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Teléfono");

        jtf_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtf_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtf_phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("RECUPERAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_datos1Layout = new javax.swing.GroupLayout(jPanel_datos1);
        jPanel_datos1.setLayout(jPanel_datos1Layout);
        jPanel_datos1Layout.setHorizontalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel_datos1Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                    .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtf_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                            .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_alertaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_alertaApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jlbl_alertaTipoPersona1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel_datos1Layout.createSequentialGroup()
                            .addGap(769, 769, 769)
                            .addComponent(jlbl_alertaDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datos1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(jbtn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtn_modificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtn_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94))
                        .addGroup(jPanel_datos1Layout.createSequentialGroup()
                            .addGap(427, 427, 427)
                            .addComponent(jlbl_mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel_datos1Layout.setVerticalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jlbl_mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn_modificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jlbl_alertaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jlbl_alertaApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_alertaDNI1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datos1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jlbl_alertaTipoPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 114, Short.MAX_VALUE))
        );

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        jScrollPaneTabla.setViewportView(jtb_persona);

        jbtn_listar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtn_listar.setText("LISTAR POR DNI");
        jbtn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_listarActionPerformed(evt);
            }
        });

        jbtn_agregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtn_agregar.setText("AGREGAR");
        jbtn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_agregarActionPerformed(evt);
            }
        });

        jtf_buscarPersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_buscarPersona.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_buscarPersonaFocusGained(evt);
            }
        });
        jtf_buscarPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_buscarPersonaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel_crudLayout = new javax.swing.GroupLayout(jPanel_crud);
        jPanel_crud.setLayout(jPanel_crudLayout);
        jPanel_crudLayout.setHorizontalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jbtn_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jtf_buscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel_crudLayout.setVerticalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_buscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jbtn_volver.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtn_volver.setText("VOLVER");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel_crud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_datos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(jbtn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelar1ActionPerformed
    
    }//GEN-LAST:event_jbtn_cancelar1ActionPerformed

    private void jbtn_modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_modificar1ActionPerformed
       Client newClient = clientService.findByCuit(jtf_cuit.getText());
        newClient.setName(jtf_name.getText());
        newClient.setLastname(jtf_lastname.getText());
        newClient.setAddress(jtf_address.getText());
        newClient.setEmail(jtf_email.getText());
        newClient.setPhone(jtf_phone.getText());
        try {
            clientService.update(newClient.getId(), newClient);
        } catch (Exception ex) {
            Logger.getLogger(Management_Clients_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtn_modificar1ActionPerformed

    private void jbtn_eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminar1ActionPerformed
        Client newClient = clientService.findByCuit(jtf_cuit.getText());
        try {
            clientService.disable(newClient.getId());
        } catch (Exception ex) {
            Logger.getLogger(Management_Clients_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jbtn_eliminar1ActionPerformed

    private void jbtn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_listarActionPerformed
        
    
    }//GEN-LAST:event_jbtn_listarActionPerformed

    private void jbtn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_agregarActionPerformed
        
    }//GEN-LAST:event_jbtn_agregarActionPerformed

    private void jtf_buscarPersonaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_buscarPersonaFocusGained
        
        
        
    }//GEN-LAST:event_jtf_buscarPersonaFocusGained

    private void jtf_buscarPersonaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_buscarPersonaKeyReleased
      
    }//GEN-LAST:event_jtf_buscarPersonaKeyReleased

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
      
    }//GEN-LAST:event_jbtn_volverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Client newClient = new Client();
        newClient.setName(jtf_name.getText());
        newClient.setLastname(jtf_lastname.getText());
        newClient.setCuit(jtf_cuit.getText());
        newClient.setAddress(jtf_address.getText());
        newClient.setEmail(jtf_email.getText());
        newClient.setPhone(jtf_phone.getText());
        clientService.create(newClient);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Client newClient = clientService.findByCuit(jtf_cuit.getText());
        try {
            clientService.enable(newClient.getId());
        } catch (Exception ex) {
            Logger.getLogger(Management_Clients_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel_crud;
    private javax.swing.JPanel jPanel_datos;
    private javax.swing.JPanel jPanel_datos1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JButton jbtn_aceptar;
    private javax.swing.JButton jbtn_agregar;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JButton jbtn_cancelar1;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_eliminar1;
    private javax.swing.JButton jbtn_listar;
    private javax.swing.JButton jbtn_modificar;
    private javax.swing.JButton jbtn_modificar1;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JLabel jlbl_alertaApellido;
    private javax.swing.JLabel jlbl_alertaApellido1;
    private javax.swing.JLabel jlbl_alertaDNI;
    private javax.swing.JLabel jlbl_alertaDNI1;
    private javax.swing.JLabel jlbl_alertaNombre;
    private javax.swing.JLabel jlbl_alertaNombre1;
    private javax.swing.JLabel jlbl_alertaTipoPersona;
    private javax.swing.JLabel jlbl_alertaTipoPersona1;
    private javax.swing.JLabel jlbl_mensaje;
    private javax.swing.JLabel jlbl_mensaje1;
    private javax.swing.JTable jtb_persona;
    private javax.swing.JTextField jtf_address;
    private javax.swing.JTextField jtf_apellido;
    private javax.swing.JTextField jtf_buscarPersona;
    private javax.swing.JTextField jtf_cuit;
    private javax.swing.JTextField jtf_dni;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_lastname;
    private javax.swing.JTextField jtf_name;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_phone;
    // End of variables declaration//GEN-END:variables
}
