package com.itec1.e_commerce.services;

import java.util.List;

import com.itec1.e_commerce.dao.EmployeeJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Employee;

public class EmployeeServiceImpl implements ICRUD<Employee> {

    private final EmployeeJpaController employeeJpaController;

    public EmployeeServiceImpl(EmployeeJpaController employeeJpaController) {
        this.employeeJpaController = employeeJpaController;
    }

    @Override
    public Employee create(Employee entity) {
        employeeJpaController.create(entity);
        return employeeJpaController.findEmployee(entity.getId());
    }

    @Override
    public Employee update(Long id, Employee entity) throws NonexistentEntityException, Exception {
        Employee employee = employeeJpaController.findEmployee(id);
        employee.setName(entity.getName());
        employee.setSurname(entity.getSurname());
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
    public void disable(Long id) throws NonexistentEntityException, Exception {
        Employee employee = employeeJpaController.findEmployee(id);
        employee.setEnable(false);
        employeeJpaController.edit(employee);
    }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        employeeJpaController.destroy(id);
    }

}
