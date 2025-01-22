/*
 * This example shows the use of a globel variable so it can be accessed in different methods. This is generally considered bad and is not allowed on assignments in my classes.
 */
public class GlobalVariableExample {
    static int favoriteNumber = 7; // Declaration at the class level. Note that it must be static.

    public static void main(String[] args) {
        System.out.println(favoriteNumber);

        outputNumber();

        System.out.println(favoriteNumber);
    }

    public static void outputNumber() {
        System.out.println(favoriteNumber);
        favoriteNumber = 18;
    }
}
