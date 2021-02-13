package lesson4.labs.probC;

import java.util.ArrayList;
import java.util.List;

public class CommissionedEmployee extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	

	public void addOrder(Order order) {
		this.orders.add(order);
	}

	public CommissionedEmployee(String empId,double commission, double baseSalary) {
		super(empId);
		
		this.commission = commission;
		this.baseSalary = baseSalary;
		orders = new ArrayList<Order>();
	
	}
	
	@Override
	public double calcGrossPay(int month, int year) {
		double orderAmt = getTotalOrderAmtSold(month, year);
		
		double totCom = commission/100 * orderAmt;
		return this.baseSalary + totCom;
	}

	private double getTotalOrderAmtSold(int month, int year) {
		double orderAmt=0;
		for(var order: orders) {
			if(order.getOrderDate().getMonthValue()==month && order.getOrderDate().getYear()==year) {
				orderAmt += order.getOrderAmount();
				
			}
		}
		return orderAmt;
	}

}
