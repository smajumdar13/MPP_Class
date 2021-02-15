package Lesson4.ProbC;

public class HourlyEmp extends Employee {
	private double hourlyPay;
	private int hoursWeekly;
	private double grossPay;
	
	HourlyEmp(int empId, double pay, int hrs){
		super(empId);
		hourlyPay = pay;
		hoursWeekly = hrs;
	}
	
	public double getGrossPay() {
		return grossPay;
	}
	
	public double calcGrossPay(int month, int year) {
		double calcGrossPay = hourlyPay * hoursWeekly * 4; // 4 weeks in a month estimated
		return calcGrossPay;
	}
	
//	@Override
//	public String toString() {
//		return "Today: "+ LocalDate.now()+ "  Emp ID: " + super.toString()+ "  Compensation: " + 
//				Double.toString(calcGrossPay(LocalDate.now().getMonthValue(), LocalDate.now().getYear()));
//	}
}