package app;

import java.util.Scanner;

public class Account {
    private double balance;


    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws FundsException {
        if (amount > balance) {
            throw new FundsException("Insufficient funds!");
        } else {
            this.balance = this.balance - amount;
        }
    }
}


