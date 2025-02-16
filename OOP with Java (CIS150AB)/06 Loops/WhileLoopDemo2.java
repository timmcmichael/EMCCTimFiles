/*
 * Count to ten!
 */

public class WhileLoopDemo2 {

    public static void main(String[] args) {
        // initialize control variable
        int counter = 0;

        // check the boolean expression
        while (counter < 10) {
            // update the control variable
            System.out.println(++counter);

        }

    }

}

// Starts at 0 and ends at 9
// add one to count in the println()
// What happens if you get your relational sign wrong?
// What happens if you put a semicolon at the end of your while statement?