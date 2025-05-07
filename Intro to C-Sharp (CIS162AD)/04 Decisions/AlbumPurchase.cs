/*
 * This program calculates the total purchase price for a shipment of used
 * albums. It prompts the user for the quantity to purchase, then outputs
 * the cost. Shipping cost is $10 but is waived for purchases of five or
 * more.
 *
 * Test cases:
 * 1 -> 40.0   (1 x 30.0 + 10)
 * 4 -> 130.0 (4 X 30.0 + 10)
 * 5 -> 150.0 (5 x 30.0 + 0)
 * 10 -> 300.0 (10 x 30.0 + 0)
 *
 * Note: This is the completed version of the code at the end of the video.
 * The video does not have a starter file.
 *
 */

// Declare variables

string input = "";
int numAlbums = -1;
double totalPrice = -1.0;
double shippingCost = 10.0;

const double AlbumPrice = 30.0;

// Get input

Console.Write("Enter the quantity of albums: ");
input = Console.ReadLine();
numAlbums = Convert.ToInt32(input);


// Calculations

if (numAlbums >= 5)
{
    shippingCost = 0.0;
    Console.WriteLine("Your order qualifies for free shipping!");
}
else
{
    Console.WriteLine("Did you know that orders of 5 or more get free shipping?");
}

totalPrice = numAlbums * AlbumPrice + shippingCost;

// Output results

Console.WriteLine($"The total cost of purchasing {numAlbums} albums is ${totalPrice}.");
