package Programs;

import java.util.Scanner;

public class ExceptionHandling_49 {

	public static void main(String[] args) {
		int a,b, result;
		Scanner in = new Scanner(System.in);
		System.out.println("Input two integers");
		
		a = in.nextInt();
		b = in.nextInt();
		
		//try block
		
		try {
			result = a/b;
			
			//catch block
		} catch (ArithmeticException e) {
			
			System.out.println("Exception caught: division by zero");
		}
		//System.out.println("after exception block");
	}

}
