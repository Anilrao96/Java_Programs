package javapackage;

public class Breakstatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<=10;i++) {
			//If statement
			if(i==9) {
				break;//breaking the loop
			}
			System.out.println(i);
		}
		System.out.println("Control came out of for loop");
	}

}
