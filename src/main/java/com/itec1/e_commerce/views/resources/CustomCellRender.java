package com.itec1.e_commerce.views.resources;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        boolean isEnabled = (boolean) table.getModel().getValueAt(row, 9); // Reemplaza <index_of_enable_column> con el índice real de la columna "enable"

        if (!isEnabled) {
            c.setBackground(Color.LIGHT_GRAY); // Cambia el color de fondo solo si el producto está deshabilitado
        } else {
            c.setBackground(table.getBackground()); // Restablece el color de fondo predeterminado
        }

        return c;
    }
}
