package org.tnsif.lambdaexpression;

//program to demonstrate on lambda expression to implement functional interface
//follow annotation ensures that interface contain only one abstract method
@FunctionalInterface
public interface Cube {
	int calculate(int a);
	
}
