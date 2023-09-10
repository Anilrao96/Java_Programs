package javapackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		
		int a = 200; // local variable
		int b = 300; // local variable
		
		if(a!=b) {
			System.out.println("a is not equal to b");
			
		}
		else {
			System.out.println("a and b are equal");
		}
		
		String p = "selenium cLAss";
		String q = "selenium class";
		
		//1st way of string comparison is not correct,never compare string like this
		//we always use == for number comparison
		if(p == q) {
			System.out.println("p and q are equal for 1st way");
			
		}
		else {
			System.out.println("p and q are not equal for 1st way");
		}
		
		//2nd way of string comparison which is not appropriate
		if(p.equals(q)) {
			System.out.println("p and q are equal for 2nd way");
		}
		else {
			System.out.println("p and q are not equal for 2nd ay");
		}
		
		// 3rd way of string comparison is correct way
		if(p.equalsIgnoreCase(q)) {
			
			System.out.println("p and q are equal for 3rd way");
		}
		else {
			System.out.println("p and q are not equal for 3rd way");
		}
	}

}
