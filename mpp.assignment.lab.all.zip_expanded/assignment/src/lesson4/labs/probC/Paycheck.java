package lesson4.labs.probC;

public final  class Paycheck {
	private final static double FICA = 0.23;
	private final static double STATE = 0.05;
	private final static double LOCAL = 0.01;
	private final static double MEDICARE = 0.03;
	private final static double SOCIALSECURITY = 0.075;
	private double grossPay;

	public Paycheck(double grossPay) {
	
		this.grossPay = grossPay;
	}
	public double getNetPay() {
		return this.grossPay - (FICA+STATE+LOCAL+MEDICARE+SOCIALSECURITY) * this.grossPay;
	}
	@Override
	public String toString() {
		return "GrossPay: " +  String.format("%.2f",this.grossPay) + " NetPay: " + String.format("%.2f",  getNetPay());
	}
}
