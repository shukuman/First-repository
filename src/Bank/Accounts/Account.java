package Bank.Accounts;
public abstract class Account {
    public int balance;
    private String name;
    public Account(String name, int balance) {
        this.balance = balance;
        this.name = name;
    }
    public String getBalance() {
        return ("Сумма на счету: " + balance);
    }
    public String getName() {
        return name;
    }
    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);
}
