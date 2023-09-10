package Programs;

public class StaticBlock_44_1 {

	public static void main(String[] args) {
		System.out.println("you are using windows nt operating system.");
	}
	static {
		String os = System.getenv("OS");
		if(os.equals("Windows_NT")!=true) {
			System.exit(1);
		}
		
	}

}
