package com.rohan.java8.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Static {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","2","3");
		
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				SimplePrinter.print(t);		
			}
		});
		System.out.println("------");
		list.forEach(x -> System.out.println(x));
		System.out.println("------");
		//First Way - static methods
		list.forEach(SimplePrinter::print);
		
		//Static ParseInt Methods
		System.out.println("------");
		List<Integer> list1 = list.stream()
		    .map(Integer::parseInt)
	        .collect(Collectors.toList());
		
		System.out.println(list1);
	}
}

class SimplePrinter {
    public static void print(String str) {
        System.out.println(str);
    }
}
