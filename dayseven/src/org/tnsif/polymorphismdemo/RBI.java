package org.tnsif.polymorphismdemo;
// program to demonstrate on method overriding 
//parent class
public class RBI {
	
	float getInterest ()
	{
		return 10.8f;
	}
	
	/*If we use method overriding in same class we will get error
	that's why we used inheritance to achive method overriding 
	float getInterest ()
	{
		return 10.8f;
	}
	*/
}
