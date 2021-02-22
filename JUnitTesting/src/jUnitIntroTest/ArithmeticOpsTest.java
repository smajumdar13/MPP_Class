package jUnitIntroTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jUnitIntro.ArithmeticOps;
import junit.framework.Assert;

public class ArithmeticOpsTest {
	private ArithmeticOps arithmeticOps;

	@Before
	public void setUp() throws Exception {
		this.arithmeticOps = new ArithmeticOps();
	}

	@After
	public void tearDown() throws Exception {
		this.arithmeticOps = null;
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		int a = 2;
//		int a = 4; 
		int b = 3;
		int actualSum = arithmeticOps.add(a, b);
		int expectedSum = 7;
		assertEquals(expectedSum, actualSum);
	}

}
