package com.example.shablon16.controllers;

import com.example.shablon16.entities.Item;
import com.example.shablon16.entities.Order;
import com.example.shablon16.repositories.ItemRepository;
import com.example.shablon16.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ItemRepository itemRepository;

    public void createItem(String name, LocalDate creationDate, double price, Order order) {
        Item item = new Item(name, creationDate, price);
        itemRepository.save(item);
    }
}
