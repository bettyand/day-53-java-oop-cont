import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        System.out.println("Hello world! Welcome to the Bank of Win!");
        System.out.println("Are you an existing customer? (0 to exit)");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int input = Integer.parseInt(in.nextLine());

        if (input == 1) {
            System.out.println("Welcome back! Please enter your account number:");
            // String acctNum = in.nextLine();

        } else if (input == 2) {
            bankAccounts.add(new BankAccount());
        }

        in.close();
    }
}
