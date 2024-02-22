/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.entities;

import java.io.Serializable;
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
public class DetailOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer amount;
    private Integer providerQualification;
    @ManyToOne
    private Product pruduct;
    @ManyToOne
    private Order order;

    public DetailOrder(Long id, Integer amount, Integer providerQualification, Product pruduct, Order order) {
        this.id = id;
        this.amount = amount;
        this.providerQualification = providerQualification;
        this.pruduct = pruduct;
        this.order = order;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getProviderQualification() {
        return providerQualification;
    }

    public void setProviderQualification(Integer providerQualification) {
        this.providerQualification = providerQualification;
    }

    public Product getPruduct() {
        return pruduct;
    }

    public void setPruduct(Product pruduct) {
        this.pruduct = pruduct;
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
        if (!(object instanceof DetailOrder)) {
            return false;
        }
        DetailOrder other = (DetailOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetailOrder{" + "id=" + id + ", amount=" + amount + ", providerQualification=" + providerQualification + ", pruduct=" + pruduct + ", order=" + order + '}';
    }

    


}
