package org.example;

public class cat {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;

    public String getName() {
        return name;
    }

    private Object elementFromStack;
    Cat newCat = (Cat) elementFromStack.clone();

    private final String name;

    public static void doSome(Cloneable cat) {
        Object clone = cat.clone();

    }

    private class Cat {
    }
}
