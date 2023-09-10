package javapackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {
	@Test
	public void a() {
		System.out.println("a test method");
	}
	@Test(enabled = true)//always recommended as per industry standard
	public void b() {
		System.out.println("b test method");
	}
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c test method");
	}
	@Test(invocationCount = 1)
	public void d() {
		System.out.println("d test method");
	}
	@Test
	public void e() {
		System.out.println("e test method");
		throw new SkipException("skipping e method");
		//System.out.println("method skipped");//code not reachable
		
	}
}
