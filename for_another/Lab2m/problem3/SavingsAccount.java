public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int acc, double rate) {
        super(acc);
        interestRate = rate;
    }

    public void addInterest() {

        double interest = getBalance() * interestRate / 100;
        deposit(interest);

    }

    @Override
    public String toString() {
        return "Savings " + super.toString() + " Interest: " + interestRate + "%";
    }
}