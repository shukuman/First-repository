package Bank;

public class BankAccount {
    String number;
    String name;
    double balance;

    public void cashIn(double amount) {
        balance += amount;
    }
    public void cashOut(double amount) {
        if(balance >= amount) {
            balance -=amount;
        } else {
            System.out.println("Error");
        }
    }
}
