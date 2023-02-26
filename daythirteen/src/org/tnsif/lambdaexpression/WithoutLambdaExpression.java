package org.tnsif.lambdaexpression;

//program to demonstrate without lambda expression
//functional interface which contains exactly one abstract method
interface Message
{
	void greet(String name);
}

//Implementable class for an interface 
//Without Lambda Expression
/*class MessageImpl implements Message
{
	
	@Override
	public void greet(String name) {
	System.out.println("Hello "+name);
		
	}
}*/

//Without Lambda Expression 
public class WithoutLambdaExpression {

	public static void main(String[] args) {
		/*MessageImpl l=new MessageImpl();
		l.greet("Sakshi");*/
		
		//Without Lambda Message implemention using ananymous class
		Message m=new Message()
			{

				@Override
				public void greet(String name) {
				System.out.println("Hello "+name);
				}
			};
			m.greet("Sakshi");

			//Using lambda expression
			Message obj=(name)->
			{
				System.out.println("Hello "+name);
			};
			obj.greet("Jenny");
}
	
}


