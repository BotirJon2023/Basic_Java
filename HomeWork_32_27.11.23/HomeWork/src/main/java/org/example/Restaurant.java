package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Restaurant {
    public static void main(String[] args) {

        List<String> dishes = Arrays.asList("Борщ", "Пельмени", "Омлет", "Салат", "Картофельное пюре");


        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);


        Thread cookThread = new Thread(new Cook(dishes, queue));
        Thread waiterThread1 = new Thread(new Waiter1(queue));
        Thread waiterThread2 = new Thread(new Waiter2(queue));

        cookThread.start();
        waiterThread1.start();
        waiterThread2.start();

        try {
            // Ожидание завершения всех потоков
            cookThread.join();
            waiterThread1.join();
            waiterThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Cook implements Runnable {
        private final List<String> dishes;
        private final BlockingQueue<String> queue;

        public Cook(List<String> dishes, BlockingQueue<String> queue) {
            this.dishes = dishes;
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                for (String dish : dishes) {
                    System.out.println("Повар готовит блюдо: " + dish);
                    queue.put(dish); // Передача блюда официантам
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Waiter1 implements Runnable {
        private final BlockingQueue<String> queue;

        public Waiter1(BlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String dish = queue.take(); // Получение блюда от повара
                    System.out.println("Официант-1 принимает блюдо: " + dish);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Waiter2 implements Runnable {
        private final BlockingQueue<String> queue;

        public Waiter2(BlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String dish = queue.take(); // Получение блюда от повара
                    System.out.println("Официант-2 принимает блюдо: " + dish);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
