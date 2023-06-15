package com.example.pr14;

import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import java.time.LocalDate;
import java.util.Scanner;


public class Pr14Application {

	public static void main(String[] args) {
		OrderController orderController = new OrderController();
		ItemController itemController = new ItemController();
		System.out.println("Welcome! \n" +
				" Choose what you want to do:\n" +
				"1)Creation \n" +
				"2)Removal\n" +
				"3)Output all");
		Scanner keyboard = new Scanner(System.in);
		while (true){
			System.out.println("\nEnter: ");
			int myint = keyboard.nextInt();
			switch (myint) {
				case 1:
					System.out.println("1)Item \n2)Order");
					System.out.println("\nEnter: ");
					int myint5 = keyboard.nextInt();
					if (myint5 == 1){
						System.out.println("Enter the name of the item: ");
						Scanner keyboard2 = new Scanner(System.in);
						String str = keyboard2.nextLine();
						itemController.createItem(str, LocalDate.now(), 0);
						itemController.createItem(str, LocalDate.now(), 0);
					}
					else{
						System.out.println("Enter the name of the game: ");
						Scanner keyboard23 = new Scanner(System.in);
						String str2 = keyboard23.nextLine();
						orderController.createOrder(LocalDate.now());
						orderController.createOrder(LocalDate.now());
					}
					break;
				case 2:
					System.out.println("Choose what to delete: ");
					Scanner keyboard42 = new Scanner(System.in);
					int myint2 = keyboard42.nextInt();
					itemController.deleteItem(itemController.getAllItems().get(myint2));
					orderController.deleteOrder(orderController.getAllOrders().get(myint2));
					System.out.println("All items after deletion:");
					for (Item item : itemController.getAllItems()) {
						System.out.println(item.getName() + "\t" + item.getPrice()+ "\t" + item.getCreationDate());
					}

					System.out.println("All orders after deletion:");
					for (Order order : orderController.getAllOrders()) {
						System.out.println(order.getOrderDate());
					}
					break;
				case 3:
					System.out.println("All items:");
					for (Item item : itemController.getAllItems()) {
						System.out.println(item.getName() + "\t" + item.getPrice()+ "\t" + item.getCreationDate());
					}
					System.out.println("All orders:");
					for (Order order : orderController.getAllOrders()) {
						System.out.println(order.getOrderDate());
					}
					break;
			}
		}
	}
}
