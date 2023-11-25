package org.example;

import java.util.List;

public class Client {

    private int clientId;
    private List<Order> orders;


    public Client(int clientId, List<Order> orders) {
        this.clientId = clientId;
        this.orders = orders;
    }
}