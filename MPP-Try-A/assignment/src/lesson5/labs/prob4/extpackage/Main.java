package lesson5.labs.prob4.extpackage;

import java.time.LocalDate;

import lesson5.labs.prob4.CustOrderFactory;
import lesson5.labs.prob4.Customer;
import lesson5.labs.prob4.Item;
import lesson5.labs.prob4.Order;

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
		Order order = CustOrderFactory.createOrder(cust, LocalDate.now());
		Item item1 = CustOrderFactory.createItem("Shirt");
		order.addItem(item1);
		Item item2 = CustOrderFactory.createItem("Laptop");
		order.addItem(item2);
		
		order = CustOrderFactory.createOrder(cust, LocalDate.now());
		Item item3 = CustOrderFactory.createItem("Pants");
		order.addItem(item3);
		Item item4 = CustOrderFactory.createItem("Knife set");
		order.addItem(item4);
		System.out.println(cust.getOrders());
	}
}

		
