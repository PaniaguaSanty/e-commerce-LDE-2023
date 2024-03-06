/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itec1.e_commerce.views.resources;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Ariel
 */
public class ValidadorDeCampos {

    /**
     * El texfield admitira solamente letras
     *
     * @param unTextField
     */
    public void validarSoloLetras(JTextField unTextField) {
        unTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracterIngresado = e.getKeyChar();
                if (Character.isDigit(caracterIngresado)) {
                    e.consume();
                }
            }
        });

    }

    /**
     * El textFiel solo admitira numeros
     *
     * @param unTextField
     */
    public void validarSoloNumero(JTextField unTextField) {
        unTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracterIngresado = e.getKeyChar();
                if (!Character.isDigit(caracterIngresado)) {
                    e.consume();
                }
            }
        });

    }

    /**
     * El TextFiel estara limitado en caracteres por el tamanioMaximo
     *
     * @param unTextField
     * @param tamanioMaximo
     */
    public void LimitarCaracteres(JTextField unTextField, int tamanioMaximo) {
        unTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int tamanioActual = unTextField.getText().length();
                if (tamanioActual >= tamanioMaximo) {
                    //No permite ingresar mas caracteres
                    e.consume();
                }
            }
        });
    }

    /**
     * El textfield permitira ingreso de numeros decimales solamente
     *
     * @param unTextField
     */
    public void validarNumeroDecimales(JTextField unTextField) {
        unTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int caracterIngresado = (int) e.getKeyChar();
                if (caracterIngresado >= 46 && caracterIngresado <= 57) {
                    if (caracterIngresado == 46) {
                        String dato = unTextField.getText();
                        int tamA = dato.length();
                        for (int i = 0; i <= tamA; i++) {
                            if (dato.contains(".")) {
                                e.setKeyChar((char) KeyEvent.VK_CLEAR);
                            }
                        }
                    }
                    if (caracterIngresado == 47) {
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
     * @param unTextField
     * @return
     */
    public int verificarTamanioCampo(JTextField unTextField) {
        int posicion = 0;
        char caracter = (char) 0;
        for (int i = 0; i <= unTextField.getText().length() - 1; i++) {
            caracter = unTextField.getText().charAt(i);
            if (caracter == '.') {
                posicion = i;
            }
        }
        return posicion;
    }

    /**
     * limpia el textfield
     *
     * @param unTextField
     */
    public void limpiarCampo(JTextField unTextField) {
        unTextField.setText("");
    }

    /**
     * Habilita o deshabilita el texfield segun el estado
     *
     * @param estado
     * @param unTextField
     */
    public void habilitarCampo(boolean estado, JTextField unTextField) {
        unTextField.setEditable(estado);
    }

    /**
     * Habilita o deshabilita el boton segun el estado
     *
     * @param estado
     * @param unBoton
     * @param colorBotonActivo
     * @param colorTextoActivo
     * @param colorBotonDesactivo
     * @param colorTextoDesactivo
     */
    public void habilitarBoton(boolean estado, JButton unBoton, Color colorBotonActivo, Color colorTextoActivo, Color colorBotonDesactivo, Color colorTextoDesactivo) {

        if (estado) {
            unBoton.setBackground(colorBotonActivo);
            unBoton.setForeground(colorTextoActivo);
            unBoton.setEnabled(estado);
        } else {
            unBoton.setBackground(colorBotonDesactivo);
            unBoton.setForeground(colorTextoDesactivo);
            unBoton.setEnabled(estado);
        }
    }

    /**
     * Habilita o deshabilita un ComboBox segun el estado
     *
     * @param estado
     * @param unComboBox
     */
    public void habilitarCombobox(boolean estado, JComboBox unComboBox) {
        unComboBox.setEnabled(estado);
    }

    /**
     * Limpia un ComboBox
     *
     * @param unComboBox
     */
    public void limpiarCombobox(JComboBox unComboBox) {
        unComboBox.removeAllItems();
    }

    /**
     * calcularFechaTurno Calcula la edad en funcion a la fechaDenacimiento ingresada
     *
     * @param fechaDeTurno
     * @return
     */
    public boolean calcularFechaTurno(Date fechaDeTurno) {
        boolean turnoValido = false;
        Calendar calendario = Calendar.getInstance(); // fecha actual
        int anioDeHoy = calendario.get(Calendar.YEAR);
        int mesDeHoy = calendario.get(Calendar.MONTH);
        int diaDeHoy = calendario.get(Calendar.DAY_OF_MONTH);

        calendario.setTime(fechaDeTurno); // fecha de turno
        int anioDeTurno = calendario.get(Calendar.YEAR);
        int mesDeTurno = calendario.get(Calendar.MONTH);
        int diaTurno = calendario.get(Calendar.DAY_OF_MONTH);

        if (anioDeTurno >= anioDeHoy) {
            turnoValido = true;
        }else{
            turnoValido = false;
        }

        if (anioDeTurno == anioDeHoy) {
            if (mesDeTurno > mesDeHoy) {
                turnoValido = true;
            }else{
                turnoValido = false;
            }
        }
        
        if (anioDeTurno == anioDeHoy) {
            if (mesDeTurno == mesDeHoy) {
                if (diaTurno>=diaDeHoy) {
                    turnoValido = true;
                }else{
                    turnoValido = false;
                }
            }
        }

        return turnoValido;
    }
}
