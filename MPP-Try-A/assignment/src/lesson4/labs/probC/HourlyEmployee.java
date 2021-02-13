package lesson4.labs.probC;

public class HourlyEmployee extends Employee{
	private double hourlyWage;
	private int hoursPerWeek;
	public HourlyEmployee( String empId,double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	@Override
	public double calcGrossPay(int month, int year) {
		
		return hoursPerWeek * hourlyWage *4;
	}

}
