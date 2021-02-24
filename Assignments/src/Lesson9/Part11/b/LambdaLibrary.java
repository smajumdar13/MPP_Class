package Lesson9.Part11.b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Integer, Character, String> 
		SALARY_NAME = (emps, salaryBound, letter) -> 
		            emps.stream()
				        .filter(e -> (e.getSalary() > salaryBound))
				        .filter(e -> (e.getLastName().charAt(0) > letter))
				        .map(e -> e.getFirstName()+" "+e.getLastName())
				        .sorted().collect(Collectors.joining(", "));
}
