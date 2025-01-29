/* 
 * This class represents a weather record for a specific date, logging the 
 * high temperature and average wind speed.
 * 
 */
public class WeatherRecord {
    // Fields
    private String date;
    private int highTemperature;
    private double averageWindSpeed;
    
    // Getters
    public String getDate() {
        return date;
    }

    public int getHighTemperature() {
        return highTemperature;
    }

    public double getAverageWindSpeed() {
        return averageWindSpeed;
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
