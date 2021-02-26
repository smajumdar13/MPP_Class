package Lesson10.Prob5;

import java.util.Optional;
import java.util.function.Predicate;

public class LibraryCompanion {
	private static Predicate<Employee> filterSalary = e-> e.getSalary()>100000 ;
	private static Predicate<Employee> filterLastName = e-> Optional.ofNullable(e.lastName).orElse(" ").charAt(0)>'M';
	
	public static boolean salaryGreaterThan100000(Employee e) {
		return filterSalary.test(e);
	}
	public static boolean lastNameAfterM(Employee e) {
		return filterLastName.test(e);
	}
	public static String fullName(Employee e) {
		return e.getFirstName() + " " + Optional.ofNullable(e.getLastName()).orElse("");
	}

}
