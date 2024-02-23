/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author melina
 */
@Entity
@Table(name = "orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Client client;
    
    @Enumerated(EnumType.STRING) 
    @JoinColumn(name = "state")
    private State state;
    
    @ManyToOne
    private Warehouse warehouseOrigin;
    
    @ManyToOne
    private Warehouse warehouseDestiny;
    
    @ManyToOne
    @JoinColumn(name = "sector_id")
    private Sector sector;

    public Order() {
    }

    public Order(Client client, State state, Warehouse warehouseOrigin, Warehouse warehouseDestiny, Sector sector) {
        this.client = client;
        this.state = state;
        this.warehouseOrigin = warehouseOrigin;
        this.warehouseDestiny = warehouseDestiny;
        this.sector = sector;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Warehouse getWarehouseOrigin() {
        return warehouseOrigin;
    }

    public void setWarehouseOrigin(Warehouse warehouseOrigin) {
        this.warehouseOrigin = warehouseOrigin;
    }

    public Warehouse getWarehouseDestiny() {
        return warehouseDestiny;
    }

    public void setWarehouseDestiny(Warehouse warehouseDestiny) {
        this.warehouseDestiny = warehouseDestiny;
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
        if (!(object instanceof Order)) {
            return false;
        }
        Order other = (Order) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", client=" + client + ", state=" + state + ", warehouseOrigin=" + warehouseOrigin + ", warehouseDestiny=" + warehouseDestiny + '}';
    }

    
}
