// NOTE: Add a package statement if necessary!

/*
 * MerchandiseItem
 * 
 * This class represents a single merchandise item to be sold by the band. 
 * The default constructor creates a t-shirt, the most common item sold. The
 * other constructor allows for the creation of any merchandise item with
 * specified name, price, and weight.
 * 
 * The getShippingPrice method calculates the shipping cost based on the
 * quantity ordered and the total weight of the items. 4 or more items get 
 * free shipping; otherwise, it's $5 for up to 1000 grams and $10 for 
 * anything heavier.
 * 
 */

public class MerchandiseItem {

    // Fields (instance variables)
    private String name;
    private double price;
    private int weight; // in grams

    // Constructors

    public MerchandiseItem(String name, double price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public MerchandiseItem() {
        this.name = "T-Shirt";
        this.price = 20.0;
        this.weight = 200;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Additional Methods

    public double getShippingPrice(int quantity) {
        double totalWeight = this.weight * quantity; 
        double totalShippingCost = -1.0;

        if (quantity > 3) {
            totalShippingCost = 0.0;
        }
        else {
            if (totalWeight > 1000) {
                totalShippingCost = 10.0;
            } else {
                totalShippingCost = 5.0;
            }
        }
        
        return totalShippingCost;
    }

}
