package java.demo.int_stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        IntStream.range(0, 5)
            .forEach(System.out::println);
        
        System.out.println();
        
        for(int i = 0; i < 5; i = i + 2) {
            System.out.println(i);
        }
        
        System.out.println();
        
        Stream.iterate(0, i-> i + 2)
            .limit(3)
            .forEach(System.out::println);
        
        System.out.println();
        
        IntStream.iterate(0, i-> i + 2)
            .limit(3)
            .forEach(System.out::println);
    }
}
