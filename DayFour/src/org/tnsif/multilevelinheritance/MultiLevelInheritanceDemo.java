package org.tnsif.multilevelinheritance;

import java.util.Scanner;

public class MultiLevelInheritanceDemo {
	
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in )) {
			System.out.println("Enter the model no, version and slottype");
			int modelno=s.nextInt();
			s.nextLine();
			
			String version=s.nextLine();
			String slottype=s.nextLine();
			
			iphone I=new iphone();
			iphone I1=new iphone(modelno,version,slottype);
			I1.setModelno(modelno);
			I1.setVersion(version);
			I1.setSlottype(slottype);
			I1.slot();
			I1.accept();
			I1.display();
			System.out.println(I1);
		}
	}
}
