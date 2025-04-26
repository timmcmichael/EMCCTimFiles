/*
 * This example demonstrates variable scope. Because it includes references to out-of-scope variables, this code will not compile.
 */
public class ScopeExample {

    public static void Main(String[] args) {
        int numberOfSongs = 7;
        Console.WriteLine(numberOfSongs); // no problem!

        OutputNumber();
    }

    public static void OutputNumber() {
        Console.WriteLine(numberOfSongs); // favoriteNumber doesn't exist here!
    }
}
