package Programs;

import java.util.Scanner;

public class Floydtraingle_28 {

	public static void main(String[] args) {
		int n, num = 1,c,d;
		
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		for(c = 1;c <= n;c++)
		{
			for(d = 1;d<=c;d++)
			{
				System.out.println("* ");
				num++;
			}
			System.out.println();
		}
		

	}

}
