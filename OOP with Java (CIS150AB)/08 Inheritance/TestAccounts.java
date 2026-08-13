/*
 * Tests the BankAccount class and subclasses.
 * 
 */

public class TestAccounts {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount();

        acct1.deposit(500);
        if (acct1.withdraw(700)) {
            System.out.println("Successfully withdrew $700");
        } else {
            System.out.println("Failed to withdraw $700");
        }
        if (acct1.withdraw(150)) {
            System.out.println("Successfully withdrew $150");
        } else {
            System.out.println("Failed to withdraw $150");
        }

        System.out.println("Balance = " + acct1.getBalance());

    }
}
