package org.java.features.demo.records;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Java8 {
    public static void main(String[] args) {
        PointClass p1 = new PointClass(0, 0);
        PointClass p2 = new PointClass(10, 10);
        
        System.out.println("Distance between p1 (" + p1 + ") and p2(" + p2 + ") = " + p1.distance(p2));
    }
}

class PointClass {
    private final int x;
    private final int y;
    
    public PointClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public double distance(PointClass other) {
        return sqrt(pow(x - other.x, 2) + pow(y - other.y, 2));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PointClass other = (PointClass) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
