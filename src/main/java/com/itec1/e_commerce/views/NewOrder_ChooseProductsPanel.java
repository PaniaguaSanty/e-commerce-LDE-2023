package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Product;
import com.itec1.e_commerce.entities.ProductCategory;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.JProductFieldListener;
import com.itec1.e_commerce.views.resources.JTextFieldListener;
import com.itec1.e_commerce.views.resources.TableListener;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author sjcex
 */
public final class NewOrder_ChooseProductsPanel extends javax.swing.JPanel implements InterfacePanel, InterfaceOrderPanel {

    private final OrderPanelController controller;
    private final FieldDataValidator validator;
    private List<Product> products;
    private final MainFrame mainFrame;

    public NewOrder_ChooseProductsPanel(MainFrame mainFrame) {
        initComponents();
        this.controller = new OrderPanelController(this);
        this.mainFrame = mainFrame;
        this.validator = new FieldDataValidator();
        initListener();
        initValidator();
        initPanel();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTabla1 = new javax.swing.JScrollPane();
        tableDetail = new javax.swing.JTable();
        jbl_filter5 = new javax.swing.JLabel();
        jbl_productName = new javax.swing.JLabel();
        jtf_productNameFilter = new javax.swing.JTextField();
        jbl_filter7 = new javax.swing.JLabel();
        comboBox_category = new javax.swing.JComboBox<>();
        jAmountSpinner = new javax.swing.JSpinner();
        jbtn_addDetailOrder = new javax.swing.JButton();
        jbtn_nextOrderPanel = new javax.swing.JButton();
        jbl_clientInfo = new javax.swing.JLabel();
        jScrollPaneTabla3 = new javax.swing.JScrollPane();
        tableChooseProduct = new javax.swing.JTable();
        jbl_filter6 = new javax.swing.JLabel();
        jbl_filter8 = new javax.swing.JLabel();
        jbtn_removeDetailOrder = new javax.swing.JButton();
        jbl_filterByName = new javax.swing.JLabel();
        jbl_CuitFilterInfo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jScrollPaneTabla1.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla1.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla1.setPreferredSize(new java.awt.Dimension(950, 750));

        tableDetail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tableDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPaneTabla1.setViewportView(tableDetail);

        jbl_filter5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter5.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter5.setText("SELECCIONAR PRODUCTOS A CARGAR: ");

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
        jbl_filter8.setText("CARRITO:");

        jbtn_removeDetailOrder.setText("QUITAR");
        jbtn_removeDetailOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_removeDetailOrderActionPerformed(evt);
            }
        });

        jbl_filterByName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filterByName.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filterByName.setText("FILTRAR POR:");

        jbl_CuitFilterInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_CuitFilterInfo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbl_filter5)
                                .addGap(18, 18, 18)
                                .addComponent(jbl_CuitFilterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbl_filter8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtn_nextOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbl_filter7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbl_clientInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtf_productNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_productName)
                            .addComponent(jbl_filterByName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jbl_filter6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtn_removeDetailOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn_addDetailOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBox_category, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jbl_filter5)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbl_CuitFilterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_filterByName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbl_productName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_productNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbl_filter7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbl_clientInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_category, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbl_filter6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_addDetailOrder)
                        .addGap(16, 16, 16)
                        .addComponent(jbtn_removeDetailOrder)
                        .addGap(86, 86, 86)
                        .addComponent(jbtn_nextOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneTabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbl_filter8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(107, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_categoryActionPerformed
        products = controller.updateProductTable(getProductFilter(), getCategoryStringFilter());
    }//GEN-LAST:event_comboBox_categoryActionPerformed

    private void jbtn_addDetailOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_addDetailOrderActionPerformed
        int selectedAmount = (int) jAmountSpinner.getValue();
        DetailOrder newDetail = new DetailOrder();
        Product product = products.get(0);
        if (controller.verifyDetail(product)) {
            newDetail.setProduct(product);
            newDetail.setAmount(selectedAmount);
            controller.assignNewDetailToOrder(newDetail);
        } else {
            controller.changeDetailAmount(product, selectedAmount);
        }
        jAmountSpinner.setValue(1);
        controller.updateDetailTable();
        changeConditionButton(jbtn_nextOrderPanel, true);
    }//GEN-LAST:event_jbtn_addDetailOrderActionPerformed

    private void jbtn_nextOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_nextOrderPanelActionPerformed
        mainFrame.changeOrderPanel();
        initPanel();
    }//GEN-LAST:event_jbtn_nextOrderPanelActionPerformed

    private void jbtn_removeDetailOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_removeDetailOrderActionPerformed
        int selectedDetail = (tableDetail.getSelectedRow());
        if (selectedDetail >= 0) {
            controller.removeNewDetail(selectedDetail);
            controller.updateDetailTable();
        }
    }//GEN-LAST:event_jbtn_removeDetailOrderActionPerformed


    private void jtf_productNameFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_productNameFilterActionPerformed

    }//GEN-LAST:event_jtf_productNameFilterActionPerformed

    @Override
    public void updateTable() {

        products = controller.updateProductTable(jtf_productNameFilter.getText(), getCategoryStringFilter());
        changeConditionButton(jbtn_addDetailOrder, false);
    }

    @Override
    public javax.swing.JTable getTable() {
        return this.tableChooseProduct;
    }

    @Override
    public JTable getClientsTable() {
        return null;
    }

    @Override
    public JTable getProductsTable() {
        return this.tableChooseProduct;
    }

    @Override
    public JTable getDetailOrdersTable() {
        return this.tableDetail;
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
    public void initListener() {
        tableChooseProduct.getSelectionModel().addListSelectionListener(new TableListener(this));
        tableDetail.getSelectionModel().addListSelectionListener(new TableListener(this));
        jtf_productNameFilter.getDocument().addDocumentListener(new JTextFieldListener(this));
    }

    @Override
    public void initValidator() {
        validator.onlyLetters(jtf_productNameFilter);
        validator.limitSize(jtf_productNameFilter, 20);
    }

    @Override
    public void initPanel() {
        products = controller.updateProductTable("", "");

        jAmountSpinner.setModel(new SpinnerNumberModel(1, 1, 20, 1));
        changeConditionAllButtons(false);
        changeConditionAllFields(false);
        changeConditionField(jtf_productNameFilter, true);
        cleanAllFields();
        loadComboBox();
    }

    @Override
    public void selectFromTable() {
        int field = tableChooseProduct.getSelectedRow();
        if (field >= 0) {
            Product selected = products.get(field);
            jtf_productNameFilter.setText(selected.getName());
            comboBox_category.selectWithKeyChar('0');
            changeConditionButton(jbtn_addDetailOrder, true);
            comboBox_category.setEnabled(true);
        }
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_productNameFilter, state);
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
        validator.enableField(state, textField);
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
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

    //Filters.
    @Override
    public String getProductFilter() {
        return jtf_productNameFilter.getText();
    }

    @Override
    public String getClientFilter() {
        return null;
    }

    @Override
    public String getStringFilter() {
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
    private javax.swing.JComboBox<String> comboBox_category;
    private javax.swing.JSpinner jAmountSpinner;
    private javax.swing.JScrollPane jScrollPaneTabla1;
    private javax.swing.JScrollPane jScrollPaneTabla3;
    private javax.swing.JLabel jbl_CuitFilterInfo;
    private javax.swing.JLabel jbl_clientInfo;
    private javax.swing.JLabel jbl_filter5;
    private javax.swing.JLabel jbl_filter6;
    private javax.swing.JLabel jbl_filter7;
    private javax.swing.JLabel jbl_filter8;
    private javax.swing.JLabel jbl_filterByName;
    private javax.swing.JLabel jbl_productName;
    private javax.swing.JButton jbtn_addDetailOrder;
    private javax.swing.JButton jbtn_nextOrderPanel;
    private javax.swing.JButton jbtn_removeDetailOrder;
    private javax.swing.JTextField jtf_productNameFilter;
    private javax.swing.JTable tableChooseProduct;
    private javax.swing.JTable tableDetail;
    // End of variables declaration//GEN-END:variables

}
