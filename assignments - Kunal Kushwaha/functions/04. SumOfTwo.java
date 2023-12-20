// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number :");
        int secondNumber = input.nextInt();
        int sum = sum(firstNumber, secondNumber);
        System.out.println("Sum : "+ sum);
    }

    static int sum(int a, int b){
        return (a + b);
    }
}
