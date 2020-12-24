package com.rohan.java8.looping;

import java.util.ArrayList;
import java.util.List;

public class LoopListClassic {
	
	public static void main(String[] args) {
		   List<String> list = new ArrayList<>();
		      list.add("A");
		      list.add("B");
		      list.add("C");
		      list.add("D");
		      list.add("E");

		      // normal loop
		      for (String l : list) {
		          System.out.println(l);
		      }
	}


}
