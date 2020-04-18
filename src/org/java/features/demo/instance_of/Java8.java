package org.java.features.demo.instance_of;

public class Java8 {
    public static void main(String[] args) {
        Object o = "";
        
        if (o instanceof String) {
            String s = (String) o;
            System.out.println(s.length());
        }
    }
}
