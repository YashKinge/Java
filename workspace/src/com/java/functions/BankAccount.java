package com.java.functions;

import java.util.Scanner;

public class BankAccount {

    private String accountHolderName;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number     : " + accountNumber);
        System.out.println("Current Balance    : ₹" + balance);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Account Number: ");
            long accNumber = sc.nextLong();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            BankAccount account = new BankAccount(name, accNumber, balance);

            account.displayBalance();

            System.out.print("Enter deposit amount: ");
            account.deposit(sc.nextDouble());

            System.out.print("Enter withdraw amount: ");
            account.withdraw(sc.nextDouble());

            System.out.println("Final Account Details:");
            account.displayBalance();
        }
    }
}
