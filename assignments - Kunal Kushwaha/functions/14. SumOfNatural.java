// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        int sum = calculateSumOfNaturalNumbers(n);
        System.out.println("Sum of the first " + n + " natural numbers: " + sum);
    }

    static int calculateSumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}

