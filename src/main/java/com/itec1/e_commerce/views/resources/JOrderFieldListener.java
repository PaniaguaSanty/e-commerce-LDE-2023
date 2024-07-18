/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.views.resources;

import com.itec1.e_commerce.views.Order_ViewOrderSector_Panel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author melina
 */
public class JOrderFieldListener implements DocumentListener {

    private final Order_ViewOrderSector_Panel panel;

    public JOrderFieldListener(Order_ViewOrderSector_Panel panel) {

        this.panel = panel;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        panel.updateTable();

    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        panel.updateTable();

    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        panel.updateTable();

    }

}
