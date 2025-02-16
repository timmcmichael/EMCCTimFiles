import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = input.nextInt();
        } while (choice < 1 || choice > 4);

        // Rest of the code...
    }
}