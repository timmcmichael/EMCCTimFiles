public class OperatorPrecedence {

    public static void main(String[] args) {

        int result1 = 17 - 4 * 6 / 3; // <.>
        int result2 = 17 - 4 / 2 + 2; // <.>
        int result3 = 17 - 4 / (2 + 2); // <.>

        System.out.println("result 1 = " + result1);
        System.out.println("result 2 = " + result2);
        System.out.println("result 3 = " + result3);
    }

}
