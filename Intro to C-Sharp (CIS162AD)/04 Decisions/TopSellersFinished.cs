/*
 * This program prompts the user to input a selection from list of music genres, then
 * outputs the store's top seller in that category.
 *
 * It demonstrates the use of an if-else if structure to execute one block of code
 * from multiple options.
 *
 * Test cases:
 * 1 (hard rock) -> "Paranoid by Black Sabbath"
 * 2 (alternative) -> "Document by R.E.M."
 * 3 (pop rock) -> "The Joshua Tree by U2"
 * 4 (hip hop) -> "Straight Outta Compton by N.W.A."
 * 5 (soul) -> "The Dock of the Bay by Otis Redding"
 * 94 -> "[Invalid selection]"
 *
 */

public class TopSellers
{
    public static void Main(String[] args)
    {
        string input = "";
        int selection = -1;
        string album = "";

        Console.WriteLine("Welcome to Zee-Uh Records");
        Console.WriteLine("Select one of the following:");
        Console.WriteLine("1. Hard rock");
        Console.WriteLine("2. Alternative rock");
        Console.WriteLine("3. Pop rock");
        Console.WriteLine("4. Hop hop");
        Console.WriteLine("5. Soul");
        Console.Write("Your selection: ");
        input = Console.ReadLine();

        selection = Convert.ToInt32(input);

        album = TopSeller(selection);

        Console.WriteLine($"The top seller in that category is {album}");


    }

    public static string TopSeller(int genre)
    {
        string title = "";

        if (genre == 1)
        {
            title = "Paranoid by Black Sabbath";
        }
        else if (genre == 2)
        {
            title = "Document by R.E.M.";
        }
        else if (genre == 3)
        {
            title = "The Joshua Tree by U2";
        }
        else if (genre == 4)
        {
            title = "Straight Outta Compton by N.W.A.";
        }
        else if (genre == 5)
        {
            title = "The Dock of the Bay by Otis Redding";
        }
        else
        {
            title = "[Invalid selection]";
        }

            return title;
    }
}