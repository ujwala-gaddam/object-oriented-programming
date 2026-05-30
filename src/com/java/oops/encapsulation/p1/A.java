package com.java.oops.encapsulation.p1;

public class A {
    protected int value = 1000;

    public A() {
        System.out.println("A()constructor called");
        this.value = value;
    }
    public void m1(){
        System.out.println("m1() called");
    }

    static void main() {
        A a;
        a = new A();
        a.m1();
        System.out.println(a.value);
    }
}
