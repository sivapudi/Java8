package com.phd.interfacem;

/*
 * 
 * A functional interface has only one abstract method but it can have multiple default methods.
 * @FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method. The use of this annotation is optional.
 */

@FunctionalInterface
public interface Square {
	int calculate(int x);
//	int test();

	default void testMethod() {
		System.out.println("Def method");
	}
}
