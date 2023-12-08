package org.example;


public class SimpleAuditService implements AuditService{
    @Override
    public void logNewTrade(Trade trade) {
        throw new RuntimeException();
    }
}