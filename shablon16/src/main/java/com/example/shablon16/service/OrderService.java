package com.example.shablon16.service;
import com.example.shablon16.entities.Item;
import com.example.shablon16.entities.Order;
import com.example.shablon16.repositories.ItemRepository;
import com.example.shablon16.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ItemService itemService;

    public void createOrder(String name, LocalDate creationDate) {
        Order order = new Order(name, creationDate);
        orderRepository.save(order);
    }

    public void createTestOrder() {
        Order order = new Order("firstOrder", LocalDate.now());
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        item1 = itemService.createAndReturnItem("firstItem", LocalDate.now(), 1);
        item2 = itemService.createAndReturnItem("secondItem", LocalDate.now(), 2);
        item3 = itemService.createAndReturnItem("thirdItem", LocalDate.now(), 3);
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        order.setItems(items);
        orderRepository.save(order);
    }
}
