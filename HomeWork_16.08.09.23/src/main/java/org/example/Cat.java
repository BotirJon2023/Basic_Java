package org.example;

import java.util.Objects;

public class Cat extends Animal {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void bark(){
        System.out.println("Miau-Miau!!!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void sayHello() {
        System.out.println("Miau-Miau!");
    }

    @Override
    public void play(Playable playable) {
        System.out.println("Cats plays with " + playable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (!this.getName().equals(cat.getName()) || this.getAge() != cat.getAge() || this.isHungry() != cat.isHungry()) return false;

        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }
}