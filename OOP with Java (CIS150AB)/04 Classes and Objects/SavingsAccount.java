/*
 * A simple class that represents a savings account. It uses a static final field to store the  interest rate, meaning that all accounts instantiated from this class will have the same interest rate.
 */
public class SavingsAccount {
    static final double DEFAULT_INTEREST_RATE = 0.02;

    private double balance;

    public SavingsAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void addInterest() {
        balance += balance * DEFAULT_INTEREST_RATE;
    }

    public double getBalance() {
        return balance;
    }
}