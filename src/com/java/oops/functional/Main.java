package com.java.oops.functional;

public class Main {
    static void main() {

        /*Greet greet = new Greet() {
            @Override
            public void greet(String name, String msg) {
                System.out.println("hello");
            }*/


        Greet greet =((name, msg) -> System.out.println(name+","+msg));
        greet.greeting("ujwala","hello ");
        }

    }

