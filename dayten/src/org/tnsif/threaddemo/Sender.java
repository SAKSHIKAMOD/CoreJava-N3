package org.tnsif.threaddemo;
//a class used to send a message
public class Sender {

	public void sendMessage(String message)
	{
		System.out.println("\n Sending" + message);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Thread Interrupted");
		}
	}
}
