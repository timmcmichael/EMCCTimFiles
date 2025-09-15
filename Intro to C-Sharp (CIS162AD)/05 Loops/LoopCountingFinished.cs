/*
 * This program counts using loops!
 * 
 * It demonstrates the use of definite loops using while and do-while.
 * 
 */

// Count to ten

// Initialize control variable
int counter = 1;
int end = -1;

Console.Write("How high should I count? ");
end = Convert.ToInt32( Console.ReadLine() );


// Check the control variable
while (counter <= end)
{
    Console.WriteLine(counter);

    // Update control variable
    counter+=2;
}


