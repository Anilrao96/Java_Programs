package Programs;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_89 {

	public static void main(String[] args) {
		//creating hashset and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Rajendra");
		set.add("Raja");
		set.add("Technolamror");
		
		//traversing elements
		Iterator <String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
