package org.java.features.demo.functional_interfaces;

import static java.util.stream.Collectors.toList;

import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        System.out.println(
            Stream.of("1", "2", "")
                .filter(s -> !s.isBlank())
                .collect(toList())
        );
    }
}
