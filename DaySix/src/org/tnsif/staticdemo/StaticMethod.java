package org.tnsif.staticdemo;

public class StaticMethod {
	//private data members
	private static double salary =45000.67 ;
	//Non static Method
	public static void display()
	{
		System.out.println("Salary is :"+salary);
	}
	//getters and setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
}
