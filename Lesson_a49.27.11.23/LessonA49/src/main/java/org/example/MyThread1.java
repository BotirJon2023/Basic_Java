package org.example;

public class MyThread1 extends Thread {
    private int millis;

    public MyThread1(String name, int millis) {
        setName(name);
        this.millis = millis;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Поток %s выполнился %d раз.%n", getName(), i + 1);
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        }
    }

}
