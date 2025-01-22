public class GoodOvalArea {
    public static void main(String[] args) {
        System.out.print(areaOfOval(2.3, 4.5));
    }

    public static double areaOfOval(double smallRadius,
            double bigRadius) {
        double area = 3.14 * smallRadius * bigRadius;
        return area;
    }

}