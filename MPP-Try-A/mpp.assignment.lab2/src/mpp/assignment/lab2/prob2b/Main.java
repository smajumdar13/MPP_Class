package mpp.assignment.lab2.prob2b;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var order = new Order("order123");
		var orderline1 = new Orderline(order);
		order.addOrderLine(orderline1);
		
		var orderline2 = new Orderline(order);
		order.addOrderLine(orderline2);


	}

}
