/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author melina
 */
public class Connection {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public Connection() {
        Connection.conectar();
    }

    public static void conectar() {
        if (em == null) {
            Connection.emf = Persistence.createEntityManagerFactory(
                    "ecommerce_PU");
            Connection.em = Connection.emf.createEntityManager();
        }
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void setEmf(EntityManagerFactory emf) {
        Connection.emf = emf;
    }

    public static EntityManager getEm() {
        return em;
    }

    public static void setEm(EntityManager em) {
        Connection.em = em;
    }
}
