package org.tnsif.thiskeyword;

class HR
{
	void display(HR obj)
	{
		System.out.println("Human Resourse");
	}
	void accept() {
		display(this);
	}
}

public class ThisKeywordExecuter {
	public static void main(String[]args) {
	HR obj=new HR();
	obj.accept();
}
}
