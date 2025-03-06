/*
 * BankAccount
 * 
 * Models a simple, generic bank account.
 * 
 * NOTE: This is the code that was completed by the end of the video and is not the starter file. Because it's been renamed, it doesn't compile. See BankAccount.java for the starter file.
 * 
 */

public class BankAccountFinished {

    // Instance Variables (fields)
    private String accountNum;
    private String ownersName;
    private double balance;

    // Constructors
    // public BankAccount2() {
    // this.ownersName = "John Doe";
    // }

    public BankAccount(String acctNum, String name) {
        this.accountNum = acctNum;
        this.ownersName = name;
    }

    // Getters
    public String getAccountNum() {
        return this.accountNum;
    }

    public String getOwnersName() {
        return this.ownersName;
    }

    public double getBalance() {
        return this.balance;
    }

    // Setters/modifiers

    public void setOwnersName(String name) {
        this.ownersName = name;
    }

    public void setAccountNum(String num) {
        this.accountNum = num;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

}