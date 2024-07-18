package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
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
 * @author sjcex
 */
public final class NewOrder_SecondPanel extends javax.swing.JPanel implements InterfacePanel, InterfaceOrderPanel {

    private final OrderPanelController controller;
    private final FieldDataValidator validator;
    private List<Order> orders;
    private List<Client> clients;
    private List<Carrier> carriers;
    private List<Warehouse> warehouses;
    private final MainFrame mainFrame;

    public NewOrder_SecondPanel(MainFrame mainFrame) {
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

        jScrollPaneTabla = new javax.swing.JScrollPane();
        tableChooseCarrier = new javax.swing.JTable();
        jbl_filter8 = new javax.swing.JLabel();
        jbtn_warehouseOrigin = new javax.swing.JButton();
        jScrollPaneTabla2 = new javax.swing.JScrollPane();
        tableChooseWarehouse = new javax.swing.JTable();
        jbl_filter11 = new javax.swing.JLabel();
        jbl_filterByCountry = new javax.swing.JLabel();
        jbl_filter13 = new javax.swing.JLabel();
        jtf_warehouseOriginSelected = new javax.swing.JTextField();
        jbtn_ConfirmCarrier = new javax.swing.JButton();
        jbl_filterByCountry1 = new javax.swing.JLabel();
        carrierFilterComboBox = new javax.swing.JComboBox<>();
        jbl_filter14 = new javax.swing.JLabel();
        jbl_clientCuitInfo = new javax.swing.JLabel();
        jbl_selectInfo = new javax.swing.JLabel();
        jbtn_warehouseDestiny = new javax.swing.JButton();
        jbtn_previewOrderPanel = new javax.swing.JButton();
        jbtn_createNewOrder = new javax.swing.JButton();
        lbl_origin = new javax.swing.JLabel();
        lbl_destiny = new javax.swing.JLabel();
        jtf_warehouseFilter = new javax.swing.JTextField();
        jtf_warehouseDestinySelected = new javax.swing.JTextField();
        lbl_carrier = new javax.swing.JLabel();
        jtf_carrierSelected = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 51, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        tableChooseCarrier.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla.setViewportView(tableChooseCarrier);

        jbl_filter8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter8.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter8.setText("SELECCIONAR TRANSPORTISTA:");

        jbtn_warehouseOrigin.setText("ORIGEN");
        jbtn_warehouseOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_warehouseOriginActionPerformed(evt);
            }
        });

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

        jtf_warehouseOriginSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_warehouseOriginSelectedActionPerformed(evt);
            }
        });

        jbtn_ConfirmCarrier.setText("CONFIRMAR ");
        jbtn_ConfirmCarrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ConfirmCarrierActionPerformed(evt);
            }
        });

        jbl_filterByCountry1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filterByCountry1.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filterByCountry1.setText("FILTRAR POR:");

        carrierFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aéreo", "Marítimo", "Terrestre" }));
        carrierFilterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrierFilterComboBoxActionPerformed(evt);
            }
        });

        jbl_filter14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter14.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter14.setText("tipo:");

        jbl_clientCuitInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_clientCuitInfo.setForeground(new java.awt.Color(255, 255, 255));

        jbl_selectInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_selectInfo.setForeground(new java.awt.Color(255, 255, 255));
        jbl_selectInfo.setText("SELECCIONAR COMO:");

        jbtn_warehouseDestiny.setText("DESTINO");
        jbtn_warehouseDestiny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_warehouseDestinyActionPerformed(evt);
            }
        });

        jbtn_previewOrderPanel.setText("VOLVER");
        jbtn_previewOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_previewOrderPanelActionPerformed(evt);
            }
        });

        jbtn_createNewOrder.setText("FINALIZAR PEDIDO");
        jbtn_createNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_createNewOrderActionPerformed(evt);
            }
        });

        lbl_origin.setText("ORIGEN:");

        lbl_destiny.setText("DESTINO:");

        jtf_warehouseFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_warehouseFilterActionPerformed(evt);
            }
        });

        jtf_warehouseDestinySelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_warehouseDestinySelectedActionPerformed(evt);
            }
        });

        lbl_carrier.setText("TRANSPORTISTA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbl_clientCuitInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtn_previewOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(311, 311, 311)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jbtn_createNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_warehouseOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_warehouseDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jbl_filter13))
                            .addComponent(jbl_filterByCountry)
                            .addComponent(jbl_selectInfo)
                            .addComponent(jtf_warehouseFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbl_filter8)
                            .addComponent(jbl_filter11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbl_filterByCountry1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_origin)
                                    .addComponent(lbl_destiny))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_warehouseOriginSelected, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_warehouseDestinySelected, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_carrier)
                                    .addComponent(jbl_filter14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carrierFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtf_carrierSelected)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbtn_ConfirmCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(372, 372, 372)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbl_clientCuitInfo)
                .addGap(10, 10, 10)
                .addComponent(jbl_filter11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_filterByCountry)
                        .addGap(4, 4, 4)
                        .addComponent(jbl_filter13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_warehouseFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbl_selectInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn_warehouseOrigin)
                            .addComponent(jbtn_warehouseDestiny))))
                .addGap(18, 18, 18)
                .addComponent(jbl_filter8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_origin)
                            .addComponent(jtf_warehouseOriginSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_warehouseDestinySelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_destiny))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbl_filterByCountry1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carrierFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbl_filter14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_carrier)
                    .addComponent(jtf_carrierSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_ConfirmCarrier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_previewOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_createNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_warehouseOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_warehouseOriginActionPerformed

        int selectedWarehouse = tableChooseWarehouse.getSelectedRow();
        if (selectedWarehouse >= 0) {
            Warehouse warehouse = warehouses.get(selectedWarehouse);
            jtf_warehouseOriginSelected.setText(warehouse.getCode());
            validator.enableField(false, jtf_warehouseOriginSelected);
            controller.assignWarehouseOriginToOrder(warehouse);
            setOriginGreenFont();
        }

    }//GEN-LAST:event_jbtn_warehouseOriginActionPerformed

    private void jbtn_ConfirmCarrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ConfirmCarrierActionPerformed
        int selectedCarrier = tableChooseCarrier.getSelectedRow();
        if (selectedCarrier > 0) {
            Carrier carrier = carriers.get(selectedCarrier);
            jtf_carrierSelected.setText(carrier.getCuit());
            changeConditionButton(jbtn_createNewOrder, true);
            controller.assignCarrierToInvoice(carrier);
            setCarrierGreenFont();
        }
    }//GEN-LAST:event_jbtn_ConfirmCarrierActionPerformed

    private void carrierFilterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrierFilterComboBoxActionPerformed
        carriers = controller.updateCarrierTable(getCarrierFilter());
    }//GEN-LAST:event_carrierFilterComboBoxActionPerformed

    private void jtf_warehouseOriginSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_warehouseOriginSelectedActionPerformed
        warehouses = controller.updateWarehouseTable(getWarehouseFilter());
    }//GEN-LAST:event_jtf_warehouseOriginSelectedActionPerformed

    private void jbtn_warehouseDestinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_warehouseDestinyActionPerformed
        int selectedWarehouse = tableChooseWarehouse.getSelectedRow();
        if (selectedWarehouse >= 0) {
            Warehouse warehouse = warehouses.get(selectedWarehouse);
            jtf_warehouseDestinySelected.setText(warehouse.getCode());
            controller.assignWarehouseDestinyToOrder(warehouse);
            setDestinyGreenFont();
        }
    }//GEN-LAST:event_jbtn_warehouseDestinyActionPerformed

    private void jbtn_previewOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_previewOrderPanelActionPerformed
        mainFrame.changeOrderPanel();
    }//GEN-LAST:event_jbtn_previewOrderPanelActionPerformed

    private void jbtn_createNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_createNewOrderActionPerformed

        controller.createOrder();
        cleanAllFields();
        mainFrame.changeOrderPanel();
        changeConditionButton(jbtn_createNewOrder, false);
    }//GEN-LAST:event_jbtn_createNewOrderActionPerformed

    private void jtf_warehouseFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_warehouseFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_warehouseFilterActionPerformed

    private void jtf_warehouseDestinySelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_warehouseDestinySelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_warehouseDestinySelectedActionPerformed

    @Override
    public javax.swing.JTable getTable() {
        return null;
    }

    @Override
    public JTable getCarriersTable() {
        return this.tableChooseCarrier;
    }

    @Override
    public JTable getWarehousesTable() {
        return this.tableChooseWarehouse;
    }

    @Override
    public JTable getClientsTable() {
        return null;
    }

    @Override
    public JTable getProductsTable() {
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
    public JTable getDetailOrdersTable() {
        return null;
    }

    @Override
    public void initListener() {
        tableChooseCarrier.getSelectionModel().addListSelectionListener(new TableListener(this));
        tableChooseWarehouse.getSelectionModel().addListSelectionListener(new TableListener(this));
    }

    @Override
    public void initValidator() {
        validator.enableField(false, jtf_carrierSelected);
        validator.enableField(false, jtf_warehouseOriginSelected);
        validator.enableField(false, jtf_warehouseDestinySelected);
        validator.onlyLetters(jtf_warehouseOriginSelected);
    }

    @Override
    public void initPanel() {
        this.carriers = controller.updateCarrierTable("");
        this.warehouses = controller.updateWarehouseTable("");
        changeConditionAllButtons(false);
        changeConditionAllFields(true);
        changeConditionButton(jbtn_warehouseOrigin, true);
        changeConditionButton(jbtn_warehouseDestiny, true);
        changeConditionButton(jbtn_ConfirmCarrier, false);
        cleanAllFields();
    }

    @Override
    public void selectFromTable() {
        int selectedCarrier = tableChooseCarrier.getSelectedRow(); //?
        if (!jtf_warehouseOriginSelected.getText().isEmpty() && !jtf_warehouseDestinySelected.getText().isEmpty()) {
            changeConditionButton(jbtn_ConfirmCarrier, true);
        }
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_warehouseOriginSelected, state);
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
        validator.enableField(state, textField);
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
        changeConditionButton(jbtn_warehouseOrigin, state);
        changeConditionButton(jbtn_warehouseDestiny, state);
        changeConditionButton(jbtn_ConfirmCarrier, state);
        changeConditionButton(jbtn_createNewOrder, state);
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
        jtf_warehouseOriginSelected.setForeground(Color.RED);
        jtf_warehouseOriginSelected.setFont(new Font("Arial", Font.BOLD, 12));
    }

    private void setOriginGreenFont() {
        lbl_origin.setForeground(Color.GREEN);
        lbl_origin.setFont(new Font("Arial", Font.BOLD, 12));
    }
    
     private void setCarrierGreenFont() {
        lbl_carrier.setForeground(Color.GREEN);
        lbl_carrier.setFont(new Font("Arial", Font.BOLD, 12));
    }
    
    private void setDestinyGreenFont() {
        lbl_destiny.setForeground(Color.GREEN);
        lbl_destiny.setFont(new Font("Arial", Font.BOLD, 12));
    }

    @Override
    public void cleanAllFields() {
        cleanField(jtf_warehouseOriginSelected);
        cleanField(jtf_warehouseDestinySelected);
        cleanField(jtf_carrierSelected);
        cleanField(jtf_warehouseFilter);
    }

    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }

    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_warehouseOriginSelected);
        for (JTextField field : fields) {
            if (field.getText().length() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getCarrierFilter() {
        String transportType = carrierFilterComboBox.getItemAt(carrierFilterComboBox.getSelectedIndex());
        return switch (transportType) {
            case "Marítimo" ->
                "maritime";
            case "Aéreo" ->
                "aerial";
            case "Terrestre" ->
                "ground";
            default ->
                "";
        };
    }

    @Override
    public String getWarehouseFilter() {
        return jtf_warehouseOriginSelected.getText();
    }

    @Override
    public String getStringFilter() {
        return null;
    }

    @Override
    public String getProductFilter() {
        return null;
    }

    @Override
    public String getClientFilter() {
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
    public void updateTable() {
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> carrierFilterComboBox;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JScrollPane jScrollPaneTabla2;
    private javax.swing.JLabel jbl_clientCuitInfo;
    private javax.swing.JLabel jbl_filter11;
    private javax.swing.JLabel jbl_filter13;
    private javax.swing.JLabel jbl_filter14;
    private javax.swing.JLabel jbl_filter8;
    private javax.swing.JLabel jbl_filterByCountry;
    private javax.swing.JLabel jbl_filterByCountry1;
    private javax.swing.JLabel jbl_selectInfo;
    private javax.swing.JButton jbtn_ConfirmCarrier;
    private javax.swing.JButton jbtn_createNewOrder;
    private javax.swing.JButton jbtn_previewOrderPanel;
    private javax.swing.JButton jbtn_warehouseDestiny;
    private javax.swing.JButton jbtn_warehouseOrigin;
    private javax.swing.JTextField jtf_carrierSelected;
    private javax.swing.JTextField jtf_warehouseDestinySelected;
    private javax.swing.JTextField jtf_warehouseFilter;
    private javax.swing.JTextField jtf_warehouseOriginSelected;
    private javax.swing.JLabel lbl_carrier;
    private javax.swing.JLabel lbl_destiny;
    private javax.swing.JLabel lbl_origin;
    private javax.swing.JTable tableChooseCarrier;
    private javax.swing.JTable tableChooseWarehouse;
    // End of variables declaration//GEN-END:variables

}
