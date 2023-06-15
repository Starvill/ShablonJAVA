package com.example.pr14;

import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ItemController {
    private List<Item> items = new ArrayList<Item>();

    public void createItem(String name, LocalDate creationDate, double price) {
        Item item = new Item(name, creationDate, price);
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }

    public List<Item> getAllItems() {
        return items;
    }
}