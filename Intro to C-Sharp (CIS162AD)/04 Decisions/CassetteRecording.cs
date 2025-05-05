/*
 * This program calculates the amount of tape and number of cassettes a band
 * will need for their recording session at Staque and Kew Studios.
 *
 * It prompts the user to input the total minutes of music they are recording
 * and the number of minutes on one side of a cassette, then outputs the
 * length (in meters) of tape required and the number of cassettes needed.
 *
 * This program demonstrates the use of parameters and return values.
 *
 * Test cases:
 * 85 45 -> 243.1 meters of tape, 0.94444444 tapes required
 * 93 30 -> 265.98 meters of tape, 1.55 tapes required
 * 14 60 -> 40.04 meters of tape, 0.11666667 tapes required
 * 157 30 -> 449.02 meters of tape, 2.61666667
 *
 * length = 2.86 x recording minutes
 * # cassettes:
 *   1. multiply minutes per side x 2
 *   2. divided recording minutes by that result
 *
 */

class CassetteRecording
{
    static void Main(string[] args)
    {
        // Define variables
        
        int recordingMinutes = -1;
        int minutesPerSide = -1;
        double metersOfTape = -1.0;
        double cassettesNeeded = -1.0;
        string input = "";
        
        // Get input
        Console.Write("Enter the numbers of minutes to record: ");
        input = Console.ReadLine();
        recordingMinutes = Convert.ToInt32(input);
        
        Console.Write("Enter the number of minutes per side of cassette: ");
        input = Console.ReadLine();
        minutesPerSide = int.Parse(input);

        // Calculates
        
        metersOfTape = TapeLength(recordingMinutes);
        cassettesNeeded = NumberOfCassettes(minutesPerSide, recordingMinutes);
        
        // Output results
        
        Console.WriteLine($"{recordingMinutes} minutes of music requires {metersOfTape} meters of tape.");
        Console.WriteLine($"{recordingMinutes} minutes of music requires {cassettesNeeded} tapes if each side holds {minutesPerSide} minutes.");

    }

    /*
     * Calculates the number of cassettes needed based on minutes and size of the cassette
     */
    public static double NumberOfCassettes(int sideLength, int minutes)
    {
        double cassettes = -1.0;
        int minutesPerTape = sideLength * 2;
        cassettes = minutes / (double)minutesPerTape;
        return cassettes;
    }
    

    /*
     * Calculates the length (in meters) of magnetic tape needed for a recording.
     */
    public static double TapeLength(int minutes)
    {
        double length = -1.0;

        length = 2.86 * minutes;
        
        return length;
    }
    
    
}
