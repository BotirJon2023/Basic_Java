package org.example;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LogisticsCenter {

    private Queue<Order> readyOrders;

    public LogisticsCenter() {
        this.readyOrders = new ConcurrentLinkedQueue<>();
    }

    public synchronized void addReadyOrder(Order order) {
        this.readyOrders.add(order);
    }

    public void sendOrders() {
        while (!readyOrders.isEmpty()) {
            Order order = readyOrders.poll();

        }
    }
}

