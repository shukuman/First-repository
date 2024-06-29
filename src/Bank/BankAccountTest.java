package Bank;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount person = new BankAccount();

        person.number = "KZ123456789";
        person.name = "Дария";
        person.balance = 250000;

        System.out.println("Current balance of account: " + person.balance);

        person.cashIn(3000.0);
        System.out.println("Current balance of account after deposit: " + person.balance);

        person.cashOut(80000.0);
        System.out.println("Current balance of account after withdrawal: " + person.balance);
    }
}
