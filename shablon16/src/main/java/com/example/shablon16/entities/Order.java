package com.example.shablon16.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order")
public class Order {
    @Id
    private String orderName;

    private LocalDate orderDate;

    public Order(String orderName, LocalDate orderDate) {
        this.orderDate = orderDate;
        this.orderName = orderName;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "order")
    private List<Item> items = new ArrayList<>();

    public Order(){}

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getOrderName() {
        return orderName;
    }

}
