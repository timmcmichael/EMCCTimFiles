/* 
 * This program demonstrates how to create an array of objects using Dog.java.
 * 
 * NOTE: This is the code that was completed by the end of the video. There is no starter code other than Dog.java.
 * 
 */
public class ArrayOfObjects {

    public static void main(String[] args) {
        Dog d1 = new Dog("Fifi", 4);
        // Dog[] dogs = new Dog[4];

        // dogs[0] = new Dog("Fido", 4);
        // dogs[1] = new Dog("Rover", 2);
        // dogs[2] = new Dog("Spike", 8);
        // dogs[3] = d1;

        Dog[] dogs = { d1, new Dog("Fido", 4), new Dog("Rover", 2) };

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getName());
        }

        dogs[1].playOutside();
        System.out.println(dogs[1].checkSmell());

    }
}
