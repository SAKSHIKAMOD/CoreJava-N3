package daytwelveorg.tnsif.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> obj1 =new Vector<>();
		obj1.add(101);
		obj1.add(15.3f);
		obj1.add('z');
		obj1.add(15.3);
		System.out.println("First List is : "+obj1);
		System.out.println("Size of List 1 : "+obj1.size());
		System.out.println("Is List 2 empty? : "+obj1.isEmpty());
		System.out.println("Remove 1st element from List 1 : "+obj1.remove(0));
		System.out.println("First List Is : "+obj1);
		System.out.println(obj1.contains(101));
		System.out.println("Element at Index 1 "+obj1.get(1));
		System.out.println("Index of 'z' : "+obj1.indexOf('z'));
		System.out.println("Index of 15.3 :  "+obj1.indexOf(15.3));
		//obj1.clear();
		//System.out.println(obj1);
		
		//To extract elements from the list
		for(Object itr:obj1)
		{
			System.out.println(itr+" ");
		}

		//List 2
		List<Integer> obj2 = new ArrayList<>();
		obj2.add(67);
		obj2.add(16);
		obj2.add(45);
		System.out.println("List 3 is : "+obj2);
		//To Sort in assending wise
		Collections.sort(obj2);
		System.out.println("Assending Order : "+ obj2);
		//To sort dessending wise
		Collections.reverse(obj2);
		System.out.println("Dessending Order : "+ obj2);
		
	}

}
