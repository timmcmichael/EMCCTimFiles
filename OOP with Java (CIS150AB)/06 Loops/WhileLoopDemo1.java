import java.util.Scanner;

public class WhileLoopDemo1 {

    public static void main(String[] args) {
        final String ANSWER = "EMCC";
        Scanner in = new Scanner(System.in);

        // initial control variable
        String response = "";

        System.out.print("What is the best community college in Arizona? ");
        response = in.nextLine();

        // evaluated a boolean expression
        while (!response.equals(ANSWER)) {
            System.out.print("Wrong, try again. What is the best community college in Arizona? ");

            // update control variable
            response = in.nextLine();
        }

        System.out.println("That's correct!");

        in.close();
    }

}

// Initialize control variable
// Check the boolean expression
// Update the control variable