//driver class

package client;
import application.MMBankFactory;
import application.MMCurrentAcc;
import application.MMSavingAcc;
import framework.BankFactory;

public class Client {
	
	public static void main(String[] args) {
		BankFactory f=new MMBankFactory();
		MMSavingAcc s=new MMSavingAcc(12,"Sakshi",1000f,true);
		MMCurrentAcc c=new MMCurrentAcc(14,"Shruti",1000f,50f);
				
		//saving Account
		System.out.println("Saving Account");
		System.out.println(s);
		s.withdraw(40);
		
		//Current Account
		System.out.println("Current Account");
		System.out.println(c);
		c.withdraw(55);

				
	}

}
