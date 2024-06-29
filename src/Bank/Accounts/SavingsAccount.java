package Bank.Accounts;

public class SavingsAccount extends Account {
    private static final String name = "сберегательный счет";

    public SavingsAccount(int balance) {
        super(name, balance);
    }

    @Override
    public String getBalance() {
        return ("Баланс сберегательного счета: " + balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Невозможно выполнить оплату со сберегательного счета");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance >= amount) {
            account.balance += amount;
            balance -= amount;
            System.out.printf("Баланс сберегательного счета после перевода на %s: %s\n",
                    account.getName(), balance);
        } else {
            System.out.println("Невозможно выполнить перевод со сберегательного счета, так как на балансе: " + balance);
        }
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("Баланс сберегательного счета после пополнения: " + balance);
    }
}
