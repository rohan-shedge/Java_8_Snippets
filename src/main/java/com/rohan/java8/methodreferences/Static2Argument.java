package com.rohan.java8.methodreferences;

import java.util.function.BiFunction;

public class Static2Argument {

    public static void main(String[] args) {

        // anonymous class
        String result1 = playTwoArgument(1, 2, new BiFunction<Integer, Integer, String>() {
                  @Override
                  public String apply(Integer a, Integer b) {
                      return IntegerUtils.join(a, b);
                  }
              });                                                                   // 3
        System.out.println(result1);
        // lambda
        String result2 = playTwoArgument(2, 3, (a, b) -> IntegerUtils.join(a, b));  // 5
        System.out.println(result2); 
        // method reference
        String result3 = playTwoArgument(3, 4, IntegerUtils::join);                 // 7
        System.out.println(result3);
    }

    private static <R> R playTwoArgument(Integer i1, Integer i2,
        BiFunction<Integer, Integer, R> func) {
        return func.apply(i1, i2);
    }

}

class IntegerUtils{

    public static String join(Integer a, Integer b) {
        return String.valueOf(a + b);
    }

}
