package org.java.features.demo.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        Optional<Integer> opt = Stream.iterate(0, i -> i < 10, i -> i + 1)
            .map(i -> (int) Math.random() * i)
            .filter(i -> i > 50)
            .findFirst();
        
        if (opt.isPresent()) {
            System.out.println("Have number: " + opt.get());
        } else {
            System.out.println("nope");
        }
        
        opt.orElse(4);
    }
}
