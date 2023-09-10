package Programs;

public class Methods_42 {
	
	Methods_42() {
		System.out.println("constructor method is called when an object of its class is created");
	}
//
//	//main method where program execution begins
	public static void main(String[] args) {
		
		Methods_42 object = new Methods_42();
		object.nonStaticMethod();
	}
	
	//static method
	static void staticMethod() {
		System.out.println("Static method can be called without creating an object");
	}

		//non static method
	void nonStaticMethod() {
		System.out.println("Nonstatic method must be called by creating an object");
	}
}
