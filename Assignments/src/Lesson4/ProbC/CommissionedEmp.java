package Lesson4.ProbC;

import java.util.ArrayList;
import java.util.List;

public class CommissionedEmp extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	
	CommissionedEmp(int empId, double baseSal, double comm){
		super(empId);
		baseSalary = baseSal;
		commission = comm;
		orders = new ArrayList<Order>();
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}
	
	private double totalOrdersSold(int month, int year) {
		double totalAmtSold = 0.0;
		for(Order o: orders) {
			if(o.getOrderDate().getMonthValue()==month && o.getOrderDate().getYear()==year) {
				totalAmtSold += o.getOrderAmount();
			}
		}
		return totalAmtSold;
	}
	
	public double calcGrossPay(int month, int year) {
		double totalComm = commission*totalOrdersSold(month, year)/100;
		return baseSalary+totalComm;
	}
	
//	@Override
//	public String toString() {
//		return "Today: "+ LocalDate.now()+ "  Emp ID: " + super.toString()+ "  Compensation: " + 
//	Double.toString(calcGrossPay(LocalDate.now().getMonthValue(), LocalDate.now().getYear()));
//	}
}