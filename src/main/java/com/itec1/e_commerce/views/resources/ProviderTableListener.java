/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.views.resources;

import com.itec1.e_commerce.views.Management_Providers_Panel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author pania
 */
public class ProviderTableListener implements ListSelectionListener{
    
    private final Management_Providers_Panel providersPanel;
    
    public ProviderTableListener(Management_Providers_Panel providersPanel) {
        this.providersPanel = providersPanel;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        providersPanel.selectFromTable();
    }
    
}
