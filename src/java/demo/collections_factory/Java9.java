package java.demo.collections_factory;

import static java.util.Map.entry;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class Java9 {
    public static void main(String[] args) {
        list();
        System.out.println();
        
        set();
        System.out.println();
        
        map();
    }
    
    private static void list() {
        println(List.of(1));
        println(List.of(1, 2));
        println(List.of(1, 2, 3));
    }
    
    private static void set() {
        println(Set.of(1));
        println(Set.of(1, 2));
        println(Set.of(1, 2, 3));
    }
    
    private static void map() {
        println(Map.of(1, 1));
        println(Map.of(1, 2, 3, 4));
        /**
         * For upto 10 KV pairs.
         * 
         * See: https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Map.html
         */
        println(Map.of(1, 2, 3, 4, 5, 6));
        
        /**
         * For more than 10
         */
        println(Map.ofEntries(entry(1, 2), entry(3, 4), entry(5, 6)));
    }
    
    private static void println(Object o) {
        System.out.println(String.format("%s: %s", o.getClass().getName(), o));
    }
}
