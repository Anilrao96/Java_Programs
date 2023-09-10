package Programs;

public class Constructor_overloading_48 {
	String name,names;
	Constructor_overloading_48(){
		System.out.println("Constructor method called");
	}
	Constructor_overloading_48(String t){
		name = t;
		names = t;
		System.out.println("execute second method");
	}
	
	
	public static void main(String[] args) {
		
		Constructor_overloading_48 cov = new Constructor_overloading_48();
		Constructor_overloading_48 cov3 = new Constructor_overloading_48();
		Constructor_overloading_48 cov2 = new Constructor_overloading_48("Java");
		
		
		
		cov.setName("C++");
		cov3.setName("C");
		cov.getName();
		cov3.getName();
		cov2.getName();
	}
	void setName(String t) {
		name=t;
	}
	void getName() {
		System.out.println("Language name: "+ name);
	}

}
