/*
 * This program demonstrates polymorphism by creating an array of BankAccount objects and storing CheckingAccount and SavingsAccount objects in it.
 * 
 */
public class InheritanceArrays {

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[6];

        accounts[0] = new CheckingAccount();
        accounts[1] = new CheckingAccount();
        accounts[2] = new SavingsAccount();
        accounts[3] = new CheckingAccount();
        accounts[4] = new SavingsAccount();
        accounts[5] = new SavingsAccount();

        accounts[0].deposit(256.43);
        accounts[1].deposit(87);
        accounts[2].deposit(7459.43);
        accounts[3].deposit(-45.65);
        accounts[4].deposit(754.93);
        accounts[5].deposit(77863.54);
    }
}
