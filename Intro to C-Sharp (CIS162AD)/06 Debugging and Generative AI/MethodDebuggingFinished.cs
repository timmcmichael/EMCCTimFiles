/*
 * This code includes some errors in order to demonstrate debugging techniques.
 * 
 * NOTE: This is the code at the END of the video. See MethodDebugging.cs for the code at the start of the video.
 * 
 * This code is translated from the Java version shown in the video
 *
*/

int betweenSum = -1, randSum = -1; // BREAKPOINT 1
String mySchool = "EMCC";
Console.WriteLine("Welcome to " + mySchool);
randSum = SumOfRandoms(5);
betweenSum = SumBetween(2, 4);
Console.WriteLine(betweenSum);
Console.WriteLine(randSum);
PrintBetween(5, 10);


static int SumBetween(int low, int high)
{
    int sum = 0;
    int counter = low;
    do
    {
        sum += counter;
        counter++; // START: comment out this line
    } while (counter <= high);
    return sum;
}

static int SumOfRandoms(int quantity)
{
    Random rng = new Random();

    int sum = 0;

    for (int i = 0; i < quantity; i++)
    {
        int randNum = rng.nextInt(10);
        sum += randNum;
    }

    return sum;

}

static void PrintBetween(int start, int end)
{
    int count = start;

    do
    {
        Console.WriteLine($"Counter = {count++}");
    } while (count <= end);

}

