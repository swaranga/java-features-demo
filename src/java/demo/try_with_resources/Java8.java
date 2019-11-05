package java.demo.try_with_resources;

public class Java8 {
    public static void main(String[] args) throws Exception {
        Resource r1 = new Resource();

        try (Resource r2 = r1) {
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
