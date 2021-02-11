package com.rohan.java8.functionalinterface.bifunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FI_BiFunction {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;
		Integer sum = biFunction.apply(10, 5);
		System.out.println(sum);

		BiFunction<Integer, Integer, Double> biFunction2 = (x, y) -> Math.pow(x, y);
		Double pow = biFunction2.apply(10, 5);
		System.out.println(pow);

		BiFunction<Integer, Integer, List<Integer>> biFunction3 = (x, y) -> Arrays.asList(x, y);
		List<Integer> list = biFunction3.apply(10, 5);
		System.out.println(list);
		
		
		//chaining BiFunction
		//Cannot chain BiFunction with another BiFunction because it accepts 2 argument. Hence need to use a function
		Function<Integer, String> func = (x) -> "result = " + x;
		System.out.println(biFunction.andThen(func).apply(10, 5));
		
	}
}
