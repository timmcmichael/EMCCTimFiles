import java.util.Scanner;

public class WhileLoopDemo1 {

    public static void main(String[] args) {
        final String ANSWER = "EMCC";
        Scanner in = new Scanner(System.in);
        String response = "";

        System.out.print("What is the best community college in Arizona? ");
        response = in.nextLine();

        while (!response.equals(ANSWER)) {
            System.out.print("Wrong! ");
        }


        in.close();
    }

}
