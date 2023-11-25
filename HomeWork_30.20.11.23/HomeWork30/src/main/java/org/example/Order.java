package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private String status;
    private List<String> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.status = "New";
        this.products = new ArrayList<>();
    }

    public synchronized void addProduct(String product) {
        this.products.add(product);
    }

    public synchronized void changeStatus(String status) {
        this.status = status;
    }
}

