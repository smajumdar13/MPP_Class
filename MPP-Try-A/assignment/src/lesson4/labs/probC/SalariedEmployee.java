package lesson4.labs.probC;

public class SalariedEmployee extends Employee {
	private double salary;
	public SalariedEmployee(String empId,double salary) {
		super(empId);
		this.salary = salary;
	}
	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return this.salary;
	}

}
