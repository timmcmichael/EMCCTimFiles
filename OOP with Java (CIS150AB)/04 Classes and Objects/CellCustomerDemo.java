/*
 * Tests and demonstrates the functionality of the CellCustomer class.
 */
public class CellCustomerDemo {

    public static void main(String[] args) {
        CellCustomer customer1;
        customer1 = new CellCustomer();
        CellCustomer customer2 = new CellCustomer();

        customer1.setName("Deadpool");
        customer2.setName("Ryan Reynolds");
        customer1.setPhoneNumber("800-867-5309");
        customer1.setMonthlyData(20.0);


        System.out.println(customer1.getName());
        System.out.println(customer1.getPhoneNumber());
        System.out.println(customer1.getMonthlyData());
        System.out.println(customer1.getRemainingData());

        

        System.out.println("----- Customer 2: -----");
        System.out.println(customer2.getName());


        // customer1.setName("John Doe");
        // customer1.setPhoneNumber("555-555-5555");
        // customer1.setMonthlyData(2.0);
        // System.out.println("Customer 1: " + customer1.getName() + " " + customer1.getPhoneNumber() + " " + customer1.getMonthlyData() + " " + customer1.getRemainingData());
    }

}
