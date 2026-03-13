public class Account {

    private double balance;
    private int accountNumber;

    public Account(int a) {
        accountNumber = a;
        balance = 0.0;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        balance -= sum;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void transfer(double amount, Account other) {
        withdraw(amount);
        other.deposit(amount);
    }

    public String toString() {
        return "Account #" + accountNumber + " Balance: " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}