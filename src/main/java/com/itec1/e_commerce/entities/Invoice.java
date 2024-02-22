/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.entities;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author melina
 */
@Entity
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate emission;
    private Integer carrierQualification;
    @ManyToOne
    private Employee employeeIssuing;
    @ManyToOne
    private Employee employeeReceiving;
    @ManyToOne
    private Carrier carrier;
    @ManyToOne
    private Order order;

    public Invoice(Long id, LocalDate emission, Integer carrierQualification, Employee employeeIssuing, Employee employeeReceiving, Carrier carrier, Order order) {
        this.id = id;
        this.emission = emission;
        this.carrierQualification = carrierQualification;
        this.employeeIssuing = employeeIssuing;
        this.employeeReceiving = employeeReceiving;
        this.carrier = carrier;
        this.order = order;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getEmission() {
        return emission;
    }

    public void setEmission(LocalDate emission) {
        this.emission = emission;
    }

    public Integer getCarrierQualification() {
        return carrierQualification;
    }

    public void setCarrierQualification(Integer carrierQualification) {
        this.carrierQualification = carrierQualification;
    }

    public Employee getEmployeeIssuing() {
        return employeeIssuing;
    }

    public void setEmployeeIssuing(Employee employeeIssuing) {
        this.employeeIssuing = employeeIssuing;
    }

    public Employee getEmployeeReceiving() {
        return employeeReceiving;
    }

    public void setEmployeeReceiving(Employee employeeReceiving) {
        this.employeeReceiving = employeeReceiving;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", emission=" + emission + ", carrierQualification=" + carrierQualification + ", employeeIssuing=" + employeeIssuing + ", employeeReceiving=" + employeeReceiving + ", carrier=" + carrier + ", order=" + order + '}';
    }

   
}
