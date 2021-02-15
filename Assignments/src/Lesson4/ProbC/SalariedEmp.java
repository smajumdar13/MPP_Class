package Lesson4.ProbC;

public class SalariedEmp extends Employee {
	private double salary;
	
	SalariedEmp(int empId, double s){
		super(empId);
		salary = s;
	}
	
	public double calcGrossPay(int month, int year) {
		return salary;
	}
	
//	@Override
//	public String toString() {
//		return "Today: "+ LocalDate.now()+ "  Emp ID: " + super.toString()+ "  Compensation: " + Double.toString(salary);
//	}
}
