package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	@Test
	public void testCase4() {
		
		String expectedTitle = "Google";
		String actualTitle = "Google";
	
		try {
			Assert.assertEquals(actualTitle, expectedTitle,"Actual and expected are not matching");
		}
		catch(AssertionError a) {
		a.printStackTrace();
		System.out.println(a);
		}
		System.out.println("We are checking Assertion");
		}
		
	}

