package javapackage;

public class BreakStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//outer loop
		for(int i = 0; i<3; i++) {
			
			//Inner for loop
			for(int j = 1; j<3; j++)
			{
				System.out.println(i);
				System.out.println(j);
				//If statement
				if(i == 2 && j==2)
				{
					break;
				}
			}
		}
	}

}
