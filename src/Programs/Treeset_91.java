package Programs;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_91 {

	public static void main(String[] args) {
		//creatinga and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Raj");
		al.add("ram");
		al.add("ramu");
		al.add("technolamror");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
