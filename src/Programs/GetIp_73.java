package Programs;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIp_73 {

	public static void main(String[] args) {
		
		try {
			InetAddress ip = InetAddress.getByName("www.Technolamror.com");
			System.out.println("Host name: "+ip.getHostName());
			System.out.println("Ip address:"+ip.getHostAddress());
		} catch (Exception e) {
			
			System.out.println(e);
		}
		

	}

}
