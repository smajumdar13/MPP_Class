package Tries.EmpSal;

import java.util.List;

public class Department {
	private String name;
	private Address location;
	private List<Position> pos;
//	private List<Employee> emp;
	
	public Department(String n, Address a, List<Position> pos) {
		this.name = n;
		this.location = a;
		this.pos = pos;
	}

	public String getName() {
		return name;
	}

	public Address getLocation() {
		return location;
	}
	
	public double getSalary() {
		double s=0.0;
		for(Position p: pos) {
			s += p.getSalary();
		}
		return s;
	}
}
