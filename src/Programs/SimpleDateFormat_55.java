package Programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_55 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);
		System.out.println("Date format with MM/dd/yyyy: "+strDate);
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println("Date format with dd=M-yyyy hh:mm:ss" + strDate);
		
		formatter = new SimpleDateFormat("dd MMM YYYY");
		strDate = formatter.format(date);
		System.out.println("Date format with dd mmm yyyy " + strDate);
		
		formatter = new SimpleDateFormat("dd MMM yyyy zzzz");
		strDate = formatter.format(date);
		System.out.println("Date format with dd MMM yyyy zzzz "+strDate);
		
		formatter = new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss z");
		strDate = formatter.format(date);
		System.out.println("Date format with E, dd MMM yyyy HH:mm:ss z:"+strDate);
		
	}

}
