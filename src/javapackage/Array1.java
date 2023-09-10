package javapackage;

public class Array1 {

	public static void main(String[] args) {
		int a[]= new int[5];
		//Initialization
		a[3]=1;
		a[1]=3;
		a[2]=5;
		a[0]=7;
		a[4]=9;
		//a[5]=6;//error:java.lang.ArrayIndexOutOfBoundsException: 5
		
		System.out.println(a[2]);
		
		//print the length of an array
		System.out.println("total length of an array is:"+a.length);
		
		//print all array element
		for(int i =0;i<a.length;i++) {
			System.out.println("Array value for index:"+i+"is:"+a[i]);
		}

	}

}
