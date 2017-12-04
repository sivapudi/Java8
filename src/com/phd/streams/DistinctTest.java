package com.phd.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.phd.util.Book;

public class DistinctTest {
	public static void main(String[] args) {
		distinctOnBasic();
		distinctWithUserObjects();
		distinctByProperty();
		}

	private static void distinctByProperty() {
		System.out.println("----------distinctByProperty----Check this for --------");
		List<Book> list = new ArrayList<>();
        {
           list.add(new Book("Core Java", 200));
           list.add(new Book("Hibernate", 500));
           list.add(new Book("Learning JavaEight", 150));        	
           list.add(new Book("Spring MVC", 300));
           list.add(new Book("Spring MVC", 300));
           list.add(new Book("Hibernate", 500));
        }
        list.stream().filter(distinctByKey(b -> b.getName()))
        .forEach(b -> System.out.println(b.getName()+ "," + b.getPrice()));
        
	}
	//Learn predicate
//	https://stackoverflow.com/questions/23699371/java-8-distinct-by-property
	 private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
	        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
	        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	    }
	private static void distinctWithUserObjects() {
		System.out.println("----------distinctWithUserObjects------------");
		List<Book> list = new ArrayList<>();
        {
           list.add(new Book("Core Java", 200));
           list.add(new Book("Core Java", 200));
           list.add(new Book("Learning JavaEight", 150));        	
           list.add(new Book("Spring MVC", 300));
           list.add(new Book("Spring MVC", 300));
        }
		list.stream().distinct().forEach(book->System.out.println(book.getName()+":"+book.getPrice()));
	}

	private static void distinctOnBasic() {
		List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
		long l = list
				.stream()
				.distinct().count();
		System.out.println("No. of distinct elements:" + l);
		
		String output = list.stream().distinct().collect(Collectors.joining(","));
		System.out.println(output);		
	}
}
