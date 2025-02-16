
/*
 * Count from one positive number to another, based on user input.
 */
import java.util.Scanner;

public class DoWhileLoopDemo2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = -1;
        int end = -1;
        int count = -1;

        System.out.print("Enter the starting number: ");
        start = in.nextInt();

        // Input validation
        do {
            System.out.print("Enter the ending number: ");
            end = in.nextInt();
        } while (end <= start);

        // initialize control variable
        count = start;

        do {
            System.out.println(count);
            // update the control variable
            count++;
        } while (count <= end); // check the boolean expression

    }

}

// Starts at 0 and ends at 9
// add one to count in the println()
// What happens if you get your relational sign wrong?
// What happens if you put a semicolon at the end of your while statement?