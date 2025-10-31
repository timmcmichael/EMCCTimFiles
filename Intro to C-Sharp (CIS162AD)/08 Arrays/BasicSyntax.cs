/*
 * Declaring arrays and assigning values with index numbers
 * Retrieving and changing array values
 * Initialization lists
 *
 * Team example from video (John, Marie, Danielle, Daveed, Javier, Vanessa)
 *
 */

// string[] team = new string[6];
//
// team[0] = "John";
// team[1] = "Marie";
// team[3] = "Daveed";
//
// team[0] = "Someone other than John";

string[] team = { "John", "Marie", "Danielle", "Daveed", "Javier", "Vanessa" };
double[] prices = { 1.59, 3.99, 6.50 };

Console.WriteLine(team[0]);
Console.WriteLine(prices[0]);

prices[0] += .50;
Console.WriteLine(prices[0]);

// Console.WriteLine(team[6].ToUpper());