package app;

import java.util.Scanner;

public class Account {
    double balance;


    private double getBalance() {
        return balance; // Наявні кошти на рахунку
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    private static double calculateBalance(double balance, double withdrawal) {
        return balance -withdrawal;
    }
}


