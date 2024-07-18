package com.itec1.e_commerce.views.resources;

import com.itec1.e_commerce.controllers.OrderPanelController;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import com.itec1.e_commerce.views.NewOrder_FirstPanel;

/**
 *
 * @author sjcex
 */
public class JClientFieldListener<T, U> implements DocumentListener {

    private List<T> entities;
    private final OrderPanelController controller;
    private final NewOrder_FirstPanel panel;

    public JClientFieldListener(List<T> entities, OrderPanelController controller, NewOrder_FirstPanel panel) {
        this.entities = entities;
        this.controller = controller;
        this.panel = panel;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateTable((panel.getClientFilter()));
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateTable((panel.getClientFilter()));
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateTable(panel.getClientFilter());
    }
}
