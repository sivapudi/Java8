package com.phd.string.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringPredTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("phd", "siva", "kumar");

		Predicate<String> pr = (s) -> s.startsWith("s");

		for (String name : names) {
			if (pr.test(name))
				System.out.println("predicte for String::" + name);
		}
	}

}
