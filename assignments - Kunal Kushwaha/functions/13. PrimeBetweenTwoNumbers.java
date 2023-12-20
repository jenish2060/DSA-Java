// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class PrimeBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lower bound: ");
        int lowerBound = input.nextInt();
        System.out.println("Enter the upper bound: ");
        int upperBound = input.nextInt();
        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
        findAndPrintPrimesInRange(lowerBound, upperBound);
    }
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void findAndPrintPrimesInRange(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
