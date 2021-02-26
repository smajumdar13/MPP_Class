package Lesson10.Prob5.soln1;



import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import Lesson10.Prob5.Employee;
import Lesson10.Prob5.Main;

public class TestClass {
	@Test
	public void asString_whenPassedEmployees_filtersCorrectly(){
		List<Employee> emps = Arrays.asList(
				new Employee("Joe", "Davis", 120000),
		        new Employee("John", "Sims", 110000),
		        new Employee("Joe", null, 200000));
		String result= Main.asString(emps);
		assertEquals("John Sims",result);
	}

}
