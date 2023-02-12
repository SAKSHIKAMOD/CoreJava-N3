package org.tnsif.abstractiondemo;

public class AbstractionExecution {

	public static void main(String[] args) {
		ButterChicken b=new ButterChicken();
		/*  Menu m=new Menu();
		 *  We Can not instantiate the abstract class*/
		b.foodType();
		b.menuType();
		b.recipe();
		

	}

}
