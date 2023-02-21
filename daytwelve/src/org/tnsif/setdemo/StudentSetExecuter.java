//driver class
//program to demonstrate on user-defined objects
package org.tnsif.setdemo;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetExecuter {

	//user define method
	public static void addStudent(Set<Student>obj)
	{
		Student student1=new Student(101,"Sakshi",87.56f);
		Student student2=new Student(102,"Pranjal",86.56f);
		Student student3=new Student(103,"Manasi",85.56f);
		//duplicate elements are not allowed in set
		//Student student4=new Student(103,"Manasi",85.56f);
		obj.add(student1);
		obj.add(student2);
		obj.add(student3);
	} 
	
	public static void main(String[] args) {
		
		Set<Student>obj=new LinkedHashSet<Student>();
		addStudent(obj);
		System.out.println(obj);
	}

}
