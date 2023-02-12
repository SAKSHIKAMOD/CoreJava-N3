package org.tnsif.polymorphismdemo;
//program to demonstrate constructor overloading 
public class HondaCity {
		
	private int speed ;
	private String color;
	
	//gettrs and setters
//	public int getSpeed() {
//		return speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColour(String color) {
//		this.color = color;
//	}
	
	
	
	// Constructor Overloading 
	
	// Constructor without argument
	public HondaCity() {
		System.out.println("I like to drive a hondacity");
	}
	
	// Constructor with argument
	public HondaCity(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		System.out.println("speed is : "+speed+","+"color is :"+color);
	}
	
	
	
	
	
}
