package org.tnsif.threadsafesingleton;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

	public static void main(String[] args) {
		ExecutorService executerservice =null ;
		MyThread myThread=new MyThread();
		try {
			executerservice = Executors.newFixedThreadPool(1);
			executerservice.execute(myThread);
			executerservice.execute(myThread);
			executerservice.execute(myThread);
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if(executerservice !=null)
				executerservice.shutdown();
		}

	}

}
