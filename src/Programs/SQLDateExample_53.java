package Programs;

public class SQLDateExample_53 {

	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		System.out.println(date);
		System.out.println(millis);

	}

}
