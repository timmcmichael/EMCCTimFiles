/*
 * Breaking out of a loop
 */


for (int counter = 1; counter <= 10; counter++) {
    Console.Write("Next: ");
    if (counter == 5) {
        break;
    }
    Console.Write(counter);
}

Console.WriteLine("All done!");
