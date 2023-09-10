package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion4 {
	@Test
	public void testCase5() {
		int i = 30;
		int j = 30;
		try {
			Assert.assertTrue(i>j);
		}
		catch(AssertionError a) {
			System.out.println(a);
		}
		System.out.println("Assertionn Fail");
	
	if(i==j) {
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Testcase failed");
	}
	}}
