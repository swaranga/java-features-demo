package org.java.features.demo.instance_of;

public class Java14 {
    public static void main(String[] args) {
        Object o = "";
        
        if (o instanceof String s) {
            System.out.println(s.length());
        }
    }
}
