/*
 * Quizzes the user on the name of the first Pearl Jam album.
 * 
 */

const string FirstAlbum = "Ten";
string guess = "";

Console.Write("What is the title of Pearl Jam's debut album? ");
guess = Console.ReadLine();

if (guess.ToUpper() != FirstAlbum.ToUpper())
{
    Console.WriteLine("Wrong!");
}
