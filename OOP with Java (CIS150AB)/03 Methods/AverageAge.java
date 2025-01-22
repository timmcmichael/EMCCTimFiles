public class AverageAge {
    public static void main(String[] args) {
        System.out.println(averageAge(10, 20, 25));
    }

    public static double averageAge(int age1, int age2) {
        return (double) (age1 + age2) / 2;
    }

    public static double averageAge(int age1, int age2, int age3) {
        return (double) (age1 + age2 + age3) / 3;
    }

}
