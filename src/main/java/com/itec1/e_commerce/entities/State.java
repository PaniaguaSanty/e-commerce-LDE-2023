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
    PENDIENTE("pendiente"),
    EN_PROCESO("en Proceso"),
    COMPLETO ("completo"),
    ESPERANDO_DESPACHO ("esperando despacho"),
    ENVIADO_DESPACHO ("enviado despacho"),
    EN_TRANSITO ("en transito"),
    EN_SUCURSAL_DE_DESTINO ("en sucursal de destino"),
    ENTREGADO ("entregado"),
    CANCELADO ("cancelado"),
    DEVUELTO ("devuelto")
    ;
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
