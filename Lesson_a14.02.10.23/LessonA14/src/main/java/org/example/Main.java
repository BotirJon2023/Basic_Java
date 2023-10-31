package org.example;

public class Main {
    public static void main(String[] args) {
        LessonA14.ZooDatabase zooDB = new LessonA14.ZooDatabase();

        LessonA14.Animal lion = new LessonA14.ZooAnimal();
        LessonA14.Animal elephant = new LessonA14.ZooAnimal();

        zooDB.addAnimal(lion);
        zooDB.addAnimal(elephant);

        LessonA14.Animal removedAnimal = zooDB.removeAnimal();
        System.out.println("Удалено животное: " + removedAnimal);
    }
}
