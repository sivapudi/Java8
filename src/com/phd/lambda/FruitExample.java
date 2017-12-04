package com.phd.lambda;

import java.util.Arrays;
import java.util.List;

public class FruitExample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "lemon", "orange");

		// for each and lamba
		fruits.forEach(singleFruit -> System.out.println(singleFruit));

		// Method reference type 1
		fruits.forEach(System.out::println);

		// Method reference type 2--calling private method /static method
		fruits.forEach(FruitTest::callStaticMethod);

	}
}

class FruitTest {
	static void callStaticMethod(String s) {
		System.out.println(s.length());

	}
}
