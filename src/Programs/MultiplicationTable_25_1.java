package Programs;

import java.util.Scanner;

public class MultiplicationTable_25_1 {

	public static void main(String[] args) {
		//For any number()from table to table
		int a,b,c,d;
		System.out.println("Enter range of numbers to print their multiplication table");
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		for(c=a;c<=b;c++) {
			for(d=1;d<=10;d++) {
				System.out.println(c+"*"+d+"="+(c*d));
			}
		}

	}

}
