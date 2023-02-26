package org.tnsif.streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WorkingWithStream {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Sakshi","Harshada","Manasi");
		//for each terminal operation
		obj.forEach((i)->System.out.print(i+" "));
		
		System.out.println();
		//stream can be accquared from array or collections
		List<Integer>obj1=Arrays.asList(new Integer[] {11,45,34,66,});
		obj1.forEach ((i) -> System.out.print(i+" "));
		}
	}


