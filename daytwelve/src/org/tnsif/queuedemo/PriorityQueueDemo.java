package org.tnsif.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> obj=new PriorityQueue<>();
		//add and offer method are used to add no. in queue
		obj.offer(13);
		obj.add(55);
		obj.offer(91);
		obj.add(15);
		//priority queue select first less than 11 no. them greater than 11 and then if 11 is present and then all another no.
		System.out.println("Queue elements are : "+obj);
		//if there is no element in queue and we use remove then we got error 
		/*obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();*/
		
		 // poll method will not give error
		/*obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();*/
		
		obj.remove();
		System.out.println("Head element is queue : "+obj.peek());
		System.out.println("Queue elemrnts are : "+obj);
		
	}

}
