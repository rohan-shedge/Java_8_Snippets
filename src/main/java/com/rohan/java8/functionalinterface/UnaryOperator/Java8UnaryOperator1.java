package com.rohan.java8.functionalinterface.UnaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Java8UnaryOperator1 {
	public static void main(String[] args) {
		
		Function<Integer, Integer> func = (x) -> x + x;
		Integer result = func.apply(5);
		System.out.println(result);
		
		
		//Function which accepts and returns the same type, 
		UnaryOperator<Integer> unary = (x) -> x + x;
		Integer result1 = func.apply(5);
		System.out.println(result1);
		
	}
}
