/*
 * This class represents a customer of a cell phone service company, focusing on the customer's data plan and usage.
 */
public class CellCustomer {

    // Fields (Instance Variables)
    private String name;
    private String phoneNumber;
    private double monthlyData;
    private double remainingData;

    // Getters (accessors)
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public double getMonthlyData() {
        return monthlyData;
    }
    public double getRemainingData() {
        return remainingData;
    }

    // Setters (mutators)
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

    public void useData(double dataUsed) {
        this.remainingData -= dataUsed;
    }

    public void topUpData() {
        this.remainingData = this.monthlyData;
    }

    
}