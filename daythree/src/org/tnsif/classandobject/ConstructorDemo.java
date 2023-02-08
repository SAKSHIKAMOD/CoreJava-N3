package org.tnsif.classandobject;

import java.util.Scanner;

//driver class
public class ConstructorDemo {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			int n=1;
			while(n<=2)
			{
			System.out.println("Enter the id,name and city");
			int id;
			String custname,city;
			
			id=s.nextInt();
			s.nextLine();
			
			custname=s.nextLine();
			city=s.nextLine();
			
			// for cust1
			Customer c=new Customer();
			c.setId(id);
			c.setCustname(custname);
			c.setCity(city);
			//c.display();
			System.out.println(c.getId());
			System.out.println(c.getCustname());
			System.out.println(c.getCity());
			n++;
			
			}
		}
	}


}


