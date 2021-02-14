package Lesson4.ProbC;

import java.time.LocalDate;

abstract class Employee {
	private int empId;
	
	Employee(int id){
		empId = id;
	}
	
	abstract double calcGrossPay(int month, int year);
	
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(grossPay);
	}
	
	public void print() {
		LocalDate date = LocalDate.now();
		Paycheck pay = calcCompensation(date.getMonthValue(), date.getYear());
		pay.print();
	}
	
	public String toString() {
		return "Emp ID: " + empId;
	}
}