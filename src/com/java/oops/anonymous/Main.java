package com.java.oops.anonymous;

public class Main {
    static void main() {
    // GreetingImpl greeting=new GreetingImpl();
    //greeting.greet();
    //greeting.greet("Hello, How are u today?");

    //anomymous inner class
    //no one change code or access
    //no one extends the class

        Greeting greeting = new Greeting() {


            @Override
            public void greet() {
                System.out.println("hello,how are you!");
            }

            @Override
            public void greet(String msg) {
                System.out.println(msg);

            }
        };
        greeting.greet();
        greeting.greet("hey how are you?");
}
}
