/*
 * This example demonstrates a simple method with a parameter.
 */

public class ParameterExample {

    public static void main(String[] args) {
        outputGreeting("Tim"); // <.>
    }

    public static void outputGreeting(String name) { // <.>
        System.out.println("Hello, " + name + "!");
    }

}