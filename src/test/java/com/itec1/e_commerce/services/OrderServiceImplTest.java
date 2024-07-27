package com.itec1.e_commerce.services;

import com.itec1.e_commerce.dao.DetailOrderJpaController;
import com.itec1.e_commerce.dao.InvoiceJpaController;
import com.itec1.e_commerce.dao.OrderJpaController;
import com.itec1.e_commerce.dao.TrackingOrderJpaController;
import com.itec1.e_commerce.entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;


@ExtendWith(MockitoExtension.class)
class OrderServiceImplTest {

    @Mock
    private OrderJpaController orderJpa;
    @Mock
    private DetailOrderJpaController detailJpa;
    @Mock
    private TrackingOrderJpaController trackingJpa;
    @Mock
    private InvoiceJpaController invoiceJpa;
    private SectorServiceImpl sectorService;
    private OrderServiceImpl service;



    private List<Order> orderList;
    private List<DetailOrder> detailList;
    private List<TrackingOrder> trackingList;




    @BeforeEach
    void setUp() {
        service = new OrderServiceImpl(orderJpa, detailJpa, trackingJpa,invoiceJpa);
        sectorService = new SectorServiceImpl();
        orderList = new ArrayList<>();
        this.orderTest();
        detailList = new ArrayList<>();
        this.detailTest();
        trackingList = new ArrayList<>();
        this.trackingTest();


    }

    @Test
    void testCreateOrder() throws Exception {
        Order expected = orderList.get(0);
        Mockito.when(orderJpa.findOrder(expected.getId())).thenReturn(expected);
        Order result = service.createOrder(expected);
        assertEquals(expected, result);
    }

    @Test
    void testFindOrderById() {
        Order expected = orderList.get(0);
        Mockito.when(orderJpa.findOrder(expected.getId())).thenReturn(expected);
        Order result = service.findById(expected.getId());
        assertEquals(expected.getId(), result.getId());

    }

    @Test
    void testFindAllOrders() {
        List<Order> expectedOrders = orderList;
        Mockito.when(orderJpa.findOrderEntities()).thenReturn(expectedOrders);
        List<Order> ordersResults = service.findAll();
        assertEquals(expectedOrders.get(0).getCode(), ordersResults.get(0).getCode());
        assertEquals(expectedOrders.size(), ordersResults.size());
    }

    @Test
    void testFindOrdersByClient() {
        List<Order> expectedOrders = orderList;
        Mockito.when(orderJpa.findOrderEntities()).thenReturn(expectedOrders);
        List<Order> ordersResults = service.findOrdersByClient(orderList.get(0).getClient());
        assertEquals(expectedOrders.get(0).getClient().getId(), ordersResults.get(0).getClient().getId());
    }

    @Test
    void testFindOrdersBySector() {
        List<Order> expectedOrders = orderList;
        Mockito.when(orderJpa.findOrderEntities()).thenReturn(expectedOrders);
        List<Order> ordersResult = service.findOrdersBySector(orderList.get(0).getSector());
        assertEquals(expectedOrders.get(0).getSector().getId(), ordersResult.get(0).getSector().getId());
    }

    @Test
    void testFindOrdersByWarehouse() {
        List<Order> expectedOrders = orderList;
        Mockito.when(orderJpa.findOrderEntities()).thenReturn(expectedOrders);
        List<Order> ordersResult = service.findOrdersByWarehouse(orderList.get(0).getSector().getWarehouse());
        assertEquals(expectedOrders.get(0).getSector().getWarehouse(), ordersResult.get(0).getSector().getWarehouse());

    }

    @Test
    void testViewDetailOfOrder() {
        List<DetailOrder> expected = detailList;
        Mockito.when(detailJpa.findDetailOrderEntities()).thenReturn(expected);
        List<DetailOrder> result = service.viewDetailOfOrder(expected.get(0).getOrder());
        assertEquals(expected.size(), 1);
        assertEquals(expected.get(0).getOrder().getId(), result.get(0).getOrder().getId());
    }

    @Test
    void createTrackingOrder() {
        TrackingOrder expected = trackingList.get(0);
        Mockito.when(trackingJpa.findTrackingOrder(expected.getId())).thenReturn(expected);
        TrackingOrder result = service.createTrackingOrder(expected);
        assertEquals(expected.getId(), result.getId());
    }

    @Test
    void testFindByOrder() {
        List<TrackingOrder> trackingExpected = trackingList;
        Mockito.when(trackingJpa.findTrackingOrderEntities()).thenReturn(trackingExpected);
        List<TrackingOrder> trackingResult = service.findByOrder(trackingExpected.get(0).getOrder());
        assertEquals(trackingExpected.get(0).getOrder(), trackingResult.get(0).getOrder());
        assertNotEquals(trackingExpected.size(), 1);
    }

    @Test
    void testgenerateTracking() {
        TrackingOrder expected = trackingList.get(0);
        service.generateTracking(expected.getOrder(), expected.getLatitude(), expected.getLongitude(), expected.getState());
        assertNotNull(expected);
        TrackingOrder updated = trackingList.get(0);
        assertEquals(State.PENDING, updated.getState());
    }


    @Test
    void testChangeOrderState() {
     Order expected = orderList.get(0);
     OrderServiceImpl service1 = Mockito.spy(service);
    service1.changeOrderState(expected);
    Mockito.verify(service1).findByOrder(expected);
    }

    @Test
    void testChangeSector() throws Exception {
        Order expected = orderList.get(0);
        expected.setSector(new Sector());
        Mockito.doNothing().when(orderJpa).edit(expected);
        Mockito.when(orderJpa.findOrder(expected.getId())).thenReturn(expected);
        Order result = service.changeSector(expected, expected.getSector());
        assertEquals(expected.getSector().getName(), result.getSector().getName());
    }

    @Test
    void testPutOrderInTransit() {
       Order expected = orderList.get(0);
       String latitude = "111";
       String longitude ="222";
       OrderServiceImpl service1 = Mockito.spy(service);
      service1.putOrderInTransit(expected,latitude,longitude);
       Mockito.verify(service1).generateTracking(expected,latitude,longitude,State.IN_TRANSIT);
     }

    @Test
    void testCancelOrder() throws Exception {
     }

    @Test
    void testreturnOrder() {
    }

    @Test
    void testCreateInvoice() {
        Invoice expected = new Invoice();
        expected.setId(1L);
        Mockito.when(invoiceJpa.findInvoice(expected.getId())).thenReturn(expected);
        Invoice result = service.createInvoice(expected);
        assertEquals(expected,result);
    }

    @Test
    void testAddDetail() {
        Order expected = orderList.get(0);
        List<DetailOrder>details = detailList;
        service.addDetail(expected,details);
        Mockito.verify(orderJpa).findOrder(expected.getId());
        Mockito.verify(detailJpa).create(any());
    }

    @Test
    void testQualifyProvider() throws Exception {
        DetailOrder expected = detailList.get(0);
        int star = 1;
        OrderServiceImpl service1 = Mockito.spy(service);
        service1.qualifyProvider(expected,star);
        Mockito.verify(detailJpa).edit(expected);
    }

    @Test
    void testQualifyCarrier() throws Exception {
        Invoice expected = new Invoice();
        int star = 5;
        OrderServiceImpl service1 = Mockito.spy(service);
        service1.qualifyCarrier(expected,star);
        Mockito.verify(invoiceJpa).edit(expected);
    }

    private void orderTest() {
        Client client = new Client();
        client.setId(1L);
        Warehouse warehouse1 = new Warehouse();
        warehouse1.setId(1L);

        Warehouse warehouse2 = new Warehouse();
        warehouse2.setId(2L);

        Sector sector = new Sector();
        sector.setId(1L);
        sector.setWarehouse(warehouse1);
        Order order1 = new Order(client, warehouse1, warehouse2, sector, "1111");
        order1.setId(1L);
        orderList.add(order1);
    }

    private void detailTest() {
        Order order = new Order();
        DetailOrder detailOrder = new DetailOrder();
        detailOrder.setOrder(order);
        detailList.add(detailOrder);
    }

    private void trackingTest() {
        TrackingOrder trackingOrder = new TrackingOrder();
        Order order = new Order();
        order.setId(1L);
        order.setWarehouseOrigin(new Warehouse());
        order.setWarehouseDestiny(new Warehouse());
        order.setSector(new Sector());
        trackingOrder.setOrder(order);
        trackingOrder.setLatitude("11");
        trackingOrder.setLongitude("22");
        trackingOrder.setState(State.PENDING);
        trackingList.add(trackingOrder);
        TrackingOrder trackingOrder1 = new TrackingOrder();
        Order order1 = new Order();
        order1.setId(2L);
        trackingOrder1.setOrder(order1);
        trackingList.add(trackingOrder1);
    }


}