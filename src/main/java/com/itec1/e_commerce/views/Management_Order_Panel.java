/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.controllers.SectorPanelController;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.TrackingOrder;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author sjcex
 */
public class Management_Order_Panel extends javax.swing.JPanel implements InterfaceOrderPanel, InterfacePanel {

    private final OrderPanelController panel;
    private final FieldDataValidator validator;
    private final SectorPanelController sectorPanel;
    private Order selectedOrder = null;

    /**
     * Creates new form Management_Client_Panel
     */
    public Management_Order_Panel() {
        this.panel = new OrderPanelController(this);
        Management_Sectors_Panel sectorsPanel = new Management_Sectors_Panel();
        this.sectorPanel = new SectorPanelController(sectorsPanel);
        this.validator = new FieldDataValidator();

        initComponents();
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

        jtf_code = new javax.swing.JTextField();
        btn_findOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbn_changeState = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbn_changeSector = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jsd_providerQualification = new javax.swing.JSlider();
        jbn_saveProductQualification = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jsd_carrierQualification = new javax.swing.JSlider();
        jbn_saveCarrierQualification = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtp_info = new javax.swing.JTextPane();
        jtf_sector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbn_cancelled = new javax.swing.JButton();
        jbn_returned = new javax.swing.JButton();
        jbl_sectorsName = new javax.swing.JLabel();
        jcb_sectors = new javax.swing.JComboBox<>();
        jcb_products = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 0, 255));

        jtf_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_codeActionPerformed(evt);
            }
        });

        btn_findOrder.setForeground(new java.awt.Color(255, 255, 255));
        btn_findOrder.setText("Buscar");
        btn_findOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findOrderActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese el código de su pedido:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cambiar estado:");

        jbn_changeState.setText("Siguiente");
        jbn_changeState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_changeStateActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cambiar sector:");

        jbn_changeSector.setText("Cambiar");
        jbn_changeSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_changeSectorActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Puntuar un Producto");

        jsd_providerQualification.setMaximum(50);
        jsd_providerQualification.setPaintLabels(true);
        jsd_providerQualification.setPaintTicks(true);
        jsd_providerQualification.setValue(0);

        jbn_saveProductQualification.setText("Guardar Puntuación ");
        jbn_saveProductQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_saveProductQualificationActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Puntuar Transportista");

        jsd_carrierQualification.setMaximum(50);
        jsd_carrierQualification.setValue(0);

        jbn_saveCarrierQualification.setText("Guardar Puntuación ");
        jbn_saveCarrierQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_saveCarrierQualificationActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jtp_info);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jbn_cancelled.setText("Cancelar");
        jbn_cancelled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_cancelledActionPerformed(evt);
            }
        });

        jbn_returned.setText("Devolver");
        jbn_returned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_returnedActionPerformed(evt);
            }
        });

        jbl_sectorsName.setBackground(new java.awt.Color(255, 255, 255));
        jbl_sectorsName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jcb_sectors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_sectors.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_sectorsItemStateChanged(evt);
            }
        });

        jcb_products.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_products.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_productsItemStateChanged(evt);
            }
        });
        jcb_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_productsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbn_cancelled)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jtf_code, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_findOrder))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbn_changeSector))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_sector, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jcb_sectors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jbn_changeState, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbn_returned))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbl_sectorsName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jsd_providerQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(jbn_saveProductQualification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jsd_carrierQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbn_saveCarrierQualification)))
                        .addGap(204, 204, 204))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_findOrder))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbn_changeState)
                            .addComponent(jbn_returned))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtf_sector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_sectors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbn_changeSector)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbl_sectorsName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jcb_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsd_carrierQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsd_providerQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbn_saveCarrierQualification)
                    .addComponent(jbn_saveProductQualification))
                .addGap(93, 93, 93)
                .addComponent(jbn_cancelled)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_codeActionPerformed

    }//GEN-LAST:event_jtf_codeActionPerformed

    private void btn_findOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findOrderActionPerformed
        selectedOrder = panel.findByCode(jtf_code.getText());
        validator.onlyNumbers(jtf_code);
        if (selectedOrder == null) {
            jtp_info.setText("No hay ningun pedido asociado al codigo proporcionado");
        } else {
            loadComboBox();
            List<TrackingOrder> trackings = panel.findByOrder(selectedOrder);
            String status = trackings.get(trackings.size() - 1).getState().getName();
            String info = "";

            if (status.equals("Canceled") || status.equals("Returned")) {
                info += "Este pedido ya ha sido "
                        + (status.equals("Canceled") ? "cancelado" : "devuelto");
            } else {
                info += "Pedido N°" + selectedOrder.getCode() + ": \n \n";
                info += "Sucursal actual: " + (trackings.size() > 5 ? selectedOrder.getWarehouseDestiny() : selectedOrder.getWarehouseOrigin());
                info += "\n \t Sector actual: " + selectedOrder.getSector().getName();
                info += "\n \n Estado: " + status;

                changeConditionButton(jbn_returned, true);
                changeConditionButton(jbn_cancelled, true);
                changeConditionButton(jbn_changeState, true);
                changeConditionButton(jbn_changeSector, true);
                  changeConditionButton(jbn_saveProductQualification, true);
                changeConditionButton(jbn_saveCarrierQualification, true);

            }
            jtp_info.setText(info);
        }
    }//GEN-LAST:event_btn_findOrderActionPerformed

    private void jbn_changeSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_changeSectorActionPerformed
        Order order = panel.findByCode(jtf_code.getText());
        Sector newSector = sectorPanel.findByCode(jtf_sector.getText());
        String info = "";
        if (newSector != null) {
            try {
                panel.changeSector(order, newSector);
                info += "Pedido N°: " + order.getCode();
                info += "Enviado al sector: " + newSector.getName();
                jtp_info.setText(info);
              
            } catch (Exception ex) {
                jtp_info.setText("No se ha encontrado ningun sector con el código proporcionado");
            }
        }


    }//GEN-LAST:event_jbn_changeSectorActionPerformed

    private void jbn_saveProductQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_saveProductQualificationActionPerformed
        Order order = panel.findByCode(jtf_code.getText());
        List<TrackingOrder> trackings = panel.findByOrder(order);
        String status = trackings.get(trackings.size() - 1).getState().getName();
        if (status.equals("Delivered")) {
            try {

                List<DetailOrder> details = panel.getDetailOrders(order);

                if (details == null || details.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No hay detalles de orden disponibles.");
                    return;
                }

                int star = jsd_providerQualification.getValue();
                String selectedProduct = (String) jcb_products.getSelectedItem();
                for (DetailOrder detailOrder : details) {
                    if (detailOrder.getProduct().getName().equals(selectedProduct)) {
                        panel.qualifyProvider(detailOrder, star);
                    }
                }
                JOptionPane.showMessageDialog(this, "Se ha asignado una puntuación de " + star + " a los productos seleccionados.");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, "ERROR: " + ex.getMessage());
            }

        }else{
            JOptionPane.showMessageDialog(this, "Solo pueden puntuarse los pedidos entregados.");
        }

    }//GEN-LAST:event_jbn_saveProductQualificationActionPerformed

    private void jbn_saveCarrierQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_saveCarrierQualificationActionPerformed
        Order order = panel.findByCode(jtf_code.getText());
        Invoice invoice = panel.getInvoice(order);
        int star = jsd_carrierQualification.getValue();
        try {
            panel.qualifyCarrier(invoice, star);
            JOptionPane.showMessageDialog(this, "su puntuacion es de: " + star);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR");

        }


    }//GEN-LAST:event_jbn_saveCarrierQualificationActionPerformed

    private void jbn_changeStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_changeStateActionPerformed
        Order order = panel.findByCode(jtf_code.getText());
        List<TrackingOrder> trackings = panel.findByOrder(order);
        String info = "";
        String newStatus = trackings.get(trackings.size() - 1).getState().getName();
        if (newStatus.equals("Canceled") || newStatus.equals("Returned")) {
            info += "Este pedido ya ha sido "
                    + (newStatus.equals("Canceled") ? "cancelado" : "devuelto");
        } else if (newStatus.equals("Delivered")) {
            info += "Este pedido ya ha sido entregado";
        } else {
            panel.changeOrderState(order);
            info += "Pedido N°" + order.getCode() + ": \n \n";
            info += "Sucursal actual: " + (trackings.size() > 5 ? order.getWarehouseDestiny() : order.getWarehouseOrigin());
            info += "\n \t Sector actual: " + order.getSector().getName();
            info += "\n \n Estado: " + newStatus;

        }
        jtp_info.setText(info);

    }//GEN-LAST:event_jbn_changeStateActionPerformed

    private void jbn_returnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_returnedActionPerformed
        Order order = panel.findByCode(jtf_code.getText());
        List<TrackingOrder> trackings = panel.findByOrder(order);
        String status = trackings.get(trackings.size() - 1).getState().getName();
        if (status.equals("Delivered") && !status.equals("Canceled")) {
            try {
                panel.returnOrder(order);
                jtp_info.setText("El pedido ha sido devuelto");
            } catch (Exception ex) {
                jtp_info.setText("Hubo un error al intentar devolver el pedido.");
            }
        } else {
            jtp_info.setText("El pedido no se puede devolver, porque está en estado: " + status);
        }
        changeConditionButton(jbn_saveCarrierQualification, false);
        changeConditionButton(jbn_saveProductQualification, false);
        changeConditionButton(jbn_cancelled, false);
    }//GEN-LAST:event_jbn_returnedActionPerformed

    private void jbn_cancelledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_cancelledActionPerformed
        Order order = panel.findByCode(jtf_code.getText());
        List<TrackingOrder> trackings = panel.findByOrder(order);
        String status = trackings.get(trackings.size() - 1).getState().getName();
        if (!status.equals("Delivered")) {
            try {
                panel.cancelOrder(order);
                jtp_info.setText("El pedido ha sido cancelado");
                cleanAllFields();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ERROR al intentar cancelar el pedido.");
            }
        } else {
            jtp_info.setText("El pedido no se puede cancelar, porque ya ha sido entregado.");
        }
        changeConditionButton(jbn_saveCarrierQualification, false);
        changeConditionButton(jbn_saveProductQualification, false);
        changeConditionButton(jbn_returned, false);
    }//GEN-LAST:event_jbn_cancelledActionPerformed

    private void jcb_sectorsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_sectorsItemStateChanged
        String sector = (String) jcb_sectors.getSelectedItem();
        Sector sector1 = sectorPanel.findByCode(sector);

        if (sector1 != null) {
            jtf_sector.setText(sector);
            jbl_sectorsName.setText(sector1.getName());
        }
    }//GEN-LAST:event_jcb_sectorsItemStateChanged

    private void jcb_productsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_productsItemStateChanged

    }//GEN-LAST:event_jcb_productsItemStateChanged

    private void jcb_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_productsActionPerformed

    }//GEN-LAST:event_jcb_productsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_findOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jbl_sectorsName;
    private javax.swing.JButton jbn_cancelled;
    private javax.swing.JButton jbn_changeSector;
    private javax.swing.JButton jbn_changeState;
    private javax.swing.JButton jbn_returned;
    private javax.swing.JButton jbn_saveCarrierQualification;
    private javax.swing.JButton jbn_saveProductQualification;
    private javax.swing.JComboBox<String> jcb_products;
    private javax.swing.JComboBox<String> jcb_sectors;
    private javax.swing.JSlider jsd_carrierQualification;
    private javax.swing.JSlider jsd_providerQualification;
    private javax.swing.JTextField jtf_code;
    private javax.swing.JTextField jtf_sector;
    private javax.swing.JTextPane jtp_info;
    // End of variables declaration//GEN-END:variables

    @Override
    public JTable getClientsTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JTable getProductsTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JTable getWarehousesTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JTable getSectorsTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JTable getOrdersTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JTable getCarriersTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JTable getDetailOrdersTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getClientFilter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getProductFilter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getWarehouseFilter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getSectorFilter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getOrderFilter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getCarrierFilter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void initListener() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void initValidator() {
        validator.onlyNumbers(jtf_code);

    }

    @Override
    public void initPanel() {
        changeConditionAllButtons(false);
        changeConditionButton(btn_findOrder, true);
        loadComboBox();
        jcb_products.setEnabled(true);
        jcb_sectors.setEnabled(true);
        cleanAllFields();
        jtp_info.setText("");
    }

    @Override
    public JTable getTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void selectFromTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
        changeConditionButton(jbn_returned, state);

        changeConditionButton(jbn_cancelled, state);
        changeConditionButton(jbn_changeSector, state);
        changeConditionButton(jbn_changeState, state);
        changeConditionButton(jbn_saveCarrierQualification, state);
        changeConditionButton(jbn_saveProductQualification, state);

    }

    @Override
    public void changeConditionButton(JButton button, boolean state) {
        validator.enableButton(state, button, null, null, null, null);
    }

    @Override
    public void cleanAllFields() {
        cleanField(jtf_code);
        cleanField(jtf_sector);
    }

    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }

    @Override
    public boolean verifyEmptyFields() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getStringFilter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadComboBox() {
        jcb_products.removeAllItems();
        jcb_products.addItem("Seleccionar Producto");
        jcb_products.setSelectedItem("Seleccionar Producto");
        jcb_sectors.removeAllItems();
        jcb_sectors.addItem("Seleccionar Sector");
        jcb_sectors.setSelectedItem("Seleccionar Sector");

        if (selectedOrder != null) {

            for (DetailOrder detail : panel.getDetailOrders(selectedOrder)) {
                jcb_products.addItem(detail.getProduct().getName());

            }

            for (Sector sector : panel.getSector(panel.findByOrder(selectedOrder).size() > 5 ? selectedOrder.getWarehouseDestiny() : selectedOrder.getWarehouseOrigin())) {
                jcb_sectors.addItem(sector.getCode());

            }
        }
    }

}
