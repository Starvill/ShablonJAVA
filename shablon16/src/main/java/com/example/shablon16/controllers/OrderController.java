package com.example.shablon16.controllers;

import com.example.shablon16.entities.Order;
import com.example.shablon16.repositories.ItemRepository;
import com.example.shablon16.repositories.OrderRepository;
import com.example.shablon16.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class OrderController {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public String getOrdersInfo(Model model) {
        orderService.createTestOrder();
        model.addAttribute("orders", orderRepository.findAll());
        return "orders";
    }

}
