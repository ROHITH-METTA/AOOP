package bankaccmanagement;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread user1 = new Thread(new User(account, 1000, "deposit"));
        Thread user2 = new Thread(new User(account, 500, "withdraw"));
        Thread user3 = new Thread(new User(account, 300, "deposit"));
        Thread user4 = new Thread(new User(account, 700, "withdraw"));

        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}
