/*
 * Breaking out of a loop
 */

public class BreakDemo1 {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Next: ");
            if (counter == 5) {
                break;
            }
            System.out.println(counter);
        }

        System.out.println("All done!");
    }

}
