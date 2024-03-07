/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.services.ProviderServiceImpl;
import com.itec1.e_commerce.views.resources.ValidadorDeCampos;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityNotFoundException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sjcex
 */
public class Management_Providers_Panel extends javax.swing.JPanel {

    private final ProviderServiceImpl providerService;
    private final ValidadorDeCampos validador;

    public Management_Providers_Panel() {
        initComponents();

        this.providerService = new ProviderServiceImpl();
        this.validador = new ValidadorDeCampos();
        validador.validarSoloNumero(jtf_providerCuit);
        validador.validarSoloLetras(jtf_providerName);
        validador.validarSoloLetras(jtf_providerLastname);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_datos1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtf_providerName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_providerLastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_providerCuit = new javax.swing.JTextField();
        jlbl_mensaje1 = new javax.swing.JLabel();
        jlbl_alertaNombre1 = new javax.swing.JLabel();
        jlbl_alertaApellido1 = new javax.swing.JLabel();
        jlbl_alertaDNI1 = new javax.swing.JLabel();
        jlbl_alertaTipoPersona1 = new javax.swing.JLabel();
        jbtn_update = new javax.swing.JButton();
        jbtn_delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtf_providerAddress = new javax.swing.JTextField();
        jtf_providerEmail = new javax.swing.JTextField();
        jtf_providerPhone = new javax.swing.JTextField();
        jbn_save = new javax.swing.JButton();
        jbn_restore = new javax.swing.JButton();
        jPanel_crud = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        tableProvider = new javax.swing.JTable();
        seeProviders = new javax.swing.JButton();

        jPanel_datos1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");

        jtf_providerName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("APELLIDO");

        jtf_providerLastname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("C.U.I.T.");

        jtf_providerCuit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jlbl_mensaje1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl_mensaje1.setForeground(new java.awt.Color(255, 0, 0));

        jlbl_alertaNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaApellido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaDNI1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaTipoPersona1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jbtn_update.setText("MODIFICAR");
        jbtn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_updateActionPerformed(evt);
            }
        });

        jbtn_delete.setText("ELIMINAR");
        jbtn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_deleteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dirección");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Teléfono");

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

        javax.swing.GroupLayout jPanel_datos1Layout = new javax.swing.GroupLayout(jPanel_datos1);
        jPanel_datos1.setLayout(jPanel_datos1Layout);
        jPanel_datos1Layout.setHorizontalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_datos1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                    .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(68, 68, 68)
                                    .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtf_providerName, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_providerLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70)
                                    .addComponent(jtf_providerCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jtf_providerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jtf_providerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jbtn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(jbtn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jlbl_mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
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
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_providerLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jlbl_alertaTipoPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_providerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_providerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_providerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jlbl_mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbn_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel_crudLayout = new javax.swing.GroupLayout(jPanel_crud);
        jPanel_crud.setLayout(jPanel_crudLayout);
        jPanel_crudLayout.setHorizontalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seeProviders)
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel_crudLayout.setVerticalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seeProviders, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jbtn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_updateActionPerformed
        try {
            Provider newProvider = providerService.findByCuit(jtf_providerCuit.getText());
            newProvider.setName(jtf_providerName.getText());
            newProvider.setLastname(jtf_providerLastname.getText());
            newProvider.setAddress(jtf_providerAddress.getText());
            newProvider.setEmail(jtf_providerEmail.getText());
            newProvider.setPhone(jtf_providerPhone.getText());
            try {
                providerService.update(newProvider.getId(), newProvider);
                JOptionPane.showMessageDialog(null, "Provider updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
            } catch (Exception ex) {
                Logger.getLogger(Management_Providers_Panel.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error updating Provider.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (EntityNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Provider not found: " + ex.getMessage(), "Error-Not-Found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtn_updateActionPerformed

    private void jbtn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_deleteActionPerformed
        Provider newProvider = providerService.findByCuit(jtf_providerCuit.getText());
        try {
            providerService.disable(newProvider.getId());
            JOptionPane.showMessageDialog(null, "Provider deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        } catch (Exception ex) {
            Logger.getLogger(Management_Providers_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtn_deleteActionPerformed

    private void jbn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_saveActionPerformed

        Provider newProvider = new Provider();
        //mensaje de prueba
        if (jtf_providerCuit.getText().length() != 11) {
            JOptionPane.showMessageDialog(null, "Ingrese un C.U.I.T válido (11 caracteres)", "USE A VALID C.U.I.", JOptionPane.ERROR_MESSAGE);
            clearFields();
            return;
        } else if (providerService.findByCuit(jtf_providerCuit.getText()) != null) {
            JOptionPane.showMessageDialog(null, "El C.U.I.T ingresado ya existe", "C.U.I.T ALREADY EXIST.", JOptionPane.ERROR_MESSAGE);
            clearFields();
            return;
        } else {
            newProvider.setName(jtf_providerName.getText());
            newProvider.setLastname(jtf_providerLastname.getText());
            newProvider.setCuit(jtf_providerCuit.getText());
            newProvider.setAddress(jtf_providerAddress.getText());
            newProvider.setEmail(jtf_providerEmail.getText());
            newProvider.setPhone(jtf_providerPhone.getText());
            providerService.create(newProvider);
            JOptionPane.showMessageDialog(null, "Provider saved successfully", "Updated-Successfully", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
    }//GEN-LAST:event_jbn_saveActionPerformed

    private void jbn_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_restoreActionPerformed
        Provider newProvider = providerService.findByCuit(jtf_providerCuit.getText());
        try {
            providerService.enable(newProvider.getId());
        } catch (Exception ex) {
            Logger.getLogger(Management_Clients_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbn_restoreActionPerformed

    private void seeProvidersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeProvidersActionPerformed
        showProvider();
    }//GEN-LAST:event_seeProvidersActionPerformed

    private void showProvider() {
        DefaultTableModel model = new DefaultTableModel();
        String[] titulos = {"Id", "Nombre", "Apellido", "C.U.I.T.", "Direción", "Correo", "Teléfono"};
        model.setColumnIdentifiers(titulos);

        List<Provider> providers = providerService.findAll();
        providers.forEach(provider -> {
            Object[] object = {provider.getId(), provider.getName(), provider.getLastname(), provider.getCuit(), provider.getAddress(),
                provider.getEmail(), provider.getPhone()};
            model.addRow(object);
        });
        tableProvider.setModel(model);
    }

    private void clearFields() {
        jtf_providerName.setText("");
        jtf_providerLastname.setText("");
        jtf_providerCuit.setText("");
        jtf_providerAddress.setText("");
        jtf_providerEmail.setText("");
        jtf_providerPhone.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel_crud;
    private javax.swing.JPanel jPanel_datos1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JButton jbn_restore;
    private javax.swing.JButton jbn_save;
    private javax.swing.JButton jbtn_delete;
    private javax.swing.JButton jbtn_update;
    private javax.swing.JLabel jlbl_alertaApellido1;
    private javax.swing.JLabel jlbl_alertaDNI1;
    private javax.swing.JLabel jlbl_alertaNombre1;
    private javax.swing.JLabel jlbl_alertaTipoPersona1;
    private javax.swing.JLabel jlbl_mensaje1;
    private javax.swing.JTextField jtf_providerAddress;
    private javax.swing.JTextField jtf_providerCuit;
    private javax.swing.JTextField jtf_providerEmail;
    private javax.swing.JTextField jtf_providerLastname;
    private javax.swing.JTextField jtf_providerName;
    private javax.swing.JTextField jtf_providerPhone;
    private javax.swing.JButton seeProviders;
    private javax.swing.JTable tableProvider;
    // End of variables declaration//GEN-END:variables
}
