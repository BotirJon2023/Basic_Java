package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;


public class LessonA14 {

    interface Animal {
        // Определите методы, специфичные для животного
    }

    static class ZooAnimal implements Animal {
        // Реализуйте методы интерфейса Animal для конкретного животного
    }

    static class ZooDatabase {
        private Stack<Animal> animalStack;

        public ZooDatabase() {
            animalStack = new Stack<>();
        }

        public void addAnimal(Animal animal) {
            animalStack.push(animal);
        }

        public Animal removeAnimal() {
            if (!animalStack.isEmpty()) {
                return animalStack.pop();
            } else {
                return null; // или выбросьте исключение, если база данных пуста
            }
        }
    }
}
