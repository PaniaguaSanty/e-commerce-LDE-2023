/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author melina
 */
public class connection {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public connection() {
        connection.conectar();
    }

    public static void conectar() {
        if (em == null) {
            connection.emf = Persistence.createEntityManagerFactory(
                    "ecommerce_PU");
            connection.em = connection.emf.createEntityManager();
        }
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void setEmf(EntityManagerFactory emf) {
        connection.emf = emf;
    }

    public static EntityManager getEm() {
        return em;
    }

    public static void setEm(EntityManager em) {
        connection.em = em;
    }
}
