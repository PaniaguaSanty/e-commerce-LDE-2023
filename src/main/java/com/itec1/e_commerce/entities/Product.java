/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.entities;

import java.io.Serializable;
import java.util.ServiceLoader.Provider;
import javax.persistence.*;

/**
 *
 * @author melina
 */
@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Float weight;
    private Float high;
    private Float width;
    private Float depth;
    private Boolean enabled;
    @ManyToOne
    private ProductCategory productCategory;
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    public Product(Long id, String name, String description, Float weight, Float high, Float width, Float depth, Boolean enabled, ProductCategory productCategory, Provider provider) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.high = high;
        this.width = width;
        this.depth = depth;
        this.enabled = enabled;
        this.productCategory = productCategory;
        this.provider = provider;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getDepth() {
        return depth;
    }

    public void setDepth(Float depth) {
        this.depth = depth;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", description=" + description + ", weight=" + weight + ", high=" + high + ", width=" + width + ", depth=" + depth + ", enabled=" + enabled + ", productCategory=" + productCategory + ", provider=" + provider + '}';
    }

   
    
}
