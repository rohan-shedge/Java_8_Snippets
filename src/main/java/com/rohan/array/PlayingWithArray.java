package com.rohan.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayingWithArray {
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4 ,5};
		
		//2nd highest element of array
		List<Integer> list = Arrays.asList(1, 2, 3, 4 ,5); 
		List<Integer> myList  = 
		list.stream()
		    .distinct()
		    .sorted((x,y) -> y - x)
		    .collect(Collectors.toList());
		    
		System.out.println(myList.get(1));    
	}
}
