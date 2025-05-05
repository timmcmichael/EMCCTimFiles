/*
 * This program prompts the user to input a track number from side one of the classic
 * hip hop album "Raising Hell" and outputs the song's title.
 *
 * It demonstrates the use of an if-else-if structure.
 * 
 */

string input = "";
int trackNum = -1;
string songTitle = "";

Console.Write("Enter track number: ");
input = Console.ReadLine();
trackNum = Convert.ToInt32(input);

if (trackNum == 1)
{
    songTitle = "Peter Piper";
}
else if (trackNum == 2)
{
    songTitle = "It's Tricky";
}
else if (trackNum == 3)
{
    songTitle = "My Adidas";
}
else if (trackNum == 4)
{
    songTitle = "Walk This Way";
}
else if (trackNum == 5)
{
    songTitle = "Is It Live";
}
else if (trackNum == 6)
{
    songTitle = "Perfection";
}
else
{
    songTitle = "Not found";
}

Console.WriteLine($"Track #{trackNum} on side one of Raising Hell by Run D.M.C. is {songTitle}.");
