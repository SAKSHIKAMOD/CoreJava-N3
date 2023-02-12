package org.tnsif.polymorphismdemo;
//driver class 
import java.util.Scanner;

public class MethodOverloadingExecuter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter the resolution and slottype "+"of a cellphone");
		int resolution = s.nextInt();
		s.nextLine();
		String slottype = s.nextLine();
		Smartphone sp=new Smartphone();
		sp.setResolution(resolution);
		sp.setSlottype(slottype);
		sp.display(resolution);
		sp.display(resolution, slottype);
		
		Multiplication  m=new Multiplication ();
		System.out.println(m.mul(2, 5));
		System.out.println(m.mul(5.2f, 4));
		
	}

}
