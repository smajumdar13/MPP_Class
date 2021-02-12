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
		double g = grossPay;
		return g - (fica*g + state*g + local*g + medicare*g + socialSecurity*g);
	}
	
	public void print() {
		System.out.println(this);
	}
	
	public String toString() {
		return "GrossPay: " + String.format("%.2f",	grossPay) + 
				". After Taxes: " + String.format("%.2f", getNetPay());
	}
}