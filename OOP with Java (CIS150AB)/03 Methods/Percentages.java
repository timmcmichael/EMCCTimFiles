/*
 * Video Demo - Methods with Parameters and Returns
 * 
 * Use a method to calculate and return a percentage based on two numbers.
 * 
 * Test Cases:
 * 2.0, 5.0 -> 40.0, 250.0
 * 8.2, 10 -> 82.0, 121.9 
 * 17.23, 54.65 -> 31.52, 317.18
 * 
 */

import java.util.Scanner;

public class Percentages {

    public static void main(String[] args) {
        // Declare variables
        double firstNumber = -1.0;
        double secondNumber = -1.0;
        double firstPercent = -1.0;
        double secondPercent = -1.0;
        Scanner input = new Scanner(System.in);

        // Get input and complete calculations
        System.out.print("Enter the first number: ");
        firstNumber = input.nextDouble();
        System.out.print("Enter the second number: ");
        secondNumber = input.nextDouble();

        firstPercent = percentage(firstNumber, secondNumber);
        secondPercent = percentage(secondNumber, firstNumber);

        // Output results
        System.out.println("Result: " + firstNumber + " is " + firstPercent + "% of " + secondNumber);
        System.out.println("Result: " + secondNumber + " is " + secondPercent + "% of " + firstNumber);

    }

    public static double percentage(double num1, double num2) {
        double percent = -1.0;
        percent = (num1 / num2) * 100;
        return percent;
    }

}
