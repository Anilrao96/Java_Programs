package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap_94 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		hm.put(100,"hf");
		hm.put(101,"fd");
		hm.put(102, "nfnsd");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}

	}

}
