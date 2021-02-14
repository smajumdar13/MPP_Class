package Tries.EmpSal;

public class Position {
	private String title; private String description; private Employee emp;
	
	public Position(String title, String des, Employee emp) {
		this.title = title; this.description = des; this.emp = emp;
	}
	
	public String getTitle() { return title; }
	
	public String getDescription() { return description; }
	
	public Employee getEmp() { return emp; }
	
	public double getSalary() { return emp.getSalary(); }
	
	public void print() { System.out.println(getSalary()); }
}
