/*
 * This program allows the user to input the side number and track number from the classic
 * hip hop album "Raising Hell" and outputs the song's title.
 *
 * It demonstrates the use of nested if-else statements to test for multiple conditions.
 *
 */
public class if_else
{
    public static void Main()
    {
        string input = "";
        int sideNum = -1;
        int trackNum = -1;
        string songTitle = "";

        Console.Write("Enter side number: ");
        input = Console.ReadLine();
        sideNum = Convert.ToInt32(input);
        
        Console.Write("Enter track number: ");
        input = Console.ReadLine();
        trackNum = Convert.ToInt32(input);

        if (sideNum == 1)
        {
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
        }
        else if (sideNum == 2)
        {
            if (trackNum == 1)
            {
                songTitle = "Hit It Run";
            }
            else if (trackNum == 2)
            {
                songTitle = "Raising Hell";
            }
            else if (trackNum == 3)
            {
                songTitle = "You Be Illin'";
            }
            else if (trackNum == 4)
            {
                songTitle = "Dumb Girl";
            }
            else if (trackNum == 5)
            {
                songTitle = "Son of Byford";
            }
            else if (trackNum == 6)
            {
                songTitle = "Proud to Be Black";
            } 
        }
        else
        {
            songTitle = "Not found";
        }

        Console.WriteLine($"Track #{trackNum} on side {sideNum} of Raising Hell by Run D.M.C. is {songTitle}.");
  
        
    }
}
