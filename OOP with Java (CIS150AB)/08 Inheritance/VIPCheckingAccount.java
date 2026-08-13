/*
 * VIPCheckingAccount class extends CheckingAccount class and overrides the deposit method.
 * It adds a 0.5% bonus to the amount deposited.
 * 
 */
public class VIPCheckingAccount extends CheckingAccount {

    @Override
    public String toString() {
        return "VIP Checking Account\nBalance = " + this.getBalance();
    }

    @Override
    public void deposit(double amount) {
        double bonus = amount * .005;
        super.deposit(bonus + amount);
    }

}
