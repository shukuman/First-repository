package Bank.Accounts;

public class Test {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(0);
        Account creditAccount = new CreditAccount(0);
        Account checkingAccount = new CheckingAccount(0);

        System.out.println(creditAccount.getBalance());
        creditAccount.pay(20000);
        creditAccount.addMoney(3000);
        creditAccount.pay(12000);
        creditAccount.transfer(savingsAccount, 24000);
        creditAccount.addMoney(17000);
        creditAccount.pay(25000);
        System.out.println();

        System.out.println(checkingAccount.getBalance());
        checkingAccount.addMoney(78000);
        checkingAccount.pay(65000);
        checkingAccount.transfer(savingsAccount, 2000);
        System.out.println();

        System.out.println(savingsAccount.getBalance());
        savingsAccount.addMoney(56000);
        savingsAccount.pay(6000);
        savingsAccount.transfer(creditAccount, 20000);
        System.out.println();

        System.out.println(creditAccount.getBalance());
    }
}
