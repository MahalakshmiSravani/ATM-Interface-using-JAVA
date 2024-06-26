import java.util.ArrayList;
import java.util.Scanner;

// Class representing an ATM
public class ATM {

    private double balance;
    private ArrayList<String> transactions;

    // Constructor
    public ATM(double initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    // Method to display menu and handle user choices
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        
        while (!quit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. View Transaction History");
            System.out.println("6. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    viewBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    transfer(scanner);
                    break;
                case 5:
                    viewTransactionHistory();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
        
        scanner.close();
    }

    // Method to view current balance
    private void viewBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Method to deposit money
    private void deposit(Scanner scanner) {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        balance += amount;
        transactions.add("Deposited $" + amount);
        System.out.println("Deposit successful.");
    }

    // Method to withdraw money
    private void withdraw(Scanner scanner) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal canceled.");
        } else {
            balance -= amount;
            transactions.add("Withdrawn $" + amount);
            System.out.println("Withdrawal successful.");
        }
    }

    // Method to transfer money to another account (simulated here)
    private void transfer(Scanner scanner) {
        System.out.print("Enter transfer amount: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds. Transfer canceled.");
        } else {
            balance -= amount;
            transactions.add("Transferred $" + amount);
            System.out.println("Transfer successful.");
        }
    }

    // Method to view transaction history
    private void viewTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // Main method to run the ATM
    public static void main(String[] args) {
        ATM atm = new ATM(1000.0); // Initial balance of $1000.0
        atm.run();
    }
}
