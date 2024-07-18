package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.services.ProviderServiceImpl;
import com.itec1.e_commerce.views.Management_Providers_Panel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pania
 */
public class ProviderPanelController implements IController<Provider> {

    private final ProviderServiceImpl service;
    private final Management_Providers_Panel panel;
    String crudOption = "";

    public ProviderPanelController(Management_Providers_Panel providerPanel) {
        this.service = new ProviderServiceImpl();
        this.panel = providerPanel;
    }

    @Override
    public List<Provider> updateTable(String cuit) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Nombre", "Apellido", "C.U.I.T.", "Direción", "Correo", "Teléfono"};
        model.setColumnIdentifiers(titles);
        List<Provider> providers = service.findAllEnabled();
        List<Provider> result = new ArrayList<>();
        for (Provider pr : providers) {
            if (pr.getCuit().startsWith(cuit)) {
                Object[] object = {pr.getId(), pr.getName(), pr.getLastname(), pr.getCuit(), pr.getAddress(),
                    pr.getEmail(), pr.getPhone()};
                model.addRow(object);
                result.add(pr);
            }
        }
        this.panel.getTable().setModel(model);
        return result;
    }

    @Override
    public String create(Provider entity) {
        if (findByCuit(entity.getCuit()) != null) {
            return "ERROR. Este CUIT ya pertenece a un provedor.";
        } else {
            service.create(entity);
        }
        return "Provedor creado correctamente.";
    }

    @Override
    public String update(Long id, Provider entity) {
        try {
            service.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. este provedor no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Provedor actualizado correctamente";
    }

    @Override
    public Provider findById(Long id) {
        return service.findById(id);
    }

    public Provider findByCuit(String cuit) throws EntityNotFoundException {
        return service.findByCuit(cuit);
    }

    @Override
    public List<Provider> findAll() {
        return service.findAll();
    }

    @Override
    public String disable(Long id) {
        Provider provider = service.findById(id);
        if (!provider.isEnable()) {
            return "ERROR. Este provedor ya se encuentra eliminado.";
        } else {
            try {
                service.disable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este provedor no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Provedor eliminado correctamente.";
    }

    @Override
    public String enable(Long id) {
        Provider provider = service.findById(id);
        if (provider.isEnable()) {
            return "ERROR. Este provedor no se encuentra eliminado.";
        } else {
            try {
                service.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este provedor no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Provedor recuperado correctamente.";
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
