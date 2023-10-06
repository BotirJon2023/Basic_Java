package org.example.LessonAB5;

public class LessonA5 implements Interf {

    public class Test1 implements Interf, Runnable {

    public static void main(String[] args) {
Thread thread = new Thread(new Test1());
        Test1 test1 = new Test1();
        test1.absM();
        test1.defM();


    }

    @Override
    public void absM() {

    }

    @Override
    public void defM() {
        Interf.super.defM();
    }

    interface Interf {
void absM();

default void defM() {
    System.out.println("DEF M");

}

static void statM() {
    System.out.println("STAT M");





