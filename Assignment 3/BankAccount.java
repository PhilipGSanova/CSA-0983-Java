import java.util.Scanner;

class BankAccount {
    // Data Members
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balanceAmount;

    // Minimum balance constant
    private static final double MINIMUM_BALANCE = 500.00;

    // Constructor
    public BankAccount(String depositorName, int accountNumber, String accountType, double balanceAmount) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balanceAmount = balanceAmount;
    }

    // Method to read account details
    public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.println("Enter Depositor Name: ");
        depositorName = scanner.nextLine();
        System.out.println("Enter Account Type (Savings/Current): ");
        accountType = scanner.nextLine();
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balanceAmount += amount;
        System.out.println("Amount Deposited. New Balance: " + balanceAmount);
    }

    // Method to withdraw an amount after checking balance
    public void withdraw(double amount) {
        if (balanceAmount - amount >= MINIMUM_BALANCE) {
            balanceAmount -= amount;
            System.out.println("Amount Withdrawn. New Balance: " + balanceAmount);
        } else {
            System.out.println("Insufficient balance. Minimum balance of Rs.500.00 must be maintained.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Account Balance: " + balanceAmount);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance Amount: " + balanceAmount);
    }

    public static void main(String[] args) {
        // Test Cases
        BankAccount account1 = new BankAccount("Raja", 100, "Savings", 8000);
        BankAccount account2 = new BankAccount("Rani", 101, "Savings", 12000);
        BankAccount account3 = new BankAccount("Ragu", 102, "Current", 8000);
        BankAccount account4 = new BankAccount("Ravi", 103, "Current", 10000);

        // Displaying initial details and balance
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();
        account4.displayAccountDetails();

        // Perform some operations
        account1.deposit(1000);
        account1.withdraw(1000);
        account1.displayBalance();

        account2.deposit(2000);
        account2.withdraw(1500);
        account2.displayBalance();

        account3.deposit(500);
        account3.withdraw(9000); // This should show an error due to insufficient balance
        account3.displayBalance();

        account4.deposit(5000);
        account4.withdraw(4000);
        account4.displayBalance();
    }
}
