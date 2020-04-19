package org.java.features.demo.completable_future;

import java.util.concurrent.CompletableFuture;

public class Java12 {
    public static void main(String[] args) {
        String value = loadFromPrimary()
            .exceptionallyCompose(ex -> loadFromSecondary())
            .join();
        
        System.out.println(value);
    }
    
    private static CompletableFuture<String> loadFromPrimary() {
        return CompletableFuture.supplyAsync(() -> {
            mayThrow();
            return "primary value";
        });
    }
    
    private static CompletableFuture<String> loadFromSecondary() {
        return CompletableFuture.supplyAsync(() -> {
            return "secondary value";
        });
    }
    
    private static void mayThrow() {
        if (Math.random() > .5) {
            throw new RuntimeException();
        }
    }
}
