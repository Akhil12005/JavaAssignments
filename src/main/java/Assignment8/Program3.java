package Assignment8;

// Parent class BankAccount
class BankAccount {
    // Initial balance
    protected double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount + ". Balance: $" + balance);
        }
    }
}

// Subclass SavingsAccount inheriting from BankAccount
class SavingsAccount extends BankAccount {
    // Constructor
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override the withdraw method to prevent withdrawal if balance falls below 100
    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Withdrawal not allowed. Balance would fall below $100. Current balance: $" + balance);
        }
    }
}

// Main class
public class Program3 {
    public static void main(String[] args) {
        // Creating SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(200);

        // Depositing and withdrawing money
        savingsAccount.deposit(50);   // Output: Deposited $50. New balance: $250
        savingsAccount.withdraw(150); // Output: Withdrawn $150. New balance: $100
        savingsAccount.withdraw(50);  // Output: Withdrawal not allowed. Balance would fall below $100. Current balance: $100
    }
}
