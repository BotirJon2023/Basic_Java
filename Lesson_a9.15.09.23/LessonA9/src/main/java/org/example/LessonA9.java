package org.example;

public class LessonA9 {

    int number = 18;
    static final int n2 = 18;


    void play();
    void play(Playable playable);

    static void method() {
        System.out.println("Static method");

    }

    default void defauldMethod(){
        System.out.println("Default method");
    }

}
