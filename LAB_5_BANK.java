import java.util.Scanner;

class Account {
    private String customerName;
    private int accountNumber;
    private String accountType;
    protected double balance;

    public Account(String name, int accNo, String type, double initialBalance) {
        customerName = name;
        accountNumber = accNo;
        accountType = type;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public void computeInterest() {
        // Implemented in child classes
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class CurrentAccount extends Account {
    private double minimumBalance;
    private double serviceCharge;

    public CurrentAccount(String name, int accNo, double initialBalance) {
        super(name, accNo, "Current", initialBalance);
        minimumBalance = 1000; // example minimum balance
        serviceCharge = 50; // example service charge
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Service charge of " + serviceCharge + " applied.");
            balance -= serviceCharge;
        }
    }

    @Override
    public void computeInterest() {
        // Current account does not earn interest
        System.out.println("Current account does not earn interest.");
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, int accNo, double initialBalance) {
        super(name, accNo, "Savings", initialBalance);
        interestRate = 0.05; // example interest rate (5%)
    }

    @Override
    public void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest computed and deposited. Updated balance: " + balance);
    }
}

public class LAB_5_BANK{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter personal information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        // Creating savings account
        System.out.print("Enter initial balance for savings account: ");
        double savingsInitialBalance = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(name, accountNumber, savingsInitialBalance);

        // Creating current account
        System.out.print("Enter initial balance for current account: ");
        double currentInitialBalance = scanner.nextDouble();
        CurrentAccount currentAccount = new CurrentAccount(name, accountNumber, currentInitialBalance);

        // Perform operations
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit to Savings Account");
            System.out.println("2. Withdraw from Current Account");
            System.out.println("3. Display Savings Account Balance");
            System.out.println("4. Display Current Account Balance");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount for savings account: ");
                    double savingsDepositAmount = scanner.nextDouble();
                    savingsAccount.deposit(savingsDepositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount for current account: ");
                    double currentWithdrawalAmount = scanner.nextDouble();
                    currentAccount.withdraw(currentWithdrawalAmount);
                    break;
                case 3:
                    savingsAccount.displayBalance();
                    break;
                case 4:
                    currentAccount.displayBalance();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
