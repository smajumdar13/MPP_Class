package lesson2.lecture.unidirectional.oneone;
import java.util.*;

public class ShoppingCart {
	private List<Item> items;
	public void addItem(Item item) {
		items.add(item);
	}
	//package level
	ShoppingCart() {
		items = new ArrayList<Item>();
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public double total() {
		double total = 0;
		for(Item i: items) {
			total += i.getPrice();
		}
		return total;
	}
	
	public String toString() {
		return items +"\nTotal amount:" + String.format("%.2f", total());
	}
}