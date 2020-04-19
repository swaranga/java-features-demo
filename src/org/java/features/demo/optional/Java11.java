package org.java.features.demo.optional;

import java.util.Optional;

public class Java11 {
    public static void main(String[] args) {
        Optional<?> o = Optional.empty();
        
        System.out.println(o.isEmpty());
    }
}
