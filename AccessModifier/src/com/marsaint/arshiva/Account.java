package com.marsaint.arshiva;

import java.util.ArrayList;

public class Account {

    public String name;
    public int balance;
    public ArrayList<Integer> transactions;

    public Account(String name) {
        this.name = name;
        this.balance = 0;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(amount);
            System.out.println("deposit: " + amount);
        } else {
            System.out.println("cannot deposit negative amount");
        }
    }

    public void withdraw(int amount) {
        int withdraw = -amount;
        if (balance > amount) {
            balance += withdraw;
            transactions.add(withdraw);
            System.out.println("withdraw: " + amount);
        } else {
            System.out.println("balance not enough");
        }
    }

    public void calculateBalance() {
        balance = 0; // reset balance
        for (int i : transactions) {
            balance += i;
            System.out.println("transaction: " + i);
        }
        System.out.println("total balance: " + balance);
    }
}
