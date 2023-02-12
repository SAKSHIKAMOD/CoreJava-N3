package org.tnsif.instanceofdemo;
//child class
public class Child extends Person {
	
	private int age;

	//getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Child() {
		super();
		
	}

	public Child(String name, String address,int age) {
		super(name, address);
		
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	

	

}
