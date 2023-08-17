
class bankAccount {
    int accountNumber;
    String accountHolder;
    float balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("insuffiscient balance.");
        }
    }

    public void displayAccountBalance() {
        System.out.println("Display account Number: " + accountNumber);
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        bankAccount bankAccount1 = new bankAccount();
        bankAccount1.accountNumber = 1235;
        bankAccount1.accountHolder = "Emiliano Rodriguez";
        bankAccount1.balance = 100;

        bankAccount1.withdraw(100); // input amount to withdraw
        System.out.println(bankAccount1.balance);
    }
}
