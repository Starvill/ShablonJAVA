package com.example.shablon16.service;
import com.example.shablon16.entities.Item;
import com.example.shablon16.entities.Order;
import com.example.shablon16.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public Item createAndReturnItem(String name, LocalDate creationDate, double price) {
        Item item = new Item(name, creationDate, price);
        itemRepository.save(item);
        return item;
    }
}
