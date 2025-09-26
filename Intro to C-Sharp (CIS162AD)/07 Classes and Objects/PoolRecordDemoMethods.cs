/*
 * PoolRecordDemo
 *
 * Tests and demonstrates the PoolRecord class using traditional getter and setter methods.
 *
 * This program works with the version of the PoolRecord class found in PoolRecordMethods.cs.
 *
 */

class PoolRecordDemo
{
    static void Main(string[] args)
    {
        // Instantiate two objects
        PoolRecord pool1 = new PoolRecord();
        PoolRecord pool2 = new PoolRecord();

        // Set field values for both instances
        pool1.SetDate("2024-10-01");
        pool1.SetWaterTemp(87);
        pool1.SetPhLevel(1.5);

        pool2.SetDate("2024-10-02");
        pool2.SetWaterTemp(75);
        pool2.SetPhLevel(8.25);

        // Output field values for both instances
        Console.WriteLine("Date: " + pool1.GetDate());
        Console.WriteLine("Water Temperature: " + pool1.GetWaterTemp());
        Console.WriteLine("pH Level: " + pool1.GetPhLevel());

        Console.WriteLine("------------------------------");

        Console.WriteLine("Date: " + pool2.GetDate());
        Console.WriteLine("Water Temperature: " + pool2.GetWaterTemp());
        Console.WriteLine("pH Level: " + pool2.GetPhLevel());
    }
}
