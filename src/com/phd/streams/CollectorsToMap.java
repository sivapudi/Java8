package com.phd.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.phd.util.Person;

/*
 * This program is for List to Map
 * toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction, Supplier mapSupplier)
 */

public class CollectorsToMap {
	public static void main(String[] args) {
		listToMapForString();
		System.out.println();
		listToMapForObjectWithoutMerge();
		//Means merging values for same key in map
		listToMapForObjectWithMerge();

	}

	private static void listToMapForObjectWithMerge() {
		List<Person> list = new ArrayList<>();
		list.add(new Person(100, "Mohan"));
		list.add(new Person(100, "Sohan"));
		list.add(new Person(300, "Mahesh"));
		Map<Integer, String> map = list.stream().collect(Collectors.toMap(Person::getId, Person::getName, (x,y)-> x+","+y));
		map.forEach((a, b) -> System.out.println(a + "-->" + b));
	}

	private static void listToMapForObjectWithoutMerge() {
		List<Person> list = new ArrayList<>();
		list.add(new Person(100, "Siva"));
		list.add(new Person(200, "Srinivas"));
		list.add(new Person(300, "PHD"));

		Map<Integer, String> ageName = list.stream().collect(Collectors.toMap(Person::getId, Person::getName));
		ageName.forEach((a, b) -> System.out.println(a + "-->" + b));
	}

	private static void listToMapForString() {
		List<String> list = new ArrayList<>();
		list.add("Mohan");
		list.add("Sohan");
		list.add("Mahesh");

		Map<String, Object> map = list.stream().collect(Collectors.toMap(Function.identity(), s -> "value"));
		// Map<String,Object>
		// map=list.stream().collect(Collectors.toMap(Function.identity(),s->s));
		map.forEach((a, b) -> System.out.println(a + "-->" + b));
	}

}
