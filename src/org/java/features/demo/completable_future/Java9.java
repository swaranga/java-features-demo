package org.java.features.demo.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Java9 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<Void> timeoutFuture = CompletableFuture.runAsync(() -> {
            sleep(3_000);
        }).orTimeout(1, TimeUnit.SECONDS);
        
        CompletableFuture<String> timeoutWithDefaultValueFuture = CompletableFuture.supplyAsync(() -> {
            sleep(3_000);
            return "Java 9";
        }).completeOnTimeout("default value", 2, TimeUnit.SECONDS);
        
        System.out.println(timeoutWithDefaultValueFuture.get());
        
        System.out.println(timeoutFuture.isCompletedExceptionally());
    }

    private static String sleep(int i) {
        try {
            Thread.sleep(i);
            return "actual value";
        } catch (Exception ex) {
            throw new RuntimeException();
        }
    }
}
