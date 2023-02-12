package org.tnsif.finalkeyword;
// program to demonstrate on final keyword with variable
public class FinalVariable {
	//final variable
	final static int x=15;
	public static void print()
	{
		//x=10; it gives error bcz if any variable is declare as a final, we cant't change the value
		System.out.println("The value of x is : "+x);
	}
	public static void main(String []args)
	{
		FinalVariable.print();
	}
}
