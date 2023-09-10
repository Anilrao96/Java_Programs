package Programs;

import java.util.Scanner;

public class SubstringsOfAString_29 {

	public static void main(String[] args) {
		String string, sub;
		int i, c, length;
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string to print all its substrings");
		string = in.nextLine();
		
		length=string.length();
		
		System.out.println("Substrings of \""+string+"\"are:");
//		sub = string.substring(1,2);
//		System.out.println(sub);
		
		for(c=0;c<length;c++)
		{
			for(i=1;i<=length-c;i++) {
				sub = string.substring(c,c+i);
				System.out.println(sub);
				System.out.println();
			}
		}

	}

}
