package org.example;

import java.util.function.Consumer;

public class References {

    public static void main(String[] args) {

        Consumer consumer = (s) -> doSomething();
        Consumer<String> consumer1 = References::doSomething;
        References examples = new References();
        Consumer<String> consumer2 = examples::doSomethingNonStatic;

        consumer.accept("!!!");
        consumer1.accept("222");


    }

    static void doSomething(String s) {
        System.out.println("doing something with" + s);
    }

    void doSomethingNonStatic(String s) {
        System.out.println("do something nonstatic with " + s);

        void someMethod(String s) {
            Consumer<String> consumer = this::doSomethingNonStatic;
        }

    }


}
