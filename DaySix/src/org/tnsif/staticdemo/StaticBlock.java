package org.tnsif.staticdemo;
//program to demonstrate on static block
public class StaticBlock {
	
	//Non static variable 
	private int num;
	
	// Static Variable
	private static String name;
	
	//getters and setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}

	//static Block
	//Static block is used to initialized static variable
	static {
	//num=12;   it gives error
	  name="Sakshi";
	}
	
}
