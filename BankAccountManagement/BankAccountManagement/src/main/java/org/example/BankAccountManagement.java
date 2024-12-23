package org.example;

import java.util.Scanner;

public class BankAccountManagement {

    class BankAccount {
        private String accountHolder;
        private double balance;

        public BankAccount(String accountHolder, double initialBalance) {

            this.accountHolder = accountHolder;

            this.balance = initialBalance;
        }

        public void deposit(double amount) {

            if (amount > 0) {

                balance += amount;

                System.out.println("Deposited: $" + amount);

            } else {

                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {

            if (amount > 0 && amount <= balance) {

                balance -= amount;

                System.out.println("Withdrew: $" + amount);

            } else {

                System.out.println("Invalid or insufficient funds.");
            }
        }

        public void checkBalance() {

            System.out.println("Balance: $" + balance);
        }

        public String getAccountHolder() {

            return accountHolder;
        }
    }


    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder's name: ");

        String name = scanner.nextLine();

        System.out.print("Enter initial deposit amount: ");

        double initialDeposit = scanner.nextDouble();

        BankAccount account = new BankAccount(name, initialDeposit);

        int option;
        do {
            System.out.println("\nMenu:");

            System.out.println("1. Deposit");

            System.out.println("2. Withdraw");

            System.out.println("3. Check Balance");

            System.out.println("4. Exit");

            System.out.print("Choose an option: ");

            option = scanner.nextInt();

            switch (option) {

                case 1:

                    System.out.print("Enter deposit amount: ");

                    double depositAmount = scanner.nextDouble();

                    account.deposit(depositAmount);

                    break;

                case 2:

                    System.out.print("Enter withdrawal amount: ");

                    double withdrawAmount = scanner.nextDouble();

                    account.withdraw(withdrawAmount);

                    break;

                case 3:

                    account.checkBalance();

                    break;

                case 4:

                    System.out.println("Exiting...");

                    break;

                default:

                    System.out.println("Invalid option!");
            }

        } while (option != 4);

        scanner.close();
    }
}
