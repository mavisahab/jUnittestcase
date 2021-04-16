package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction j = new jUnitFunction();
		int r= j.addNumbers(200, 300);
		assertEquals (500,r);
	}

}
