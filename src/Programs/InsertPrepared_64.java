package Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepared_64 {

	public static void main(String[] args) {
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			PreparedStatement stmt = con.prepareStatement("insert into emp values(?,?)");
			stmt.setInt(1,101);//1 specifies the first parameter in the query
			stmt.setString(2,"Ratan");
			int i = stmt.executeUpdate();
			System.out.println(i+"records inserted");
			con.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
