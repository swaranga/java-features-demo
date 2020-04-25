package org.java.features.demo.records;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Java14 {
    public static void main(String[] args) {
        PointRecord p1 = new PointRecord(0, 0);
        PointRecord p2 = new PointRecord(10, 10);

        System.out.println("Distance between p1 (" + p1 + ") and p2(" + p2 + ") = " + p1.distance(p2));
    }
}

record PointRecord(int x, int y) {
    public double distance(PointRecord other) {
        return sqrt(pow(x - other.x, 2) + pow(y - other.y, 2));
    }
}

record Square(PointRecord topLeft, PointRecord bottomRight) {}
