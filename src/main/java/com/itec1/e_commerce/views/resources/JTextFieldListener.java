package com.itec1.e_commerce.views.resources;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import com.itec1.e_commerce.views.InterfacePanel;

/**
 *
 * @author sjcex
 */
public class JTextFieldListener<T, U> implements DocumentListener {

    private final InterfacePanel panel;

    public JTextFieldListener(InterfacePanel panel) {

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
