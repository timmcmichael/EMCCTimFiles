/*
 * This class is a subclass of Friend class. It adds the ability to give an honest opinion, and it overrides the giveHug() method.
 * 
 */
public class CloseFriend extends Friend {

    public void honestOpinion() {
        System.out.println("Those shoes make your feet look big!");
    }

    @Override
    public void giveHug() {
        System.out.println("This is a close friend's hug");
    }
}
