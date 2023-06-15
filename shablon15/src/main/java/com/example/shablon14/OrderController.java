package com.example.shablon14;

import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OrderController {
    UserDao userDao = new UserDao();
    private List<Order> orders = new ArrayList<Order>();

    public void createLevel(LocalDate orderDate, String orderName) {
        Order order = new Order(orderName, orderDate);
        User user1 = new User();
        user1.setName(String.valueOf(orderName));
        userDao.addUser(user1);
//        levels.add(level);
    }

    public void deleteOrder(Order order) {
        orders.remove(order);
    }
    public void deleteOrder2(int a) {
        System.out.println(a);
        User userToDelete = userDao.getUserById(a); // Получить объект User, который нужно удалить
        userDao.delete(userToDelete);
    }
    public List<Order> getAllOrders() {
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getId());
        }
        return orders;
    }
}