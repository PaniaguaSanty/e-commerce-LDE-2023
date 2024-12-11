package com.itec1.e_commerce.services;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.dao.ClientJpaController;
import com.itec1.e_commerce.dao.DetailOrderJpaController;
import com.itec1.e_commerce.dao.InvoiceJpaController;
import com.itec1.e_commerce.dao.OrderJpaController;
import com.itec1.e_commerce.dao.ProductJpaController;
import com.itec1.e_commerce.dao.TrackingOrderJpaController;
import com.itec1.e_commerce.dao.WarehouseJpaController;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.DetailOrder;
import com.itec1.e_commerce.entities.Invoice;
import com.itec1.e_commerce.entities.Order;

import com.itec1.e_commerce.entities.Sector;
import com.itec1.e_commerce.entities.State;
import com.itec1.e_commerce.entities.TrackingOrder;
import com.itec1.e_commerce.entities.Warehouse;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;


import java.util.List;
import java.util.Map;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author melina
 */
public class OrderServiceImpl {

    private final ClientJpaController clientJpaController;
    private final WarehouseJpaController warehouseJpaController;
    private final DetailOrderJpaController detailOrderJpaController;
    private final ProductJpaController productJpaController;
    private final TrackingOrderJpaController trackingOrderJpaController;
    private final OrderJpaController orderJpaController;
    private final InvoiceJpaController invoiceJpaController;
    private final  SectorServiceImpl sectorServiceImpl;
    private final State[] states = State.values();
    private ProductServiceImpl productServiceImpl;


   


    public OrderServiceImpl() {
        this.clientJpaController = new ClientJpaController(Connection.getEmf());
        this.warehouseJpaController = new WarehouseJpaController(Connection.getEmf());
        this.detailOrderJpaController = new DetailOrderJpaController(Connection.getEmf());
        this.productJpaController = new ProductJpaController(Connection.getEmf());
        this.trackingOrderJpaController = new TrackingOrderJpaController(Connection.getEmf());
        this.orderJpaController = new OrderJpaController(Connection.getEmf());
        this.invoiceJpaController = new InvoiceJpaController(Connection.getEmf());
        this.sectorServiceImpl = new SectorServiceImpl();
    }

    public OrderServiceImpl(OrderJpaController orderJpaController,
            DetailOrderJpaController detailOrderJpaController,
            TrackingOrderJpaController trackingOrderJpaController,
            InvoiceJpaController invoiceJpaController,
                            SectorServiceImpl sectorService) {
        this.orderJpaController = orderJpaController;
        this.productServiceImpl = new ProductServiceImpl();
        this.detailOrderJpaController = detailOrderJpaController;
        this.clientJpaController = new ClientJpaController(Connection.getEmf());
        this.warehouseJpaController = new WarehouseJpaController(Connection.getEmf());
        this.productJpaController = new ProductJpaController(Connection.getEmf());
        this.trackingOrderJpaController = trackingOrderJpaController;
        this.invoiceJpaController = invoiceJpaController;

        this.sectorServiceImpl = sectorService;

    }

   public Order createOrder(Order entity) throws Exception {
        String code = String.valueOf(entity.getWarehouseOrigin().getCode().charAt(0));
        code += entity.getWarehouseOrigin().getCode().charAt(1);
        code += entity.getWarehouseDestiny().getCode().charAt(0);
        code += entity.getWarehouseDestiny().getCode().charAt(1);
        code += findAll().size() + 1;
        if (6 > code.length()) {
            code = 0 + code;
        }
        entity.setCode(code);
        Sector sector = sectorServiceImpl.findSectorByWarehouse(entity.getWarehouseOrigin()).get(0);
        entity.setSector(sector);
        orderJpaController.create(entity);
        generateTracking(entity, entity.getWarehouseOrigin().getLatitude(), entity.getWarehouseOrigin().getLongitude(), states[0]);
        return orderJpaController.findOrder(entity.getId());
    }

    public Order findById(Long id) {
        return orderJpaController.findOrder(id);
    }

    public List<Order> findAll() {
        return orderJpaController.findOrderEntities();
    }

    public List<Order> findOrdersByClient(Client orderByClient) {
        return findAll().stream().filter(order -> order.getClient().getId()
                .equals(orderByClient.getId())).toList();
    }

    public List<Order> findOrdersBySector(Sector orderBySector) {
        return findAll().stream().filter(order -> order.getSector().getId()
                .equals(orderBySector.getId())).toList();
    }

    public Order findByCode(String code) {
        return findAll().stream().filter(order -> order.getCode()
                .equals(code)).findFirst().orElse(null);
    }

    public List<Order> findOrdersByWarehouse(Warehouse orderByWarehouse) {
        return findAll().stream().filter(order -> order.getSector().getWarehouse().getId()
                .equals(orderByWarehouse.getId())).toList();
    }

    public List<DetailOrder> viewDetailOfOrder(Order order) {
        return detailOrderJpaController.findDetailOrderEntities().stream().
                filter(detail -> detail.getOrder().equals(order)).toList();
    }

     public TrackingOrder createTrackingOrder(TrackingOrder entity) {
        trackingOrderJpaController.create(entity);
        return trackingOrderJpaController.findTrackingOrder(entity.getId());
    }

    public List<TrackingOrder> findByOrder(Order order) {
      
        return trackingOrderJpaController.findTrackingOrderEntities().stream()
                .filter(trackingOrder -> trackingOrder.getOrder().getId().equals(order.getId()))
                .collect(Collectors.toList());
    }

    public TrackingOrder generateTracking(Order order, String latitude, String longitude, State state) {
        TrackingOrder tracking = new TrackingOrder();
        tracking.setOrder(order);
        tracking.setLatitude(latitude);
        tracking.setLongitude(longitude);
        tracking.setState(state);
        tracking.setDate(new GregorianCalendar());
        return createTrackingOrder(tracking);
    }

    public TrackingOrder changeOrderState(Order order) {
        int nextState = findByOrder(order).size();
        if (nextState < 7) {
            return generateTracking(order, order.getWarehouseOrigin().getLatitude(),
                    order.getWarehouseOrigin().getLongitude(), states[nextState]);
        } else {
            return generateTracking(order, order.getWarehouseDestiny().getLatitude(),
                    order.getWarehouseDestiny().getLongitude(), states[nextState]);
        }
    }

    public Order changeSector(Order order, Sector sector) throws Exception {
        order.setSector(sector);
        orderJpaController.edit(order);
        return orderJpaController.findOrder(order.getId());
    }

    public void putOrderInTransit(Order order, String latitude, String longitude) {
        generateTracking(order, latitude, longitude, State.IN_TRANSIT);
    }

    public TrackingOrder cancelOrder(Order order) throws Exception {
      return   generateTracking(order,
                order.getWarehouseOrigin().getLatitude(),
                order.getWarehouseOrigin().getLongitude(),
                State.CANCELED);
      }

    public void returnOrder(Order order) throws Exception {
        generateTracking(order,
                order.getWarehouseDestiny().getLatitude(),
                order.getWarehouseDestiny().getLongitude(),
                State.RETURNED);
     }

    public Invoice createInvoice(Invoice invoice) {
        invoiceJpaController.create(invoice);
        return invoiceJpaController.findInvoice(invoice.getId());
    }

    public void addDetail(Order order, List<DetailOrder> details) {
        details.forEach(detail -> {
            detail.setOrder(orderJpaController.findOrder(order.getId()));
            detailOrderJpaController.create(detail);
        });
    }

    public void qualifyProvider(DetailOrder detail, int star) throws Exception {
        detail.setProviderQualification(star);
        detailOrderJpaController.edit(detail);
    }

    public void qualifyCarrier(Invoice invoice, int star) throws Exception {
        invoice.setCarrierQualification(star);
        invoiceJpaController.edit(invoice);
    }
    
    public List<DetailOrder> getDetailsByProvider(String cuit){
        List<DetailOrder> details = new ArrayList<>();
        for (DetailOrder detail : detailOrderJpaController.findDetailOrderEntities()) {
            if (detail.getProduct().getProvider().getCuit().equals(cuit)) {
                details.add(detail);
            }
        }
        return details;
    }

    public Integer getTotalProviderScore(String cuit) {
        List<DetailOrder> details = getDetailsByProvider(cuit);
        return details
                .stream()
                .mapToInt(DetailOrder::getProviderQualification)
                .sum();
    }

    public Integer getProviderScoreCount(String cuit) {
        List<DetailOrder> details = getDetailsByProvider(cuit);
        return details.size();
    }

    public Integer getAverageProviderScore(String cuit) {
        if (getProviderScoreCount(cuit) == 0) {
            return 0;
        }
        return getTotalProviderScore(cuit) / getProviderScoreCount(cuit);
    }

    public Map<String, Integer> getTopProductsByProvider(String cuit) {
        List<DetailOrder> details = getDetailsByProvider(cuit);
        Map<String, Integer> result = new HashMap<>();

        // Recorrer las ventas y actualizar el contador para cada producto
        details.stream()
                .map(detail -> detail.getProduct().getName())
                .forEach(name -> {
                    result.put(name, result.getOrDefault(name, 0) + 1);
                });

        // Ordenar el mapa por valor de cada clave y seleccionar los primeros 10 productos
        Map<String, Integer> topTen = result.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        return topTen;
    }

    public List<DetailOrder> getDetailsByOrder(Order order) {
        List<DetailOrder> details = new ArrayList<>();
        for (DetailOrder detail : detailOrderJpaController.findDetailOrderEntities()) {
            if (detail.getOrder().equals(order)) {
                details.add(detail);
            }
        }
        return details;
    }

    public List<TrackingOrder> getTrackingByOrder(Order order) {
        List<TrackingOrder> list = new ArrayList<>();
        for (TrackingOrder trackingOrder : trackingOrderJpaController.findTrackingOrderEntities()) {
            if (trackingOrder.getOrder().equals(order)) {
                list.add(trackingOrder);
            }
        }
        return list;
    }

    public Order findOrderByCode(String code) {
        return orderJpaController.findOrderEntities()
                .stream()
                .filter(order -> order.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
