package lesson10.exercise_1;

import org.junit.Test;

import junit.framework.TestCase;

public class TestLambda extends TestCase {
	@Test
	public void testLambda() {
		//your test 
		Customer cust1 = new Customer("101", "Bob", "Jones");
		cust1.getCheckingAccount().updateBalance(100);
		Customer cust2 = new Customer("102", "Tom", "Brokaw");
		cust2.getCheckingAccount().updateBalance(100);
		Customer cust3 = new Customer("103", "Ron", "Regis");
		cust3.getCheckingAccount().updateBalance(10);
		
		
	}
}
