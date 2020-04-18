package org.java.features.demo.npe;

public class NpeDemo {
    public static void main(String[] args) {
        A a = new A();
        
        System.out.println(a.b.c.d.value);
    }
}

class A {
    B b;
}

class B {
    C c;
}

class C {
    D d;
}

class D {
    Boolean value;
}
