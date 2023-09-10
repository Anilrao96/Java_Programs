package javapackage;

public class EH5 {

	public static void main(String[] args) {
		String y = "Selenium";
		String x = "Hello";
		try {
			int i = Integer.parseInt(x);
		}
		catch(NumberFormatException n) {
			System.out.println(n);
		}
		System.out.println("Exception handled");

	}

}
