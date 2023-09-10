package Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamExample_71 {

	public static void main(String[] args) throws Exception{
		
		try {
			FileInputStream fin = new FileInputStream("C:\\\\Users\\\\ramad\\\\OneDrive\\\\Desktop\\\\demo.txt");
			int i = fin.read();
			System.out.println((char)i);
			fin.close();
		} catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
