package com.phd.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.phd.util.Student;

public class StreamSorted {

	public static void main(String[] args) {
		
		workOutForList();
		workOutForMap();
	}

	private static void workOutForMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(15, "Mahesh");
		map.put(10, "Suresh");
		map.put(30, "Nilesh");
		
		System.out.println("---Sort by Map Value---");
	        map.entrySet()
		        .stream()
		        .sorted(Comparator.comparing(Map.Entry::getValue))//am Here
		        .forEach(e -> System.out.println("Key: "+ e.getKey() +", Value: "+ e.getValue()));

		System.out.println("---Sort by Map Key---");
	        map.entrySet()
	           .stream()
	           .sorted(Comparator.comparing(Map.Entry::getKey))
	           .forEach(e -> System.out.println("Key: "+ e.getKey() +", Value: "+ e.getValue()));
	}

	private static void workOutForList() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Siva", 28));
		list.add(new Student(2, "Hari", 26));
		list.add(new Student(3, "Single", 27));

		System.out.println("---Natural Sorting by Name---");
		List<Student> slist = list
								  .stream()
								  .sorted()
								  .collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getName() + ", Age:" + e.getAge()));

		System.out.println("---Natural Sorting by Name in reverse order---");
		
				slist = list
						.stream()
						.sorted(Comparator.reverseOrder())
						.collect(Collectors.toList());//Here sorted will expect overridden comparTo method from Student else compilation error will come
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getName() + ", Age:" + e.getAge()));

		System.out.println("---Sorting using Comparator by Age---");
		
				slist = list
						.stream()
						.sorted(Comparator.comparing(Student::getAge))//am Here
						.collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getName() + ", Age:" + e.getAge()));

		System.out.println("---Sorting using Comparator by Age with reverse order---");
		
				slist = list
						.stream()
						.sorted(Comparator.comparing(Student::getAge).reversed())
						.collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getName() + ", Age:" + e.getAge()));
	}
}
