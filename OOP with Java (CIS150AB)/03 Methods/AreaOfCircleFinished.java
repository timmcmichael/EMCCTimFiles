
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

public class AreaOfCircleFinished {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = -1.0;
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();
        printArea(radius);
    }

    public static void printArea(double r) {
        double area = 3.14 * (r * r);
        System.out.print(area);
    }
}