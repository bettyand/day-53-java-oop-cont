public class BankAccount {
    private String name;
    private double balance;
    private String acctNumber;

    public BankAccount(String customerName, int accountBalance, String acctNumber) {
        this.name = customerName;
        this.balance = accountBalance;
        this.acctNumber = acctNumber;
    }

    public BankAccount() {}

    public String getName() { 
        return this.name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public double getBalance() { 
        return this.balance; 
    }
    public void setBalance(double balance) { 
        this.balance = balance; 
    }

    public String getAcctNumber() { 
        return this.acctNumber; 
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        this.balance -= withdrawalAmount;
    }

    public void transfer(BankAccount targetAcct, double transferAmount) {
        withdrawal(transferAmount);
        targetAcct.deposit(transferAmount);
    }

    @Override
    public String toString() {
        return "Account #" + acctNumber + " belongs to " + name + " and the balance is $" + balance;
    }
}
