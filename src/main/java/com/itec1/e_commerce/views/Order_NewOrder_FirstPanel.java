package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.JOrderFieldListener;
import com.itec1.e_commerce.views.resources.JTextFieldListener;
import com.itec1.e_commerce.views.resources.TableListener;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author sjcex
 */
public final class Order_NewOrder_FirstPanel extends javax.swing.JPanel implements InterfacePanel {

    private final OrderPanelController controller;
    private final FieldDataValidator validator;
    private List<DetailOrder> detailsOrder;
    private List<Client> clients;
    private List<Product> products;
    private final MainFrame mainFrame;

    public Order_NewOrder_FirstPanel(MainFrame mainFrame) {
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

        jScrollPaneTabla1 = new javax.swing.JScrollPane();
        tableDetail = new javax.swing.JTable();
        jtf_clientCuitFilter = new javax.swing.JTextField();
        jbl_filter5 = new javax.swing.JLabel();
        jbl_productName = new javax.swing.JLabel();
        jtf_productNameFilter = new javax.swing.JTextField();
        jbl_filter7 = new javax.swing.JLabel();
        comboBox_category = new javax.swing.JComboBox<>();
        Jbtn_findClientByCuit = new javax.swing.JButton();
        jAmountSpinner = new javax.swing.JSpinner();
        jbtn_addDetailOrder = new javax.swing.JButton();
        jbtn_nextOrderPanel = new javax.swing.JButton();
        jbl_clientCuitInfo = new javax.swing.JLabel();
        jScrollPaneTabla2 = new javax.swing.JScrollPane();
        tableChooseClient = new javax.swing.JTable();
        jbl_clientInfo = new javax.swing.JLabel();
        jScrollPaneTabla3 = new javax.swing.JScrollPane();
        tableChooseProduct = new javax.swing.JTable();
        jbl_filter6 = new javax.swing.JLabel();
        jbl_filter8 = new javax.swing.JLabel();
        jbtn_addDetailOrder1 = new javax.swing.JButton();
        jbl_filterByName = new javax.swing.JLabel();
        jbl_filter1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jScrollPaneTabla1.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla1.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla1.setPreferredSize(new java.awt.Dimension(950, 750));

        tableDetail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla1.setViewportView(tableDetail);

        jtf_clientCuitFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_clientCuitFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_clientCuitFilterActionPerformed(evt);
            }
        });

        jbl_filter5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter5.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter5.setText("ARMAR CARRITO:");

        jbl_productName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_productName.setForeground(new java.awt.Color(255, 255, 255));
        jbl_productName.setText("nombre:");

        jtf_productNameFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_productNameFilterActionPerformed(evt);
            }
        });

        jbl_filter7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter7.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter7.setText("categoría:");

        comboBox_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item 1" }));
        comboBox_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_categoryActionPerformed(evt);
            }
        });

        Jbtn_findClientByCuit.setBackground(new java.awt.Color(0, 255, 51));
        Jbtn_findClientByCuit.setText("ACEPTAR");
        Jbtn_findClientByCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_findClientByCuitActionPerformed(evt);
            }
        });

        jbtn_addDetailOrder.setText("AGREGAR");
        jbtn_addDetailOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_addDetailOrderActionPerformed(evt);
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

        jScrollPaneTabla2.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseClient.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla2.setViewportView(tableChooseClient);

        jbl_clientInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_clientInfo.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPaneTabla3.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla3.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla3.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseProduct.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla3.setViewportView(tableChooseProduct);

        jbl_filter6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter6.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter6.setText("indicar cantidad");

        jbl_filter8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter8.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter8.setText("DETALLE ACTUAL:");

        jbtn_addDetailOrder1.setText("QUITAR");
        jbtn_addDetailOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_addDetailOrder1ActionPerformed(evt);
            }
        });

        jbl_filterByName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filterByName.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filterByName.setText("FILTRAR POR:");

        jbl_filter1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter1.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter1.setText("INGRESAR CUIT DEL CLIENTE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbl_clientCuitInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_filter5))
                        .addContainerGap(549, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneTabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbl_filter8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jbtn_addDetailOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(jbl_filter6)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jbtn_addDetailOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPaneTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_nextOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_clientCuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jbtn_findClientByCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbl_clientInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbl_filter7)
                                        .addComponent(jtf_productNameFilter)
                                        .addComponent(comboBox_category, 0, 145, Short.MAX_VALUE)
                                        .addComponent(jbl_productName)))
                                .addContainerGap(114, Short.MAX_VALUE))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(535, Short.MAX_VALUE)
                    .addComponent(jbl_filterByName)
                    .addGap(165, 165, 165)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(515, 515, 515)
                    .addComponent(jbl_filter1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbl_clientCuitInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf_clientCuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jbtn_findClientByCuit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbl_clientInfo)
                        .addGap(36, 36, 36))
                    .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jbl_filter5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jbl_productName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_productNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jbl_filter7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_category, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_nextOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPaneTabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jbl_filter8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbl_filter6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_addDetailOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_addDetailOrder1))
                            .addComponent(jScrollPaneTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(243, 243, 243)
                    .addComponent(jbl_filterByName)
                    .addContainerGap(340, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jbl_filter1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(533, Short.MAX_VALUE)))
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

    private void jtf_clientCuitFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_clientCuitFilterActionPerformed
        validator.onlyNumbers(jtf_clientCuitFilter);
    }//GEN-LAST:event_jtf_clientCuitFilterActionPerformed

    private void comboBox_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_categoryActionPerformed
        products = controller.updateProductTable(getStringFilter(), getCategoryStringFilter());
    }//GEN-LAST:event_comboBox_categoryActionPerformed

    private void jtf_productNameFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_productNameFilterActionPerformed
        validator.onlyLetters(jtf_productNameFilter);
    }//GEN-LAST:event_jtf_productNameFilterActionPerformed

    private void Jbtn_findClientByCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_findClientByCuitActionPerformed
        Client clientExist = controller.findByCuit(jtf_clientCuitFilter.getText());
        if (clientExist != null) {
            changeConditionButton(Jbtn_findClientByCuit, false);
            jbl_clientCuitInfo.setText("CLIENTE ENCONTRADO");
            changeConditionButton(jbtn_addDetailOrder, true);
        } else {
            jbl_clientCuitInfo.setText("INGRESE UN CUIT.");
        }
    }//GEN-LAST:event_Jbtn_findClientByCuitActionPerformed

    private void jbtn_addDetailOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_addDetailOrderActionPerformed
        jtf_clientCuitFilter.setText(jAmountSpinner.getValue().toString());
        int a = (Integer)jAmountSpinner.getValue();
    }//GEN-LAST:event_jbtn_addDetailOrderActionPerformed

    private void jbtn_nextOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_nextOrderPanelActionPerformed
        mainFrame.changeOrderPanel();
    }//GEN-LAST:event_jbtn_nextOrderPanelActionPerformed

    private void jbtn_addDetailOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_addDetailOrder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_addDetailOrder1ActionPerformed

    @Override
    public javax.swing.JTable getTable() {
        return this.tableChooseProduct;
    }

    @Override
    public void initListener() {
        tableChooseProduct.getSelectionModel().addListSelectionListener(new TableListener(this));
        jtf_productNameFilter.getDocument().addDocumentListener(new JOrderFieldListener(products, controller, this));
        tableDetail.getSelectionModel().addListSelectionListener(new TableListener(this));
    }

    @Override
    public void initValidator() {
        validator.onlyNumbers(jtf_clientCuitFilter);
        validator.onlyLetters(jtf_productNameFilter);
        validator.limitSize(jtf_clientCuitFilter, 11);
    }

    @Override
    public void initPanel() {
        products = controller.updateProductTable("", "");
        changeConditionAllButtons(true);
        changeConditionAllFields(true);
        changeConditionButton(Jbtn_findClientByCuit, true);
        cleanAllFields();
        loadComboBox();
    }

    @Override
    public void selectFromTable() {
        int field = tableChooseProduct.getSelectedRow();
        if (field >= 0) {
            Product selected = products.get(field);
            jtf_productNameFilter.setText(selected.getName());
        }
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_clientCuitFilter, state);
        changeConditionField(jtf_productNameFilter, state);
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
        validator.enableField(state, textField);
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
        changeConditionButton(Jbtn_findClientByCuit, state);
        changeConditionButton(jbtn_addDetailOrder, state);
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

    @Override
    public void cleanAllFields() {
        cleanField(jtf_clientCuitFilter);
        cleanField(jtf_productNameFilter);
    }

    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }

    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_productNameFilter);
        for (JTextField field : fields) {
            if (field.getText().length() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getStringFilter() {
        return jtf_productNameFilter.getText();
    }

    private void loadComboBox() {
        comboBox_category.removeAllItems();
        comboBox_category.addItem("Seleccionar Categoría");
        comboBox_category.setSelectedItem("Seleccionar Categoría");
        for (ProductCategory category : controller.getCategories()) {
            comboBox_category.addItem(category.getName());
        }
    }

    public String getCategoryStringFilter() {
        return comboBox_category.getItemAt(comboBox_category.getSelectedIndex());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_findClientByCuit;
    private javax.swing.JComboBox<String> comboBox_category;
    private javax.swing.JSpinner jAmountSpinner;
    private javax.swing.JScrollPane jScrollPaneTabla1;
    private javax.swing.JScrollPane jScrollPaneTabla2;
    private javax.swing.JScrollPane jScrollPaneTabla3;
    private javax.swing.JLabel jbl_clientCuitInfo;
    private javax.swing.JLabel jbl_clientInfo;
    private javax.swing.JLabel jbl_filter1;
    private javax.swing.JLabel jbl_filter5;
    private javax.swing.JLabel jbl_filter6;
    private javax.swing.JLabel jbl_filter7;
    private javax.swing.JLabel jbl_filter8;
    private javax.swing.JLabel jbl_filterByName;
    private javax.swing.JLabel jbl_productName;
    private javax.swing.JButton jbtn_addDetailOrder;
    private javax.swing.JButton jbtn_addDetailOrder1;
    private javax.swing.JButton jbtn_nextOrderPanel;
    private javax.swing.JTextField jtf_clientCuitFilter;
    private javax.swing.JTextField jtf_productNameFilter;
    private javax.swing.JTable tableChooseClient;
    private javax.swing.JTable tableChooseProduct;
    private javax.swing.JTable tableDetail;
    // End of variables declaration//GEN-END:variables

}
