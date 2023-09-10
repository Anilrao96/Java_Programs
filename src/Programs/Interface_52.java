package Programs;

interface Interface_52 {
	static final String language = "Java";
	public void display();
}

class Huihd implements Interface_52{
	public static void main(String []args) {
		Huihd obj = new Huihd();
		obj.display();
	}
	
	//defining method declared in interface
	public void display() {
		System.out.println(language+" is awesome");
	}
}
