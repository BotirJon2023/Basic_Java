package org.example;

public class Interruption {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Started!");
        IThread t1 = new IThread();

        t1.start();
        Thread.sleep(2000);

        t1.interrupt();
        t1.join();

        System.out.println("Main End!");


    }


}

class IThread extends Thread {
    double digit = 0d;

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            if (isInterrupted()) {
                System.out.println("*** ! ***");
                return;
            }
            digit += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Zzzz ......... ");
            }

        }
        System.out.println(digit);

    }
}
