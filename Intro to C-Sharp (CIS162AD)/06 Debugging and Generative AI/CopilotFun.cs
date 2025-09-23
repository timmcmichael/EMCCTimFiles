/*
 * CopilotFun.java
 * This is a demonstration of the Copilot plugin for Visual Studio Code. It prints a message and includes a method to add two integers.
 *
 * This code is translated from the Java version shown in the video
 * 
 * Test Cases:
 * 3 5 -> 8
 * 10 20 -> 30
 * 0 0 -> 0
 * -5 5 -> 0
 * -5 -5 -> -10
 */

Console.WriteLine("Hello, Copilot!"); // print a message

/*
 * This function returns the sum of two integers.
 */
static int sum(int a, int b)
{
    return a + b; // return the sum of a and b
}

/*
 * This function calculates the area of a pyramid.
 * The formula for the area of a pyramid is base area + 1/2 * perimeter * slant
 * height.
 */
static double pyramidArea(double baseArea, double perimeter, double slantHeight)
{
    return baseArea + 0.5 * perimeter * slantHeight;
}

/*
 * This function converts a temperature from Fahrenheit to Celsius.
 */
static double fahrenheitToCelsius(double fahrenheit)
{
    return (fahrenheit - 32) * 5 / 9;
}
