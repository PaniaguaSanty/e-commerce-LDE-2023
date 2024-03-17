package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.TableListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author sjcex
 */
public final class Order_NewOrder_Panel extends javax.swing.JPanel implements InterfacePanel {

    private final OrderPanelController controller;
    private final FieldDataValidator validator;
    private List<Order> orders;
    private List<Product> products;
    private List<Carrier> carriers;
    private List<Warehouse> warehouses;

    public Order_NewOrder_Panel() {
        initComponents();
        this.controller = new OrderPanelController(this);
        tableChooseCarrier.getSelectionModel().addListSelectionListener(new TableListener(this));
        this.products = controller.updateTableProduct("");
        this.carriers = controller.updateTable("");
        this.warehouses = controller.updateTableWarehouse("");
        this.validator = new FieldDataValidator();
        initListener();
        initValidator();
        initPanel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTabla = new javax.swing.JScrollPane();
        tableChooseCarrier = new javax.swing.JTable();
        jScrollPaneTabla1 = new javax.swing.JScrollPane();
        tableChooseProduct = new javax.swing.JTable();
        jtf_nameFilter = new javax.swing.JTextField();
        jbl_filter = new javax.swing.JLabel();
        jbl_filterByName = new javax.swing.JLabel();
        jbl_filter5 = new javax.swing.JLabel();
        jbl_productName = new javax.swing.JLabel();
        jtf_productNameFilter = new javax.swing.JTextField();
        jbl_filter7 = new javax.swing.JLabel();
        categoryFilterComboBox = new javax.swing.JComboBox<>();
        Jbtn_findClientByCuit = new javax.swing.JButton();
        jbl_filter8 = new javax.swing.JLabel();
        jbl_filter9 = new javax.swing.JLabel();
        jAmountSpinner = new javax.swing.JSpinner();
        jbtn_addDetailOrder = new javax.swing.JButton();
        jbtn_warehouseOrigin = new javax.swing.JButton();
        jbtn_warehouseDestiny = new javax.swing.JButton();
        jbl_filter10 = new javax.swing.JLabel();
        jScrollPaneTabla2 = new javax.swing.JScrollPane();
        tableChooseWarehouse = new javax.swing.JTable();
        jbl_filter11 = new javax.swing.JLabel();
        jbl_filterByCountry = new javax.swing.JLabel();
        jbl_filter13 = new javax.swing.JLabel();
        jtf_warehouseFilter = new javax.swing.JTextField();
        jbl_filter14 = new javax.swing.JLabel();
        groundCheckBox = new javax.swing.JCheckBox();
        aerialCheckBox = new javax.swing.JCheckBox();
        maritimeCheckBox = new javax.swing.JCheckBox();
        jbtn_ConfirmCarrier = new javax.swing.JButton();
        jbtn_createNewOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseCarrier.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla.setViewportView(tableChooseCarrier);

        jScrollPaneTabla1.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla1.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla1.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseProduct.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla1.setViewportView(tableChooseProduct);

        jtf_nameFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_nameFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nameFilterActionPerformed(evt);
            }
        });

        jbl_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter.setText("INGRESAR CUIT DEL CLIENTE:");

        jbl_filterByName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filterByName.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filterByName.setText("FILTRAR POR:");

        jbl_filter5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter5.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter5.setText("ARMAR CARRITO:");

        jbl_productName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_productName.setForeground(new java.awt.Color(255, 255, 255));
        jbl_productName.setText("nombre:");

        jbl_filter7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter7.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter7.setText("categoría:");

        categoryFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Jbtn_findClientByCuit.setText("ACEPTAR");

        jbl_filter8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter8.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter8.setText("SELECCIONAR TRANSPORTISTAS:");

        jbl_filter9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter9.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter9.setText("DETERMINAR CANTIDAD: ");

        jbtn_addDetailOrder.setText("AGREGAR");

        jbtn_warehouseOrigin.setText("ORIGEN");

        jbtn_warehouseDestiny.setText("DESTINO");

        jbl_filter10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter10.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter10.setText("SELECCIONAR COMO:");

        jScrollPaneTabla2.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla2.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseWarehouse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla2.setViewportView(tableChooseWarehouse);

        jbl_filter11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter11.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter11.setText("SELECCIONAR SUCURSALES:");

        jbl_filterByCountry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filterByCountry.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filterByCountry.setText("FILTRAR POR:");

        jbl_filter13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter13.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter13.setText("país:");

        jbl_filter14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter14.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter14.setText("SELECCIONAR TIPO DE TRANSPORTE:");

        groundCheckBox.setText("Terrestre");

        aerialCheckBox.setText("Aéreo");

        maritimeCheckBox.setText("Marítimo");

        jbtn_ConfirmCarrier.setText("CONFIRMAR TRANSPORTISTA");

        jbtn_createNewOrder.setText("FINALIZAR PEDIDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbl_filter5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(648, 648, 648))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_nameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jbtn_findClientByCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))
                    .addComponent(jbl_filter8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_warehouseOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_warehouseDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbl_filter10)
                            .addComponent(jbl_filterByCountry)
                            .addComponent(jbl_filter13)
                            .addComponent(jtf_warehouseFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbl_filter7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(categoryFilterComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbl_filterByName)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbl_productName)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtf_productNameFilter)))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbtn_addDetailOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbl_filter9))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(aerialCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(maritimeCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addComponent(jbtn_createNewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbl_filter14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(groundCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_ConfirmCarrier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jbl_filter11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_nameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jbtn_findClientByCuit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbl_filter5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_filterByName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_productName)
                            .addComponent(jtf_productNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_filter7)
                            .addComponent(categoryFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbl_filter9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_addDetailOrder)
                            .addComponent(jAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_filterByCountry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbl_filter13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_warehouseFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbl_filter10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn_warehouseOrigin)
                            .addComponent(jbtn_warehouseDestiny)))
                    .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbl_filter8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_filter14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_ConfirmCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groundCheckBox))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_createNewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(aerialCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(maritimeCheckBox)))))
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(242, 242, 242)
                    .addComponent(jbl_filter11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(341, 341, 341)))
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

    private void jtf_nameFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nameFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nameFilterActionPerformed

    @Override
    public javax.swing.JTable getTable() {
        return this.tableChooseCarrier;
    }

    public javax.swing.JTable getWarehouseTable() {
        return this.tableChooseWarehouse;
    }

    public javax.swing.JTable getProductTable() {
        return this.tableChooseProduct;
    }

    @Override
    public void initListener() {
        tableChooseCarrier.getSelectionModel().addListSelectionListener(new TableListener(this));
        tableChooseProduct.getSelectionModel().addListSelectionListener(new TableListener(this));
        tableChooseWarehouse.getSelectionModel().addListSelectionListener(new TableListener(this));
    }

    @Override
    public void initValidator() {
        validator.onlyNumbers(jtf_nameFilter);
        validator.onlyLetters(jtf_warehouseFilter);
        validator.onlyLetters(jtf_productNameFilter);
    }

    @Override
    public void initPanel() {
        this.products = controller.updateTableProduct("");
        this.carriers = controller.updateTable("");
        this.warehouses = controller.updateTableWarehouse("");
        changeConditionAllButtons(false);
        changeConditionAllFields(false);
        changeConditionButton(Jbtn_findClientByCuit, true);
        changeConditionButton(jbtn_addDetailOrder, true);
        changeConditionButton(jbtn_warehouseOrigin, true);
        changeConditionButton(jbtn_ConfirmCarrier, true);
        changeConditionButton(jbtn_createNewOrder, true);
        cleanAllFields();
    }

    @Override
    public void selectFromTable() {
    }

    @Override
    public void changeConditionAllFields(boolean state) {
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
        changeConditionButton(Jbtn_findClientByCuit, state);
        changeConditionButton(jbtn_addDetailOrder, state);
        changeConditionButton(jbtn_warehouseOrigin, state);
        changeConditionButton(jbtn_warehouseDestiny, state);
        changeConditionButton(jbtn_ConfirmCarrier, state);
        changeConditionButton(jbtn_createNewOrder, state);
    }

    @Override
    public void changeConditionButton(JButton button, boolean state) {
        validator.enableButton(state, button, null, null, null, null);
    }

    @Override
    public void cleanAllFields() {
        cleanField(jtf_nameFilter);
        cleanField(jtf_productNameFilter);
        cleanField(jtf_warehouseFilter);
    }

    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }

    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_productNameFilter);
        fields.add(jtf_warehouseFilter);

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

    public String getProductStringFilter() {
        return jtf_productNameFilter.getText();
    }

    public String getWarehouseStringFilter() {
        return jtf_warehouseFilter.getText();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_findClientByCuit;
    private javax.swing.JCheckBox aerialCheckBox;
    private javax.swing.JComboBox<String> categoryFilterComboBox;
    private javax.swing.JCheckBox groundCheckBox;
    private javax.swing.JSpinner jAmountSpinner;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JScrollPane jScrollPaneTabla1;
    private javax.swing.JScrollPane jScrollPaneTabla2;
    private javax.swing.JLabel jbl_filter;
    private javax.swing.JLabel jbl_filter10;
    private javax.swing.JLabel jbl_filter11;
    private javax.swing.JLabel jbl_filter13;
    private javax.swing.JLabel jbl_filter14;
    private javax.swing.JLabel jbl_filter5;
    private javax.swing.JLabel jbl_filter7;
    private javax.swing.JLabel jbl_filter8;
    private javax.swing.JLabel jbl_filter9;
    private javax.swing.JLabel jbl_filterByCountry;
    private javax.swing.JLabel jbl_filterByName;
    private javax.swing.JLabel jbl_productName;
    private javax.swing.JButton jbtn_ConfirmCarrier;
    private javax.swing.JButton jbtn_addDetailOrder;
    private javax.swing.JButton jbtn_createNewOrder;
    private javax.swing.JButton jbtn_warehouseDestiny;
    private javax.swing.JButton jbtn_warehouseOrigin;
    private javax.swing.JTextField jtf_nameFilter;
    private javax.swing.JTextField jtf_productNameFilter;
    private javax.swing.JTextField jtf_warehouseFilter;
    private javax.swing.JCheckBox maritimeCheckBox;
    private javax.swing.JTable tableChooseCarrier;
    private javax.swing.JTable tableChooseProduct;
    private javax.swing.JTable tableChooseWarehouse;
    // End of variables declaration//GEN-END:variables

}
