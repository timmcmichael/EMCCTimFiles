/*
 * BankAccount
 * 
 * Models a simple, generic bank account.
 * 
 */

public class BankAccount extends Object {

    // Instance Variables (fields)
    private String accountNum;
    private String ownersName;
    private double balance;

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