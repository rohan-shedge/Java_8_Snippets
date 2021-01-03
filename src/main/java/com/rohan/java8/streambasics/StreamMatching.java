package com.rohan.java8.streambasics;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamMatching {
	public static void main(String[] args) {
		String[] strArray = new String[] {"Highlandr","skywalker","","Strikers", ""};
		List<String> list = Arrays.asList(strArray);
		
		//Pre-Java 8
		for (String string : list) {
		    if (string.contains("H")) {
		        System.out.println("Found");
		    }
		}
		
		//Java 8
		//None, All, Any Matches
		System.out.println("AnyMatch = " + list.stream().anyMatch(x -> x.contains("H")));
		System.out.println("NoneMatch = " + list.stream().noneMatch(x -> x.startsWith("Z")));
		System.out.println("All Match = " + list.stream().allMatch(x -> x.endsWith("r")));
		System.out.println("nonNull Match = " + list.stream().allMatch(Objects::nonNull));
		System.out.println("isNull Match = " + list.stream().allMatch(Objects::isNull));

		
		//Count the number of objects
		System.out.println(list.stream().count());
		
		//Count the number of Distinct objects
		System.out.println(list.stream().distinct().count());
		
		//Filter Element
		System.out.println("-----");
		Stream<String> stream  = list.stream().filter(x ->  x.equalsIgnoreCase(""));
		stream.forEach(System.out::println);
	}
}