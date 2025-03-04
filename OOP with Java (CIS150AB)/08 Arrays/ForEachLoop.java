public class ForEachLoop {
    public static void main(String[] args) {
        Dog[] dogs = { new Dog("Fifi", 4), new Dog("Fido", 4), new Dog("Rover", 2), new Dog("Spike", 8) };
        double[] prices = { 1.99, 2.25, 2.99, 9.99, 4.49 };

        for (Dog d : dogs) {
            System.out.println(d.getName() + ": " + d.getAge());
        }
        System.out.println("--------------------------");

        for (Dog d : dogs) {
            d.haveABirthday();
            System.out.println(d.getName() + ": " + d.getAge());
        }
        double total = 0.0;
        for (double price : prices) {
            System.out.println(price);
            total += price;
        }

        System.out.println("Total = " + total);
    }
}
