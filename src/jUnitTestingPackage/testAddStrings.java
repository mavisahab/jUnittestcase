package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction js = new jUnitFunction();
		String r= js.addStrings("Hi","Bro");
		assertEquals ("HiBro",r);
	}
	
}
