package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.EmployeeJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Employee;
import com.itec1.e_commerce.entities.Warehouse;
import java.util.stream.Collectors;
import java.util.List;

public class EmployeeServiceImpl implements ICRUD<Employee> {

    private final EmployeeJpaController employeeJpaController;

    public EmployeeServiceImpl() {
        this.employeeJpaController = new EmployeeJpaController(Connection.getEmf());
    }

    public EmployeeServiceImpl(EmployeeJpaController employeeJpaController) {
        this.employeeJpaController = employeeJpaController;
    }

    @Override
    public Employee create(Employee entity) {
        try {
            employeeJpaController.create(entity);
            return entity;
        } catch (Exception e) {
            System.err.println("Error when creating the employee" + e.getMessage());
            throw new RuntimeException("Failed to create employee", e);
        }
    }

    @Override
    public Employee update(Long id, Employee entity) throws NonexistentEntityException, Exception {
        Employee employee = employeeJpaController.findEmployee(id);
        employee.setName(entity.getName());
        employee.setLastname(entity.getLastname());
        employee.setAddress(entity.getAddress());
        employee.setCuit(entity.getCuit());
        employee.setEmail(entity.getEmail());
        employee.setPhone(entity.getPhone());
        employee.setWarehouse(entity.getWarehouse());
        employeeJpaController.edit(employee);
        return employeeJpaController.findEmployee(entity.getId());
    }

    @Override
    public Employee findById(Long id) {
        return employeeJpaController.findEmployee(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeJpaController.findEmployeeEntities();
    }

    @Override
    public Employee disable(Long id) throws NonexistentEntityException, Exception {
        Employee employee = employeeJpaController.findEmployee(id);
        employee.setEnable(false);
        employeeJpaController.edit(employee);
        return employeeJpaController.findEmployee(id);
    }

    @Override
    public Employee delete(Long id) throws NonexistentEntityException {
        employeeJpaController.destroy(id);
        return employeeJpaController.findEmployee(id);
    }

    @Override
    public Employee enable(Long id) throws NonexistentEntityException, Exception {
        Employee employee = employeeJpaController.findEmployee(id);
        employee.setEnable(true);
        employeeJpaController.edit(employee);
        return employeeJpaController.findEmployee(id);
    }

    public Employee findByCuit(String cuit) {
        try {
            return employeeJpaController.findEmployeeEntities().stream()
                    .filter(client -> client.getCuit().equals(cuit))
                    .findFirst()
                    .orElse(null);
        } catch (Exception e) {
            System.err.println("Error while searching Employee by cuit.");
            throw new RuntimeException("Error while searching, please try again.", e);
        }
    }
  
  public List<Employee> searchByWarehouse(String warehouseToSearch) {
        return employeeJpaController.findEmployeeEntities().stream()
                .filter(employee -> employee.getWarehouse().getCode().equalsIgnoreCase(warehouseToSearch))
                .collect(Collectors.toList());
    }

    //Verificar
    public Employee relocateEmployee(String employeeCuitToRelocate, Warehouse warehouseToRelocate) throws Exception {
        Employee employeeToRelocate = findByCuit(employeeCuitToRelocate);
        if (employeeToRelocate != null && employeeToRelocate.getEnable()) {
            employeeToRelocate.setWarehouse(warehouseToRelocate);
            employeeJpaController.edit(employeeToRelocate);
            return employeeToRelocate;
        }
        return null;
    }


}
