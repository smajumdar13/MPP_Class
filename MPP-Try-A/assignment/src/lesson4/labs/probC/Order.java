package lesson4.labs.probC;

import java.time.LocalDate;

public class Order {
	private int orderNo;
	public int getOrderNo() {
		return orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	private LocalDate orderDate;
	private double orderAmount;
	public Order(int orderNo, LocalDate orderDate, double orderAmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
}
