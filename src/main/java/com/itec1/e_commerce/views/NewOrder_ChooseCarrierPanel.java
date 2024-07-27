package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.entities.Carrier;
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
 * @author sjcex
 */
public final class NewOrder_ChooseCarrierPanel extends javax.swing.JPanel implements InterfacePanel, InterfaceOrderPanel {

    private final OrderPanelController controller;
    private final FieldDataValidator validator;
    private List<Carrier> carriers;
    private final MainFrame mainFrame;

    public NewOrder_ChooseCarrierPanel(MainFrame mainFrame) {
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
        jbtn_ConfirmCarrier = new javax.swing.JButton();
        jbl_filterByCountry1 = new javax.swing.JLabel();
        carrierFilterComboBox = new javax.swing.JComboBox<>();
        jbl_filter14 = new javax.swing.JLabel();
        jbl_clientCuitInfo = new javax.swing.JLabel();
        jbtn_previewOrderPanel = new javax.swing.JButton();
        jbtn_createNewOrder = new javax.swing.JButton();
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

        jbtn_ConfirmCarrier.setText("CONFIRMAR ");
        jbtn_ConfirmCarrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ConfirmCarrierActionPerformed(evt);
            }
        });

        jbl_filterByCountry1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filterByCountry1.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filterByCountry1.setText("FILTRAR POR:");

        carrierFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..", "Aéreo", "Marítimo", "Terrestre" }));
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

        lbl_carrier.setText("TRANSPORTISTA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbl_clientCuitInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtn_previewOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                        .addComponent(jbtn_createNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 762, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbl_filterByCountry1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_carrier)
                                            .addComponent(jbl_filter14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carrierFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtf_carrierSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jbtn_ConfirmCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jbl_filter8))
                                .addGap(0, 362, Short.MAX_VALUE)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbl_clientCuitInfo)
                .addGap(23, 23, 23)
                .addComponent(jbl_filter8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 303, Short.MAX_VALUE)
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
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_previewOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_createNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_ConfirmCarrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ConfirmCarrierActionPerformed

        controller.assignCarrierToInvoice(this.getStringFilter());
        changeConditionButton(jbtn_createNewOrder, true);
        setCarrierGreenFont();

    }//GEN-LAST:event_jbtn_ConfirmCarrierActionPerformed

    private void carrierFilterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrierFilterComboBoxActionPerformed
        if (carrierFilterComboBox.getItemAt(carrierFilterComboBox.getSelectedIndex()).equals("Seleccionar")) {
            carriers = controller.updateCarrierTableByTransportType("");
        } else {
            carriers = controller.updateCarrierTableByTransportType(getCarrierFilter());
        }
    }//GEN-LAST:event_carrierFilterComboBoxActionPerformed

    private void jbtn_previewOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_previewOrderPanelActionPerformed
        mainFrame.changeOrderPanel();
    }//GEN-LAST:event_jbtn_previewOrderPanelActionPerformed

    private void jbtn_createNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_createNewOrderActionPerformed

        controller.createOrder();
        mainFrame.changeOrderPanel();
        initPanel();
    }//GEN-LAST:event_jbtn_createNewOrderActionPerformed

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
        return null;
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
        jtf_carrierSelected.getDocument().addDocumentListener(new JTextFieldListener(this));
    }

    @Override
    public void initValidator() {
        validator.enableField(true, jtf_carrierSelected);
    }

    @Override
    public void initPanel() {
        this.carriers = controller.updateCarrierTableByTransportType("");
        changeConditionAllButtons(false);
        changeConditionAllFields(true);
        changeConditionButton(jbtn_ConfirmCarrier, false);
        cleanAllFields();
    }

    @Override
    public void selectFromTable() {
        int field = tableChooseCarrier.getSelectedRow();
        if (field >= 0) {
            Carrier selected = carriers.get(field);
            jtf_carrierSelected.setText(selected.getCuit());
            changeConditionButton(jbtn_ConfirmCarrier, true);
        }
        this.updateTable();
    }

    @Override
    public void changeConditionAllFields(boolean state) {
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
        validator.enableField(state, textField);
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
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

    private void setCarrierGreenFont() {
        lbl_carrier.setForeground(Color.GREEN);
        lbl_carrier.setFont(new Font("Arial", Font.BOLD, 12));
    }

    @Override
    public void cleanAllFields() {
        cleanField(jtf_carrierSelected);
    }

    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }

    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_carrierSelected);
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
        return null;
    }

    @Override
    public String getStringFilter() {
        return jtf_carrierSelected.getText();
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
        carriers = controller.updateCarrierTable(getStringFilter());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> carrierFilterComboBox;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JLabel jbl_clientCuitInfo;
    private javax.swing.JLabel jbl_filter14;
    private javax.swing.JLabel jbl_filter8;
    private javax.swing.JLabel jbl_filterByCountry1;
    private javax.swing.JButton jbtn_ConfirmCarrier;
    private javax.swing.JButton jbtn_createNewOrder;
    private javax.swing.JButton jbtn_previewOrderPanel;
    private javax.swing.JTextField jtf_carrierSelected;
    private javax.swing.JLabel lbl_carrier;
    private javax.swing.JTable tableChooseCarrier;
    // End of variables declaration//GEN-END:variables

}
