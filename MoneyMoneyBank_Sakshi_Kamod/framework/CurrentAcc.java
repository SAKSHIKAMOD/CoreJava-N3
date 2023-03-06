package framework;

public abstract class CurrentAcc extends BankAcc {

	final private float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit ) {
		super(accNo, accNm, accBal);
		this.creditLimit=0;
	}

	//to string
	

	@Override
	public void withdraw(float bal) {
		System.out.println("Money withdrawn: "+ bal);
		System.out.println("AccNO: "+ this.getAccNo() + " accName: "+ this.getAccNm()+ " accBalance: "+ (this.getAccBal() - bal));


	}

	@Override
	public String toString() {
		return "CurrentAcc [AccNO:"+ getAccNo() + " accName:"+ getAccNm()+ " accBalance:"+ getAccBal() + " creditLimit:" + creditLimit + "]";
	}
}
