package org.java.features.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
        
        System.out.println();
        
        Stream.iterate(1, i -> i + 1)
            .limit(10)
            .forEach(System.out::println);
    }
}
