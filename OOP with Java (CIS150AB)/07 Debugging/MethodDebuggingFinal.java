/*
 * This code includes some errors in order to demonstrate debugging techniques.
 * 
 * NOTE: This is the code at the END of the video. See MethodDebugging.java for the code at the start of the video.
 * 
 */import java.util.Random;

public class MethodDebuggingFinal {

    public static void main(String[] args) {
        int betweenSum = -1, randSum = -1; // BREAKPOINT 1
        String mySchool = "EMCC";
        System.out.println("Welcome to " + mySchool);
        randSum = sumOfRandoms(5);
        betweenSum = sumBetween(2, 4);
        System.out.println(betweenSum);
        System.out.println(randSum);
        printBetween(5, 10);
    }

    public static int sumBetween(int low, int high) {
        int sum = 0;
        int counter = low;
        do {
            sum += counter;
            counter++; // START: comment out this line
        } while (counter <= high);
        return sum;
    }

    public static int sumOfRandoms(int quantity) {
        Random rng = new Random();

        int sum = 0;

        for (int i = 0; i < quantity; i++) {
            int randNum = rng.nextInt(10);
            sum += randNum;
        }

        return sum;

    }

    public static void printBetween(int start, int end) {
        int count = start;

        do {
            System.out.println();
        } while (count <= end);

    }

}