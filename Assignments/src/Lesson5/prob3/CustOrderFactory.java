package Lesson5.prob3;

import java.time.LocalDate;

public class CustOrderFactory {
	public static Customer createCustomer(String name) {
		Customer cust = new Customer(name);
		return cust;
	}
	public static Order createOrder(Customer cust, LocalDate date) {
		if(cust == null) {
			throw new NullPointerException("Cannot create order without customer");
		}
		Order o = new Order(date);
		cust.addOrder(o);
		return o;
	}
	public static Item createItem(String name) {
		Item item = new Item(name);
		return item;
	}
}
