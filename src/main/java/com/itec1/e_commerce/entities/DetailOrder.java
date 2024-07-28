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
import javax.persistence.Table;

/**
 *
 * @author melina
 */
@Entity
@Table(name = "order_details")
public class DetailOrder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer amount;
    private Integer providerQualification;
    
    @ManyToOne
    private Product product;
    
    @ManyToOne
    private Order order;

    public DetailOrder() {
    }

    public DetailOrder(Integer amount, Integer providerQualification, Product product, Order order) {
        this.amount = amount;
        this.providerQualification = providerQualification;
        this.product = product;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "DetailOrder{" + "id=" + id + ", amount=" + amount + ", providerQualification=" + providerQualification + ", pruduct=" + product + ", order=" + order + '}';
    }

    

    


}
