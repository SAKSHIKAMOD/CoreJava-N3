package org.tnsif.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
//program to demonstrate on parameterized test
class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings={"Sakshi","Diya"})
	void test()
	{
		System.out.println("Hello");
	}
	
	@ParameterizedTest
	@ValueSource(strings={"Sakshi","Diya"})
	void display(String str)
	{
		assertNotNull(str);
	}

}
