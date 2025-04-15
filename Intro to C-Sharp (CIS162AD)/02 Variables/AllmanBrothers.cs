/*
 * This program prompts the user for information about their Allman Brothers Band record collection,
 * then calculates how much money they need to complete it.
 *
 * It demonstrates getting user input and converting that to numeric data types.
 */
int albumsOwned = -1;
int albumsWanted = -1;
double albumValue = 1.0;
int albumsNeeded = -1; // difference between albumsWanted and albumsOwned
double cost = -1.0;
string guitarist = "Duane Allman";

string input = "";

Console.Write("Who was the best guitarist in the Allman Brothers Band? ");
guitarist = Console.ReadLine();

Console.WriteLine($"Ah, {guitarist} is a good choice.");

Console.Write("How many Allman Brothers Band albums do you own? ");
input = Console.ReadLine();
albumsOwned = Convert.ToInt32(input);

Console.Write("How many Allman Brothers Band albums do you wish you owned? ");
input = Console.ReadLine();
albumsWanted = int.Parse(input);

Console.Write("How much is one Allman Brothers Band album worth? ");
input = Console.ReadLine();
albumValue = Convert.ToDouble(input);
// albumValue = double.Parse(input);

albumsNeeded = albumsWanted - albumsOwned;
cost = albumsNeeded * albumValue;

Console.WriteLine($"You need {albumsNeeded} more albums, which will cost you ${cost}.");
