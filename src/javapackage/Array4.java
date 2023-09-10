package javapackage;

public class Array4 {

	public static void main(String[] args) {
		
		//declaration and initialization of multi dimension array
		int a[][]= {{1,2,3,4},{2,3,4,5},{4,5,6,7},{2,4,5,6}};
		
		//total rows
		int row = a.length;//length is the property of an array
		System.out.println("total rows "+row);
		//total columns
		int column = a[0].length;
		System.out.println("total columns "+column);
		
		//print all elements of multi dimension array
		//outer loop
		for(int i=0;i<row;i++) {
			//inner loop
			for(int j=0;j<column;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
