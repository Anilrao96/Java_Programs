package Programs;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImage_65 {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			PreparedStatement ps = con.prepareStatement("insert into imgtable values(?,?)");
			ps.setString(1, "Technolamror");
			FileInputStream fin = new FileInputStream("D://g.jpg");
			ps.setBinaryStream(2,fin,fin.available());
			int i = ps.executeUpdate();
			System.out.println(i+" records affected");
			con.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
