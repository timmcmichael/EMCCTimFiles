/*
 * Declaring arrays and assigning values with index numbers
 * Retrieving and changing array values
 * Initialization lists
 * 
 * Team example from video (John, Marie, Danielle, Daveed, Javier, Vanessa)
 * 
 */

public class BasicSyntax1 {

    public static void main(String[] args) {

        // String[] team = new String[6];
        // team[0] = "John";
        // team[1] = "Marie";

        // team[0] = "Someone other than John";

        String[] team = { "John", "Marie", "Danielle", "Daveed", "Javier", "Vanessa" };
        double[] prices = { 1.99, 2.25, 2.99, 9.99, 4.49 };

        prices[0] += .50;

        System.out.println(prices[0]);
        System.out.println(team[1]);

    }

}