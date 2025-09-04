/*
 * SeatPrices
 * 
 * This program determines the price of a ticket for the Rolling Stones'
 * "Steel Wheelchairs" tour based on section and row. The lower bowl costs 
 * $100 for the first 5 rows and $75 for rows behind that. The upper bowl
 * is $65 for the first 5 rows and $50 further back.
 *
 * It is intended to demonstrate the use of "nested" if statements to make
 * hierarchical decisions.
 * 
 * Test Cases:
 * L 4 -> $100.0
 * l 15 -> $75.0
 * u 1 -> $65.0
 * U 27 -> $50.0
 * x 23 -> Invalid entry
 */

string sectionLetter = "";
int rowNumber = -1;
double seatPrice = -1.0;

Console.WriteLine("Available seating sections:");
Console.WriteLine("[L]ower Bowl\n[U]pper Bowl");
Console.Write("Select a section: ");
sectionLetter = Console.ReadLine();
Console.Write("Enter the row number: ");
rowNumber = Convert.ToInt32(Console.ReadLine());

if (sectionLetter.ToUpper() == "L")
{
    if (rowNumber <= 5)
    {
        seatPrice = 100.0;
    }
    else
    {
        seatPrice = 75.0;
    }
}
else if (sectionLetter.ToLower() == "u")
{
    if (rowNumber <= 5)
    {
        seatPrice = 65.0;
    }
    else
    {
        seatPrice = 50.0;
    }
}

if (seatPrice > 0.0)
{
    Console.WriteLine($"Ticket price is ${seatPrice}. Enjoy the show!");
}
else
{
    Console.WriteLine("Invalid entry");
}