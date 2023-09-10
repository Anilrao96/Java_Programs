package javapackage;

public class IfElse4 {

	public static void main(String[] args) {
		
		int age = 25;// local variable
		int weight = 51; // local variable	
		
		//outer if block
		if(age > 18) {
			//Inner if block
            if(weight > 50) {
			System.out.println("eligible for blood donation");
			}
			else {
			System.out.println("not eligible");
			}}
		
		else 
		{
				System.out.println("age must be greater than 18");
			}
		
		
		}
	}


