/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.views.resources;

import com.itec1.e_commerce.views.Management_Clients_Panel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author turraca
 */
public class ClientsTableListener implements ListSelectionListener {

    private final Management_Clients_Panel clientsPanel;
    
    public ClientsTableListener(Management_Clients_Panel clientsPanel) {
        this.clientsPanel = clientsPanel;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        clientsPanel.selectFromTable();
    }
    
}
