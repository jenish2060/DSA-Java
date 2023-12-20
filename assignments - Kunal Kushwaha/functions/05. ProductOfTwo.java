// Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number :");
        int secondNumber = input.nextInt();
        int product = product(firstNumber, secondNumber);
        System.out.println("Sum : "+ product);
    }

    static int product(int a, int b){
        return (a * b);
    }
}
