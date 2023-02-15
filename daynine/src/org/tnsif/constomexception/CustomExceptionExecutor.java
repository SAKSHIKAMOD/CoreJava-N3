package org.tnsif.constomexception;
//program to demonstrate on custom exception
import java.util.Scanner;
//driver class
public class CustomExceptionExecutor {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String id=s.nextLine();
	s.nextLine();
	String password = s.nextLine();
	try
	{
		if(id.equals("kamodsakshi@gmail.com") && password.equals("abc@123"))
			System.out.println("Credential Matched");
		else
			throw new LoginCredential("Invalid Credential");
	}
	catch(LoginCredential e)
	{
		System.out.println("Exception Handle"+e);
	}
	finally
	{
		System.out.println("Finally Block");
	}
}
}