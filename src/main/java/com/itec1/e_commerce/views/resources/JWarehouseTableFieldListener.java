package com.itec1.e_commerce.views.resources;

import com.itec1.e_commerce.controllers.OrderPanelController;
import com.itec1.e_commerce.views.NewOrder_ChooseWarehousePanel;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author sjcex
 */
public class JWarehouseTableFieldListener<T, U> implements DocumentListener {

    private List<T> entities;
    private final OrderPanelController controller;
    private final NewOrder_ChooseWarehousePanel panel;

    public JWarehouseTableFieldListener(List<T> entities, OrderPanelController controller, NewOrder_ChooseWarehousePanel panel) {
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
