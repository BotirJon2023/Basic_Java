package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class OrderProcessor {

    private Queue<Order> orderQueue;

    public OrderProcessor() {
        this.orderQueue = new ConcurrentLinkedQueue<>();
    }

    public synchronized void addOrder(Order order) {
        this.orderQueue.add(order);
    }

    public synchronized Order getOrder() {
        return this.orderQueue.poll();
    }

    public boolean isProcessing() {
    return false;

    }

    public Collection<Object> getOrderQueue() {
        return Collections.singleton(orderQueue);
    }

    public void setOrderQueue(Queue<Order> orderQueue) {
        this.orderQueue = orderQueue;
    }
}
