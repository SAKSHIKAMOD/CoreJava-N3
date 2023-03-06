package application;

import framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}
	
	//to string method
	@Override
	public void withdraw(float accBal) {
		super.withdraw(accBal);
	}

	@Override
	public String toString() {
		return super.toString();
	}	
	
	

	
}
