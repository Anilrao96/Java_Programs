package Programs;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample_93 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(100,"Raj");
		map.put(101, "Lamror");
		map.put(102,"gajab");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
