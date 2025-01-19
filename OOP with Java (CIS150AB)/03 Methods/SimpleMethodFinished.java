/*
 * This example defines a couple methods that produce output and demonstrates
 * calling those methods.
 */
public class SimpleMethodFinished {

    public static void main(String[] args) {
        System.out.print("I am at ");
        outputCollegeName();
        System.out.println();
        System.out.print("I think ");
        outputCollegeName();
        System.out.println(" is the best school in the world.");
        outputCollegeName();
        System.out.println(", will you marry me?");
    }

    public static void outputCollegeName() {
        System.out.print("Estrella Mountain");
        System.out.print(" Community College");
    }

    public static void outputMascot() {
        System.out.print("Mountain Lion");
    }
}
