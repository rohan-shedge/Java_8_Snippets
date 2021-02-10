package com.rohan.java8.looping;

import java.util.HashMap;
import java.util.Map;

public class LoopMapJava8 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		map.put(null, 5);
		
		//Looping Map through Java8
		map.forEach((k, v) -> System.out.println(k + " -> " + v));
		
		//Looping Map through Java8 checking non null key
		map.forEach((k, v) -> {
		   if(k != null) {
			System.out.println(k + " " + v);
		   }
		 }
	   );
  }
}
