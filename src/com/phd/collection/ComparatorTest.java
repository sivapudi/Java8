package com.phd.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.phd.util.Employee;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Employee> employees = getEmployees();

		employees.sort(Comparator.comparing(Employee::getFirstName));
		System.out.println("First Name::"+employees);
		
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName);
		employees.sort(groupByComparator);
		System.out.println("Both Names::"+employees);
		System.out.println("::Parallel Sort::");
		parallelSort(getEmployees(), groupByComparator);
//		Stream<Employee> stream = getEmployees().parallelStream().sorted(groupByComparator))
		System.out.println("Parallel Sort with stream::");
		getEmployees().parallelStream().sorted(groupByComparator).forEach(e->System.out.println(e));
	}

	private static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(6, "Yash", "Chopra", 25));
		employees.add(new Employee(2, "Aman", "Sharma", 28));
		employees.add(new Employee(3, "Aakash", "Yaadav", 52));
		employees.add(new Employee(5, "David", "Kameron", 19));
		employees.add(new Employee(4, "James", "Hedge", 72));
		employees.add(new Employee(8, "Balaji", "Subbu", 88));
		employees.add(new Employee(7, "Karan", "Johar", 59));
		employees.add(new Employee(1, "Lokesh", "Gupta", 32));
		employees.add(new Employee(9, "Vishu", "Bissi", 33));
		employees.add(new Employee(10, "Lokesh", "Ramachandran", 60));
		return employees;
	}
	
	private static void parallelSort(List<Employee> employees,Comparator<Employee> groupByComparator){
		Employee[] empArray= employees.toArray(new Employee[employees.size()]);
		Arrays.parallelSort(empArray, groupByComparator);
		System.out.println(Arrays.toString(empArray));
	}
}
