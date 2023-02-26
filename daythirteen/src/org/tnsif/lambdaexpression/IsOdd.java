package org.tnsif.lambdaexpression;
//program to demonstrate on lambda expression to implement functional interface
//follow annotation ensures that interface contain only one abstract method
@FunctionalInterface
public interface IsOdd {
	boolean checkOdd(int a);
    
}
