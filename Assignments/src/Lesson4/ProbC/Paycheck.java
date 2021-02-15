package Lesson4.ProbC;

public final class Paycheck {
	private double grossPay;
	private final double fica = 0.23;
	private final double state = 0.05;
	private final double local = 0.01;
	private final double medicare = 0.03;
	private final double socialSecurity = 0.075;
	
	Paycheck(double gPay){
		grossPay = gPay;
	}
	
	public double getNetPay() {
//		double g = grossPay;
		return grossPay - (fica + state + local + medicare + socialSecurity)*grossPay;
	}
	
	public void print() {
		System.out.println(this);
//		System.out.println(toString());
	}
	
	public String toString() {
		return "Gross Pay: " + String.format("%8.2f",	grossPay) + 
				"    Net Pay: " + String.format("%8.2f", getNetPay());
	}
}