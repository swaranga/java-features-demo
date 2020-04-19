package org.java.features.demo.collectors;

import java.util.stream.Stream;

public class Java8 {
    private static class MinMax {
        private double min;
        private double max;
        
        public MinMax(double min, double max) {
            this.min = min;
            this.max = max;
        }
        
        public void updateMin(double newMin) {
            this.min = Math.min(min, newMin);
        }
        
        public void updateMax(double newMax) {
            this.max = Math.max(max, newMax);
        }

        @Override
        public String toString() {
            return "MinMax [min=" + min + ", max=" + max + "]";
        }
    }
    
    public static void main(String[] args) {
        MinMax minMax = new MinMax(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
        
        Stream.generate(Math::random)
                .limit(1_000)
                .forEach(value -> {
                    minMax.updateMin(value);
                    minMax.updateMax(value);
                });

        System.out.println(minMax);
    }
}
