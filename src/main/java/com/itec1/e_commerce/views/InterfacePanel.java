/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itec1.e_commerce.views;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author turraca
 */
public interface InterfacePanel {
    
    void initListener();
    
    void initValidator();
    
    void initPanel();
    
    javax.swing.JTable getTable();
    
    void selectFromTable();
    
    void changeConditionAllFields(boolean state);
    
    void changeConditionField(JTextField textField, boolean state);
   
    void changeConditionAllButtons(boolean state);
    
    void changeConditionButton(JButton button, boolean state);
    
    void cleanAllFields();
    
    void cleanField(JTextField textfield);
    
    boolean verifyEmptyFields();
    
    String getStringFilter();
    
    void updateTable();
}
