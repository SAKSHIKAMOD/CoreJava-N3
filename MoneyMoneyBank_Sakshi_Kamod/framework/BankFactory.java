package framework;

public abstract class BankFactory {

	//abstract method
	public abstract SavingAcc getNewSavingAcc(int AccNo, String ccNm, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit);

}
