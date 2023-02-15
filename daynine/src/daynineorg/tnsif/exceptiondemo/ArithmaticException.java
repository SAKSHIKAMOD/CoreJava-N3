package daynineorg.tnsif.exceptiondemo;
import java.util.Scanner;

//program to demonstrate on ArithmaticException
public class ArithmaticException {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		
		//try block contain the exception code
		try {
			int res=x/y;
			System.out.println(res);
		}
		
		//catch block handles the exception thrown by try block
		catch(Exception e)
		{
			System.out.println("Excepetion handled using catch :"+e);
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}

}
