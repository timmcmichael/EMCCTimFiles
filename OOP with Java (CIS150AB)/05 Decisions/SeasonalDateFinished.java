/*
 * Solution Walkthrough
 * Module 05
 * 
 * Create a class called SeasonalDate (in SeasonalDate.java) that includes separate fields for a day, 
 * month, and year; include get methods for each field. A constructor should accept values for each
 * of the fields and assign them appropriately. A method called getSeason() returns a String
 * indicating the astronomical season for the date using the ranges below:
 *  Spring starts March 20
 *  Summer starts June 21
 *  Fall starts September 23
 *  Winter starts December 21
 *    Note: These dates are based on equinoxes and solstices for 2023; for simplicity,
 *    your code can use these same dates regardless of the year.
 * Next, create a program in TestSeasonalDate.java that demonstrates SeasonalDate by creating multiple
 * instances of the class and outputting the seasons. This program does not require user input.
 * 
 * Test Cases:
 * 3/1/2023 -> Winter
 * 3/20/2023 -> Spring
 * 6/28/2023 -> Summer
 * 10/1/2022 -> Fall
 */

public class SeasonalDate {
    // Fields (instance variables)
    private int day;
    private int month;
    private int year;

    // Constructors
    public SeasonalDate(int newMonth, int newDay, int newYear) {
        this.day = newDay;
        this.month = newMonth;
        this.year = newYear;
    }

    // Getters and Setters
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public String getSeason() {
        String season = "unknown";
        if (this.month < 3) {
            season = "Winter";
        } else if (this.month == 3) {
            if (this.day < 20) {
                season = "Winter";
            } else {
                season = "Spring";
            }
        } else if (this.month < 6) {
            season = "Spring";
        } else if (this.month == 6) {
            if (this.day < 21) {
                season = "Spring";
            } else {
                season = "Summer";
            }
        } else if (this.month < 9) {
            season = "Summer";
        } else if (this.month == 9) {
            if (this.day < 23) {
                season = "Summer";
            } else {
                season = "Fall";
            }
        } else if (this.month <= 12) {
            season = "Fall";
        } else if (this.month == 12) {
            if (this.day < 21) {
                season = "Fall";
            } else {
                season = "Winter";
            }
        }

        return season;
    }
}
