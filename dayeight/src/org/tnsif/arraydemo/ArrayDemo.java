package org.tnsif.arraydemo;
import java.util.Arrays;
//Program to demonstrate on array using user input
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in the array");
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		
		// To allocate the value to an array
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Array elements are : ");
		//printing the elements of an array
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		// To sort an array elements
		System.out.println();
		Arrays.sort(arr);
		/*for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}*/
		for(int itr:arr)
		{
			System.out.print(itr+" ");
		}
	}

}
