package com.rohan.java8.looping;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachOrdered {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c","1","2","3");
		Set<String> set = new HashSet<String>(list);
		//The forEach does not guarantee the stream’s encounter order, 
		//regardless of whether the stream is sequential or parallel. 
		
		//Unordered
		list.parallelStream().forEach((s) -> System.out.println(s));
		System.out.println("---");
		list.forEach((s) -> System.out.println(s));
		System.out.println("---");
		//Ordered
		list.stream().forEachOrdered(System.out::println);
		
		System.out.println("SET OPERATION");
		// Set does not have a encounter Order
		set.stream().forEachOrdered(System.out::println);
		
		
		
	}
}
