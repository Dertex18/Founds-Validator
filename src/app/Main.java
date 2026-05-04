package app;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000.00);
        ConsoleUI app = new ConsoleUI(account);
        app.run(account);
    }
}

