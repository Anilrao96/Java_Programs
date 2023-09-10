package javapackage;

public class Array3 {

	public static void main(String[] args) {
		int a[]= {22,2,44,5};//declaration and initialization
		passingArrayToMethod(a);
		

	}
	
	//create one method 	which receives an array as an argument/parameter
	public static void passingArrayToMethod(int a[]) {
		int b=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(b>=a[i]) {
				System.out.println(b);
			}else {
				System.out.println("abcd");
			}
		}
		
	}

}
