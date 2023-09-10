package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	@Test
	public void testCase2() {
		int a = 10;
		int b = 20;
		
		String expectedTitle = "Google";
		String actualTitle = "Google";
		
		Assert.assertEquals(actualTitle,expectedTitle,"Actual and expected are not matching.");
		System.out.println("Assertion pass");
		
		Assert.assertFalse(a>b,"assert false condition get failed");
		System.out.println("Balle Balle");
		
		Assert.assertEquals(a>b, "Test case failed as b is greater ");
		System.out.println("We are checking Assertion");
	}
	@Test
	public void testCase3() {
		//assertion are writtten in testcase2() method
		//Hence the scope of assertion will be limited to testcase2() method only
 		System.out.println("Hello Assertion");
	}

}
