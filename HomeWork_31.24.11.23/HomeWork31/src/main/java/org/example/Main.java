package org.example;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                account.deposit(1000);
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5000000; i++) {
                account.withdraw(200);
            }
        });

        depositThread.start();
        withdrawThread.start();
    }
}