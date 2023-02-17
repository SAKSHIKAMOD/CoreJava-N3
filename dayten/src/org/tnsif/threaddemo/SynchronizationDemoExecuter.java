package org.tnsif.threaddemo;
//driver class
//program to demonstrate on synchronized method
public class SynchronizationDemoExecuter {

	public static void main(String[] args) {
		SyncronizationDemo obj=new SyncronizationDemo();
		ThreadOne t1=new ThreadOne(obj);
		ThreadTwo t2=new ThreadTwo(obj);
		t1.start();
		t2.start();
	}

}
