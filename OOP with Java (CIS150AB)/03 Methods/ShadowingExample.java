/*
 * This is an example of code that uses variable "shadowing"--two variables with the same namd but a different scope. Shadowing is a bad idea.
 */
public class ShadowingExample {

    public static void main(String[] args) {
        int favoriteNumber = 7;
        System.out.println(favoriteNumber); // this outputs 7

        outputNumber();

        System.out.println(favoriteNumber); // this still outputs 7, since it can't be changed in outputNumber()
    }

    public static void outputNumber() {
        int favoriteNumber = 18;
        System.out.println(favoriteNumber); // This outputs 18, not 7
        favoriteNumber = 10;
    }
}