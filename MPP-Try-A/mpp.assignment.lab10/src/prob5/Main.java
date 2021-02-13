package prob5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
	
// Function<List<Employee>,String> filters = emps ->	emps.stream()
//    .filter(LibraryCompanion::salaryGreaterThan100000)
//    .filter(LibraryCompanion::lastNameAfterM)
//    .map(LibraryCompanion::fullName)
//    .sorted()
//    .collect(Collectors.joining(", ")).toString();

	public static void main(String[] args) {

		List<Employee> emps = Arrays.asList(
		new Employee("Joe", "Davis", 120000),
        new Employee("John", "Sims", 110000),
        new Employee("Joe", "Stevens", 200000),
        new Employee("Andrew", "Reardon", 80000),
        new Employee("Joe", "Cummings", 760000),
        new Employee("Steven", "Walters", 135000),
        new Employee("Thomas", "Blake", 111000),
        new Employee("Alice", "Richards", 101000),
        new Employee("Donald", "Trump", 100000));
				               
		printEmps(emps) ;    

	}
	
	
	public static String asString(List<Employee> emps)
	{
		return emps.stream()
	    .filter(LibraryCompanion::salaryGreaterThan100000)
	    .filter(LibraryCompanion::lastNameAfterM)
	    .map(LibraryCompanion::fullName)
	    .sorted()
	    .collect(Collectors.joining(", ")).toString();
	}
	public static void printEmps(List<Employee> emps) {
		 System.out.println(asString(emps));
	}
}
