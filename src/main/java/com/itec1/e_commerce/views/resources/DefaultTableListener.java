/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.views.resources;

import com.itec1.e_commerce.views.InterfaceCrudPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author turraca
 */
public class DefaultTableListener implements ListSelectionListener {

    private final InterfaceCrudPanel panel;
    
    public DefaultTableListener(InterfaceCrudPanel panel) {
        this.panel = panel;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        panel.selectFromTable();
    }
    
}
    
