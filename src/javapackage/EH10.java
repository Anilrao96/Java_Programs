package javapackage;

import java.io.IOException;

public class EH10 {

	public static void eligible(int age)  {
		
		try {
			if(age<18) {
				throw new ArithmeticException("Not valid");
			}
			else {
				System.out.println("Eligible for voting");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}}
		public static void main(String[]args) throws InterruptedException,Exception,ArithmeticException,IOException{
			Thread.sleep(3000);
			eligible(15);
			eligible(19);
		}
		

	}


