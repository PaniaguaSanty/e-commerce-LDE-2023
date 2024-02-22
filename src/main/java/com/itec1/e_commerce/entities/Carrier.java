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

/**
 *
 * @author melina
 */
@Entity
public class Carrier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String cuit;
    private String phone;
    private Boolean enabled;
    private Boolean ground;
    private Boolean maritime;
    private Boolean aerial;

    public Carrier(Long id, String name, String cuit, String phone, Boolean enabled, Boolean ground, Boolean maritime, Boolean aerial) {
        this.id = id;
        this.name = name;
        this.cuit = cuit;
        this.phone = phone;
        this.enabled = enabled;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrier)) {
            return false;
        }
        Carrier other = (Carrier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carrier{" + "id=" + id + ", name=" + name + ", cuit=" + cuit + ", phone=" + phone + ", enabled=" + enabled + ", ground=" + ground + ", maritime=" + maritime + ", aerial=" + aerial + '}';
    }

   
    
}
