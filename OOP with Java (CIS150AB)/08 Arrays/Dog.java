/* 
 * This class models a Dog object to demonstrate storing objects in an array. The demonstration program is ArrayOfObjects.java.
 * 
 */

public class Dog {
    // Instance Variables
    private String name;
    private int age;
    private boolean isClean;

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.isClean = true;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String checkSmell() {
        if (this.isClean) {
            return "Smells clean!";
        } else {
            return this.name + " stinks!";
        }
    }

    // Modifiers
    public void playOutside() {
        this.isClean = false;
    }

    public void haveABirthday() {
        this.age++;
    }

    public void visitGroomer() {
        this.isClean = true;
    }

}
