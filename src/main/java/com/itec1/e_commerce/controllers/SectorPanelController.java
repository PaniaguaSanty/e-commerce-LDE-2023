package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.services.SectorServiceImpl;
import com.itec1.e_commerce.services.WarehouseServiceImpl;
import com.itec1.e_commerce.views.Management_Sectors_Panel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author melina
 */
public class SectorPanelController implements IController<Sector> {

    private final SectorServiceImpl sectorService;
    private final Management_Sectors_Panel sectorPanel;
    private final WarehouseServiceImpl warehouseService;
    private String crudOption = "";

    public SectorPanelController(Management_Sectors_Panel sectorPanel) {
        this.sectorPanel = sectorPanel;
        this.sectorService = new SectorServiceImpl();
        this.warehouseService = new WarehouseServiceImpl();
    }

    @Override
    public List<Sector> updateTable(String string) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Codigo", "Nombre", "Cant.pedidos"};
        model.setColumnIdentifiers(titles);
        List<Sector> sectors = sectorService.findAllEnabled();
        List<Sector> result = new ArrayList<>();
        for (Sector sec : sectors) {
            if (sec.getWarehouse().getCode().equals(string)) {
                Object[] object = {sec.getId(), sec.getCode(), sec.getName(), sec.getOrders().size()};
                model.addRow(object);
                result.add(sec);
            }
        }
        this.sectorPanel.getTable().setModel(model);
        return result;
    }

    public List<Warehouse> getWarehouses(String string) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Código", "Dirección", "País", "Latitud", "Longitud"};
        model.setColumnIdentifiers(titles);
        List<Warehouse> warehouses = warehouseService.findAll();
        List<Warehouse> result = new ArrayList<>();
        for (Warehouse wh : warehouses) {
            if (wh.getCode().startsWith(string)) {
                Object[] object = {wh.getId(), wh.getCode(), wh.getAddress(), wh.getCountry(), wh.getLatitude(), wh.getLongitude()};
                model.addRow(object);
                result.add(wh);
            }
        }
        this.sectorPanel.getTableWarehouse().setModel(model);
        return result;
    }

    @Override
    public boolean verifyCrud(String selectedOption) {
        if (!crudOption.equals(selectedOption)) {
            crudOption = selectedOption;
            return true;
        }
        return false;
    }

    @Override
    public String create(Sector entity) {
        if (sectorService.findByCode(entity.getCode()) != null) {
            return "ERROR. Este nombre ya pertence a un sector.";
        } else {
            sectorService.create(entity);
        }
        return "Sector creado correctamente.";
    }

    @Override
    public String update(Long id, Sector entity) {
        try {
            sectorService.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. este sector no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Sector actualizado correctamente";
    }

    @Override
    public Sector findById(Long id) {
        return sectorService.findById(id);
    }

    @Override
    public List<Sector> findAll() {
        return sectorService.findAll();
    }

    @Override
    public String disable(Long id) {
        Sector sector = sectorService.findById(id);
        if (!sector.isEnable()) {
            return "ERROR. Este sector ya se encuentra eliminado.";
        } else {
            try {
                sectorService.disable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este sector no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Sector eliminado correctamente.";
    }

    @Override
    public String enable(Long id) {
        Sector sector = sectorService.findById(id);
        if (sector.isEnable()) {
            return "ERROR. Este sector no se encuentra eliminado.";
        } else {
            try {
                sectorService.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este sector no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Sector recuperado correctamente.";
    }

    public Sector findByName(String name, Warehouse entity) {
        return sectorService.findSectorByName(name, entity);
    }

    public Sector findByCode(String string) {
        return sectorService.findByCode(string);
    }
}
