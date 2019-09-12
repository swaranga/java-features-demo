package com.swaranga.java.demo.optional_stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Java9 {
    public static void main(String[] args) {
        Optional<Integer> opt = Stream.iterate(0, i -> i < 10, i -> i + 1)
                .map(i -> (int) Math.random() * i)
                .filter(i -> i < 50)
                .findFirst();
        
        print(opt.stream());
    }
    
    private static <T> void print(Stream<T> stream) {
        stream.forEach(System.out::println);
    }
}
