/*
 * CellCustomer
 * This class represents a customer of a cell phone service company, focusing on the customer's data plan and usage.
 */
package module04;

public class MobileCustomer {

    // Fields (instance variables)
    private String name;
    private String phoneNumber;
    private double monthlyData;
    private double remainingData;

    // Constructors
    public MobileCustomer(String name, String phoneNumber, double monthlyData) {
        this.name = name;       // name = name doesn't work right!
        this.phoneNumber = phoneNumber;
        this.monthlyData = monthlyData;
        this.remainingData = monthlyData;
    }

    public MobileCustomer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.monthlyData = 8.0;
        this.remainingData = 8.0;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double getMonthlyData() {
        return this.monthlyData;
    }

    public double getRemainingData() {
        return this.remainingData;
    }

    // Setters
    public void setName(String cName) {
        this.name = cName;
    }

    public void setPhoneNumber(String cPhoneNumber) {
        this.phoneNumber = cPhoneNumber;
    }

    public void setMonthlyData(double cMonthlyData) {
        this.monthlyData = cMonthlyData;
        this.remainingData = cMonthlyData;
    }

    // Mutators
    public void useData(double dataUsed) {
        this.remainingData -= dataUsed;
    }

    public void addData(double amount) {
        this.remainingData += amount;
    }

    public void resetData() {
        this.remainingData = this.monthlyData;
    }
    
}
