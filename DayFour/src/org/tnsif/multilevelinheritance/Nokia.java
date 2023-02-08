package org.tnsif.multilevelinheritance;
//To demonstrate an example on multilevel inheritance
//parent class
public class Nokia {
	
	//private data members
	private int modelno;
	public void display()
	{
		System.out.println("The Model No. is:"+modelno);
	}
	
	//Default Constructor
	public Nokia() {
		System.out.println("Nokia class");
	}
	
	//Parameterized Constructor
	public Nokia(int modelno) {
		super();
		this.modelno = modelno;
	}

	//getters and setters
	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	
}
