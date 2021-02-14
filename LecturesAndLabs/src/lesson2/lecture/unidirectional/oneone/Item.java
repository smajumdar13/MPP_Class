package lesson2.lecture.unidirectional.oneone;

public class Item {
	String name;
	double price;
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return name;
	}
}