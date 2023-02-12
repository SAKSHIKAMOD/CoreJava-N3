package org.tnsif.thiskeyword;
//It can be used to refer instance of current class
class Account
{
	int a;
	int b;
	void setData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void print() {
		System.out.println("Value of A ="+a);
		System.out.println("Value of B ="+b);
	}
}

public class ThisKeywordDemo {

	public static void main(String[]args) {
		Account a1=new Account();
		a1.setData(19,60);
		a1.print();
	}
}

