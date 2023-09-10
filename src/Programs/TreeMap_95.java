package Programs;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_95 {

	public static void main(String[] args) {
		TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
		hm.put(100,"ram");
		hm.put(102, "rat");
		hm.put(102, "rao");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
