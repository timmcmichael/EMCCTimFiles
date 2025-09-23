/*
 * This code includes some errors in order to demonstrate debugging techniques.
 * 
 * NOTE: This is the code at the START of the video. See MethodDebuggingFinal.java for the code after completing the video.
 * 
 */

int betweenSum = -1, randSum = -1;
string mySchool = "EMCC";
SayHello(mySchool);
randSum = SumOfRandoms(5);
betweenSum = SumBetween(2, 4);
Console.WriteLine(betweenSum);
Console.WriteLine(randSum);
PrintBetween(5, 10);


static void SayHello(string school)
{
    Console.WriteLine("Hello!");
    Console.Write("Welcome to " + school + "!");
    Console.WriteLine(" Hope you have a great semester!");
}

static int SumBetween(int low, int high)
{
    int sum = 0;
    int counter = low;
    do
    {
        sum += counter;
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
        Console.WriteLine();
    } while (count <= end);

}

