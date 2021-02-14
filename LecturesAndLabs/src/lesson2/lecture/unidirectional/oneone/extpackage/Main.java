package lesson2.lecture.unidirectional.oneone.extpackage;

import lesson2.lecture.unidirectional.oneone.*;

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		cust.getCart().addItem(new Item("Shirt", 250.00));
		System.out.println(
			cust.getCart().getItems());
		//cannot create a ShoppingCart from here - compiler error
		//ShoppingCart newCart = new ShoppingCart();
		ShoppingCart bobsCart =cust.getCart();
		bobsCart.addItem(new Item("Pants", 400.00));
		System.out.println(
				cust.getCart().getItems());
		
		System.out.println();
		System.out.println(cust);
		
	}
}