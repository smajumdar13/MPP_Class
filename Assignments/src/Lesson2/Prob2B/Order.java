package Lesson2.Prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
//	private String orderName;
	private List<OrderLine> item = new ArrayList<OrderLine>();
		
	public void addItem(String itemName) {
		OrderLine o = new OrderLine(itemName, this);
		item.add(o);
	}

	public List<OrderLine> getList() {
		return item;
	}

	@Override
	public String toString() {
		return item.toString();
	}
}