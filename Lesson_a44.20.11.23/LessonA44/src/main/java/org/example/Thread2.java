package org.example;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 10000; i < 10010; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Threat " + i);
        }
    }

}
