public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount s1 = new SavingsAccount(1,5);
        CheckingAccount c1 = new CheckingAccount(2);

        s1.deposit(1000);

        c1.deposit(200);
        c1.withdraw(50);
        c1.deposit(30);
        c1.withdraw(10);

        bank.openAccount(s1);
        bank.openAccount(c1);

        bank.update();

        bank.printAccounts();

    }
}