package org.tnsif.genericsdemo;
//program to demonstrate on generic method
class GenericMethod
{
	public static<E> void print(E[] elements)
	{
		for(E itr:elements)
		{
			System.out.println(itr+" ");
		}
		System.out.println();
	}
}
public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod m=new GenericMethod();
		Integer[] array1= {10,36,40,56,61};
		Character[] array2= {'S','A','K','I','H'};
		System.out.print("Integer Array : ");
		m.print(array1);
		System.out.print("Character Array : ");
		m.print(array2);
		
	}
	
}
