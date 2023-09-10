package Programs;

public class Multiple_Class_46 {
	Multiple_Class_46(){
		System.out.println("Constructor of computer class");
	}
	void computer_method(){
		System.out.println("power gone, shut down your pc soon");
	}
	public static void main(String[]args) {
		Multiple_Class_46 my = new Multiple_Class_46();
		Laptop lap = new Laptop();
		my.computer_method();
		lap.laptop_method();
		
	}
}

class Laptop{
	Laptop(){
		System.out.println("Constructor of laptop class");
	}
	void laptop_method() {
		System.out.println("99% battery available");
	}
}