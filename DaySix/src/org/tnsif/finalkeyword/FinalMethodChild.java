package org.tnsif.finalkeyword;

public class FinalMethodChild extends FinalMethodParent{
	private int price;
	/* If any method is declared as final in parent class and we are going to
	 * use that method in child class */
	//void display()   it gives error bcz method is overriding
	
	final void display(int price)
	{
		System.out.println("The prise is : "+price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
