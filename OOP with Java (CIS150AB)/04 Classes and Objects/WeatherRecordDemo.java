/*
 * This driver class tests/demonstrates the WeatherRecordDemo class.
 */

public class WeatherRecordDemo {
    public static void main(String[] args) {
        WeatherRecord day1 = new WeatherRecord();
        WeatherRecord day2 = new WeatherRecord();

        day1.setDate("2024-10-01");
        day1.setHighTemperature(87);
        day1.setAverageWindSpeed(1.5);

        day2.setDate("2024-10-02");
        day2.setHighTemperature(75);
        day2.setAverageWindSpeed(8.25);

        System.out.println("Date: " + day1.getDate());
        System.out.println("High Temperature: " + day1.getHighTemperature());
        System.out.println("Average Wind Speed: " + day1.getAverageWindSpeed());

        System.out.println("------------------------------");

        System.out.println("Date: " + day2.getDate());
        System.out.println("High Temperature: " + day2.getHighTemperature());
        System.out.println("Average Wind Speed: " + day2.getAverageWindSpeed());
    }
}