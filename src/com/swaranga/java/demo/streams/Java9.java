package com.swaranga.java.demo.streams;

import java.util.Arrays;
import java.util.List;

public class Java9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 32, 12, 54, 67, 81, 16, 15);
        
        list.stream()
            .takeWhile(i -> i < 55) // equivalent of break
            .forEach(System.out::println);
        
        System.out.println();
        
        list.stream()
            .dropWhile(i -> i < 55) // equivalent of continue
            .forEach(System.out::println);
    }
}
