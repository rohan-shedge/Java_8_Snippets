package com.rohan.java8.functionalinterface.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorAsAMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int sum = math(list, 0, (x1, x2) -> x1 + x2);
		System.out.println("Result = " + sum);
	}

	private static <T> T math(List<T> list, T result, BinaryOperator<T> func) {
		for (T t : list) {
			result = func.apply(result, t);
		}
		return result;
	}
}