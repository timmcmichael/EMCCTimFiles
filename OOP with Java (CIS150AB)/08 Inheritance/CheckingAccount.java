/*
 * This class represents a checking account that is a subclass of BankAccount.
 * 
 */
public class CheckingAccount extends BankAccount {

    // Fields (instance variables)
    private int lastCheckNum;
    private int checksRemaining;

    public int getChecksRemaining() {
        return this.checksRemaining;
    }

    // Modifier methods
    public void writeCheck(double amount, int checkNum) {
        this.lastCheckNum = checkNum;
        this.withdraw(amount);
    }

}
