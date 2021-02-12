package Lesson4.ProbC;

import java.time.LocalDate;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	
	Order(int no, LocalDate date, double amt){
		orderNo = no;
		orderDate = date;
		orderAmount = amt;
	}
	
	public int getOrderNumber() {
		return orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
}