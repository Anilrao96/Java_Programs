package Programs;

import java.io.IOException;

public class Notepad_59 {

	public static void main(String[] args) {
		Runtime rs = Runtime.getRuntime();
		
		
		try {
			//rs.exec("notepad");
			rs.exec("Word");
		} catch (IOException e) {
			
		System.out.println(e);
		}

	}

}
