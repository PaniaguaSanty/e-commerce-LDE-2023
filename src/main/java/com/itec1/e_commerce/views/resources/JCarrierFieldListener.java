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
public class JCarrierFieldListener<T, U> implements DocumentListener {

    private List<T> entities;
    private final OrderPanelController controller;
    private final NewOrder_SecondPanel panel;

    public JCarrierFieldListener(List<T> entities, OrderPanelController controller, NewOrder_SecondPanel panel) {
        this.entities = entities;
        this.controller = controller;
        this.panel = panel;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateCarrierTable((panel.getCarrierFilter()));
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateCarrierTable((panel.getCarrierFilter()));
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        entities = (List<T>) controller.updateCarrierTable(panel.getCarrierFilter());
    }
}
