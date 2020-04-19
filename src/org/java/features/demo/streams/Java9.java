package org.java.features.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java9 {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(11, 32, 12, 54, 67, 81, 16, 15);
        
        list.stream()
            .takeWhile(i -> i < 55) // equivalent of break
            .forEach(System.out::println);
        
        System.out.println();
        
        list.stream()
            .dropWhile(i -> i < 55) // equivalent of continue
            .forEach(System.out::println);
        
        System.out.println();
        
        Stream.iterate(1, i -> i <= 10, i -> i + 1)
            .forEach(System.out::println);
        
        
    }
    
    /**
     * Other improvements:
     *  - Files.lines() returns memory mapped Stream, can improve parallel processing
     *    - much faster than a BufferedReader -> Parallel Stream
     */
}
