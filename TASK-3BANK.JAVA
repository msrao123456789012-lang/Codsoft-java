import java.util.*;

class BankAccount {
    private int balance;

    BankAccount(int initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(int deposit) {
        if (deposit > 0) {
            balance += deposit;
            System.out.println("Amount of " + deposit + " deposited successfully");
        } else {
            System.out.println("Enter a valid amount");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount of " + amount + " withdrawn successfully");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Enter a valid amount");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class Atm {
    private BankAccount account;
    private Scanner sc;

    Atm(BankAccount b) {
        this.account = b;
        this.sc = new Scanner(System.in);
    }

    void showMenu() {
        while (true) {
            System.out.println("\n=== WELCOME TO MINOR BANK ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // clear invalid input
                continue;
            }

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    depositMoney();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thanks for using our bank!");
                    return; // exit method
                default:
                    System.out.println("Enter a valid option (1-4).");
            }
        }
    }

    private void depositMoney() {
        System.out.print("Enter amount to be deposited: ");
        int amount = sc.nextInt();
        account.deposit(amount);
    }

    private void withdrawMoney() {
        System.out.print("Enter amount to be withdrawn: ");
        int amount = sc.nextInt();
        account.withdraw(amount);
    }

    private void checkBalance() {
        System.out.println("Account balance: " + account.getBalance());
    }
}

public class Task-3Bank{
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        Atm atm = new Atm(acc);
        atm.showMenu();
    }
}

