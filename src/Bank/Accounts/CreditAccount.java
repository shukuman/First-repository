package Bank.Accounts;

public class CreditAccount extends Account {
    private static final String name = "кредитный счет";

    public CreditAccount(int balance) {
        super(name, balance);
    }

    @Override
    public String getBalance() {
        return ("Баланс кредитного счета: " + balance);
    }

    @Override
    public void pay(int amount) {
        if (balance == 0) {
            balance -= amount;
            System.out.println("Баланс кредитного счета после оплаты: " + balance);
        } else {
            System.out.println("Невозможно выполнить оплату с кредитного счета, так как баланс равен "
                    + balance + ". Для оплаты необходимо пополнить баланс на " + -balance);
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Невозможно выполнить перевод с кредитного счета");
    }

    @Override
    public void addMoney(int amount) {
        if (balance + amount <= 0) {
            System.out.println("Баланс кредитного счета после пополнения: " + (balance += amount));
        } else {
            System.out.println("Баланс кредитного счета не может быть положительным, счет необходимо пополнить на " + -balance);
        }
    }
}
