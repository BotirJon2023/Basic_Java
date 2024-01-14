package org.example;

public class LessonA45 {

    public static final Object LOCK1 = new Object();
    public static final Object LOCK2 = new Object();


    public static void main(String[] args) {
        Thread T1 = new Thread();
        Thread T2 = new Thread();

        T1.setName("T-1");
        T2.setName("T-2");

        T1.start();
        T2.start();

    }

}

class TH3 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Try to catch LOCK1");
        synchronized (LessonA45.LOCK1) {
            System.out.println(Thread.currentThread().getName() + "T-1 caught LOCK1");
            System.out.println(Thread.currentThread().getName() + "T-1 try to catch LOCK2");
            synchronized (LessonA45.LOCK2) {
            System.out.println(Thread.currentThread().getName() + "T-1: LOCK1 and LOCK2");
            }

        }
    }
}

class TH4 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Try to catch LOCK2");
        synchronized (LessonA45.LOCK1) {
            System.out.println(Thread.currentThread().getName() + "T-2 caught LOCK2");
            System.out.println(Thread.currentThread().getName() + "T-2 try to catch LOCK1");
            synchronized (LessonA45.LOCK2) {
                System.out.println(Thread.currentThread().getName() + "T-2: LOCK2 and LOCK1");

            }

        }
    }
}