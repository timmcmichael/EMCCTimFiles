public class TestSeasonalDate {
    public static void main(String[] args) {
        SeasonalDate sd1 = new SeasonalDate(3, 1, 2023);
        SeasonalDate sd2 = new SeasonalDate(3, 20, 2023);
        SeasonalDate sd3 = new SeasonalDate(6, 28, 2023);
        SeasonalDate sd4 = new SeasonalDate(10, 1, 2022);

        String dateStr = sd1.getMonth() + "/" + sd1.getDay() + "/" + sd1.getYear();
        System.out.println(dateStr + " is in " + sd1.getSeason());

        dateStr = sd2.getMonth() + "/" + sd2.getDay() + "/" + sd2.getYear();
        System.out.println(dateStr + " is in " + sd2.getSeason());

        dateStr = sd3.getMonth() + "/" + sd3.getDay() + "/" + sd3.getYear();
        System.out.println(dateStr + " is in " + sd3.getSeason());

        dateStr = sd4.getMonth() + "/" + sd4.getDay() + "/" + sd4.getYear();
        System.out.println(dateStr + " is in " + sd4.getSeason());
    }

}
