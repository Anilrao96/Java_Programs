package Programs;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_92 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Rama");
		queue.add("Roja");
		queue.add("Ravan");
		queue.add("Sita");
		System.out.println("head:"+queue.element());
		System.out.println("peak:"+queue.peek());
		
		System.out.println("iterating the queue elements");
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		
		Iterator itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}

}
