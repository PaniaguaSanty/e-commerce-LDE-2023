/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.views.resources;

import com.itec1.e_commerce.controllers.IController;
import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.views.InterfacePanel;
import com.itec1.e_commerce.views.NewOrder_FirstPanel;
import com.itec1.e_commerce.views.Order_ViewOrderSector_Panel;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author melina
 */
public class JWarehouseFieldListener implements DocumentListener {

    private final Order_ViewOrderSector_Panel panel;

    public JWarehouseFieldListener ( Order_ViewOrderSector_Panel panel) {
     
        this.panel = panel;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
      panel.updateTable();
      panel.clearSectorTable();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        panel.updateTable();
        panel.clearSectorTable();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        panel.updateTable();
        panel.clearSectorTable();
    }

}