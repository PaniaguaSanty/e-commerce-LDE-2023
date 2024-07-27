/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.entities.Client;
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
public final class NewOrder_ChooseClientPanel extends javax.swing.JPanel implements InterfacePanel, InterfaceOrderPanel {
    
    private final OrderPanelController controller;
    private final FieldDataValidator validator;
    private List<Client> clients;
    private final MainFrame mainFrame;
    
    public NewOrder_ChooseClientPanel(MainFrame mainFrame) {
        initComponents();
        this.controller = new OrderPanelController(this);
        this.mainFrame = mainFrame;
        this.validator = new FieldDataValidator();
        initListener();
        initValidator();
        initPanel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtf_clientCuitFilter = new javax.swing.JTextField();
        Jbtn_findClientByCuit = new javax.swing.JButton();
        jbtn_nextOrderPanel = new javax.swing.JButton();
        jbl_clientCuitInfo = new javax.swing.JLabel();
        jScrollPaneTabla2 = new javax.swing.JScrollPane();
        tableChooseClient = new javax.swing.JTable();
        jbl_clientInfo = new javax.swing.JLabel();
        jbl_CuitFilterInfo = new javax.swing.JLabel();
        jbl_filter2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jtf_clientCuitFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_clientCuitFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_clientCuitFilterActionPerformed(evt);
            }
        });

        Jbtn_findClientByCuit.setBackground(new java.awt.Color(0, 255, 51));
        Jbtn_findClientByCuit.setText("ACEPTAR");
        Jbtn_findClientByCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_findClientByCuitActionPerformed(evt);
            }
        });

        jbtn_nextOrderPanel.setText("SIGUIENTE");
        jbtn_nextOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_nextOrderPanelActionPerformed(evt);
            }
        });

        jbl_clientCuitInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_clientCuitInfo.setForeground(new java.awt.Color(255, 255, 255));
        jbl_clientCuitInfo.setText("SELECCIONE EL CLIENTE: ");

        jScrollPaneTabla2.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseClient.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla2.setViewportView(tableChooseClient);

        jbl_clientInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_clientInfo.setForeground(new java.awt.Color(255, 255, 255));

        jbl_CuitFilterInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_CuitFilterInfo.setForeground(new java.awt.Color(255, 255, 255));

        jbl_filter2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter2.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter2.setText("INGRESAR CUIT DEL CLIENTE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jtf_clientCuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbl_filter2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbl_clientCuitInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbl_CuitFilterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(Jbtn_findClientByCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtn_nextOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(159, 159, 159)
                                .addComponent(jbl_clientInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbl_clientCuitInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbl_CuitFilterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jbl_clientInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jbl_filter2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_clientCuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jbtn_findClientByCuit)
                    .addComponent(jbtn_nextOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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

    private void jtf_clientCuitFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_clientCuitFilterActionPerformed

    }//GEN-LAST:event_jtf_clientCuitFilterActionPerformed

    private void Jbtn_findClientByCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_findClientByCuitActionPerformed
        Client clientExist = controller.findByCuit(jtf_clientCuitFilter.getText());
        if (clientExist != null) {
            changeConditionButton(Jbtn_findClientByCuit, false);
            setGreenFont();
            jbl_CuitFilterInfo.setText("Cliente asociado.");
            controller.assignClientToOrder(clientExist);
            changeConditionButton(jbtn_nextOrderPanel, true);
        } else {
            setRedFont();
            jbl_CuitFilterInfo.setText("Ingrese un cuit.");
        }
    }//GEN-LAST:event_Jbtn_findClientByCuitActionPerformed

    private void jbtn_nextOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_nextOrderPanelActionPerformed
        
        mainFrame.changeOrderPanel();
        initPanel();
    }//GEN-LAST:event_jbtn_nextOrderPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_findClientByCuit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneTabla2;
    private javax.swing.JLabel jbl_CuitFilterInfo;
    private javax.swing.JLabel jbl_clientCuitInfo;
    private javax.swing.JLabel jbl_clientInfo;
    private javax.swing.JLabel jbl_filter2;
    private javax.swing.JButton jbtn_nextOrderPanel;
    private javax.swing.JTextField jtf_clientCuitFilter;
    private javax.swing.JTable tableChooseClient;
    // End of variables declaration//GEN-END:variables

    @Override
    public void initListener() {
        tableChooseClient.getSelectionModel().addListSelectionListener(new TableListener(this));
        jtf_clientCuitFilter.getDocument().addDocumentListener(new JTextFieldListener(this));
    }
    
    @Override
    public void initValidator() {
        validator.onlyNumbers(jtf_clientCuitFilter);
        validator.limitSize(jtf_clientCuitFilter, 11);
    }
    
    @Override
    public void initPanel() {
        clients = controller.updateTable("");
        changeConditionAllButtons(false);
        changeConditionAllFields(false);
        changeConditionField(jtf_clientCuitFilter, true);
        changeConditionButton(Jbtn_findClientByCuit, true);
 
        cleanAllFields();
    }
    
    @Override
    public JTable getTable() {
        return null;
    }
    
    @Override
    public void selectFromTable() {
        int field = tableChooseClient.getSelectedRow();
        if (field >= 0) {
            Client selected = clients.get(field);
            jtf_clientCuitFilter.setText(selected.getCuit());
        }
    }
    
    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_clientCuitFilter, state);
    }
    
    @Override
    public void changeConditionField(JTextField textField, boolean state) {
        validator.enableField(state, textField);
    }
    
    @Override
    public void changeConditionAllButtons(boolean state) {
        changeConditionButton(Jbtn_findClientByCuit, state);
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
    
    private void setRedFont() {
        jbl_CuitFilterInfo.setForeground(Color.RED);
        jbl_CuitFilterInfo.setFont(new Font("Arial", Font.BOLD, 16));
    }
    
    private void setGreenFont() {
        jbl_CuitFilterInfo.setForeground(Color.GREEN);
        jbl_CuitFilterInfo.setFont(new Font("Arial", Font.BOLD, 16));
    }
    
    @Override
    public void cleanAllFields() {
        cleanField(jtf_clientCuitFilter);
        jbl_CuitFilterInfo.setText("");
    }
    
    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }
    
    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_clientCuitFilter);
        for (JTextField field : fields) {
            if (field.getText().length() == 0) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String getStringFilter() {
        return null;
    }
    
    @Override
    public void updateTable() {
        clients = controller.updateTable(jtf_clientCuitFilter.getText());
    }
    
    @Override
    public JTable getClientsTable() {
        return this.tableChooseClient;
    }
    
    @Override
    public JTable getProductsTable() {
        return null;
    }
    
    @Override
    public JTable getWarehousesTable() {
        return null;
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
        return jtf_clientCuitFilter.getText();
    }
    
    @Override
    public String getProductFilter() {
        return null;
    }
    
    @Override
    public String getWarehouseFilter() {
        return null;
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
}
