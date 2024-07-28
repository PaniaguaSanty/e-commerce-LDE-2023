package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Employee;
import com.itec1.e_commerce.entities.Warehouse;
import com.itec1.e_commerce.services.EmployeeServiceImpl;
import com.itec1.e_commerce.services.WarehouseServiceImpl;
import com.itec1.e_commerce.views.Management_Employees_Panel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author melina
 */
public class EmployeePanelController implements IController<Employee> {

    private final EmployeeServiceImpl employeeService;
    private final WarehouseServiceImpl warehouseService;
    private final Management_Employees_Panel panel;
    private String crudOption = "";

    public EmployeePanelController(Management_Employees_Panel panel) {
        this.panel = panel;
        this.employeeService = new EmployeeServiceImpl();
        this.warehouseService = new WarehouseServiceImpl();
    }

    @Override
    public List<Employee> updateTable(String string) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"C.U.I.T.", "Nombre"};
        model.setColumnIdentifiers(titles);
        List<Employee> employees = employeeService.findAllEnabled();
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getWarehouse().getCode().equals(string)) {
                Object[] object = {emp.getCuit(), emp.getName() + " " + emp.getLastname()};
                model.addRow(object);
                result.add(emp);
            }
        }
        this.panel.getTable().setModel(model);
        return result;
    }

    public List<Warehouse> getWarehouses(String string) {
        DefaultTableModel model = new DefaultTableModel();
        //agrega los titulos a la columna
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
        this.panel.getTableWarehouse().setModel(model);
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
    public String create(Employee entity) {
        if (employeeService.findByCuit(entity.getCuit()) != null) {
            return "ERROR. Este cuit ya pertence a un empleado.";
        } else {
            employeeService.create(entity);
        }
        return "Empleado creado correctamente.";
    }

    @Override
    public String update(Long id, Employee entity) {
        try {
            employeeService.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. este empleado no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Empleado actualizado correctamente";
    }

    @Override
    public Employee findById(Long id) {
        return employeeService.findById(id);
    }

    public Employee findByCuit(String string) {
        return employeeService.findByCuit(string);
    }

    @Override
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @Override
    public String disable(Long id) {
        Employee sector = employeeService.findById(id);
        if (!sector.isEnable()) {
            return "ERROR. Este empleado ya se encuentra eliminado.";
        } else {
            try {
                employeeService.disable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este sector no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Empleado eliminado correctamente.";
    }

    @Override
    public String enable(Long id) {
        Employee sector = employeeService.findById(id);
        if (sector.isEnable()) {
            return "ERROR. Este empleado no se encuentra eliminado.";
        } else {
            try {
                employeeService.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este empleado no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Empleado recuperado correctamente.";
    }
}
