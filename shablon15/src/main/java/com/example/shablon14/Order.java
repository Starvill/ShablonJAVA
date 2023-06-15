package com.example.shablon14;

import java.time.LocalDate;

public class Order {
    private LocalDate orderDate;

    private String orderName;

    public Order(String orderName, LocalDate orderDate) {
        this.orderDate = orderDate;
        this.orderName = orderName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getOrderName() {
        return orderName;
    }
}