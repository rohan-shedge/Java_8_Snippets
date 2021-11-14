package com.rohan.java8.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareExample {
	public static void main(String[] args) {
		Person p1 = new Person(1, "rohan", 3000);
		Person p2 = new Person(1, "Mugu", 2000);
		Person p3 = new Person(1, "padi", 1000);
		
		List<Person> list = Arrays.asList(p1, p2, p3);
		System.out.println("before sort");
		list.forEach(x -> System.out.println("name = " + x.getName() + ", salary = " + x.getSalary()));	
		System.out.println("--------------------");

		System.out.println("After sort 1st way(comparable)= ");
		Collections.sort(list);
		list.forEach(x -> System.out.println("name = " + x.getName() + ", salary = " + x.getSalary()));
		System.out.println("--------------------");

		System.out.println("After sort 2st way(old comparator) = ");
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return Integer.compare(o1.getSalary(), o2.getSalary());
			}
		});
		list.forEach(x -> System.out.println("name = " + x.getName() + ", salary = " +
				x.getSalary()));
		System.out.println("--------------------");
		
		System.out.println("After sort 3st way(Java 8 lambdas) using Collections Utility = ");
		Comparator<Person> c = (x, y) -> Integer.compare(x.getSalary(), y.getSalary()); 
		Collections.sort(list, c); 
		list.forEach(x -> System.out.println("name = " + x.getName() + ", salary = " + x.getSalary()));
		System.out.println("--------------------");
		
		System.out.println("After sort 4th way(Java 8 lambdas) using List Object = ");
		list.sort((x, y) -> x.getSalary() - y.getSalary());
		list.forEach(x -> System.out.println("name = " + x.getName() + ", salary = " + x.getSalary()));
		System.out.println("--------------------");

		System.out.println("After sort 5th way(Java 8 lambdas) using comparing = ");
		list.sort(Comparator.comparing(Person::getSalary));
		list.forEach(x -> System.out.println("name = " + x.getName() + ", salary = " + x.getSalary()));
		System.out.println("--------------------");
	}
}
