package org.tnsif.datetime;

import java.time.Clock;

public class Example4 
{
	public static void main(String[] args) 
	{
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1);
	}

}