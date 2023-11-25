package org.example;

public class BankAccount {

    private int sum;

    public BankAccount(int initialSum) {
        this.sum = initialSum;
    }

    public synchronized void deposit(int amount) {
        sum += amount;
        System.out.println("Пополнение счёта на " + amount + " Евро. Общая сумма: " + sum + " Евро.");
    }

    public synchronized void withdraw(int amount) {
        if (sum >= amount) {
            sum -= amount;
            System.out.println("Снятие со счёта " + amount + " Евро. Общая сумма: " + sum + " Евро.");
        } else {
            System.out.println("Недостаточно средств на счёте. Общая сумма: " + sum + " Евро.");
        }
    }
}
