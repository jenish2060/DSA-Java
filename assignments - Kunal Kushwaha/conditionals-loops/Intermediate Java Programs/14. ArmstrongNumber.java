// Armstrong Number

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        double sum = 0;
        int numberOfDigits = (int) Math.log10(number) + 1;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
