// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class PythagoreanTriplet{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three numbers (separated by spaces): ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("The triplet is a Pythagorean triplet.");
        } else {
            System.out.println("The triplet is not a Pythagorean triplet.");
        }
    }

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        int smallest = Math.min(Math.min(a, b), c);
        int largest = Math.max(Math.max(a, b), c);
        int middle = a + b + c - smallest - largest;
        return smallest * smallest + middle * middle == largest * largest;
    }
}
