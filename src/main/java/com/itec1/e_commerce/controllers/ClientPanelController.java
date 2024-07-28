package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.views.Management_Clients_Panel;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.table.DefaultTableModel;

public class ClientPanelController implements IController<Client> {

    private final ClientServiceImpl service;
    private final Management_Clients_Panel panel;
    private String crudOption = "";

    public ClientPanelController(Management_Clients_Panel panel) {
        this.service = new ClientServiceImpl();
        this.panel = panel;
    }

    @Override
    public List<Client> updateTable(String cuit) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Nombre", "Apellido", "C.U.I.T.", "Direción", "Correo", "Teléfono"};
        model.setColumnIdentifiers(titles);
        List<Client> clients = service.findAllEnabled();
        List<Client> result = new ArrayList<>();
        for (Client cl : clients) {
            if (cl.getCuit().startsWith(cuit)) {
                Object[] object = {cl.getId(), cl.getName(), cl.getLastname(), cl.getCuit(), cl.getAddress(), cl.getEmail(), cl.getPhone()};
                model.addRow(object);
                result.add(cl);
            }
        }
        this.panel.getTable().setModel(model);
        return result;
    }

    @Override
    public String create(Client entity) {
        if (findByCuit(entity.getCuit()) != null) {
            return "ERROR. Este CUIT ya pertenece a un cliente.";
        } else {
            service.create(entity);
        }
        return "Cliente creado correctamente.";
    }

    @Override
    public String update(Long id, Client entity) {
        try {
            service.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. este cliente no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Cliente actualizado correctamente";
    }

    @Override
    public Client findById(Long id) {
        return service.findById(id);
    }

    public Client findByCuit(String cuit) throws EntityNotFoundException {
        return service.findByCuit(cuit);
    }

    @Override
    public List<Client> findAll() {
        return service.findAll();
    }

    @Override
    public String disable(Long id) {
        Client client = service.findById(id);
        if (!client.isEnable()) {
            return "ERROR. Este cliente ya se encuentra eliminado.";
        } else {
            try {
                service.disable(id);
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
        Client client = service.findById(id);
        if (client.isEnable()) {
            return "ERROR. Este cliente no se encuentra eliminado.";
        } else {
            try {
                service.enable(id);
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
