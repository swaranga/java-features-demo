package java.demo.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Java9 {
    public static void main(String[] args) {
        Optional<Integer> opt = Stream.iterate(0, i -> i < 10, i -> i + 1)
            .map(i -> (int) Math.random() * i)
            .filter(i -> i > 50)
            .findFirst();
        
        opt.ifPresentOrElse(
                i -> System.out.println("Have number: " + i), 
                () -> System.out.println("nope"));
        
        opt.or(() -> Optional.of(5));
    }
}
