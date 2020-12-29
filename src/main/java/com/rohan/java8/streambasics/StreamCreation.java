package com.rohan.java8.streambasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
	
	public static void main(String[] args) {
		String[] strArray = new String[] {"Rohan","pradnya","mugdha "};
		
		//Stream Creation from Arrays
		//Stream contains ReferencePipeline.Head as Internal object, Stream is just a Reference
		Stream<String> stream = Arrays.stream(strArray);
		//Another way
		Stream anotherStream = Stream.of(strArray);

		//print Stream
		stream.forEach(x -> System.out.print(x));       
		System.out.println("");          
		anotherStream.forEach(x -> System.out.print(x));

		System.out.println("");
		//Convert to List and Print
		List<String> list = Arrays.asList(strArray);
		
		System.out.println("");
		//both are sequential
		list.stream().forEach(x -> System.out.print(x));       
		list.forEach(x -> System.out.print(x));
		
	}

}
