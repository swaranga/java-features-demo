package org.java.features.demo.collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.teeing;

import java.util.stream.Stream;

/**
 * Collectors.teeing: split a stream to two collectors and finally combine the outputs using a BiFunction
 * 
 * <pre>
 * 
 * 
 *                                   +--> Collector 1 --->
 *                                  /                     \
 *                                 /                       \
 *                                /                         \
 *                               /                           \
 *    stream(1, 2, 3 ...) ======>                              ===> BiFunction(Collector 1 result, Collector 2 result) -> final result
 *                               \                           /
 *                                \                         /
 *                                 \                       /
 *                                  \                     /
 *                                   +---> Collector 2 --->
 * 
 * 
 * </pre>
 * 
 */
public class Java12 {
    static record MinMax(double min, double max) {};

    public static void main(String[] args) {

        MinMax minMax = Stream.generate(Math::random)
                            .limit(100)
                            .collect(
                                teeing(
                                    minBy(Double::compare),
                                    maxBy(Double::compare), 
                                    (min, max) -> new MinMax(min.get(), max.get())
                                )
                            );
        
        System.out.println(minMax);
    }
}
