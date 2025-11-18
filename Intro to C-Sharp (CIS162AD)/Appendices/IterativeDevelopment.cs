/*
 * This example demonstrates iterative development by capturing a copy of each version along the way.
 * The programmer writes a version, copy/pastes the code, comments out the previous, then continues development.
 * This allows the code reviewer or teacher to see how the program progressed. The final version is not commented out.
 *
 * The prompt for this problem was to write a program that asked the user for a song's length in minutes and seconds
 * and then converted that to the total number of seconds.
 *
 */

// ------------------------------------------------------------
// Version 1 (Very Basic)
// Rough draft: no methods, no validation.
// Converts minutes + seconds into total seconds.
// ------------------------------------------------------------

// Console.WriteLine("Enter minutes:");
// int minutes = int.Parse(Console.ReadLine());

// Console.WriteLine("Enter seconds:");
// int seconds = int.Parse(Console.ReadLine());

// int totalSeconds = minutes * 60 + seconds;
// Console.WriteLine($"Total seconds: {totalSeconds}");



// ------------------------------------------------------------
// Version 2 (Cleaner variables + basic validation for seconds)
// Still inline code, but prevents weird inputs like 83 seconds.
// ------------------------------------------------------------

// Console.WriteLine("Enter minutes:");
// int minutes = int.Parse(Console.ReadLine());

// Console.WriteLine("Enter seconds (0–59):");
// int seconds = int.Parse(Console.ReadLine());

// if (seconds < 0 || seconds > 59)
// {
//     Console.WriteLine("Seconds must be between 0 and 59.");
// }
// else
// {
//     int totalSeconds = minutes * 60 + seconds;
//     Console.WriteLine($"Total seconds: {totalSeconds}");
// }



// ------------------------------------------------------------
// Version 3 (Extracts a method)
// We've now turned the logic into a reusable method.
// ------------------------------------------------------------

// static int ConvertToSeconds(int mins, int secs)
// {
//     return mins * 60 + secs;
// }

// Console.WriteLine("Enter minutes:");
// int minutes = int.Parse(Console.ReadLine());

// Console.WriteLine("Enter seconds (0–59):");
// int seconds = int.Parse(Console.ReadLine());

// if (seconds < 0 || seconds > 59)
// {
//     Console.WriteLine("Seconds must be between 0 and 59.");
// }
// else
// {
//     Console.WriteLine($"Total seconds: {ConvertToSeconds(minutes, seconds)}");
// }



// ------------------------------------------------------------
// Version 4 (Final polish: input validation + loop for retries)
// This is a small, user-friendly program.
// ------------------------------------------------------------

static int ConvertToSeconds(int mins, int secs)
{
    return mins * 60 + secs;
}

int minutes = 0;
int seconds = 0;

Console.WriteLine("=== Song Length Converter ===");

bool valid = false;

while (!valid)
{
    Console.Write("Enter minutes: ");
    if (!int.TryParse(Console.ReadLine(), out minutes) || minutes < 0)
    {
        Console.WriteLine("Minutes must be a non-negative whole number.");
        continue;
    }

    Console.Write("Enter seconds (0–59): ");
    if (!int.TryParse(Console.ReadLine(), out seconds) || seconds < 0 || seconds > 59)
    {
        Console.WriteLine("Seconds must be between 0 and 59.");
        continue;
    }

    valid = true;
}

int totalSeconds = ConvertToSeconds(minutes, seconds);
Console.WriteLine($"Your track is {totalSeconds} seconds long!");
