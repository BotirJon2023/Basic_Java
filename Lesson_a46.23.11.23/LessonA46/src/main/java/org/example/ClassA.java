package org.example;

public class ClassA {

    public static void main(String[] args) {


    }


    public class classA {

        public synchronized void methodA() {
            System.out.println("Поток с именем " + Thread.currentThread().getName() + " начал method A ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Поток с именем " + Thread.currentThread().getName() + " закончил method A ");
        }
    }
    public class classB {

        public synchronized void methodA() {
            System.out.println("Поток с именем " + Thread.currentThread().getName() + " начал method B ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Поток с именем " + Thread.currentThread().getName() + " закончил method B ");
        }
    }

}