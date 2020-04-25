package org.java.features.demo.completable_future;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TryCatchFinally {

    public static void main(String[] args) {
        System.out.println(asyncTryCatchFinally().join());
    }

    private static CompletableFuture<String> asyncTryCatchFinally() {
        long start = System.nanoTime();

        return asyncTryCatchFinally(
                TryCatchFinally::doTry,
                TryCatchFinally::doCatch,
                (result, error) -> doFinally(start)
            );
    }

    private static <T> CompletableFuture<T> asyncTryCatchFinally(Supplier<T> supplier, Consumer<Throwable> onError,
            BiConsumer<T, Throwable> onFinally) {
        var future = new CompletableFuture<T>();

        CompletableFuture.supplyAsync(() -> {
            T value = supplier.get();
            return new ResultOrException<T>(value, null);
        }).exceptionally(ex -> {
            onError.accept(ex);
            return new ResultOrException<T>(null, ex);
        }).whenComplete((resultOrException, t) -> {
            onFinally.accept(resultOrException.result, resultOrException.error);

            if (resultOrException.result != null) {
                future.complete(resultOrException.result);
            } else {
                future.completeExceptionally(resultOrException.error);
            }
        });

        return future;
    }

    private static void doFinally(long start) {
        System.out.println("metrics.addTime: Latency=" + Duration.ofNanos(System.nanoTime() - start));
    }

    private static void doCatch(Throwable t) {
        System.out.println("metrics.addCount: Fault=" + t.getCause().getClass().getSimpleName());
    }

    private static String doTry() {
        if (Math.random() > .5) {
            throw new RuntimeException();
        }

        return "value";
    }

    private static class ResultOrException<T> {
        private final T result;
        private final Throwable error;

        ResultOrException(T result, Throwable error) {
            this.result = result;
            this.error = error;
        }
    }
}
