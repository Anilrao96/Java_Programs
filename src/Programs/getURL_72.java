package Programs;

import java.net.MalformedURLException;
import java.net.URL;

public class getURL_72 {

	public static void main(String[] args){
		
		try {
			URL url = new URL("http://www.technolamror.com/java");
			System.out.println("protocol: " + url.getProtocol());
			System.out.println("Host naem: "+url.getHost());
			System.out.println("port number:"+url.getPort());
			System.out.println("file name:"+url.getFile());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
