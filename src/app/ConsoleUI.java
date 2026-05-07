package app;

import java.util.Scanner;


public class ConsoleUI {

    private double getAmount(Account account) {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", account.getBalance());
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero!");
            }
            return amount;
        } else {
            throw new IllegalArgumentException("Amount must be a number!");
        }
    }

    public void run(Account account) {
        try {
            double amount = getAmount(account);
            account.withdraw(amount);
            System.out.printf("Funds are OK. Purchase paid.%nBalance is USD %.2f", account.getBalance());
        } catch (FundsException | IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
