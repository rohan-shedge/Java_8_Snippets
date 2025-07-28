package com.rohan.java8.reduction;

import java.util.Arrays;
import java.util.List;

public class Basics {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));

        numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("---------");
        int sum = numbers.stream().reduce(0, (a,b) -> a + b);
        System.out.println(sum);


    }
}
