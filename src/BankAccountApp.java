import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountApp {
    public static ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello world! Welcome to the Bank of Win!");

        while (true) {
            System.out.println("Are you an existing customer? (0 to exit)");
            System.out.println("1. Yes");
            System.out.println("2. No");

            int input = Integer.parseInt(in.nextLine());

            if (input == 1) {
                System.out.println("What account number would you like to access?");
                String acctNum = in.nextLine();

                boolean found = false;
                int index = -1;
                for (int i = 0; i < bankAccounts.size(); i++) {
                    if (bankAccounts.get(i).getAcctNumber() == acctNum) {
                        found = true;
                        index = i;
                    }
                }

                if (!found) {
                    System.out.println("Account not found");
                } else if (found && index >= 0) {
                    mainMenu(bankAccounts.get(index));
                } else {
                    System.out.println("Error");
                }

            } else if (input == 2) {
                System.out.println("Let's make a new account!");
                BankAccount newAcct = new BankAccount();

                System.out.println("What is the name for the account?");
                String responseName = in.nextLine();
                newAcct.setName(responseName);

                System.out.println("What is the beginning balance for the account?");
                double responseBalance = Double.parseDouble(in.nextLine());
                newAcct.setBalance(responseBalance);

                bankAccounts.add(newAcct);
                mainMenu(bankAccounts.get((bankAccounts.size()) - 1));
            } else if (input == 0) {
                System.out.println("Goodbye");
                break;
            }
        }

        in.close();
    }

    public static void mainMenu(BankAccount acct) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello " + acct.getName() + ", welome to the main menu.");

        while (true) {
            System.out.println("""
                        Please select from the following options:
                        1. Check account balance
                        2. Make a withdrawal
                        3. Make a deposit
                        4. Transfer funds to another account
                        0. Exit
                    """);

            int choice = Integer.valueOf(in.nextLine());
            
            if (choice == 1) {
                acct.getBalance();
            } else if (choice == 2) {
                System.out.println("Enter an amount to withdraw:");
                double amt = Integer.valueOf(in.nextLine());
                acct.withdrawal(amt);
            } else if (choice == 3) {
                System.out.println("Enter an amount to deposit:");
                double amt = Integer.valueOf(in.nextLine());
                acct.deposit(amt);
            } else if (choice == 4) {
                System.out.println("Enter the account number you would like to transfer to:");
                String targetAcct = in.nextLine();

                boolean found = false;
                int index = -1;
                for (int i = 0; i < bankAccounts.size(); i++) {
                    if (bankAccounts.get(i).getAcctNumber() == targetAcct) {
                        found = true;
                        index = i;
                    }
                }

                if (!found) {
                    System.out.println("Account not found");
                } else if (found && index >= 0) {
                    System.out.println("Account located. What amount would you like to transfer?");
                    double amt = Double.valueOf(in.nextLine());
                    acct.transfer(bankAccounts.get(index), amt);
                    System.out.println("Transfer of " + amt
                            + " from " + acct.getName()
                            + " to " + bankAccounts.get(index).getName()
                            + " complete.");
                } else {
                    System.out.println("Error");
                }
            } else if (choice == 0) {
                break;
            }
        }
        in.close();
    }
}
