package org.tnsif.mapdemo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//program to demonstrate on difference between HashMap and LinkedHashMap
public class MapDemo {

	public static void main(String[] args) {
		
		//Unordered
		Map<Integer,String>obj=new HashMap<>();
		obj.put(411001, "MG Road");    //Pune
		obj.put(422001, "MG Road");    //Nashik
		System.out.println(obj);
		
		//Ordered
	    Map<Integer,String>obj1=new LinkedHashMap<>();
	    obj1.put(411001, "MG Road");    //Pune
	    obj1.put(422001, "MG Road");    //Nashik
	    System.out.println(obj1);
	}

}
