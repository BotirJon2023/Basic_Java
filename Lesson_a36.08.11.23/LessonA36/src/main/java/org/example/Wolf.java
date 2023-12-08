package org.example;

import com.github.javafaker.Faker;

import java.util.*;

public class Wolf {
    String name;
    int age;

    public Wolf(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compareTo(Wolf o) {
//        return this.age - o.age;
//    }
}

class Main {
    public static void t(List<Wolf> wolfArrayList) {

    }

    private static final Faker FAKER = new Faker();
    public static void main(String[] args) {
        Wolf w1 = new Wolf(FAKER.name().name(), 10);
        Wolf w2 = new Wolf(FAKER.name().name(), 10);

        Set<Wolf> set = new TreeSet<>();
        set.add(w1);
        set.add(w2);
        System.out.println(set);
    }
}