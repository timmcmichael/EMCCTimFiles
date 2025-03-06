/*
 * This class represents a checking account that is a subclass of BankAccount.
 * 
 * NOTE: This is the code that was completed by the end of the video and is not the starter file. Because it's been renamed, it doesn't compile. See CheckingAccount.java for the starter file.
 *
 */

public class CheckingAccount extends BankAccount {

    // Instance Variables (fields)
    private int lastCheckNum;
    private int checksRemaining;

    public CheckingAccount(String acctNum, String name) {
        super(acctNum, name);
        this.lastCheckNum = 1;
        this.checksRemaining = 50;
    }

    // Getters
    public int getLastCheckNum() {
        return this.lastCheckNum;
    }

    public int getChecksRemaining() {
        return this.checksRemaining;
    }

    // Modifier methods
    public boolean writeCheck(double amount, int checkNum) {
        if (this.withdraw(amount)) {
            this.lastCheckNum = checkNum;
            this.checksRemaining--;
            return true;
        }
        return false;
    }

}
