package org.example.ordermanagementspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testCreateOrder() {
        Order order = new Order();
        order.setCustomerName("John Doe");
        order.setStatus("Pending");
        Order savedOrder = orderService.createOrder(order);
        assertNotNull(savedOrder);
        assertEquals("John Doe", savedOrder.getCustomerName());
    }

    @Test
    public void testGetAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        assertNotNull(orders);
    }

    @Test
    public void testUpdateOrder() {
        Order order = new Order();
        order.setCustomerName("John Doe");
        order.setStatus("Pending");
        Order savedOrder = orderService.createOrder(order);
        savedOrder.setCustomerName("Jane Doe");
        Order updatedOrder = orderService.updateOrder(savedOrder.getId(), savedOrder);
        assertEquals("Jane Doe", updatedOrder.getCustomerName());
    }

    @Test
    public void testDeleteOrder() {
        Order order = new Order();
        order.setCustomerName("John Doe");
        order.setStatus("Pending");
        Order savedOrder = orderService.createOrder(order);
        orderService.deleteOrder(savedOrder.getId());
        assertThrows(RuntimeException.class, () -> orderService.updateOrder(savedOrder.getId(), savedOrder));
    }
}
