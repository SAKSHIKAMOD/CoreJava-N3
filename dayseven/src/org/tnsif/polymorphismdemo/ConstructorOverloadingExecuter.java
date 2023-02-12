package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class ConstructorOverloadingExecuter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed and colour : "+"a hondacity");
		int speed = s.nextInt();
		s.nextLine();
		String color = s.nextLine();
		HondaCity c=new HondaCity();
		HondaCity c1=new HondaCity(speed , color);
	}

}
