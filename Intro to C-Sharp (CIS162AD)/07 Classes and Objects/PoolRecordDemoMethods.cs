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
        PoolRecord day1 = new PoolRecord();
        PoolRecord day2 = new PoolRecord();

        // Set field values for both instances
        day1.SetDate("2024-10-01");
        day1.SetWaterTemp(87);
        day1.SetPhLevel(1.5);

        day2.SetDate("2024-10-02");
        day2.SetWaterTemp(75);
        day2.SetPhLevel(8.25);

        // Output field values for both instances
        Console.WriteLine("Date: " + day1.GetDate());
        Console.WriteLine("Water Temperature: " + day1.GetWaterTemp());
        Console.WriteLine("pH Level: " + day1.GetPhLevel());

        Console.WriteLine("------------------------------");

        Console.WriteLine("Date: " + day2.GetDate());
        Console.WriteLine("Water Temperature: " + day2.GetWaterTemp());
        Console.WriteLine("pH Level: " + day2.GetPhLevel());
    }
}
