package com.rohan.java8.functionalinterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
/*
 * Java 8 introduced lambda expressions to provide the implementation of the abstract method of a functional interface. 
 * */
public class FI_Predicate {
	public static void main(String[] args) {
		
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 8;
        Predicate<Integer> lengthIs3 = x -> x == 3;
        Predicate<Integer> startWithA = x -> x == 9;

		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<String> listString = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
	    Predicate<String> startWithAA = x -> x.startsWith("A");

		 
		list.stream()
			.filter(x -> x > 5)
			.forEach(System.out::println);
		
		
		List<Integer> list1 = list.stream()
		.filter(x -> x > 5)
		.collect(Collectors.toList());
		System.out.println(list1);
		
		
		//Multiple Filters
		List<Integer> list2 = list.stream()
		.filter(x -> x > 5 && x <9)
		.collect(Collectors.toList());
		System.out.println(list2);
		
		//Multiple Filters
		List<Integer> list3 = list.stream()
		.filter(noGreaterThan5.and(noLessThan8))
		.collect(Collectors.toList());
		System.out.println(list3);
		
		List<Integer> list4 = list.stream()
		.filter(lengthIs3.or(startWithA))
		.collect(Collectors.toList());
		System.out.println(list4);
		
		//Negation
        List<String> collect = listString.stream()
                .filter(startWithAA.negate())
                .collect(Collectors.toList());
        System.out.println(collect);
		
	}
}
