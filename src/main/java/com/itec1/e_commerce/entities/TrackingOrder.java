/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.entities;

import java.io.Serializable;
import java.util.GregorianCalendar;
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
@Table(name = "tracking_orders")
public class TrackingOrder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private GregorianCalendar registDate;
    private String latitude;
    private String longitude;
    private State stateOrder;
    
    @ManyToOne
    private Order order;
    
    public TrackingOrder() {
    }

    public TrackingOrder(String latitude, String longitude, Order order, State state) {
        this.registDate = new GregorianCalendar();
        this.latitude = latitude;
        this.longitude = longitude;
        this.order = order;
        this.stateOrder = state;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public GregorianCalendar getDate() {
        return registDate;
    }

    public void setDate(GregorianCalendar date) {
        this.registDate = date;
    }

    public State getState() {
        return stateOrder;
    }

    public void setState(State state) {
        this.stateOrder = state;
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
        if (!(object instanceof TrackingOrder)) {
            return false;
        }
        TrackingOrder other = (TrackingOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

   
    
}
