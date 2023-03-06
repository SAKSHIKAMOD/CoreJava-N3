package application;

import framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal,creditLimit);
		
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
