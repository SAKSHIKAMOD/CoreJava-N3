package org.tnsif.threaddemo;
//program to demonstrate on synchronized method

public class SyncronizationDemo {
	
	synchronized void print(int num) throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num*i);
		}
	}

}
//Thread1 
class ThreadOne extends Thread
{
	SyncronizationDemo d;

	public ThreadOne(SyncronizationDemo d) {
		super();
		this.d = d;
	}
	public void run()
	{
		try {
			d.print(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
//Thread2
class ThreadTwo extends Thread
{
	SyncronizationDemo d;
	
	public ThreadTwo(SyncronizationDemo d) {
		super();
		this.d = d;
	}
	public void run()
	{
		try {
			d.print(15);
		} catch (InterruptedException e) {
			System.out.println(e);

		}
	}
}