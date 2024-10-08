package bankaccmanagement;

public class User implements Runnable {
    private final BankAccount account;
    private final double amount;
    private final String operation;

    public User(BankAccount account, double amount, String operation) {
        this.account = account;
        this.amount = amount;
        this.operation = operation;
    }

    @Override
    public void run() {
        if ("deposit".equalsIgnoreCase(operation)) {
            account.deposit(amount);
        } else if ("withdraw".equalsIgnoreCase(operation)) {
            account.withdraw(amount);
        }
    }
}
