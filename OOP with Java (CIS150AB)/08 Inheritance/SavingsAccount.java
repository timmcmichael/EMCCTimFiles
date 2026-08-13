/*
 * SavingsAccount class is a subclass of BankAccount class. It overrides the deposit() and calls the superclass's deposit() method.
 * 
 */
public class SavingsAccount extends BankAccount {

    // Fields
    private double interestRate;

    // Method
    public void addInterest() {
        // TODO later
    }

    public void deposit(double amount) {
        System.out.println("This is a savings deposit");
        super.deposit(amount);
    }

}
