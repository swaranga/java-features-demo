package org.java.features.demo.collections_factory;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * JDK 1.0, 1996 - Legacy collections, Vector Hashtable
 * 
 * JDK 1.2, 1998 - Collections Framework, Collection, List, Set, Map ...
 * 
 * JDK 5 - 2004: Generics, java.util.concurrent, ConcurrentHashMap
 * 
 * JDK 8, 2014: Lambda, Streams
 * 
 * Java 9: Collections Factory
 *         - NOT collection literals
 *         - Examples...
 *         
 *         - Unmodifiable, but not wrappers
 *           - add, set, remove will throw
 *         
 *         - No nulls
 *         
 *         - Random iteration order (Set, Map)
 *           - HashSet, HashMap order is unspecified, but usually consistent
 *           - For new collections, different order across JVM runs
 *           
 *         - No duplicates (Set, Map)
 *           - likely a bug
 *           
 *         - Space Efficient
 *           - compact, example 20 bytes vs 152 byte overhead for two element Set
 *           - 
 *           
 *         - Serlializable
 *
 */
public class Java8 {
    public static void main(String[] args) {        
        list();
        System.out.println();
        
        set();
        System.out.println();
        
        map();
    }
    
    private static void list() {
        println(Collections.unmodifiableList(Arrays.asList("1", "2")));
    }
    
    private static void set() {
        println(Collections.unmodifiableSet(new HashSet<String>(Arrays.asList("1"))));
    }
    
    private static void map() {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        
        map = Collections.unmodifiableMap(map);
        
        println(map);
        
        /**
         * Or Guava
         */
    }
    
    private static void println(Object o) {
        System.out.println(String.format("%s: %s", o.getClass().getName(), o));
    }
}
