package Tries.EmpSal;

import java.util.List;

public class Company {
	private String name;
	private List<Department> dept;
	
	public Company(String name, List<Department> dept) {
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		double s = 0.0;
		for(Department d: dept) {
			s += d.getSalary();
		}
		return s;
	}
	
	public void print() {
		System.out.println(getSalary());
	}
}
