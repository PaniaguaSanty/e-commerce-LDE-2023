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
    public class Conexion {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public Conexion() {
        Conexion.conectar();
    }

    public static void conectar() {
        if (em == null) {
            Conexion.emf = Persistence.createEntityManagerFactory(
                    "ecommerce_PU");
            Conexion.em = Conexion.emf.createEntityManager();
        }
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void setEmf(EntityManagerFactory emf) {
        Conexion.emf = emf;
    }

    public static EntityManager getEm() {
        return em;
    }

    public static void setEm(EntityManager em) {
        Conexion.em = em;
    }

}

    
}
