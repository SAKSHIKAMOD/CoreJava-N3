package org.tnsif.staticdemo;

public class StaticVariable {
	//Non static variable
	private String name;
	
	//static Variable
	public static String companyName ="TechnoServe India";

	public StaticVariable(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "StaticDemo [name=" + name + "]";
	}
	
	
}
