package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.EmployeeJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Employee;
import com.itec1.e_commerce.entities.Warehouse;
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
        employeeJpaController.create(entity);
        return entity;
    }

    @Override
    public Employee update(Long id, Employee entity) throws Exception {
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
    public List<Employee> findAllEnabled() {
        return findAll().stream().filter(Employee::isEnable).toList();
    }

    @Override
    public Employee disable(Long id) throws Exception {
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
    public Employee enable(Long id) throws Exception {
        Employee employee = employeeJpaController.findEmployee(id);
        employee.setEnable(true);
        employeeJpaController.edit(employee);
        return employeeJpaController.findEmployee(id);
    }

    public Employee findByCuit(String cuit) {
        return employeeJpaController.findEmployeeEntities().stream()
                .filter(client -> client.getCuit().equals(cuit))
                .findFirst()
                .orElse(null);
    }

    public List<Employee> searchByWarehouse(String warehouseToSearch) {
        return employeeJpaController.findEmployeeEntities().stream()
                .filter(employee -> employee.getWarehouse().getCode().
                equals(warehouseToSearch)).toList();
    }

    //Verificar
    public Employee relocateEmployee(String employeeCuitToRelocate, Warehouse warehouseToRelocate) throws Exception {
        Employee employeeToRelocate = findByCuit(employeeCuitToRelocate);
        if (employeeToRelocate != null && employeeToRelocate.isEnable()) {
            employeeToRelocate.setWarehouse(warehouseToRelocate);
            employeeJpaController.edit(employeeToRelocate);
            return employeeToRelocate;
        }
        return null;
    }
}
