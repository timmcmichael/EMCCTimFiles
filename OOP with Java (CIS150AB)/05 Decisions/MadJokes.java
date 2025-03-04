/*
 * MadJokes
 * This program prompts the user to input how many jokes they'd like to buy at $30/joke. If the user buys 10 or more, they'll get a 10% discount. The program will then display the total cost of the jokes.
 * 
 * Test Cases:
 * 1 -> 30.0
 * 9 -> 270.0
 * 10 -> 270.0
 * 11 -> 297.0
 *
 * NOTE: This is the completed code at the end of the video.
 * 
 */

package module04;


import java.util.Scanner;

public class MadJokes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numJokes = -1;
        double totalPrice = -1.0;

        System.out.print("How many jokes would you like to buy? ");
        numJokes = input.nextInt();

        totalPrice = numJokes * 30.0;

        if (numJokes >= 10) {
            totalPrice = totalPrice * .9; // totalPrice *= .9 - same thing!
        } else {
            System.out.println("Did you know that if you buy 10 or more jokes, you get a 10% discount? Keep that in mind for your next purchase!");
        }


        System.out.println("The total cost of you joke purchase is $" + totalPrice);
    }

}
