package org.tnsif.stringdemo;
// program to demonstrate on string comparison
public class StringComparisonDemo {

	public static void main(String[] args) {
		//Creating a string using literal
		String s1= "TNSIF";
		String s2= "TNSIF";
		
		//Creating a string using new operator
		String s3= new String("TNSIF");
		String s4= new String("TNSIF");
		
		//String Comparison
		System.out.println(s1==s2);
		System.out.println(s2==s3);           //it gives false
		
		System.out.println(s1.equals(s4));	  //it gives true
		
		//Using compareTo
		System.out.println(s1.compareTo("tnsif"));
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s2));
		

	}

}
