import java.util.Scanner;

import static java.lang.System.exit;

class bankAccount {
    int accountNumber;
    String accountHolder;
    float balance;

    void Deposit(double amount) {
        balance += amount;
    }

    void Withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    boolean goBack(boolean b) {
        boolean goBack = true;
        return goBack;
    }

    boolean displayAccountBalance() {
        System.out.println("Display account Number: " + accountNumber);
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
    boolean keepGoing = true;

        bankAccount bankAccount1 = new bankAccount();
        bankAccount1.accountNumber = 1234;
        bankAccount1.accountHolder = "Emiliano Rodriguez";
        bankAccount1.balance = 100;
        while (keepGoing) {
            System.out.println("What would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Balance");
            System.out.println("4. Sign out.");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

                switch (input) {
                    case "1":
                        System.out.println("How much do you want to deposit?");
                        double depositAmount = scanner.nextDouble();
                        bankAccount1.Deposit(depositAmount);
                        System.out.println("Your new balance is: " + bankAccount1.balance);
                        break;
                    case "2":
                        System.out.println("How much do you want to withdraw?");
                        double withdrawAmount = scanner.nextDouble();
                        bankAccount1.Withdraw(withdrawAmount);
                        System.out.println("Your new balance is: " + bankAccount1.balance);
                        break;
                    case "3":
                        System.out.println("Here are your account details:");
                        bankAccount1.displayAccountBalance();
                        break;
                    case "4":
                        keepGoing = false;
                        break;
                    default:
                        System.out.println("Invalid action");
                        break;
                }
            }
        }

    }

