package org.java.features.demo.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class Java9 {
    public static void main(String[] args) throws Exception {
        oldAPI("/workplace/swaranga/workspaces/java-features-demo/java-features-demo/postgresql.log.2019-08-28-11");
        newApi("/workplace/swaranga/workspaces/java-features-demo/java-features-demo/postgresql.log.2019-08-28-11");
    }

    private static void oldAPI(String fileName) throws Exception {
        long start = System.nanoTime();

        BufferedReader r = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8));

        int sum = r.lines().parallel().mapToInt(String::length).sum();

        System.out.println(
                "Sync API, Latency: " + Duration.ofNanos(System.nanoTime() - start) + ", Character count: " + sum);

        r.close();
    }

    private static void newApi(String fileName) throws Exception {
        long start = System.nanoTime();

        int sum = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8).parallel().mapToInt(String::length).sum();

        System.out.println(
                "New API, Latency: " + Duration.ofNanos(System.nanoTime() - start) + ", Character count: " + sum);
    }
}
