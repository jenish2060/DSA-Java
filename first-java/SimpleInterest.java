// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal, time & rate : ");
        int principal = input.nextInt();
        float time = input.nextFloat();
        float rate = input.nextFloat();
        float SI = (principal * time * rate) / 100;
        System.out.println("Simple Interest : " + SI );
    }
}
