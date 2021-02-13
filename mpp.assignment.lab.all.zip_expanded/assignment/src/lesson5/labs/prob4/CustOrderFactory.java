package lesson5.labs.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
public static Customer createCustomer(String name) {
	Customer cust = new Customer(name);
	return cust;
}
public static Order createOrder(Customer cust,LocalDate date) {
	if(cust == null) throw new NullPointerException("Null customer");
	Order ord = new Order(date);
	cust.addOrder(ord);
	return ord;
}
public static Item createItem(String name){
	return new Item(name);
}
}
