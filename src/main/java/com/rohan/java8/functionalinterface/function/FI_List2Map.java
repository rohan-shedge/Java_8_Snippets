package com.rohan.java8.functionalinterface.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class FI_List2Map {
	
	 public static void main(String[] args) {
		FI_List2Map obj = new FI_List2Map();
	    List<String> list = Arrays.asList("node", "c++", "java", "javascript");
	    Map<String,Integer> map = obj.convertList2Map(list, x -> x.length());
	    map.forEach((k,v) -> {
	    	System.out.println("Key -> " + k + " 	-> " + v);
	    });
	}

	private <T, R> Map<T,R> convertList2Map(List<T> list, Function<T, R> func) {
		// lambda
	    Supplier<Map> obj1 = () -> new HashMap();   // default HashMap() constructor
	    Map map = obj1.get();
	    list.forEach(x -> {
	    	map.put(x, func.apply(x));
	    } );
		return map;
	  }
}