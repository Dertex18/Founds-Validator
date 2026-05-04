package app;
import java.util.Scanner;


public class BankApp {

    private static double getAmount(double balance) {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", balance);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public void run() {
        double amount = getAmount();
        try {
            account.withdraw(amount);
            System.out.printf("Funds are OK...");
        } catch (FundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
