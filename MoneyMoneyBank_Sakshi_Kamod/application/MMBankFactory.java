package application;

import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class MMBankFactory extends BankFactory {
	
	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
	MMSavingAcc s = new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
	return s;
	}
	
	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float MinBal) {
	MMCurrentAcc c = new MMCurrentAcc(AccNo, accNm, accBal,MinBal);
	return c;
	}
}
