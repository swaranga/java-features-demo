package com.swaranga.java.demo.streams;

import java.util.Arrays;
import java.util.List;

public class Java8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 32, 12, 54, 67, 81, 16, 15);
        
        list.stream()
            .limit(5)
            .forEach(System.out::println);
        
        System.out.println();
        
        list.stream()
            .skip(4)
            .forEach(System.out::println);
    }
}
