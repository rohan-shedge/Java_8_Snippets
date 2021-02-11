package com.rohan.java8.functionalinterface.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionAsMethod {
	public static void main(String[] args) {
		String result = pow2String(2, 4, (x, y) ->  Math.pow(x, y), x -> "result = " + String.valueOf(x));
		System.out.println(result);
	}

	private static <T, U, R1, R2> R2 pow2String(T i, U j, BiFunction<T, U, R1> biFunc, Function<R1, R2> func) {
		R2 result = biFunc.andThen(func).apply(i, j);
		return result;
	}
}
