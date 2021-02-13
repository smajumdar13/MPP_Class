package mpp.assignment.lab8.prob2.partA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeInfo {

	public static void main(String[] args) {
		
		//Give an example of two Employee objects having the same name but that should not be considered equal
		//Answer: Employee having the same name but different salary should not be onsidered equal
		EmployeeNameComparator equalComp = new EmployeeNameComparator();
		
		Employee smith1 = new Employee("Smith", 150000);
		Employee smith2 = new Employee("Smith", 100000);
		System.out.println("Both " + smith1.name + " are not equal even though same name.");
		System.out.println(smith1.equals(smith2));			
		System.out.println(equalComp.compare(smith1, smith2));
		
		
		// both employees are equal
		System.out.println();
		Employee joe1 = new Employee("Joe", 150000);
		Employee joe2 = new Employee("Joe", 150000);
		System.out.println("Both " + joe2.name + " are equal and consistent  with equals in compare method of comparator");
		System.out.println(joe1.equals(joe2));
		
	
		System.out.println(equalComp.compare(joe1, joe2));
		
		
		
		//sort
		System.out.println();
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Joe", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Andy", 58899));
		
		Collections.sort(emps, new EmployeeNameComparator());
		System.out.println(emps);
		
	}
}

	



	
