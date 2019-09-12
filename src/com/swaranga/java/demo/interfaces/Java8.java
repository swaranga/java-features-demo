package com.swaranga.java.demo.interfaces;

public interface Java8 {
    default int getValue() {
        return 5;
    }
    
    default int getOtherValue() {
        return 5 + 5;
    }
    
    public static void main(String[] args) {
        
    }
}
