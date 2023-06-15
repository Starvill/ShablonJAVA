package com.example.pr14;

import org.springframework.stereotype.Controller;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {

    private List<Order> orders = new ArrayList<Order>();

    public void createOrder(LocalDate orderDate) {
        Order order = new Order(orderDate);
        orders.add(order);
    }

    public void deleteOrder(Order level) {
        orders.remove(level);
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
