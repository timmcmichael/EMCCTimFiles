/*
 * Just don't. You're better than this
 */

public class EvilDemo {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(counter);
            if (counter == 5) {
                counter = 11;
            }
        }

    }

}
