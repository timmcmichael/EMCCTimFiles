package module01;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        String email;

        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        input.nextLine(); // clear buffer
        System.out.print("Email: ");
        email = input.nextLine();

        age += 10;

        System.out.println("Hello," + name);
        System.out.println(age);
        System.out.println(email);
    }

}