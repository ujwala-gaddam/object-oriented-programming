package com.java.oops.anonymous;

public class GreetingImpl implements Greeting{
    @Override
    public void greet() {
        System.out.println("hello,how r u");
    }

    @Override
    public void greet(String msg) {
        System.out.println("hello"+msg);
    }
}
