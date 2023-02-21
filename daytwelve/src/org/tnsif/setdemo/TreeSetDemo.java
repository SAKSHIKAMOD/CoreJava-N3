package org.tnsif.setdemo;
//program to demonstrate on SortedSet 
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//TreeSet is used to print output in assending order for integer
		//Sorted with alphabetical order for Strings 
		SortedSet<String> obj=new TreeSet();
		obj.add("Sakshi");
		obj.add("Pranali");
		obj.add("Janhavi");
		System.out.println("Elements is set are : "+obj);
		}

}
