package Lesson5.prob3.extpackage;

import java.time.LocalDate;

import Lesson5.prob3.CustOrderFactory;
import Lesson5.prob3.Customer;
import Lesson5.prob3.Item;
import Lesson5.prob3.Order;

public class Main {
	public static void main(String[] args) {
//		Customer cust = new Customer("Bob");
//		Order order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Shirt");
//		order.addItem("Laptop");
//
//		order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Pants");
//		order.addItem("Knife set");
		
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.createOrder(cust, LocalDate.of(2021, 2, 11));
		Item item1 = CustOrderFactory.createItem("Shirt");
		Item item2 = CustOrderFactory.createItem("Laptop");
		order.addItem(item1);
		order.addItem(item2);
		
		order = CustOrderFactory.createOrder(cust, LocalDate.now());
		Item item3 = CustOrderFactory.createItem("Pants");
		Item item4 = CustOrderFactory.createItem("Knife set");
		order.addItem(item3);
		order.addItem(item4);
		
		System.out.println(cust.getOrders());
	}
}
