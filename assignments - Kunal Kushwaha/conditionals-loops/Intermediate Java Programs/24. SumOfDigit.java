// Sum of digit of a number

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int temp, sum = 0;
        while (num != 0) {
            temp = num % 10;
            sum = temp + sum;
            num = num / 10;
        }
        System.out.println("Sum : " + sum);
    }
}
