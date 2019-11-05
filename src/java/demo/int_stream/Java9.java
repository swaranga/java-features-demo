package java.demo.int_stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java9 {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i < 5, i-> i + 2)
            .forEach(System.out::println);
    
        System.out.println();
    
        IntStream.iterate(0, i -> i < 5, i-> i + 2)
            .forEach(System.out::println);
    }
}
