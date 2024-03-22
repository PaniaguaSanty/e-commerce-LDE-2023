/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.views.resources;

import com.itec1.e_commerce.controllers.OrderPanelController;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import com.itec1.e_commerce.views.NewOrder_SecondPanel;

/**
 *
 * @author sjcex
 */
public class JWarehouseTableFieldListener<T, U> implements DocumentListener {

    private List<T> entities;
    private final OrderPanelController controller;
    private final NewOrder_SecondPanel panel;

    public JWarehouseTableFieldListener(List<T> entities, OrderPanelController controller, NewOrder_SecondPanel panel) {
        this.entities = entities;
        this.controller = controller;
        this.panel = panel;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateWarehouseTable((panel.getWarehouseFilter()));
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateWarehouseTable((panel.getWarehouseFilter()));
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateWarehouseTable(panel.getWarehouseFilter());
    }
}
