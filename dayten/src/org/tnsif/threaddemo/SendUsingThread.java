package org.tnsif.threaddemo;
//class sending a message using threads
public class SendUsingThread extends Thread{

	private String message;
	Sender sender;
	//receives a messages object and a String message to send 
	SendUsingThread(String msg,Sender object){
		message=msg;
		sender=object;
	}
	public void run() {
		//this will ensure that only one thread send message at a time 
	}
	
}
