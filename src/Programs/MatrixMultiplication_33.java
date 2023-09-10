package Programs;

import java.util.Scanner;

public class MatrixMultiplication_33 {

	public static void main(String[] args) {
		int m,n,p,q,sum=0,c,d,k;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of first matrix");

		m = in.nextInt();
		n = in.nextInt();
		
		int first[][]=new int[m][n];
		System.out.println("Enter the elemnets of first matrix");	
		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				first[c][d]=in.nextInt();
		System.out.println("enter r and c for 2nd matrix");
		p=in.nextInt();
		q=in.nextInt();
		if(n!=p)
			System.out.println("matrices cannot be multiplied");
	else {
		int second[][]=new int[p][q];
		int multiply[][]=new int[m][q];
		System.out.println("eneter the elements of second matrix");
		for(c=0;c<p;c++)
			for(d=0;d<q;d++)
				second[c][d]=in.nextInt();
		for(c=0;c<m;c++) 
		{
			for(d=0;d<n;d++) {
				for(k=0;k<p;k++) {
					sum = sum+first[c][k]*second[k][d];
				}
				multiply[c][d]=sum;
				sum=0;
			}
		}
		for(c=0;c<m;c++) 
		{
			for(d=0;d<q;d++)
				System.out.println(multiply[c][d]+"\t");
			System.out.println("\n");
		}
	}

}
	}
