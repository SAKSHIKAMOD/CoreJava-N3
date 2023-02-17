package org.tnsif.threaddemo;
//program to demonstrate on thread class
//driver class
public class ThreadExecuter {

	public static void main(String[] args) {
		SimpleThreadProgram p=new SimpleThreadProgram();
		//used to change thread name 
		p.setName("Java Method");
		//used to change the priority
		p.setPriority(8);
		//when thread calls to start method, it will come to run method 
		p.start();
		p.run();
		//Ones we call start() method, again we can not restart
        //p.start();
		System.out.println("Current Thread "+p);
		
	}

}
