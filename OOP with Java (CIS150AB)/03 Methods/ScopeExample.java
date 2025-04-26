/*
 * This example demonstrates variable scope. Because it includes references to out-of-scope variables, this code will not compile.
 */
public class ScopeExample {

    public static void main(String[] args) {
        int numberOfSongs = 7;
        System.out.println(numberOfSongs); // no problem!

        outputNumber();
    }

    public static void outputNumber() {
        System.out.println(numberOfSongs); // favoriteNumber doesn't exist here!
    }
}
