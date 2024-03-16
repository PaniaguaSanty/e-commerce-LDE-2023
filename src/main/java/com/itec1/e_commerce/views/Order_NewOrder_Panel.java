package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.TableListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author sjcex
 */
public final class Order_NewOrder_Panel extends javax.swing.JPanel implements InterfaceCrudPanel {

    private final OrderPanelController controller;
    private final FieldDataValidator validator;
    private List<Order> orders;

    public Order_NewOrder_Panel() {
        initComponents();
        this.controller = new OrderPanelController(this);
        tableChooseProduct.getSelectionModel().addListSelectionListener(new TableListener(this));

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
        jbn_chooseCarrier = new javax.swing.JButton();
        jbn_chooseDestiny = new javax.swing.JButton();
        jlbl_info = new javax.swing.JLabel();
        jScrollPaneTabla1 = new javax.swing.JScrollPane();
        tableChooseWarehouse = new javax.swing.JTable();
        jbn_chooseOrigin = new javax.swing.JButton();
        jbl_cuitFilter = new javax.swing.JLabel();
        jScrollPaneTabla2 = new javax.swing.JScrollPane();
        tableChooseCarrier = new javax.swing.JTable();
        jbl_chooseCarrier = new javax.swing.JLabel();
        jtf_cuitFilter = new javax.swing.JTextField();
        jPanel_crud = new javax.swing.JPanel();
        jSpinnerDetailOrderAmount = new javax.swing.JSpinner();
        jbl_amountFilter = new javax.swing.JLabel();
        Jbtn_enterAmount = new javax.swing.JButton();
        jcategoryComboBox = new javax.swing.JComboBox<>();
        jbl_filter2 = new javax.swing.JLabel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        tableChooseProduct = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel_datos1.setBackground(new java.awt.Color(0, 51, 255));

        jbn_chooseCarrier.setText("SELECCIONAR");
        jbn_chooseCarrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_chooseCarrierActionPerformed(evt);
            }
        });

        jbn_chooseDestiny.setText("SELECCIONAR DESTINO");
        jbn_chooseDestiny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_chooseDestinyActionPerformed(evt);
            }
        });

        jlbl_info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPaneTabla1.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla1.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla1.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseWarehouse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla1.setViewportView(tableChooseWarehouse);

        jbn_chooseOrigin.setText("SELECCIONAR ORIGEN");
        jbn_chooseOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_chooseOriginActionPerformed(evt);
            }
        });

        jbl_cuitFilter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_cuitFilter.setForeground(new java.awt.Color(255, 255, 255));
        jbl_cuitFilter.setText("CUIT DEL CLIENTE:");

        jScrollPaneTabla2.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseCarrier.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla2.setViewportView(tableChooseCarrier);

        jbl_chooseCarrier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_chooseCarrier.setForeground(new java.awt.Color(255, 255, 255));
        jbl_chooseCarrier.setText("INGRESAR TRANSPORTISTA:");

        jtf_cuitFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel_datos1Layout = new javax.swing.GroupLayout(jPanel_datos1);
        jPanel_datos1.setLayout(jPanel_datos1Layout);
        jPanel_datos1Layout.setHorizontalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addComponent(jbl_cuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_cuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addComponent(jScrollPaneTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbn_chooseOrigin)
                                    .addComponent(jbn_chooseDestiny)))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbl_chooseCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbn_chooseCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel_datos1Layout.setVerticalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl_cuitFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_cuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addComponent(jbn_chooseOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jbn_chooseDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jbl_chooseCarrier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datos1Layout.createSequentialGroup()
                        .addComponent(jbn_chooseCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)))
                .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel_crud.setBackground(new java.awt.Color(0, 51, 255));

        jbl_amountFilter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_amountFilter.setForeground(new java.awt.Color(255, 255, 255));
        jbl_amountFilter.setText("INGRESE CANTIDAD:");

        Jbtn_enterAmount.setText("AGREGAR");
        Jbtn_enterAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_enterAmountActionPerformed(evt);
            }
        });

        jcategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbl_filter2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter2.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter2.setText("INGRESE CATEGORÍA:");

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseProduct.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla.setViewportView(tableChooseProduct);

        javax.swing.GroupLayout jPanel_crudLayout = new javax.swing.GroupLayout(jPanel_crud);
        jPanel_crud.setLayout(jPanel_crudLayout);
        jPanel_crudLayout.setHorizontalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jbl_amountFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerDetailOrderAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jbtn_enterAmount)
                        .addGap(93, 93, 93)
                        .addComponent(jbl_filter2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_crudLayout.setVerticalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerDetailOrderAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbl_amountFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jbtn_enterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbl_filter2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_crud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1053, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    @Override
    public javax.swing.JTable getTable() {
        return this.tableChooseProduct;
    }

    @Override
    public void initListener() {
        tableChooseProduct.getSelectionModel().addListSelectionListener(new TableListener(this));
    }

    @Override
    public void initValidator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void initPanel() {
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void changeConditionButton(JButton button, boolean state) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cleanAllFields() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cleanField(JTextField textfield) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean verifyEmptyFields() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getStringFilter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_enterAmount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_crud;
    private javax.swing.JPanel jPanel_datos1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JScrollPane jScrollPaneTabla1;
    private javax.swing.JScrollPane jScrollPaneTabla2;
    private javax.swing.JSpinner jSpinnerDetailOrderAmount;
    private javax.swing.JLabel jbl_amountFilter;
    private javax.swing.JLabel jbl_chooseCarrier;
    private javax.swing.JLabel jbl_cuitFilter;
    private javax.swing.JLabel jbl_filter2;
    private javax.swing.JButton jbn_chooseCarrier;
    private javax.swing.JButton jbn_chooseDestiny;
    private javax.swing.JButton jbn_chooseOrigin;
    private javax.swing.JComboBox<String> jcategoryComboBox;
    private javax.swing.JLabel jlbl_info;
    private javax.swing.JTextField jtf_cuitFilter;
    private javax.swing.JTable tableChooseCarrier;
    private javax.swing.JTable tableChooseProduct;
    private javax.swing.JTable tableChooseWarehouse;
    // End of variables declaration//GEN-END:variables

}
