public class TestAccounts2 {
    public static void main(String[] args) {
        BankAccount2 acct1 = new BankAccount2("1234", "Homer Simpson");

        System.out.println("Owner = " + acct1.getOwnersName());
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

        // Adding here

        CheckingAccount2 checking1 = new CheckingAccount2("98765", "Superman");

        checking1.deposit(250);
        checking1.writeCheck(500.48, 43);
        // acct1.writeCheck(302.23, 49);
        System.out.println("Balance = " + checking1.getBalance());
        System.out.println("Last Check # = " + checking1.getLastCheckNum());

        System.out.println("Owner = " + checking1.getOwnersName());

        SavingsAccount2 sa1 = new SavingsAccount2();
        System.out.println("Balance = " + sa1.getBalance());

    }
}
