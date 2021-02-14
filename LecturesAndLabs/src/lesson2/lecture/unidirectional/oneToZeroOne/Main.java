package lesson2.lecture.unidirectional.oneToZeroOne;

public class Main {

	public static void main(String[] args) {
		Customer c1 = new Customer("Sam");
		Customer c2 = new Customer("Harry");
		Customer c3 = new Customer("Rose");
		ShoppingCart s1 = new ShoppingCart(c1);
		ShoppingCart s2 = new ShoppingCart(c2);
		ShoppingCart s3 = new ShoppingCart(c3);
		s1.addItem(new Item("Pen"));
		s1.addItem(new Item("Pencil"));
		s1.addItem(new Item("Eraser"));
		s2.addItem(new Item("Shoes"));
		s2.addItem(new Item("Socks"));
		s2.addItem(new Item("Gloves"));
		s2.addItem(new Item("Napkin"));
		s3.addItem(new Item("Soap"));
		s3.addItem(new Item("Razor"));
		s3.addItem(new Item("Glue"));
		s3.addItem(new Item("Book"));
		s3.addItem(new Item("MousePad"));
		
		Customer[] c = {c1, c2, c3};
		for(Customer cus: c) {
			System.out.println(cus);
		}
		
//		Customer[] cus = {new Customer("Alan"), new Customer("John"), new Customer("Rob")};
		
	}
}