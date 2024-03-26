package com.itec1.e_commerce.views.resources;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import com.itec1.e_commerce.views.InterfacePanel;

/**
 *
 * @author turraca
 */
public class TableListener implements ListSelectionListener {

    private final InterfacePanel panel;

    public TableListener(InterfacePanel panel) {
        this.panel = panel;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        panel.selectFromTable();
    }

}
