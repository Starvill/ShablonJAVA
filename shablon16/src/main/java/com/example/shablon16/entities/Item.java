package com.example.shablon16.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "items")
public class Item {
    @Id
    private String name;
    private LocalDate creationDate;
    private double price;

    public Item(String name, LocalDate creationDate, double price) {
        this.name = name;
        this.creationDate = creationDate;
        this.price = price;
    }

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn
    private Order order;
    public Item(){}

    public String getItemName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public double getPrice() {
        return price;
    }
}
