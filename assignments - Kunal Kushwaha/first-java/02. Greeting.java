// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ? ");
        String name = input.nextLine();
        System.out.println("Namaste " + name + " ! How are you ?");
    }
}
