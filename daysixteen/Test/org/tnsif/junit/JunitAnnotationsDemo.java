package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)

class JunitAnnotationsDemo {

	@Test
	@DisplayName("SimpleJunitTestingMethod")
	void test() {
		System.out.println("First Junit Testcase");
	}

	@Test
	@BeforeAll
	//if we make this method as static then we will not get method name in testing
	//to overcome this we must have to use "@TestInstance(Lifecycle.PER_CLASS)"
	void display() {
		//this will display before all the methods
		System.out.println("Welcome to junit5 testing ");
	}
	
	@Test
	@BeforeEach
	void show()
	{
		//this will display before each methods
		System.out.println("Before Each Method");
	}
	
	@Test
	@AfterEach
	@Disabled
	void accept()
	{
		//this will display after each methods
		System.out.println("After Each Method");
	}
	
	@Test
	@AfterAll
	void print()
	{
		//this will display after all the methods
		System.out.println("After All Method");
	}
	

}
