package Lesson10.Prob5.soln2;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Lesson10.Prob5.Employee;
import Lesson10.Prob5.LibraryCompanion;



public class TestClass {
	@Test
	public void salaryGreaterThan100000_whenPassedEmpHavingSalaryLT100000_returnsFalse(){
		
		assertFalse(LibraryCompanion.salaryGreaterThan100000(new Employee("Joe", "Davis", 10000)));
	}
	@Test
	public void salaryGreaterThan100000_whenPassedEmpHavingSalaryGT100000_returnsTrue(){
		
		assertTrue(LibraryCompanion.salaryGreaterThan100000(new Employee("Smith", "Tamang", 10000000)));
	}
	
	@Test
	public void lastNameAfterM_whenPassedEmpHavingLastNameBeforeM_returnsFalse(){
		
		assertFalse(LibraryCompanion.lastNameAfterM(new Employee("Joe", "Davis", 10000000)));
	}
	@Test
	public void lastNameAfterM_whenPassedEmpHavingLastNameAfterM_returnsTrue(){
		
		assertTrue(LibraryCompanion.lastNameAfterM(new Employee("Joe", "Zavis", 10000000)));
	}
	@Test
	public void fullName_whenPassedEmp_returnsFullName(){
		
		assertEquals("Joe ",LibraryCompanion.fullName(new Employee("Joe", null, 10000000)));
	}

}
