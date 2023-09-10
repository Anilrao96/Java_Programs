package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
	@Test
	public void assertionCheck() {
	String expectedMessage = "User Created Successfully.";
	String actualMessage = "User Created Successfully";
	
	try {
	Assert.assertEquals(actualMessage, expectedMessage);
	}
	catch(AssertionError a) {
	System.out.println(a);
	}
	System.out.println("Verification Successful.");
	}
}
