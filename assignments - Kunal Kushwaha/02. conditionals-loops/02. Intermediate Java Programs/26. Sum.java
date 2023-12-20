/* Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N)
entered by the user. The list terminates when the user enters a zero.*/

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        while (true) {
            System.out.println("Enter a number (enter 0 to terminate): ");
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            if (number < 0) {
                sumNegative += number;
            } else {
                if (number % 2 == 0) {
                    sumPositiveEven += number;
                } else {
                    sumPositiveOdd += number;
                }
            }
        }
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}
