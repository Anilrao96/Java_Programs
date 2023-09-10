package Programs;

import java.io.FileOutputStream;

public class FileOStream_70 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\ramad\\OneDrive\\Desktop\\demo.txt");
			fout.write(3);
			fout.close();
			System.out.println("success by tech");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
