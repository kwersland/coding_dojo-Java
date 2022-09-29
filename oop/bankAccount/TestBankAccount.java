
public class TestBankAccount {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.deposit(100, "savings");
        account1.deposit(300, "checking");
        System.out.println(account1.getSavings());
        account2.deposit(400, "checking");
        account2.deposit(200, "savings");
        System.out.println(account2.getChecking());
        account3.deposit(200, "savings");
        account3.deposit(500, "checking");
        System.out.println(account3.getSavings());

        System.out.println(account1.numberOfAccounts);

        account1.withdraw(75, "savings");
        System.out.println(account1.getSavings());

        account2.withdraw(100, "checking");
        System.out.println(account2.getChecking());

        account3.withdraw(100, "checking");
        account3.withdraw(100, "savings");
        System.out.println(account3.getChecking());
        System.out.println(account3.getSavings());

        System.out.println(account1.totalBalance());
        System.out.println(account2.totalBalance());
        System.out.println(account3.totalBalance());
    }
}