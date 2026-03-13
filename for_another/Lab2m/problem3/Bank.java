import java.util.Vector;

public class Bank {

    private Vector<Account> accounts = new Vector<>();

    public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(Account acc) {
        accounts.remove(acc);
    }

    public void update() {

        for(Account a : accounts){

            if(a instanceof SavingsAccount){
                ((SavingsAccount)a).addInterest();
            }

            if(a instanceof CheckingAccount){
                ((CheckingAccount)a).deductFees();
            }

        }

    }

    public void printAccounts(){

        for(Account a : accounts){
            a.print();
        }

    }
}