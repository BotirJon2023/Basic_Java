package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderManagementSystem {

    private List<OrderProcessor> orderProcessors;
    private volatile boolean running;

    public OrderManagementSystem() {
        this.orderProcessors = new ArrayList<>();
        this.running = false;
    }

    public void start() {
        this.running = true;

        // Create and start order processing threads
        for (int i = 0; i < 3; i++) {
            OrderProcessor orderProcessor = new OrderProcessor();
            this.orderProcessors.add(orderProcessor);
            OrderProcessingThread thread = new OrderProcessingThread(orderProcessor);
            thread.start();
        }

        // Start order generator thread
        OrderGeneratorThread generatorThread = new OrderGeneratorThread(this);
        generatorThread.start();

        // Start monitoring thread
        MonitoringThread monitoringThread = new MonitoringThread(this);
        monitoringThread.start();
    }

    public void stop() {
        this.running = false;
    }

    public synchronized void distributeOrder(Order order) {
        // Find the order processor with the least load
        OrderProcessor minLoadProcessor = this.orderProcessors.get(0);
        for (OrderProcessor orderProcessor : this.orderProcessors) {
            if (orderProcessor.getOrderQueue().size() < minLoadProcessor.getOrderQueue().size()) {
                minLoadProcessor = orderProcessor;
            }
        }

        // Add the order to the chosen order processor's queue
        minLoadProcessor.addOrder(order);
    }

    public boolean isRunning() {
        return running;
    }
}
class OrderProcessingThread extends Thread {
    private OrderProcessor orderProcessor;

    public OrderProcessingThread(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    @Override
    public void run() {
        while (true) {
            Order order = orderProcessor.getOrder();
            if (order == null) {
                if (!orderProcessor.isProcessing()) {
                    break;
                } else {
                    continue;
                }
            }

            // Process the order
            // ...

            // Change the status of the order
            order.changeStatus("Processed");
        }
    }
}

class OrderGeneratorThread extends Thread {
    private OrderManagementSystem orderManagementSystem;
    private static int orderId = 1;

    public OrderGeneratorThread(OrderManagementSystem orderManagementSystem) {
        this.orderManagementSystem = orderManagementSystem;
    }

    @Override
    public void run() {
        while (orderManagementSystem.isRunning()) {
            // Generate a new order
            Order order = new Order(orderId++);
            order.addProduct("Product 1");
            order.addProduct("Product 2");

            // Add the order to the order management system
            orderManagementSystem.distributeOrder(order);

            try {
                // Sleep for a random amount of time
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MonitoringThread extends Thread {
    private OrderManagementSystem orderManagementSystem;

    public MonitoringThread(OrderManagementSystem orderManagementSystem) {
        this.orderManagementSystem = orderManagementSystem;
    }

    @Override
    public void run() {
        while (orderManagementSystem.isRunning()) {
            // Print information about the order statuses
            // ...

            try {
                // Sleep for a specified amount of time
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
