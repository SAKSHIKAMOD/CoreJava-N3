package daynineorg.tnsif.exceptiondemo;
//program to demonstrate on when finally block is not define
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
	
		try {
			int arr[]=new int[] {101,23,45};
			System.out.println("C2TC");
			//1. when it calls to system.exit(0);
			//System.exit(0);
			System.out.println(arr[3]);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception  Handled : "+e);
			
		}
		finally
		{
			//2. when finally block contain exception
			int res = 12/0;
			System.out.println(res);
			System.out.println("Finally Block");
	
		}
		
	}
	
}
