package Programs;

import java.util.Scanner;

public class BreakContinueWhileLoop_22 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input an integer");
			n = input.nextInt();
			
			if(n!=0) {
				System.out.println("you entered "+n);
				continue;
			}
			else {
				break;
			}
		}

	}

}
