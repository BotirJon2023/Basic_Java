package org.example;

public class CreateTradeException extends RuntimeException {
    public CreateTradeException() {
        super("***Cannot create such trade!***");
    }
}