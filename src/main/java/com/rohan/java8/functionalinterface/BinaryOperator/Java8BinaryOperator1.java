package com.rohan.java8.functionalinterface.BinaryOperator;

import java.util.List;
import java.util.function.BinaryOperator;

public class Java8BinaryOperator1 {
	public static void main(String[] args) {
		BinaryOperator<Integer> func = (x1, x2) -> x1 + x2;
		int sum = func.apply(2, 3);
		System.out.println("Result = " + sum);
	}
}