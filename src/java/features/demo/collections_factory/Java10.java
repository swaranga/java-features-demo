package java.features.demo.collections_factory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * - Copy factories
 *   - Allows duplicates, but impl unspecified
 *   - Returns itself if unnecessary
 *   
 * - Collectors
 *   - Collect to Unmodifiable collections
 */
public class Java10 {
    public static void main(String[] args) {
        copyOf();
        System.out.println();
        
        collectors();
    }
    
    private static void collectors() {
        println(Arrays.asList(1).stream().collect(Collectors.toUnmodifiableList()));
        println(Arrays.asList(1).stream().collect(Collectors.toUnmodifiableSet()));
        println(Arrays.asList(1).stream().collect(Collectors.toUnmodifiableMap(i -> i, i -> i)));
        
        /**
         * Large collection
         */
        println(IntStream.range(0, 15).mapToObj(i -> i).collect(Collectors.toUnmodifiableList()));
    }
    
    private static void copyOf() {
        println(List.copyOf(Arrays.asList("1")));
        println(Set.copyOf(Arrays.asList("1")));
        println(Map.copyOf(Map.of("1", 1)));
        
        Map<String, Integer> map = Map.of("1", 1);
        System.out.println(Map.copyOf(map) == map);
    }
    
    private static void println(Object o) {
        System.out.println(String.format("%s: %s", o.getClass().getName(), o));
    }
}
