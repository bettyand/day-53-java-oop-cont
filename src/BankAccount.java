import java.util.Scanner;

public class BankAccount {
    Scanner in = new Scanner(System.in);
    private String name;
    private double balance;
    private String acctNumber;

    public BankAccount(String customerName, int accountBalance, String acctNumber) {
        this.name = customerName;
        this.balance = accountBalance;
        this.acctNumber = acctNumber;
    }

    public BankAccount() {
        System.out.println("Let's make a new account!");
        System.out.println("What is the name for the account?");
        this.name = in.nextLine();
        System.out.println("What is the beginning balance for the account?");
        this.balance = Double.parseDouble(in.nextLine());
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getAcctNumber() { return acctNumber; }
    public void setAcctNumber(String acctNumber) { this.acctNumber = acctNumber; }


    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        balance -= withdrawalAmount;
    }

    @Override
    public String toString() {
        return "Account #" + acctNumber + " belongs to " + name + " and the balance is $" + balance;
    }

    public void mainMenu(String acctNumber) {
        // use acctNumber to find it in the ArrayList
        System.out.println("Hello " + getName() + "!");
        System.out.println("Welcome to the Main Menu, what would you like to do today?");
    }
}
