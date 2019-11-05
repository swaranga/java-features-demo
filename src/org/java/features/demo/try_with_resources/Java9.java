package org.java.features.demo.try_with_resources;

public class Java9 {
    public static void main(String[] args) throws Exception {
        Resource r1 = new Resource();

        try (r1) {
            System.out.println();
        }
    }

    private static class Resource implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Close");
        }
    }
}
