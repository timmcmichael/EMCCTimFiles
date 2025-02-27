/*
 * CopilotFun.java
 * This is a demonstration of the Copilot plugin for Visual Studio Code. It prints a message and includes a method to add two integers.
 * 
 * Test Cases:
 * 3 5 -> 8
 * 10 20 -> 30
 * 0 0 -> 0
 * -5 5 -> 0
 * -5 -5 -> -10
 */
public class CopilotFun {

    public static void main(String[] args) {
        System.out.println("Hello, Copilot!"); // print a message
    }

    /*
     * This function returns the sum of two integers.
     */
    public static int sum(int a, int b) {
        return a + b; // return the sum of a and b
    }

    /*
     * This function calculates the area of a pyramid.
     * The formula for the area of a pyramid is base area + 1/2 * perimeter * slant
     * height.
     */
    public static double pyramidArea(double baseArea, double perimeter, double slantHeight) {
        return baseArea + 0.5 * perimeter * slantHeight;
    }

    /*
     * This function converts a temperature from Fahrenheit to Celsius.
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
