package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.EmployeeJpaController;
import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import com.itec1.e_commerce.entities.Employee;
import com.itec1.e_commerce.entities.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

    @Mock
    private EmployeeJpaController employeeJpa;

    private EmployeeServiceImpl employeeService;
    private List<Employee> employees;


    @BeforeEach
    void setUp() {
        employeeService = new EmployeeServiceImpl(employeeJpa);
        employees = new ArrayList<>();
        employeeList();


    }


    @Test
    void testCreateEmployee() {
        Mockito.doNothing().when(employeeJpa).create(any());
        employeeService.create(any());
        verify(employeeJpa).create(any());
    }

    @Test
    void update() throws Exception {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Melina");
        employee.setLastname("gamarra");
        employee.setEmail("email");
        employee.setAddress("address");
        employee.setPhone("phone");
        when(employeeJpa.findEmployee(anyLong())).thenReturn(employee);
        final Employee result = employeeService.update(employee().getId(), employee);
        verify(employeeJpa).edit(any());
        assertEquals(employee.getName(), result.getName());
    }

    @Test
    void findById() {

        Mockito.when(employeeJpa.findEmployee(employee().getId())).thenReturn(employee());
        final Employee result = employeeService.findById(employee().getId());
        assertEquals(employee(), result);

    }

    @Test
    void findAll() {
        Mockito.when(employeeJpa.findEmployeeEntities()).thenReturn(employees);
        final List<Employee> result = employeeService.findAll();
        assertEquals(employees, result);
    }

    @Test
    void disable() throws Exception {
        Employee employee = employee();
        when(employeeJpa.findEmployee(employee.getId())).thenReturn(employee);
        employeeService.disable(employee.getId());
        assertFalse(employee.isEnable());
    }


    @Test
    void enable() throws Exception {

        when(employeeJpa.findEmployee(employee().getId())).thenReturn(employee());
        employeeService.enable(employee().getId());
        assertTrue(employee().isEnable());
    }

    @Test
    void findByCuit() {
        employeeList();
        when(employeeJpa.findEmployeeEntities()).thenReturn(employees);
        Employee result = employeeService.findByCuit("cuit");
        assertNotNull(result);
        assertEquals(employees.get(0), result);
    }

    @Test
    void testsearchEmployedByWarehouse() {
        when(employeeJpa.findEmployeeEntities()).thenReturn(employees);
        List<Employee> result = employeeService.searchByWarehouse("1111");
        assertEquals(2, result.size());
    }

    @Test
    void testDeleteEmployee() throws NonexistentEntityException {
        when(employeeJpa.findEmployee(anyLong())).thenReturn(employees.get(0));
        employeeService.delete(employees.get(0).getId());
        verify(employeeJpa).destroy(employees.get(0).getId());
        assertEquals(employeeService.delete(employees.get(0).getId()),employees.get(0));
    }

    @Test
    void relocateEmployee() throws Exception {
        Warehouse newWarehouse = new Warehouse("address", "country", "latitude", "longitude", "code");
        when(employeeJpa.findEmployeeEntities()).thenReturn(employees);
        Employee result = employeeService.relocateEmployee(employees.get(0).getCuit(), newWarehouse);
        verify(employeeJpa).edit(any());
        assertEquals(newWarehouse.getCode(), result.getWarehouse().getCode());
    }


    private Employee employee() {
        Warehouse warehouse = new Warehouse();
        Employee employee = new Employee("nombre", "apellido", "address", "cuit", "email", "phone", warehouse);
        employee.setId(1L);
        return employee;
    }

    private void employeeList() {
        Warehouse warehouse = new Warehouse();
        warehouse.setCode("1111");
        // Primer empleado
        Employee e1 = new Employee("melina", "gamarra", "dirrecion", "cuit", "email", "phone", warehouse);
       e1.setId(1L);
        employees.add(e1);

        // Segundo empleado
        Employee e2 = new Employee("Juan", "Perez", "Calle 123", "123456789", "juan@example.com", "555-1234", warehouse);
        e2.setId(2L);
        employees.add(e2);


    }


}
