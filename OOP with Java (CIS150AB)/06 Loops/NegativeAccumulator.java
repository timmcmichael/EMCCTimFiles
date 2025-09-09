/*
 * Textbook example
 * 
 * This program counts and totals how many negative numbers a user enters.
 * 
 * It demonstrates the use of a counter variable and an accumulator with a while loop.
 * 
 */

import java.util.Scanner;

public class NegativeAccumulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int currentInput = -1;

        System.out.print("The object of the game is to see how much you can accumulate by entering negative numbers.");
        System.out.println(" If you enter a positive number, the game is over.\n");
        System.out.println("We didn't say it was a fun game.\n");

        while (currentInput < 0) {
            System.out.print("Enter a negative number: ");
            currentInput = input.nextInt();
            if (currentInput < 0) {
                count++;
                sum += currentInput;
            }
        }

        System.out.println("\nGame over!");
        System.out.println("You entered " + count + " negative numbers.");
        System.out.println("The total of all the negative numbers you entered is " + sum + ".");
    }

}
