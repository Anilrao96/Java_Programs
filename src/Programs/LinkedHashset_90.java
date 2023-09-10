package Programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset_90 {

	public static void main(String[] args) {
		LinkedHashSet<String> al = new LinkedHashSet<String>();
		al.add("Rao");
		al.add("Ram");
		al.add("richie");
		al.add("rich");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
