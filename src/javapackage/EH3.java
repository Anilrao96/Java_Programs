package javapackage;

public class EH3 {

	public static void main(String[] args) {
		try {
			int c =5/0;//Arithmetic exception
		} catch (ArithmeticException a) {
		
			a.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println(b);
		}
		catch(NullPointerException c) {
			System.out.println(c);
		}
		catch(Exception d) {
			System.out.println(d);
		}
		System.out.println("exception handled");
	}

}
