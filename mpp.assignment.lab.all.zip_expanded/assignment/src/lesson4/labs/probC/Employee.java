package lesson4.labs.probC;

public abstract class Employee {
	private String empId;

	public Employee(String empId) {
		
		this.empId = empId;
	}
	public Paycheck calcCompensation(int month, int year) {
		var grossPay= this.calcGrossPay(month, year);
		var payCheck = new Paycheck(grossPay);
		return  payCheck;
	}
	public abstract double calcGrossPay(int month, int year);
	@Override
	public String toString() {
		return "EmployeeId : " + empId;
	}
		
}
