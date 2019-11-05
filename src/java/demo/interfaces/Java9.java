package java.demo.interfaces;

public interface Java9 {
    default int getValue() {
        return value();
    }
    
    default int getOtherValue() {
        return value() + value();
    }
    
    private int value() {
        return 5;
    }
    
    static int s_getVal() {
        return s_p_getVal();
    }
    
    private static int s_p_getVal() {
        return 15;
    }
    
    public static class Impl implements Java9 {
        void run() {
            // this.value(); - error
        }
    }
}
