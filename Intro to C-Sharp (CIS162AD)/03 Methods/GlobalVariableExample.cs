/*
 * This example shows the use of a globel variable so it can be accessed in different methods. This is generally considered bad and is not allowed on assignments in my classes.
 */
public class GlobalVariableExample {
    static int numberOfSongs = 7; // Declaration at the class level. Note that it must be static.

    public static void Main(String[] args) {
        Console.WriteLine(numberOfSongs);

        
      outputNumber();

        Console.WriteLine(numberOfSongs);
    }

    public static void OutputNumber() {
        Console.WriteLine(numberOfSongs);
        numberOfSongs = 18;
    }
}
