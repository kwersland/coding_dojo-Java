

public class BankAccount {
    
    private double checking;
    private double savings;
    public static int numberOfAccounts;
    public static double totalMoneyInBank;

    // Constructor
    public BankAccount(){
        this.checking = 0.0;
        this.savings = 0.0;
        numberOfAccounts++;
    }

    // Methods
    public void deposit(double amount, String account) {
        if (account == "checking") {
            this.checking += amount;
            totalMoneyInBank += amount;
        } else if (account == "savings"){
            this.savings += amount;
            totalMoneyInBank += amount;
        } else {
            System.out.println("No account called "+ account);
        }
    }

    public void withdraw(double amount, String account) {
        if (account == "checking") {
            this.checking -= amount;
            System.out.println("You withdrew "+amount+" from "+account);
            totalMoneyInBank -= amount;
        } else if (account == "savings"){
            this.savings -= amount;
            System.out.println("You withdrew "+amount+" from "+account);
            totalMoneyInBank -= amount;
        } else {
            System.out.println("No account called "+ account);
        }
    }

    public double totalBalance() {
        double totalBalance = this.checking + this.savings;
        return totalBalance;
    }

    public int accountsOpen() {
        return this.numberOfAccounts;
    }

    //Getters
    public double getChecking() {
        return this.checking;
    }

    public double getSavings() {
        return this.savings;
    }

}