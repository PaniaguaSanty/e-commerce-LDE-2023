/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.views.resources;

import com.itec1.e_commerce.controllers.IController;
import com.itec1.e_commerce.views.InterfaceCrudPanel;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author sjcex
 */
public class JTextFieldListener<T, U> implements DocumentListener{
    
    private List<T> entities;
    private final IController<U> controller;
    private final InterfaceCrudPanel panel;

    public JTextFieldListener(List<T> entities, IController<U> controller, InterfaceCrudPanel panel) {
        this.entities = entities;
        this.controller = controller;
        this.panel = panel;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateTable(panel.getStringFilter());
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateTable(panel.getStringFilter());
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateTable(panel.getStringFilter());
    }
    
    
    
}
