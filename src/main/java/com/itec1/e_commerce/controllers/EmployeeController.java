/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Employee;
import com.itec1.e_commerce.services.EmployeeServiceImpl;
import java.util.List;

/**
 *
 * @author melina
 */
public class EmployeeController implements ICRUD<Employee>{
    
    private final EmployeeServiceImpl employeeServiceImpl;

    public EmployeeController(EmployeeServiceImpl employedServiceImpl) {
        this.employeeServiceImpl = employedServiceImpl;
    }
    
    

    @Override
    public Employee create(Employee entity) {
        return employeeServiceImpl.create(entity);
    }

    @Override
    public Employee update(Long id, Employee entity) throws NonexistentEntityException, Exception {
    return employeeServiceImpl.update(id, entity);
    }

    @Override
    public Employee findById(Long id) {
   return employeeServiceImpl.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeServiceImpl.findAll();
   }

    @Override
    public void disable(Long id) throws NonexistentEntityException, Exception {
        employeeServiceImpl.disable(id);
  }

    @Override
    public void delete(Long id) throws NonexistentEntityException {
        employeeServiceImpl.delete(id);
    }
    
    
}
