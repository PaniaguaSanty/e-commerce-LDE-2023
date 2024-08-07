/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.entities.Carrier;
import com.itec1.e_commerce.controllers.ReportPanelController;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.JTextFieldListener;
import com.itec1.e_commerce.views.resources.TableListener;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author sjcex
 */
public class Report_Carriers extends javax.swing.JPanel implements InterfacePanel, InterfaceOrderPanel {

    private final ReportPanelController panel;
    private final FieldDataValidator validator;
    private List<Carrier> carriers;

    /**
     * Creates new form Management_Client_Panel
     */
    public Report_Carriers() {
        this.panel = new ReportPanelController(this);
        this.validator = new FieldDataValidator();
        initComponents();
        initListener();
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

        jPanel2 = new javax.swing.JPanel();
        jPanel_data = new javax.swing.JPanel();
        jbl_reportTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportText = new javax.swing.JTextArea();
        jPanel_table = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        tableCarrier = new javax.swing.JTable();
        deselectCarrier = new javax.swing.JButton();
        jbl_filter = new javax.swing.JLabel();
        jtf_cuitFilter = new javax.swing.JTextField();
        jtf_dateFilterInitDay = new javax.swing.JTextField();
        jtf_dateFilterEndDay = new javax.swing.JTextField();
        jtf_dateFilterInitMonth = new javax.swing.JTextField();
        jtf_dateFilterEndMonth = new javax.swing.JTextField();
        jtf_dateFilterInitYear = new javax.swing.JTextField();
        jtf_dateFilterEndYear = new javax.swing.JTextField();
        jbl_dateFilterInit = new javax.swing.JLabel();
        jbl_dateFilterEnd = new javax.swing.JLabel();
        jbn_dateFilter = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel_data.setBackground(new java.awt.Color(0, 51, 255));

        jbl_reportTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_reportTitle.setForeground(new java.awt.Color(255, 255, 255));
        jbl_reportTitle.setText("INFORME GENERAL:");

        reportText.setEditable(false);
        reportText.setColumns(20);
        reportText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportText.setRows(5);
        reportText.setAlignmentX(0.0F);
        jScrollPane1.setViewportView(reportText);

        javax.swing.GroupLayout jPanel_dataLayout = new javax.swing.GroupLayout(jPanel_data);
        jPanel_data.setLayout(jPanel_dataLayout);
        jPanel_dataLayout.setHorizontalGroup(
            jPanel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dataLayout.createSequentialGroup()
                .addGroup(jPanel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_dataLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jbl_reportTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_dataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel_dataLayout.setVerticalGroup(
            jPanel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dataLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jbl_reportTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel_table.setBackground(new java.awt.Color(0, 51, 255));

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        tableCarrier.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla.setViewportView(tableCarrier);

        deselectCarrier.setText("DESELECCIONAR");
        deselectCarrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deselectCarrierActionPerformed(evt);
            }
        });

        jbl_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter.setText("Filtrar por cuit:");

        jtf_cuitFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_cuitFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cuitFilterActionPerformed(evt);
            }
        });

        jtf_dateFilterInitDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_dateFilterInitDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_dateFilterInitDayActionPerformed(evt);
            }
        });

        jtf_dateFilterEndDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_dateFilterEndDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_dateFilterEndDayActionPerformed(evt);
            }
        });

        jtf_dateFilterInitMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_dateFilterInitMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_dateFilterInitMonthActionPerformed(evt);
            }
        });

        jtf_dateFilterEndMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_dateFilterEndMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_dateFilterEndMonthActionPerformed(evt);
            }
        });

        jtf_dateFilterInitYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_dateFilterInitYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_dateFilterInitYearActionPerformed(evt);
            }
        });

        jtf_dateFilterEndYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_dateFilterEndYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_dateFilterEndYearActionPerformed(evt);
            }
        });

        jbl_dateFilterInit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_dateFilterInit.setForeground(new java.awt.Color(255, 255, 255));
        jbl_dateFilterInit.setText("inicial ->");

        jbl_dateFilterEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_dateFilterEnd.setForeground(new java.awt.Color(255, 255, 255));
        jbl_dateFilterEnd.setText("final ->");

        jbn_dateFilter.setText("FILTRAR POR FECHA");
        jbn_dateFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_dateFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_tableLayout = new javax.swing.GroupLayout(jPanel_table);
        jPanel_table.setLayout(jPanel_tableLayout);
        jPanel_tableLayout.setHorizontalGroup(
            jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tableLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_tableLayout.createSequentialGroup()
                        .addComponent(deselectCarrier)
                        .addGap(26, 26, 26)
                        .addComponent(jbl_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_cuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbn_dateFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbl_dateFilterInit)
                            .addComponent(jbl_dateFilterEnd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_tableLayout.createSequentialGroup()
                                .addComponent(jtf_dateFilterInitDay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_dateFilterInitMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_dateFilterInitYear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_tableLayout.createSequentialGroup()
                                .addComponent(jtf_dateFilterEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_dateFilterEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_dateFilterEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel_tableLayout.setVerticalGroup(
            jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tableLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deselectCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_cuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbn_dateFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_tableLayout.createSequentialGroup()
                        .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_dateFilterInitDay, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_dateFilterInitMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_dateFilterInitYear, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_dateFilterInit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_tableLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_dateFilterEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_dateFilterEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_dateFilterEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbl_dateFilterEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_cuitFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_cuitFilterActionPerformed

    }//GEN-LAST:event_jtf_cuitFilterActionPerformed

    private void deselectCarrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deselectCarrierActionPerformed
        cleanAllFields();
        overviewReport(getInitDate(), getEndDate());
    }//GEN-LAST:event_deselectCarrierActionPerformed

    private void jtf_dateFilterEndMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dateFilterEndMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_dateFilterEndMonthActionPerformed

    private void jtf_dateFilterEndYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dateFilterEndYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_dateFilterEndYearActionPerformed

    private void jtf_dateFilterInitYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dateFilterInitYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_dateFilterInitYearActionPerformed

    private void jtf_dateFilterInitMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dateFilterInitMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_dateFilterInitMonthActionPerformed

    private void jbn_dateFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_dateFilterActionPerformed
        if (carriers.size() == 1) {
            carrierReport(carriers.get(0), getInitDate(), getEndDate());
        } else {
            overviewReport(getInitDate(), getEndDate());
        }
    }//GEN-LAST:event_jbn_dateFilterActionPerformed

    private void jtf_dateFilterEndDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dateFilterEndDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_dateFilterEndDayActionPerformed

    private void jtf_dateFilterInitDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dateFilterInitDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_dateFilterInitDayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deselectCarrier;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_data;
    private javax.swing.JPanel jPanel_table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JLabel jbl_dateFilterEnd;
    private javax.swing.JLabel jbl_dateFilterInit;
    private javax.swing.JLabel jbl_filter;
    private javax.swing.JLabel jbl_reportTitle;
    private javax.swing.JButton jbn_dateFilter;
    private javax.swing.JTextField jtf_cuitFilter;
    private javax.swing.JTextField jtf_dateFilterEndDay;
    private javax.swing.JTextField jtf_dateFilterEndMonth;
    private javax.swing.JTextField jtf_dateFilterEndYear;
    private javax.swing.JTextField jtf_dateFilterInitDay;
    private javax.swing.JTextField jtf_dateFilterInitMonth;
    private javax.swing.JTextField jtf_dateFilterInitYear;
    private javax.swing.JTextArea reportText;
    private javax.swing.JTable tableCarrier;
    // End of variables declaration//GEN-END:variables

    @Override
    public void initValidator() {
        validator.onlyNumbers(jtf_cuitFilter);
        validator.onlyNumbers(jtf_dateFilterInitDay);
        validator.onlyNumbers(jtf_dateFilterInitMonth);
        validator.onlyNumbers(jtf_dateFilterInitYear);
        validator.onlyNumbers(jtf_dateFilterEndDay);
        validator.onlyNumbers(jtf_dateFilterEndMonth);
        validator.onlyNumbers(jtf_dateFilterEndYear);
        validator.limitSize(jtf_cuitFilter, 11);
        validator.limitSize(jtf_dateFilterInitDay, 2);
        validator.limitSize(jtf_dateFilterEndDay, 2);
        validator.limitSize(jtf_dateFilterInitMonth, 2);
        validator.limitSize(jtf_dateFilterEndMonth, 2);
        validator.limitSize(jtf_dateFilterInitYear, 4);
        validator.limitSize(jtf_dateFilterEndYear, 4);
    }

    @Override
    public void initListener() {
        tableCarrier.getSelectionModel().addListSelectionListener(new TableListener(this));
        jtf_cuitFilter.getDocument().addDocumentListener(new JTextFieldListener(this));
    }

    @Override
    public void initPanel() {
        this.carriers = this.panel.updateCarriersTable("");
        cleanAllFields();
        overviewReport(getInitDate(), getEndDate());
    }

    @Override
    public JTable getTable() {
        return tableCarrier;
    }

    private GregorianCalendar getInitDate() {
        int initDay = jtf_dateFilterInitDay.getText().isBlank() ? 0 : Integer.parseInt(jtf_dateFilterInitDay.getText());
        int initMonth = jtf_dateFilterInitMonth.getText().isBlank() ? 0 : Integer.parseInt(jtf_dateFilterInitMonth.getText());
        int initYear = jtf_dateFilterInitYear.getText().isBlank() ? 0 : Integer.parseInt(jtf_dateFilterInitYear.getText());
        return new GregorianCalendar(initYear, initMonth, initDay);
    }

    private GregorianCalendar getEndDate() {
        int endDay = jtf_dateFilterEndDay.getText().isBlank() ? 0 : Integer.parseInt(jtf_dateFilterEndDay.getText());
        int endMonth = jtf_dateFilterEndMonth.getText().isBlank() ? 0 : Integer.parseInt(jtf_dateFilterEndMonth.getText());
        int endYear = jtf_dateFilterEndYear.getText().isBlank() ? 0 : Integer.parseInt(jtf_dateFilterEndYear.getText());
        return new GregorianCalendar(endYear, endMonth, endDay);
    }

    @Override
    public void selectFromTable() {
        int field = tableCarrier.getSelectedRow();
        if (field >= 0) {
            Carrier carrier = carriers.get(field);
            this.carriers = panel.updateCarriersTable(carrier.getCuit());
            carrierReport(carrier, getInitDate(), getEndDate());
        }
    }

    @Override
    public void changeConditionAllFields(boolean state) {
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
    }

    @Override
    public void changeConditionButton(JButton button, boolean state) {
    }

    @Override
    public void cleanAllFields() {
        cleanField(jtf_cuitFilter);
        cleanField(jtf_dateFilterInitDay);
        cleanField(jtf_dateFilterInitMonth);
        cleanField(jtf_dateFilterInitYear);
        cleanField(jtf_dateFilterEndDay);
        cleanField(jtf_dateFilterEndMonth);
        cleanField(jtf_dateFilterEndYear);
    }

    @Override
    public void cleanField(JTextField textfield) {
        validator.cleanField(textfield);
    }

    @Override
    public boolean verifyEmptyFields() {
        return false;
    }

    @Override
    public String getStringFilter() {
        return "";
    }

    @Override
    public void updateTable() {
        this.carriers = this.panel.updateCarriersTable(jtf_cuitFilter.getText());
    }

    private void overviewReport(GregorianCalendar init, GregorianCalendar end) {
        this.carriers = panel.updateCarriersTable("");
        jbl_reportTitle.setText("INFORME GENERAL:");
        cleanAllFields();
        reportText.setText(panel.carrierOverviewReport(init, end));
    }

    private void carrierReport(Carrier carrier, GregorianCalendar init, GregorianCalendar end) {
        this.carriers = panel.updateCarriersTable(carrier.getCuit());
        jbl_reportTitle.setText("INFORME DE " + carrier.getName() + ":");
        reportText.setText(panel.carrierReport(carrier, init, end));
    }

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

}
