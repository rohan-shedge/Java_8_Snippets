package com.rohan.java8.functionalinterface.function;

import java.util.function.Function;

public class FI_Function {
	public static void main(String[] args) {
		Function<String, Integer> function= x -> x.length();
		System.out.println(function.apply("Rohan Shedge"));
	}
}
