package com.itec1.e_commerce.views.resources;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Ariel
 */
public class FieldDataValidator {

    /**
     * El texfield admitira solamente letras
     *
     * @param textField
     */
    public void onlyLetters(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char charEntered = e.getKeyChar();
                if (Character.isDigit(charEntered)) {
                    e.consume();
                }
            }
        });

    }

    /**
     * El textFiel solo admitira numeros
     *
     * @param textField
     */
    public void onlyNumbers(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char charEntered = e.getKeyChar();
                if (!Character.isDigit(charEntered)) {
                    e.consume();
                }
            }
        });

    }

    /**
     * El TextFiel estara limitado en caracteres por el tamanioMaximo
     *
     * @param textField
     * @param maximumSize
     */
    public void limitSize(JTextField textField, int maximumSize) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int actualSize = textField.getText().length();
                if (actualSize >= maximumSize) {
                    //No permite ingresar mas caracteres
                    e.consume();
                }
            }
        });
    }

    /**
     * El textfield permitira ingreso de numeros decimales solamente
     *
     * @param textField
     */
    public void onlyDecimalsNumbers(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int charEntered = (int) e.getKeyChar();
                if (charEntered >= 46 && charEntered <= 57) {
                    if (charEntered == 46) {
                        String info = textField.getText();
                        int size = info.length();
                        for (int i = 0; i <= size; i++) {
                            if (info.contains(".")) {
                                e.setKeyChar((char) KeyEvent.VK_CLEAR);
                            }
                        }
                    }
                    if (charEntered == 47) {
                        e.setKeyChar((char) KeyEvent.VK_CLEAR);
                    }
                } else {
                    e.setKeyChar((char) KeyEvent.VK_CLEAR);
                    e.consume();
                }
            }
        });
    }

    /**
     * Informa el tamaño del texfield
     *
     * @param textField
     * @return
     */
    public int verifyFieldSize(JTextField textField) {
        int position = 0;
        char character;
        for (int i = 0; i <= textField.getText().length() - 1; i++) {
            character = textField.getText().charAt(i);
            if (character == '.') {
                position = i;
            }
        }
        return position;
    }

    /**
     * limpia el textfield
     *
     * textField unTextField
     *
     * @param textField
     */
    public void cleanField(JTextField textField) {
        textField.setText("");
    }

    /**
     * Habilita o deshabilita el texfield segun el estado
     *
     * @param state
     * @param textField
     */
    public void enableField(boolean state, JTextField textField) {
        textField.setEditable(state);
    }

    /**
     * Habilita o deshabilita el boton segun el estado
     *
     * @param state
     * @param button
     * @param buttonEnabledColor
     * @param textEnabledColor
     * @param buttonDisabledColor
     * @param textDisabledColor
     */
    public void enableButton(boolean state, JButton button, Color buttonEnabledColor, Color textEnabledColor, Color buttonDisabledColor, Color textDisabledColor) {

        if (state) {
            button.setBackground(buttonEnabledColor);
            button.setForeground(textEnabledColor);
            button.setEnabled(state);
        } else {
            button.setBackground(buttonDisabledColor);
            button.setForeground(textDisabledColor);
            button.setEnabled(state);
        }
    }

    /**
     * Habilita o deshabilita un ComboBox segun el estado
     *
     * @param state
     * @param comboBox
     */
    public void enableCombobox(boolean state, JComboBox comboBox) {
        comboBox.setEnabled(state);
    }

    /**
     * Habilita o deshabilita un CheckBox segun el estado
     *
     * @param state
     * @param checkBox
     */
    public void enableCheckbox(boolean state, JCheckBox checkBox) {
        checkBox.setEnabled(state);
    }

    /**
     * Limpia un ComboBox
     *
     * @param comboBox
     */
    public void cleanCombobox(JComboBox comboBox) {
        comboBox.removeAllItems();
    }

}
