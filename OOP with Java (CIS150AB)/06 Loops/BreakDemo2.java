/*
 * I can't even bring myself to explain what this does...
 */

public class BreakDemo2 {

    public static void main(String[] args) {

        int counter = 1;

        while (true) {
            System.out.println(counter);
            counter++;
            if (counter > 10) {
                break;
            }
        }

    }

}
