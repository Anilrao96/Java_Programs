package Programs;

import java.util.Scanner;

public class GetInputFromUser_4 {

	public static void main(String[] args) {
		int a;
		float b;
		String s;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string");
		s = in.nextLine();
		System.out.println("you entered string "+s);
		
		System.out.println("Enter an integer");
		a = in.nextInt();
		System.out.println("you entered integer"+a);
		
		System.out.println("Enter a float");
		b = in.nextFloat();
		System.out.println("You entered float "+b);

	}

}
