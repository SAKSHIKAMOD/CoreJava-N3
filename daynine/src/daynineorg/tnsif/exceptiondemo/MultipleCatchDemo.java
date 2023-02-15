package daynineorg.tnsif.exceptiondemo;
import java.util.Scanner;
//program to demonstrate on multiple catch block
public class MultipleCatchDemo {

	public static void main(String[] args) {
		int arr[]= new int[] {11,22,33};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y : " );
		int x=s.nextInt();
		int y=s.nextInt();
		
		try {
			int res =x/y;
			System.out.println(arr[3]);
		}
		
		//multiple catch block
		/*catch(ArithmeticException)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}*/
		
		// WE can write multiple catch block in single catch block using pipe operator i.e | 
		catch(ArithmeticException |ArrayIndexOutOfBoundsException e )
		{
			System.out.println("Exception handled"+e);
		}
		
	}
		
}


