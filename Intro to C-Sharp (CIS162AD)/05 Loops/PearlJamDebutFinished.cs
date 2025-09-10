/*
 * Quizzes the user on the name of the first Pearl Jam album.
 *
 * This demonstrates a simple while (and do-while) loop based on user input.
 *
 */

const string FirstAlbum = "Ten";
// Initialize control variable
string guess = "";
// Initialize a counter variable
int numGuesses = 0; // Not necessary for the loop, just to keep a count

do
{
    Console.Write("What is the title of Pearl Jam's debut album? ");

    // Update control variable
    guess = Console.ReadLine();
    numGuesses++;
} while (guess.ToUpper() != FirstAlbum.ToUpper()); // Evaluate a Boolean expression

Console.WriteLine($"It took you {numGuesses} guess(es) to get the answer!");

Console.WriteLine("Thanks for playing!");




//const string FirstAlbum = "Ten";
//// Initialize control variable
//string guess = "";

//Console.Write("What is the title of Pearl Jam's debut album? ");
//guess = Console.ReadLine();

//// Evaluate a Boolean expression
//while (guess.ToUpper() != FirstAlbum.ToUpper())
//{
//    Console.Write("Wrong! Take another guess: ");
//    // Update control variable
//    guess = Console.ReadLine();
//}

//Console.WriteLine("Thanks for playing!");
