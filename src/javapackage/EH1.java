package javapackage;

public class EH1 {

	public static void main(String[] args) {
		try {
			int data = 50/0; //Arithmetic exception
		} catch (ArithmeticException a) {
			System.out.println(a);
		}
		catch(NullPointerException n) {
			n.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			int a =10/0;//arithmetic exception
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("finally will always be executed");
		}
	}

}
