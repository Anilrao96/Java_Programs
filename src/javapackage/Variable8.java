package javapackage;

public class Variable8 {

	int b = 10;//Global variable
	static int c = 5;//static variable
	public static void main(String[] args) {
		
		int a = 6;//local variable
		
		Variable8 v8 = new Variable8();
		
		System.out.println(v8.b);//10//calling a variable
		System.out.println(c);//5
		System.out.println(a);
		a();//calling a method
	}
	public static void a() {
		
		int f = 15;// local variable
		System.out.println(f);
		System.out.println("Hello Selenium");
	

	}

}
