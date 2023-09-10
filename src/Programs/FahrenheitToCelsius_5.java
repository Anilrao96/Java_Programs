package Programs;

import java.util.Scanner;

public class FahrenheitToCelsius_5 {

	public static void main(String[] args) {
		float temperature;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit");
		temperature = in.nextInt();
		
		temperature = ((temperature-32)*5/9);
		
		System.out.println("Temperature in celsius = " + temperature);
		
	}

}
