package javapackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_technolamror_86 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();//creating arraylist
		list.add("Rajendra");//adding object in array list
		list.add("Mahendra");
		list.add("Raja");
		list.add("technolamror");
		
		//travesrsing list trough iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
;
	}

}
