/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.dao;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.itec1.e_commerce.entities.Order;
import com.itec1.e_commerce.entities.Sector;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author turraca
 */
public class SectorJpaController implements Serializable {

    public SectorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sector sector) {
        if (sector.getOrders() == null) {
            sector.setOrders(new ArrayList<Order>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Order> attachedOrders = new ArrayList<Order>();
            for (Order ordersOrderToAttach : sector.getOrders()) {
                ordersOrderToAttach = em.getReference(ordersOrderToAttach.getClass(), ordersOrderToAttach.getId());
                attachedOrders.add(ordersOrderToAttach);
            }
            sector.setOrders(attachedOrders);
            em.persist(sector);
            for (Order ordersOrder : sector.getOrders()) {
                Sector oldSectorOfOrdersOrder = ordersOrder.getSector();
                ordersOrder.setSector(sector);
                ordersOrder = em.merge(ordersOrder);
                if (oldSectorOfOrdersOrder != null) {
                    oldSectorOfOrdersOrder.getOrders().remove(ordersOrder);
                    oldSectorOfOrdersOrder = em.merge(oldSectorOfOrdersOrder);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sector sector) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sector persistentSector = em.find(Sector.class, sector.getId());
            List<Order> ordersOld = persistentSector.getOrders();
            List<Order> ordersNew = sector.getOrders();
            List<Order> attachedOrdersNew = new ArrayList<Order>();
            for (Order ordersNewOrderToAttach : ordersNew) {
                ordersNewOrderToAttach = em.getReference(ordersNewOrderToAttach.getClass(), ordersNewOrderToAttach.getId());
                attachedOrdersNew.add(ordersNewOrderToAttach);
            }
            ordersNew = attachedOrdersNew;
            sector.setOrders(ordersNew);
            sector = em.merge(sector);
            for (Order ordersOldOrder : ordersOld) {
                if (!ordersNew.contains(ordersOldOrder)) {
                    ordersOldOrder.setSector(null);
                    ordersOldOrder = em.merge(ordersOldOrder);
                }
            }
            for (Order ordersNewOrder : ordersNew) {
                if (!ordersOld.contains(ordersNewOrder)) {
                    Sector oldSectorOfOrdersNewOrder = ordersNewOrder.getSector();
                    ordersNewOrder.setSector(sector);
                    ordersNewOrder = em.merge(ordersNewOrder);
                    if (oldSectorOfOrdersNewOrder != null && !oldSectorOfOrdersNewOrder.equals(sector)) {
                        oldSectorOfOrdersNewOrder.getOrders().remove(ordersNewOrder);
                        oldSectorOfOrdersNewOrder = em.merge(oldSectorOfOrdersNewOrder);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = sector.getId();
                if (findSector(id) == null) {
                    throw new NonexistentEntityException("The sector with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sector sector;
            try {
                sector = em.getReference(Sector.class, id);
                sector.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sector with id " + id + " no longer exists.", enfe);
            }
            List<Order> orders = sector.getOrders();
            for (Order ordersOrder : orders) {
                ordersOrder.setSector(null);
                ordersOrder = em.merge(ordersOrder);
            }
            em.remove(sector);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sector> findSectorEntities() {
        return findSectorEntities(true, -1, -1);
    }

    public List<Sector> findSectorEntities(int maxResults, int firstResult) {
        return findSectorEntities(false, maxResults, firstResult);
    }

    private List<Sector> findSectorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sector.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Sector findSector(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sector.class, id);
        } finally {
            em.close();
        }
    }

    public int getSectorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sector> rt = cq.from(Sector.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
