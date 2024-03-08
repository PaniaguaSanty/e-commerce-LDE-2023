/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.views.Management_Clients_Panel;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author turraca
 */
public class ClientPanelController implements IController<Client> {

    private final ClientServiceImpl clientService;
    private final Management_Clients_Panel clientPanel;
    private String crudOption = "";

    public ClientPanelController(Management_Clients_Panel clientPanel) {
        this.clientService = new ClientServiceImpl();
        this.clientPanel = clientPanel;
    }

    @Override
    public List<Client> updateTable(String cuit) {
        DefaultTableModel model = new DefaultTableModel();
        //agrega los titulos a la columna
        String[] titles = {"Id", "Nombre", "Apellido", "C.U.I.T.", "Direción", "Correo", "Teléfono"};
        model.setColumnIdentifiers(titles);
        List<Client> clients = clientService.findAll();
        List<Client> result = new ArrayList<>();
        for (Client cl : clients) {
            if (cl.getCuit().startsWith(cuit)) {
                Object[] object = {cl.getId(), cl.getName(), cl.getLastname(), cl.getCuit(), cl.getAddress(),
                    cl.getEmail(), cl.getPhone()};
                model.addRow(object);
                result.add(cl);
            }
        }
        this.clientPanel.getTable().setModel(model);
        return result;
    }

    @Override
    public String create(Client entity) {
        if (findByCuit(entity.getCuit()) != null) {
            return "ERROR. Este CUIT ya pertenece a un cliente.";
        } else {
            clientService.create(entity);
        }
        return "Cliente creado correctamente.";
    }

    @Override
    public String update(Long id, Client entity) {
        try {
            clientService.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. este cliente no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Cliente actualizado correctamente";
    }

    @Override
    public Client findById(Long id) {
        return clientService.findById(id);
    }

    public Client findByCuit(String cuit) throws EntityNotFoundException {
        return clientService.findByCuit(cuit);
    }

    @Override
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @Override
    public String disable(Long id) {
        Client client = clientService.findById(id);
        if (!client.getEnable()) {
            return "ERROR. Este cliente ya se encuentra eliminado.";
        } else {
            try {
                clientService.disable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este cliente no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Cliente eliminado correctamente.";
    }

    @Override
    public String enable(Long id) {
        Client client = clientService.findById(id);
        if (client.getEnable()) {
            return "ERROR. Este cliente no se encuentra eliminado.";
        } else {
            try {
                clientService.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este cliente no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Cliente recuperado correctamente.";
    }

    @Override
    public boolean verifyCrud(String selectedOption) {
        if (!crudOption.equals(selectedOption)) {
            crudOption = selectedOption;
            return true;
        }
        return false;
    }

}
