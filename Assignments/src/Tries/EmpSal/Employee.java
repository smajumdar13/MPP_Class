package Tries.EmpSal;
import java.time.LocalDate;

public class Employee {
	private int employeeID; private String firstName; private String middleInitial; private String lastName;
	private LocalDate birthDate; private Long SSN; private double salary; 
	
	public Employee(int empID, String fn, String mi, String ln, LocalDate dob, Long ssn, double sal) {
		this.employeeID = empID; this.firstName = fn; this.middleInitial = mi; this.lastName = ln;
		this.birthDate = dob; this.SSN = ssn; this.salary = sal; 
	}
	
	public int getEmployeeID() { return employeeID; }
	
	public String getFirstName() { return firstName; }
	
	public String getMiddleInitial() { return middleInitial; }
	
	public String getLastName() { return lastName; }
	
	public LocalDate getBirthDate() { return birthDate; }
	
	public Long getSSN() { return SSN; }
	
	public double getSalary() { return salary; }	
	
	public void print() { System.out.println(salary); }
}
