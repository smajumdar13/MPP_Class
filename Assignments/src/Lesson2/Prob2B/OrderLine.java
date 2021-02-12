package Lesson2.Prob2B;

public class OrderLine {
	private String name;
	private Order ord;
	
	public OrderLine(String name, Order order) {
		this.name = name;
		this.ord = order;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}