package Programs;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter three integers");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		if (x>y && x>z)
			System.out.println("First number is largest");
		//else if 

	}

}
