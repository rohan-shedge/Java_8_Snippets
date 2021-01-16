package com.rohan.java8.streambasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
	public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        
        //Collect to map using ID as the key
        Map<Integer, String> result = list.stream()
            .collect(Collectors.toMap(Hosting::getId, Hosting::getName));
        
        result.forEach((k,v) -> System.out.println(k + " " + v));
        System.out.println("Result  : " + result);
        
        //Another way to Collect to map using ID as the key
        Map<Integer, String> result2 = list.stream().collect(
                Collectors.toMap(x -> x.getId(), x -> x.getName()));
        System.out.println("result 2 : " + result2);
  }
}	
