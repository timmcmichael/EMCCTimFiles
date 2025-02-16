import java.util.Scanner;

public class DoWhileLoopDemo1 {

    public static void main(String[] args) {
        final String ANSWER = "EMCC";
        Scanner in = new Scanner(System.in);

        // Initialize control variable
        String response = "";
        int numGuesses = 0;

        do {
            System.out.print("What is the best community college in Arizona? ");
            response = in.nextLine(); // Update the control variable
            numGuesses++;
        } while (!response.equals(ANSWER)); // Check the boolean expression

        System.out.printf("That's correct! It only took you %d tries!%n", numGuesses);

        in.close();
    }

}
