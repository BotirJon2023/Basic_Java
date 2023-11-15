package org.example;

public class Box<T extends Garbage> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public Box() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItemWeight() {
    }

//    @Override
//    public String toString() {
//        return "Box{" +
//                "item=" + item +
//                " weight "+ getItemWeigt() +
//                '}';
//    }

//    public double getItemWeigt() {
//        return item == null ? 0 : item.getWeight();
//    }
}