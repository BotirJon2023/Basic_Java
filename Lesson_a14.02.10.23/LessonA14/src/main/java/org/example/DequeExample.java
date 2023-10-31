package org.example;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeExample {

    public static void main(String[] args) {

        ArrayDeque<Cat> arrayDeque = new ArrayDeque<Cat>();

        Cat firstCat = new Cat(1, "Tom Cat");
        Cat secondCat = new Cat(2, "Barsik Cat");

        arrayDeque.add(firstCat);
        arrayDeque.add(secondCat);

        System.out.println(arrayDeque.removeLast());

        System.out.println("_______________________");

        System.out.println(arrayDeque.size());

        System.out.println("_______________________");

        System.out.println(arrayDeque.getLast());

        System.out.println(arrayDeque.size());

        Cat thirdCat = new Cat(3, "Stepanich Cat");

        arrayDeque.addFirst(thirdCat);
        System.out.println(arrayDeque.getFirst());

        Iterator<Cat> iterator = arrayDeque.iterator();

        for (int i = 0; i < arrayDeque.size(); i++) {

        }

        for (Cat cat : arrayDeque) {
            System.out.println(cat);
        }

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    private static class Cat {
        public Cat(int age, String name) {
        }
    }
}
