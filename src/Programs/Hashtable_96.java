package Programs;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable_96 {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer,String>();
		
		hm.put(100,"Raj");
		hm.put(101, "Ram");
		hm.put(102,"rav");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
