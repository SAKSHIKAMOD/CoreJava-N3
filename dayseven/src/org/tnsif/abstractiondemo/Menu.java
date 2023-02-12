package org.tnsif.abstractiondemo;
//Program to demonstrate on abstract class and abstract method
//abstract class
//class can not be final abstract 
public abstract class Menu {
	
	// abstract method
	abstract void recipe();
	abstract void foodType();
	//concrete method -- Non abstract method
	void menuType()
	{
		System.out.println("Veg and Nonveg");
	}
	
	
	
}
