package com.rohan.java8.methodReferences;

import java.util.*;
import java.util.function.Supplier;

public class Constructor {
    public static void main(String[] args) {

        // lambda
        Supplier<Map> obj1 = () -> new HashMap();   // default HashMap() constructor
        Map map1 = obj1.get();

        // method reference
        Supplier<Map> obj2 = HashMap::new;
        Map map2 = obj2.get();
    }
}
