package org.example;

import java.util.UUID;

public class Processor {

    public int count = 0;
    private String id;

    public Processor(String id) {
        this.id = id;
    }

    @Deprecated
    public void process(int data) {
        System.out.println("Processing " + data);
    }

    private void changeId() {
        id = UUID.randomUUID().toString();
    }
}
