/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.itec1.e_commerce.entities;

import java.io.Serializable;

/**
 *
 * @author melina
 */
public enum State implements Serializable {
    PENDING("Pending"),
    IN_PROCESS("In Process"),
    COMPLETE("Complete"),
    WAITING_DISPATCH("Waiting Dispatch"),
    DISPATCHED("Dispatched"),
    IN_TRANSIT("In Transit"),
    AT_DESTINATION("At Destination"),
    DELIVERED("Delivered"),
    CANCELED("Canceled"),
    RETURNED("Returned");
    
    private String name;

    private State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
