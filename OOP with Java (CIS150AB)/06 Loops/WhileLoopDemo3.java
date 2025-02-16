/*
 * Print a simple multiplication table based on user input.
 * (user selects number, then multiply it times each number from 20 to 100)
 */

import java.util.Scanner;

public class WhileLoopDemo3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int multiplier = 0;

        // initiallize control variable
        int counter = 20;

        System.out.print("Enter a number to create a multiplication table: ");
        multiplier = in.nextInt();

        // evaluate boolean expression
        while (counter <= 100) {
            int answer = counter * multiplier;
            System.out.println(counter + " x " + multiplier + " = " + answer);
            // update control variable
            counter++;
        }

    }

}
