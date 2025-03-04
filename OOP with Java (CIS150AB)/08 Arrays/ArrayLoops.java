/*
 * Demonstration of using loops with arrays:
 * Acknowledgement of the Arrays class
 * Output traversal
 * Nonstandard traversals
 * Accumulation traversal (every other number?) 
 * Searching an array
 * Input traversal
 * 
 */

import java.util.Scanner;

public class ArrayLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] team = { "John", "Marie", "Danielle", "Daveed", "Javier", "Vanessa" };
        double[] prices = { 1.99, 2.25, 2.99, 9.99, 4.49 };
        double totalPrice = 0.0;
        String searchName;

        // String[] team;
        // System.out.print("Number of players: ");
        // int numPlayers = input.nextInt();
        // input.nextLine();

        // team = new String[numPlayers];

        // Input traversal
        // for (int i = 0; i < team.length; i++) {
        // String newName = "";
        // System.out.print("Input player name: ");
        // newName = input.nextLine();
        // team[i] = newName;
        // }

        // Output traversal
        for (int i = team.length - 1; i >= 0; i--) {
            System.out.println(team[i]);
        }

        // Accumulation traversal
        for (int i = 0; i < prices.length; i++) {
            // totalPrice = totalPrice + prices[i];
            totalPrice += prices[i];
        }
        System.out.println("Total = " + totalPrice);

        // Modifier traversal
        for (int i = 0; i < prices.length; i++) {
            prices[i] += 1.0;
        }

        System.out.println("-------------------------------");

        // Output
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        System.out.println("-------------------------------");
        System.out.print("Enter the name to check: ");
        searchName = input.nextLine();

        boolean isFound = false;

        for (int i = 0; i < team.length; i++) {
            if (searchName.equals(team[i])) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Yes, that name is on the team");
        } else {
            System.out.println("NO, not on the team!");

        }

    }

}