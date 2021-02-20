package com.rohan.java8.functionalinterface.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class FI_Consumer {
	public static void main(String[] args) {
		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("Rohan the Coder");
		
		
		Consumer<Integer> c = x -> System.out.println(x);
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream()
			.forEach(c);
	}
}

