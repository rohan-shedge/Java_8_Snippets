package com.rohan.java8.functionalinterface.function;

import java.util.function.Function;

public class FI_Function_Chain {
	public static void main(String[] args) {
		Function<String, Integer> function1 = x -> x.length();
		Function<Integer, Integer> function2 = x -> x + 1;
		Function<Integer, Integer> function3 = x -> x + 1;

		//Chaining multiple Function
		Integer i = function1.andThen(function2).andThen(function3).apply("Rohan Shedge");
		
		System.out.println(i);
	}
}
