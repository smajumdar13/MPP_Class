package Tries.EmpSal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Address> a = new ArrayList<Address>();
		a.add(0, new Address("1104 N Dr", "Fairfield", "Iowa", 52555));
		a.add(1, new Address("2552 N Dr", "Iowa City", "Iowa", 52542));
		a.add(2, new Address("Town Sq.", "Des Moines", "Iowa", 52510));
		
		List<Employee> e = new ArrayList<Employee>();
		e.add(0, new Employee(101, "Sam", "", "Mist", LocalDate.of(1990, 4, 23), 254215235L, 4500.0));
		e.add(1, new Employee(124, "Rob", "Van", "Thomas", LocalDate.of(1985, 7, 11), 187815545L, 7200.0));
		e.add(2, new Employee(155, "Hailey", "Sean", "Johnson", LocalDate.of(1992, 12, 31), 652485412L, 3800.0));
		
		List<Position> p = new ArrayList<>();
		p.add(0, new Position("Manager", "Accounts", e.get(0)));
		p.add(1, new Position("CA", "Lab", e.get(1)));
		p.add(2, new Position("", "", e.get(2)));
		
		List<Department> d = new ArrayList<>();
		d.add(new Department("Finance", a.get(0), p));
		
		Company c = new Company("ABC", d);
		System.out.println("Total salary of the company is: " + c.getSalary());
	}
}
