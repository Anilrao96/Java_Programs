package javapackage;

public class Array2 {

	public static void main(String[] args) {
		
		//we can write arrray in below format as well
		Object a[]= {1,2,3,4,5,6,7,"Ram"};//declaration and initialization of array
		
		System.out.println(a[7]);
		
		int b[]= {1,2,3,4,5};//declaration and initialization of an int array
		
		String s[]= {"Hi","Hello"};//declaration and initialization of string array
		
		System.out.println(a.length);
		System.out.println(s.length);
		System.out.println(b.length);

		System.out.println(a[5]);
		System.out.println(b[3]);
		System.out.println(s[1]);
		a[5]="Mummy";
		System.out.println(a[5]);
		System.out.println(a);

	}

}
