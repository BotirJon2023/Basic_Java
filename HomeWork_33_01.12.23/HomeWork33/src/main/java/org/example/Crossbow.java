package org.example;

import java.util.Scanner;

public class Crossbow {
    private int arrows;
    private Object lock;

    public Crossbow() {
        this.arrows = 0;
        this.lock = new Object();
    }

    public void shoot() {
        synchronized (lock) {
            while (true) {
                if (arrows > 0) {
                    arrows--;
                    System.out.println("Robin Hood shoots an arrow");
                } else {
                    System.out.println("Robin Hood waits for arrows...");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void replenishArrows(int numArrows) {
        synchronized (lock) {
            arrows += numArrows;
            System.out.println("Servant brings " + numArrows + " arrows");
            lock.notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Crossbow crossbow = new Crossbow();
        Scanner scanner = new Scanner(System.in);

        Thread robinHoodThread = new Thread(() -> crossbow.shoot());
        Thread servantThread = new Thread(() -> {
            while (true) {
                System.out.println("Enter the number of arrows to bring:");
                int numArrows = scanner.nextInt();
                crossbow.replenishArrows(numArrows);
            }
        });

        robinHoodThread.start();
        servantThread.start();

        robinHoodThread.join();
        servantThread.join();
    }
}

