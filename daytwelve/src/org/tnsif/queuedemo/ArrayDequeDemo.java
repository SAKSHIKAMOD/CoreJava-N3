package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
	Deque<String> obj =new ArrayDeque<>();
	//for add we also use offer method
	obj.add("Sakshi");
	obj.offerFirst("Shital");
	obj.addLast("Sampada");
	System.out.println("Array Deque elements are : "+obj);
	//extract the elements from deque
	for(String itr:obj)
	{
		System.out.print(itr+" ");
	}
	System.out.println();
	obj.remove();
	System.out.println("Array Deque elements are : "+obj);
	obj.removeFirst();
	System.out.println("Array Deque elements are : "+obj);
	obj.removeLast();
	System.out.println("Array Deque elements are : "+obj);
	
	

	}

}
