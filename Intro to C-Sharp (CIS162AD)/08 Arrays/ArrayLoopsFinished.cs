/*
 * Demonstration of using loops with arrays:
 * Output traversal
 * Nonstandard traversals
 * Accumulation traversal (every other number?)
 * Searching an array
 * Input traversal
 *
 *
 */

string[] team = { "John", "Marie", "Danielle", "Daveed", "Javier", "Vanessa" };
double[] prices = { 1.99, 2.25, 2.99, 9.99, 4.49 };


double totalPrice = 0.0;
string searchName;

// string[] team;
// Console.Write("Number of players: ");
// int numPlayers = Convert.ToInt32(Console.ReadLine());

// team = new string[numPlayers];

// Input traversal
// for (int i = 0; i < team.Length; i++) {
// string newName = "";
// Console.Write("Input player name: ");
// newName = Console.ReadLine();
// team[i] = newName;
// }

// Output traversal
for (int i = team.Length - 1; i >= 0; i--)
{
    Console.WriteLine(team[i]);
}

// Accumulation traversal
for (int i = 0; i < prices.Length; i++)
{
    // totalPrice = totalPrice + prices[i];
    totalPrice += prices[i];
}

Console.WriteLine("Total = " + totalPrice);

// Modifier traversal
for (int i = 0; i < prices.Length; i++)
{
    prices[i] += 1.0;
}

Console.WriteLine("-------------------------------");

// Output
for (int i = 0; i < prices.Length; i++)
{
    Console.WriteLine(prices[i]);
}

Console.WriteLine("-------------------------------");
Console.Write("Enter the name to check: ");
searchName = Console.ReadLine();

bool isFound = false;

for (int i = 0; i < team.Length; i++)
{
    if (searchName == team[i])
    {
        isFound = true;
        break;
    }
}

if (isFound)
{
    Console.WriteLine("Yes, that name is on the team");
}
else
{
    Console.WriteLine("NO, not on the team!");
}
