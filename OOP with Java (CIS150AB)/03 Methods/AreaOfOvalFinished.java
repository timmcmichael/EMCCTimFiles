/*
 * 
 * Demo file
 * 
 * The demonstrates passing a arguments to a method by implementing a method 
 * that accepts two radii of and and calculates the area. 
 * 
 * Test Cases:
 * 1.0, 1.0 -> 3.14
 * 4.0, 12.0 -> 150.7964
 * 15.67, 6.34 -> 312.1103
 * 
 */
public class AreaOfOvalFinished {
    public static void main(String[] args) {
        printAreaOfOval(2.3, 4.5);
    }

    public static void printAreaOfOval(double smallRadius,
            double bigRadius) {
        double area = 3.14 * smallRadius * bigRadius;
        System.out.print(area);
    }
}