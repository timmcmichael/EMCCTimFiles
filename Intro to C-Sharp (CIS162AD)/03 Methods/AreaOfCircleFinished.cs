
/*
 * 
 * Demo file
 * 
 * The demonstrates passing a arguments to a method by implementing a method 
 * that accepts a radius of a circle and calculates the area. 
 * 
 * Test Cases:
 * 1.0 -> 3.14
 * 4.0 -> 50.27
 * 15.67 -> 771.41462
 * 
 */
import java.util.Scanner;

public class AreaOfCircleFinished
{

    public static void Main(string[] args)
    {
        string input = "";
        double radius = -1.0;
        Console.Write("Enter the radius: ");
        input = Console.ReadLine();
        radius = Convert.ToDouble(input);
        PrintArea(radius);
    }

    public static void PrintArea(double r)
    {
        r = r * r;
        double area = 3.14 * r;
        Console.WriteLine(area);
    }
}