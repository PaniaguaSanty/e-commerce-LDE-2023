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
import javax.persistence.Table;

/**
 *
 * @author melina
 */
@Entity
@Table(name = "carriers")
public class Carrier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String cuit;
    private String phone;
    private Boolean enable;
    private Boolean ground;
    private Boolean maritime;
    private Boolean aerial;

    public Carrier() {
        this.enable = true;
    }

    public Carrier(String name, String cuit, String phone, Boolean ground, Boolean maritime, Boolean aerial) {
        this();
        this.name = name;
        this.cuit = cuit;
        this.phone = phone;
        this.ground = ground;
        this.maritime = maritime;
        this.aerial = aerial;
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

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Boolean getGround() {
        return ground;
    }

    public void setGround(Boolean ground) {
        this.ground = ground;
    }

    public Boolean getMaritime() {
        return maritime;
    }

    public void setMaritime(Boolean maritime) {
        this.maritime = maritime;
    }

    public Boolean getAerial() {
        return aerial;
    }

    public void setAerial(Boolean aerial) {
        this.aerial = aerial;
    }

    @Override
    public String toString() {
        return "carrier{" + "id=" + id + ", name=" + name + ", cuit=" + cuit + ", phone=" + phone + ", enabled=" + enable + ", ground=" + ground + ", maritime=" + maritime + ", aerial=" + aerial + '}';
    }

   
    
}
