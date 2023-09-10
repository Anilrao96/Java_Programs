package javapackage;

public class Method1 {

	public static void main(String[] args) {
		
		int c = methodA(15,30); //method calling
		System.out.println(c);
		methodA(10,20);
		methodA(111,333);
	}
	public static int methodA(int n1, int n2) {
		if(n1>n2) {
			return n2;//return statement
		}
		else {
			return n1;
		}
		
		
	}

}
