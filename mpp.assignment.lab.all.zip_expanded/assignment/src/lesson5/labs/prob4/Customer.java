package lesson5.labs.prob4;

import java.util.ArrayList;
import java.util.List;

public final class Customer {
	private String name;
	private List<Order> orders;
	//package level access
	Customer(String name) {
		this.name = name;
		orders = new ArrayList<Order>();	
	}
	public void addOrder(Order order) {
		orders.add(order);
	}
	public String getName() {
		return name;
	}
	public List<Order> getOrders() {
		return orders;
	}
}
