package com.marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        Account xAccount = new Account("Arshiva");

        xAccount.deposit(1000);
        xAccount.deposit(200);
        xAccount.deposit(400);
        xAccount.deposit(2000);
        xAccount.withdraw(500);
        xAccount.withdraw(1500);
        xAccount.deposit(1200);

        xAccount.calculateBalance();
        System.out.println(xAccount.getBalance());

    }
}
