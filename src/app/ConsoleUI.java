package app;
import java.util.Scanner;


public class ConsoleUI {

    private Account account;
    public ConsoleUI(Account account) {
        this.account = account;
    }
    private  double getAmount() {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", account.getBalance());
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public void run() {
        double amount = getAmount();
        try {
            account.withdraw(amount);
            System.out.printf("Funds are OK. Purchase paid.%nBalance is USD %.2f", account.getBalance());;
        } catch (FundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
