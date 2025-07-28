package com.rohan.java8.zflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basics {
    public static void main(String[] args) {
        String[][] array = new String[][]
                        {
                            {"1", "2"},
                            {"3", "4"},
                            {"5", "6"}
                        };

        Arrays.stream(array)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);


    }
}
