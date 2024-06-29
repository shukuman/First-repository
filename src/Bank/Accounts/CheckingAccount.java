package Bank.Accounts;

public class CheckingAccount extends Account {
    private static final String name = "расчетный счет";

    public CheckingAccount(int balance) {
        super(name, balance);
    }

    @Override
    public String getBalance() {
        return ("Баланс расчетного счета: " + balance);
    }

    @Override
    public void pay(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Баланс расчетного счета после оплаты: " + balance);
        } else {
            System.out.println("Невозможно выполнить оплату с расчетного счета");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance >= amount) {
            account.balance += amount;
            balance -= amount;
            System.out.printf("Баланс расчетного счета после перевода на %s: %s\n",
                    account.getName(), balance);
        } else {
            System.out.println("Невозможно выполнить перевод с расчетного счета, так как на балансе: " + balance);
        }
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("Баланс расчетного счета после пополнения: " + balance);
    }
}
