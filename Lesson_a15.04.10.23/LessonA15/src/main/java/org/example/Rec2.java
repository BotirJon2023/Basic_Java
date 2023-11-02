package org.example;
public class Rec2 {
    public static void main(String[] args) {
        m((el, el1) -> {
            System.out.println(el);
            System.out.println("&&&&");
            System.out.println("$$$$");
        });
    }

    public static void m(Inter inter) {
        System.out.println("****");
        inter.get("1", "a");
    }
}

@FunctionalInterface
interface Inter {
    void get(String s, String d);
}