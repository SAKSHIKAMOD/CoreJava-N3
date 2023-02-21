package daytwelveorg.tnsif.listdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Collection is an interface , we can not create an object for a collection
		//Collection obj = new Collection<>()
		
		//List 1
		Collection<Object> obj=new ArrayList<>();
		obj.add(101);
		obj.add(15.3);
		obj.add('z');
		obj.add(15.3);
		System.out.println("First List is : "+obj);
		
		//List 2
		List<Object> obj1 =new ArrayList<>();
		/*obj1.add(101);
		obj1.add(15.3);
		obj1.add('z');*/
		obj1.addAll(obj);
		System.out.println("Second List is : "+obj1);
		System.out.println("Size of List 1 : "+obj.size());
		System.out.println("Is List 2 empty? : "+obj1.isEmpty());
		System.out.println("Remove 1st element from List 1 : "+obj.remove(101));
		System.out.println("First List Is : "+obj);
		System.out.println(obj1.contains(101));
		System.out.println("Element at Index 1 "+obj1.get(1));
		System.out.println("Index of 'z' : "+obj1.indexOf('z'));
		System.out.println("Index of 15.3 :  "+obj1.indexOf(15.3));
		obj.clear();
		System.out.println(obj);
		
		// List 3
		List<Integer>obj2 = new ArrayList<>();
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
