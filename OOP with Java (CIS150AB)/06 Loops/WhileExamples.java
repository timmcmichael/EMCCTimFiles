/*
 * This class demonstrates the use of while loop. The examples are used in the eBook chapter.
 */
public class WhileExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 0 to 9 using while loop
        int count1 = 0;
        while (count1 < 10) {
            System.out.println("Count is: " + count1);
            count1++;
        }
        System.out.println("------------------------");

        // Example 2: Infinite loop
        // It is commented out to allow the rest of the examlpes to run.
        // int count2 = 0;
        // while (count2 < 10) {
        //     System.out.println("Count is: " + count2);
        // }
        // System.out.println("------------------------");

        // Example 3: Print even numbers from 0 to 9 using do-while loop
        int count3 = 0;
        do {
            System.out.println("Count is: " + count3);
            count3++;
        } while (count3 < 10);

        System.out.println("------------------------");

        // Example 4: Print odd numbers from 1 to 10
        // i = 1;
        // while (i <= 10) {
        //     if (i % 2 != 0) {
        //         System.out.print(i + " ");
        //     }
        //     i++;
        // }
        // System.out.println();
    }
}