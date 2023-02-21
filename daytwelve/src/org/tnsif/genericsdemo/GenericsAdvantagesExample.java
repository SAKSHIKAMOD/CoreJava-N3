package org.tnsif.genericsdemo;

import java.util.ArrayList;

public class GenericsAdvantagesExample {

	public static void main(String[] args) {
		//1. Type Safety 
		//Without Generic
		ArrayList obj=new ArrayList<>();
		obj.add(15);
		obj.add("15");
		System.out.println("Without Generic : "+obj);
		
		//With Generic
		ArrayList <Integer>obj1=new ArrayList<>();
		obj1.add(15);
		//obj.add("15"); //String type is not allowed
		System.out.println("With Generic : "+obj1);
		
		//2. Typecasting is allowed befotre generic
		ArrayList obj2=new ArrayList<>();
		obj2.add("MET");
		//Typecasting
		String str=(String)obj2.get(0);
		System.out.println(str);
		
		//with generics , Typecasting is not Allowed
		ArrayList <String>obj3=new ArrayList<>();
		obj3.add("MET");
		String str1=obj3.get(0);
		System.out.println(obj3);

	}

}
