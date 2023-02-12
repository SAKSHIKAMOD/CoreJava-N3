package org.tnsif.abstractiondemo;
//implemented class
public class ButterChicken extends Menu{
	
	/* implement all the abstract method of abstract class */
	@Override
	void recipe() {
		System.out.println("Wash and cook a chicken");
	}

	@Override
	void foodType() {
		System.out.println("Non-Veg");
		
	}

}
