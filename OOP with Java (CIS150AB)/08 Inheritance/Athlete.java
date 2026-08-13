/* 
 * This class represents an athlete. It has three fields and three methods. It is designed to be a superclass for other more specific types of athletes.
 */
public class Athlete {
    private String athleteName;
    private int age;
    private int weight;

    public Athlete(String athleteName, int age, int weight) {
        this.athleteName = athleteName;
        this.age = age;
        this.weight = weight;
    }

    public void run() {
        System.out.println("Running!");
    }

    public void jump() {
        System.out.println("Jumping!");
    }

    public void throwBall() {
        System.out.println("Throwing!");
    }
}