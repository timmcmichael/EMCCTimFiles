/*
 * This subclass of Athlete represents a tennis player. It implements two specific fields, two new methods, and overrides the run() and toString() methods.
 */
public class TennisPlayer extends Athlete {
    private String dominantHand;
    private int rank;

    public void serve() {
        System.out.println("Serving!");
    }

    public void volley() {
        System.out.println("Volleying!");
    }

    @Override
    public void run() {
        System.out.println("Running like a tennis player!");
    }

    @Override
    public String toString() {
        return "TennisPlayer{" +
                "dominantHand='" + dominantHand + '\'' +
                ", rank=" + rank +
                '}';
    }
}