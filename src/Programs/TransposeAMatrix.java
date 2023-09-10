package Programs;

import java.util.Scanner;

public class TransposeAMatrix {

	public static void main(String[] args) {
		int m,n,c,d;
			Scanner in = new Scanner(System.in);
			System.out.println("enter the number of rows and columns");
			m=in.nextInt();
			n=in.nextInt();
			 
			int matrix[][]=new int [m][n];
			System.out.println("enter the elements of matrix");
			for(c=0;c<m;c++)
				for(d=0;d<n;d++)
					matrix[m][n]=in.nextInt();
			int transpose[][]=new int [n][m];
			for(c=0;c<m;c++) {
				for (d=0;d<n;d++)
					transpose[d][c]=matrix[c][d];
			}
			System.out.println("transpose of entered matrix");
			for(c=0;c<n;c++) {
				for(d=0;d<m;d++)
					System.out.println(transpose[c][d]+"\t");
				System.out.println("\n");
			}
	}

}
