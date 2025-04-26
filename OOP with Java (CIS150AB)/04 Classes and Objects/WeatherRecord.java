/* 
 * This class represents a weather record for a specific date, logging the 
 * high temperature and average wind speed.
 * 
 * NOTE: This class appears in multiple sections of the eBook and/or accompanying videos. This version demonstrates concepts from the "Classes and Objects" chapter.
 *
 */
public class WeatherRecord {
   
    // Fields
    private String date;
    private int highTemperature;
    private double averageWindSpeed;

    // Constructors
    public WeatherRecord() { // "parameterless" constructor
        this.date = "2025-01-01";
        this.highTemperature = 0;
        this.averageWindSpeed = 0.0;
    }

    public WeatherRecord(String date) {
        this.date = date;
        this.highTemperature = 0;
        this.averageWindSpeed = 0.0;
    }

    public WeatherRecord(String date, int highTemperature, double averageWindSpeed) {
        this.date = date;
        this.highTemperature = highTemperature;
        this.averageWindSpeed = averageWindSpeed;
    }

    // Getters
    public String getDate() {
        return this.date;
    }

    public int getHighTemperature() {
        return this.highTemperature;
    }

    public double getAverageWindSpeed() {
        return this.averageWindSpeed;
    }

    // Setters and Mutators
    public void setDate(String date) {
        this.date = date;
    }

    public void setHighTemperature(int highTemperature) {
        this.highTemperature = highTemperature;
    }

    public void setAverageWindSpeed(double averageWindSpeed) {
        this.averageWindSpeed = averageWindSpeed;
    }
}
