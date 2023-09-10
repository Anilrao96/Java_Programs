package javapackage;
import java.util.*;
public class LinkedListtechnolamror_87 {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList <String>();
		al.add("Rajendra");//adding object in linkedlist
		al.add("Mahendra");
		al.add("Raja");
		al.add("Technolamror");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
