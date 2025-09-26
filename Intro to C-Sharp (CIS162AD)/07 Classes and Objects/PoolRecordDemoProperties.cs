/*
 * PoolRecordDemo
 *
 * Tests and demonstrates the PoolRecord class using properties.
 *
 * This program works with the version of the PoolRecord class found in PoolRecordProperties.cs.
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
        day1.Date = "2024-10-01";
        
        day1.WaterTemp = 87;
        day1.PhLevel = 1.5;

        day2.Date = "2024-10-02";
        day2.WaterTemp = 75;
        day2.PhLevel = 8.25;

        // Output field values for both instances
        Console.WriteLine("Date: " + day1.Date);
        Console.WriteLine("Water Temperature: " + day1.WaterTemp);
        Console.WriteLine("pH Level: " + day1.PhLevel);

        Console.WriteLine("------------------------------");

        Console.WriteLine("Date: " + day2.Date);
        Console.WriteLine("Water Temperature: " + day2.WaterTemp);
        Console.WriteLine("pH Level: " + day2.PhLevel);
    }
}
