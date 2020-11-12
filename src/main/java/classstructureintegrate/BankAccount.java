package classstructureintegrate;

public class BankAccount {

    // Bankszámlaszám
    private String accountNumber;

    // Számlatulajdonos
    private String owner;

    // Egyenleg
    private int balance;

    // Core
    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    // Befizetés
    public void deposit(int amount) {
        balance = balance + amount;
    }

    // Kifizetés
    public void withdraw(int amount) {
        balance = balance - amount;
    }

    // Átutalás
    public void transfer(BankAccount to, int amount) {
        withdraw(amount);
        to.deposit(amount);
    }
    // Számlakivonat
    public String getInfo() {
        return owner + " (" + accountNumber + "):" + balance + " Ft";
    }
}
