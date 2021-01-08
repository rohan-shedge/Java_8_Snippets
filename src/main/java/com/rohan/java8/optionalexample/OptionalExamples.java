package com.rohan.java8.optionalexample;
import java.util.Optional;

public class OptionalExamples {
	public static void main(String[] args) {
           
		//Empty Optional
		Optional<String> opt = Optional.empty();
		Optional<String> opt1 = Optional.empty();
		System.out.println(opt);
		
		// Use Optional.of when you are sure that the value is NON NULL
		//opt = Optional.of(null); 
		
		// Use Optional.ofNullable when you are not sure about the value
		opt1 = Optional.ofNullable(null);
		
		//Use it in this way is live code
		if (opt1.isPresent()) {
			System.out.println(opt1.get());
		}
		
		opt1.ifPresent(System.out::println);
	}
}
