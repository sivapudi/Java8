package com.phd.string.utils;

import java.util.StringJoiner;

public class StringJoinTest {
	public static void main(String[] args) {

		
		String[] strArray = { "How", "To", "Do", "In", "Java" };
		System.out.println(String.join("--", strArray));
		
		
		// StringJoiner(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
		StringJoiner joiner = new StringJoiner(", ", "[", "]");
		System.out.println(joiner.add("Testing").add("String").add("Joiner").add("Program"));
	}

}
