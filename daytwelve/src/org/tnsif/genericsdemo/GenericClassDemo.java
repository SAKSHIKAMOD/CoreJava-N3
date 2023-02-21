package org.tnsif.genericsdemo;
//program to demonstrate on generic class
//generic class definition
class GenericClass<T>
{
	T x;
	//To add the elements in the generic class
	void display (T x)
	{
		this.x=x;
	}
	//To return the elements
	T accept()
	{
		return x;
	}
}
//driver Class
public class GenericClassDemo {

	public static void main(String[] args) {
		GenericClass <String>obj1=new GenericClass<String>();
		obj1.display("TechnoServe India");
		//obj1.display(11);
		System.out.println(obj1.accept());
	}

}
