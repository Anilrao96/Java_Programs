package javapackage;

public class EH9 {

	public static void main(String[] args) {
		
		try {
			int i = 10/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			System.out.println("It will always be executed");
//		}
		finally {
			 	try {
			 		int a = 5/0;
			 	}
			 	 catch(Exception e) {
			 		 e.printStackTrace();
			 	 }
			 	System.out.println("finally block will always execute");
		}
	}

}
