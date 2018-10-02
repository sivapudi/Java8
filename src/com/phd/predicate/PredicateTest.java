package com.phd.predicate;

import java.util.function.Function;
import java.util.function.Predicate;

import com.phd.util.Student;

public class PredicateTest {
	public static void main(String[] args) {

		Predicate<Student> maleTest = s -> s.getAge() >= 21 && "male".equals(s.getGender());
		Predicate<Student> feMaleTest = s -> s.getAge() >= 18 && "female".equalsIgnoreCase(s.getGender());

		Function<Student, String> maleStyle = s -> "Hi, You are male and age " + s.getAge();
		Function<Student, String> femaleStyle = s -> "Hi, You are female and age " + s.getAge();
		Student s = new Student(22, "female");
		
		if (maleTest.test(s)) {
			System.out.println(s.customShow(maleStyle));
		} else if (feMaleTest.test(s)) {
			System.out.println(s.customShow(femaleStyle));
		}
	}
}
