package org.tnsif.setdemo;
//program to demonstrate on deference between HashSet And LinkedHashSet
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		//set 1
		//Using HashSet we get output in unordered wise
		Set<Object> obj = new HashSet<>();
		obj.add(11);
		obj.add("Sakshi");
		obj.add(87.90f);
		System.out.println("Set elements are : "+obj);
		
		//set 2
		//Using LinkedHashSet we get output in order wise
		Set<Object> obj1 = new LinkedHashSet<>();
		obj1.add(11);
		obj1.add("Sakshi");
		obj1.add(87.90f);
		System.out.println("Set elements are : "+obj1);
		System.out.println("obj is equal to obj 1 = "+obj.equals(obj1));
	}

}
