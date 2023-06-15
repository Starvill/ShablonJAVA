package com.example.shablon14;

import java.time.LocalDate;

public class Item {
    private String name;
    private LocalDate creationDate;
    private double price;

    public Item(String name, LocalDate creationDate, double price) {
        this.name = name;
        this.creationDate = creationDate;
        this.price = price;
    }

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