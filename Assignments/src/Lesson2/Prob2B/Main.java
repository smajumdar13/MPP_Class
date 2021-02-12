package Lesson2.Prob2B;

public class Main {

	public static void main(String[] args) {
		
		Order o = new Order();
		o.addItem("Bag");
		o.addItem("Car");
		o.addItem("Dog");
		
		System.out.println("Items in the order are: " + o);
		
	}
}