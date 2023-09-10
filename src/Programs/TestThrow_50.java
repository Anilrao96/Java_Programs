package Programs;

public class TestThrow_50 {

	static void validate(int age) {
		if(age<18) throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote on technolamror");
	}
	public static void main(String args[]) {
		validate(17);
		System.out.println("rest of the code...");
	}

}
